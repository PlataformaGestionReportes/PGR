package pgr.model;

import pgr.ModelFactory;
import pgr.PgrFactory;


public class ModelFactoryModel {
	
	//------------------------------  Singleton ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder { 
		// El constructor de Singleton puede ser llamado desde aqu� al ser protected
		private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
	}

	// M�todo para obtener la instancia de nuestra clase
	public static ModelFactoryModel getInstance() {
		return SingletonHolder.eINSTANCE;
	}
//------------------------------  Singleton ------------------------------------------------
	ModelFactory modelFactory = PgrFactory.eINSTANCE.createModelFactory();
	
//	---constructor SINGLETON -----
	public ModelFactoryModel() {
	
		ModelFactory tempModelFactory = modelFactory;
		modelFactory = modelFactory.load();
		
		if(modelFactory == null){
			
			modelFactory = tempModelFactory;
		}
	}

//	getters and setters
	public ModelFactory getModelFactory() {
		return modelFactory;
	}

	public void setModelFactory(ModelFactory modelFactory) {
		this.modelFactory = modelFactory;
	}

	public void salvar(){
		modelFactory.save();
	}
	


	
	

}
