package pgr.view;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFileChooser;
import javax.swing.UIManager;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import gestionmodelosconsultas.compilador.CompiladorProyeccion;
import pgr.ModelFactory;
import pgr.domain.Domain;
import pgr.domain.DomainFactory;
import pgr.domain.Report;
import pgr.domain.generators.DataformDiagramGenerator;
import pgr.domain.generators.DataformGenerator;
import pgr.domain.generators.ExcelGenerator;
import pgr.domain.generators.ExcelUpdater;
import pgr.domain.generators.GeneratorsFactory;
import pgr.domain.generators.ViewModelGenerator;
import pgr.domain.util.Unzip;
import pgr.domain.util.UtilFactory;
import pgr.model.ModelFactoryModel;
import pgr.ui.ReportView;
import pgr.ui.ReportViewModel;
import pgr.ui.UiFactory;

import org.eclipse.swt.widgets.Group;

import javax.swing.UIManager.*;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.beans.PojoProperties;

public class PGRView extends ViewPart {
	
	private DataBindingContext m_bindingContext;

	public static final String ID = "reportes.view.Reportes"; //$NON-NLS-1$
	
	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	//Query Magnament
	
	private whoownme.model.ModelFactoryModel modelFactoryModelGC = whoownme.model.ModelFactoryModel.getInstance();
	
	private gestionmodelosconsultas.ModelFactory modelFactoryGC;
	
	//Pgr Domain
	
	private ModelFactoryModel modelFactoryModel = ModelFactoryModel.getInstance();

	private ModelFactory modelFactory;

	private DataformGenerator dfGenerator;
	
	private ExcelGenerator excelGenarator;
	
	private ViewModelGenerator viewModelGenerator;
	
	private DataformDiagramGenerator dfdGenerator;
	
	private ExcelUpdater excelUpdater;
	
	private Unzip unzip;
	
	//Pgr UI
	private ReportViewModel reportViewModelSelected;
	
	//Util
	private String runTimePath;
	
	private String fileName;
	
	private String filePath;
	
	private String filePathOriginal; 
	
	private String url;
	
	private String consulta;
	
	private ResultSet rs;
	
	//View Part
	
	private String state;
	
	private Label label1;
	
	private Label label2;
	
	private Label label3;
	
	private Label lblStep1;
	
	private Label lblStep2;
	
	private Label lblStep3;
	
	private Label lblFileName;
	
	private Button btnCargarExcel;
	
	private Button btnCapturarMM;
	
	private Button btnEjecutarConsulta;
	
	private Button btnGenerarReporte;
	
	private Button btnDesechar;
	
	private Button btnGuardar;
	
	private Button btnCancelar;
	
	private Button btnEliminar;
	
	private Button btnActualizar;
	
	private Table table;
	
	private ReportView reportView;

	private TableViewer tableViewer;
		
	public PGRView() {
		inicializar();
	}

	public void inicializar() {
		
		modelFactory = modelFactoryModel.getModelFactory();
		
		modelFactoryGC = modelFactoryModelGC.getModelFactory();
		
		reportView = modelFactory.getTheUI().getTheReportView();
		
		dfGenerator = GeneratorsFactory.eINSTANCE.createDataformGenerator();
		excelGenarator =  GeneratorsFactory.eINSTANCE.createExcelGenerator();
		viewModelGenerator =  GeneratorsFactory.eINSTANCE.createViewModelGenerator();
		dfdGenerator =  GeneratorsFactory.eINSTANCE.createDataformDiagramGenerator();
		excelUpdater =  GeneratorsFactory.eINSTANCE.createExcelUpdater();
		unzip =  UtilFactory.eINSTANCE.createUnzip();
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		File workspaceDirectory = workspace.getRoot().getLocation().toFile();
		
		state = "E1";
		runTimePath = workspaceDirectory.getAbsolutePath().toString();
		runTimePath = runTimePath.replace("\\","/");
	}
	
	public void updateTable(){
		reportView = modelFactory.getTheUI().getTheReportView();
		initDataBindings();
	}
	
	/**
	 * Create contents of the view part.
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Windows".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
		
		Composite container = toolkit.createComposite(parent, SWT.NONE);
		toolkit.paintBordersFor(container);
		
		Group grpCicloDeVida = new Group(container, SWT.NONE);
		grpCicloDeVida.setFont(pgr.swt.SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		grpCicloDeVida.setText("Ciclo de vida del Reporte");
		grpCicloDeVida.setBounds(10, 90, 250, 345);
		toolkit.adapt(grpCicloDeVida);
		toolkit.paintBordersFor(grpCicloDeVida);
		
		label1 = toolkit.createLabel(grpCicloDeVida, "1", SWT.NONE);
		label1.setFont(pgr.swt.SWTResourceManager.getFont("Thonburi", 40, SWT.NORMAL));
		label1.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		label1.setBounds(20, 40, 30, 60);
		lblStep1 = toolkit.createLabel(grpCicloDeVida, "Capturar modelo mental del\nExcel en el Dataform.", SWT.NONE);
		lblStep1.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		lblStep1.setBounds(60, 40, 160, 30);
		btnCapturarMM = new Button(grpCicloDeVida, SWT.NONE);
		btnCapturarMM.setBounds(60, 75, 160, 25);
		btnCapturarMM.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				makeStepLifeCycle("1");
			}
		});
		toolkit.adapt(btnCapturarMM, true, true);
		btnCapturarMM.setText("Capturar modelo mental");
		
		label2 = toolkit.createLabel(grpCicloDeVida, "2", SWT.NONE);
		label2.setFont(pgr.swt.SWTResourceManager.getFont("Thonburi", 40, SWT.NORMAL));
		label2.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		label2.setBounds(20, 120, 30, 60);
		lblStep2 = toolkit.createLabel(grpCicloDeVida, "Obtener la informacion de la\r\nBase de Datos.", SWT.NONE);
		lblStep2.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		lblStep2.setBounds(60, 120, 160, 30);
		btnEjecutarConsulta = new Button(grpCicloDeVida, SWT.NONE);
		btnEjecutarConsulta.setBounds(60, 155, 160, 25);
		btnEjecutarConsulta.setEnabled(false);
		btnEjecutarConsulta.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				makeStepLifeCycle("2");
			}
		});
		toolkit.adapt(btnEjecutarConsulta, true, true);
		btnEjecutarConsulta.setText("Ejecutar consulta");
		
		label3 = toolkit.createLabel(grpCicloDeVida, "3", SWT.NONE);
		label3.setFont(pgr.swt.SWTResourceManager.getFont("Thonburi", 40, SWT.NORMAL));
		label3.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		label3.setBounds(20, 200, 30, 60);
		lblStep3 = toolkit.createLabel(grpCicloDeVida, "Terminar ciclo de vida.", SWT.NONE);
		lblStep3.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		lblStep3.setBounds(60, 200, 160, 15);
		btnGenerarReporte = new Button(grpCicloDeVida, SWT.NONE);
		btnGenerarReporte.setBounds(60, 220, 160, 25);
		btnGenerarReporte.setEnabled(false);
		btnGenerarReporte.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				makeStepLifeCycle("3");
			}
		});
		toolkit.adapt(btnGenerarReporte, true, true);
		btnGenerarReporte.setText("Generar Reporte");
		
		btnDesechar = new Button(grpCicloDeVida, SWT.NONE);
		btnDesechar.setEnabled(false);
		btnDesechar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				makeStepLifeCycle("5");
			}
		});
		btnDesechar.setBounds(60, 250, 75, 25);
		toolkit.adapt(btnDesechar, true, true);
		btnDesechar.setText("Desechar");
		
		btnGuardar = new Button(grpCicloDeVida, SWT.NONE);
		btnGuardar.setEnabled(false);
		btnGuardar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				makeStepLifeCycle("4");
			}
		});
		btnGuardar.setBounds(145, 250, 75, 25);
		toolkit.adapt(btnGuardar, true, true);
		btnGuardar.setText("Guardar");
		
		btnCancelar = new Button(grpCicloDeVida, SWT.NONE);
		btnCancelar.setBounds(60, 300, 160, 25);
		btnCancelar.setEnabled(false);
		btnCancelar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				cancelLifeCycle();
			}
		});
		toolkit.adapt(btnCancelar, true, true);
		btnCancelar.setText("Cancelar");
		
		Group grpReportes = new Group(container, SWT.NONE);
		grpReportes.setFont(pgr.swt.SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		grpReportes.setText("Reportes");
		grpReportes.setBounds(270, 90, 320, 345);
		toolkit.adapt(grpReportes);
		toolkit.paintBordersFor(grpReportes);
		
		btnEliminar = new Button(grpReportes, SWT.NONE);
		btnEliminar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String reportName =  reportViewModelSelected.getName();
				EList<Report> listReports = modelFactory.getTheDomain().getListReport();
				EList<ReportViewModel> listReportViewModels = modelFactory.getTheUI().getTheReportView().getListReportViewModel();
				for(int i=0; i < listReports.size(); i++){
					if( listReports.get(i).getFileName().equals(reportName)) {
						listReports.remove(i);
						break;
					}
				}
				for(int i=0; i < listReportViewModels.size(); i++){
					if( listReportViewModels.get(i).getName().equals(reportName)) {
						listReportViewModels.remove(i);
						break;
					}
				}
				modelFactory.save();
				updateTable();
			}
		});
		btnEliminar.setBounds(30, 300, 120, 25);
		toolkit.adapt(btnEliminar, true, true);
		btnEliminar.setText("Eliminar");
		
		btnActualizar = new Button(grpReportes, SWT.NONE);
		btnActualizar.setBounds(180, 300, 120, 25);
		btnActualizar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				String reportName =  reportViewModelSelected.getName();
				EList<Report> listReport = modelFactory.getTheDomain().getListReport();		
				for(int i=0; i < listReport.size(); i++){
					if( listReport.get(i).getFileName().equals(reportName)) {
						fileName = listReport.get(i).getFileName();
						filePath = listReport.get(i).getFilePath();
						break;
					}
				}
				 excelUpdater.ExcelUpdater(filePath);
				 excelUpdater.refresh();
			}
		});
		toolkit.adapt(btnActualizar, true, true);
		btnActualizar.setText("Actualizar");
		
		Label lblSeleccionarReporte = toolkit.createLabel(grpReportes, "Seleccionar un reporte.", SWT.NONE);
		lblSeleccionarReporte.setBounds(30, 30, 180, 15);
		
		tableViewer = new TableViewer(grpReportes, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		table.setBounds(30, 60, 270, 220);
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection xSelection = tableViewer.getStructuredSelection();
				reportViewModelSelected = (ReportViewModel) xSelection.getFirstElement();
			}
		});
		toolkit.paintBordersFor(table);
		
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnReporte = tableViewerColumn.getColumn();
		tblclmnReporte.setWidth(265);
		tblclmnReporte.setText("Reportes");
		
		Group grpCargarExcel = new Group(container, SWT.NONE);
		grpCargarExcel.setFont(pgr.swt.SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		grpCargarExcel.setText("Cargar Excel");
		grpCargarExcel.setBounds(10, 10, 580, 70);
		toolkit.adapt(grpCargarExcel);
		toolkit.paintBordersFor(grpCargarExcel);
		
		btnCargarExcel = new Button(grpCargarExcel, SWT.NONE);
		btnCargarExcel.setBounds(10, 30, 180, 25);
		btnCargarExcel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				FileDialog file = new FileDialog(new Shell());
				filePathOriginal = file.open();
				fileName = file.getFileName();
				
				unzip.unzip(filePathOriginal, fileName);
				url = unzip.removeExtension(fileName);
				lblFileName.setText(fileName);
				excelGenarator.copyExcel(filePathOriginal ,runTimePath+"/PGR/files");
				filePath = runTimePath+"/PGR/files/"+fileName;
				closeAllEditors();
				excelGenarator.openFileIntoEditor(filePath);
				closeAllEditors();
				excelGenarator.openFileIntoEditor(filePath);
			}
		});
		toolkit.adapt(btnCargarExcel, true, true);
		btnCargarExcel.setText("Seleccionar archivo");
		
		lblFileName = toolkit.createLabel(grpCargarExcel, "Ning\u00FAn archivo seleccionado", SWT.NONE);
		lblFileName.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblFileName.setFont(pgr.swt.SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblFileName.setBounds(200, 30, 370, 25);
		createActions();
		m_bindingContext = initDataBindings();
	}
	
	public void makeStepLifeCycle(String event){
		
		if(event.equalsIgnoreCase("1")) {
			if(state.equalsIgnoreCase("E1")) {

					dfGenerator.DataformGenerator(url, filePath);
					dfGenerator.generate();
					dfdGenerator.DataformDiagramGenerator(dfGenerator.getModelFactory());
					dfdGenerator.generateDiagram();
					
					label1.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
					lblStep1.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
					label2.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
					lblStep2.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
					btnEjecutarConsulta.setEnabled(true);
					btnCapturarMM.setEnabled(false);
					btnCancelar.setEnabled(true);
					btnActualizar.setEnabled(false);
					btnEliminar.setEnabled(false);
					btnCargarExcel.setEnabled(false);
					state = "E2";
			}
		}
		
		if(event.equalsIgnoreCase("2")) {
			if(state.equalsIgnoreCase("E2")) {
				
				try {
					modelFactoryGC = modelFactoryGC.cargar();
					viewModelGenerator.ViewModelGenerator(modelFactoryGC);
					viewModelGenerator.generateViewModel();

					modelFactoryGC = modelFactoryGC.cargar();
					modelFactoryModelGC.setModelFactory(modelFactoryGC);
					CompiladorProyeccion compiladorProyeccion = new CompiladorProyeccion();
					compiladorProyeccion.compilarProyeccion(modelFactoryGC);
					consulta = compiladorProyeccion.getCompiladorRealizacion().getConsultaGenerica().getConsultaMySql().getConsultaId();
					rs = compiladorProyeccion.getCompiladorRealizacion().getConsultaGenerica().getConsultaMySql().getRs();
					
					excelGenarator.ExcelGenerator(filePath, dfGenerator.getListComboBox(), 
							dfGenerator.getListComboCordinate(), modelFactoryGC, 
							dfGenerator.getDataStartRow(), dfGenerator.getDataStartCell(), consulta);
					excelGenarator.writeFileColumns(rs);
					closeAllEditors();
					excelGenarator.openFileIntoEditor(filePath);
					label2.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
					lblStep2.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
					label3.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
					lblStep3.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
					btnGenerarReporte.setEnabled(true);
					btnEjecutarConsulta.setEnabled(false);
					state = "E3";
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		
		if(event.equalsIgnoreCase("3")) {
			if(state.equalsIgnoreCase("E3")) {
					
					excelGenarator.createDataSheet(rs);
					if(excelGenarator.getNamesFilters().size() != 0)
						excelGenarator.createRelations();
					
					filePathOriginal = filePathOriginal.replace("\\","/");
					excelGenarator.copyExcel(filePath, excelGenarator.getDir(filePathOriginal));
					
					label3.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
					lblStep3.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
					btnGenerarReporte.setEnabled(false);
					btnCancelar.setEnabled(false);
					btnDesechar.setEnabled(true);
					btnGuardar.setEnabled(true);
					state = "E4";
			}
		}
		
		if(event.equalsIgnoreCase("4")) {
			if(state.equalsIgnoreCase("E4")) {
				
				ReportViewModel reportViewModel = UiFactory.eINSTANCE.createReportViewModel();
				reportViewModel.setName(fileName);
				
				pgr.domain.Report report = DomainFactory.eINSTANCE.createReport();
				report.setFileName(fileName);
				report.setFilePath(filePathOriginal);
				
				modelFactory.getTheDomain().getListReport().add(report);
				reportView.getListReportViewModel().add(reportViewModel);
				modelFactory.save();
				updateTable();
				
				label1.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
				lblStep1.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
				label2.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
				lblStep2.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
				label3.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
				lblStep3.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
				lblFileName.setText("Ning\u00FAn archivo seleccionado");
				fileName = null;
				filePath = null;
				
				btnDesechar.setEnabled(false);
				btnGuardar.setEnabled(false);
				btnCancelar.setEnabled(false);
				btnCapturarMM.setEnabled(true);
				btnActualizar.setEnabled(true);
				btnEliminar.setEnabled(true);
				btnCargarExcel.setEnabled(true);
				state = "E1";
			}
		}
		
		if(event.equalsIgnoreCase("5")) {
			if(state.equalsIgnoreCase("E4")) {
				label1.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
				lblStep1.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
				label2.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
				lblStep2.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
				label3.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
				lblStep3.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
				lblFileName.setText("Ning\u00FAn archivo seleccionado");
				fileName = null;
				filePath = null;
				btnDesechar.setEnabled(false);
				btnGuardar.setEnabled(false);
				btnCancelar.setEnabled(false);
				btnCapturarMM.setEnabled(true);
				btnActualizar.setEnabled(true);
				btnEliminar.setEnabled(true);
				btnCargarExcel.setEnabled(true);
				state = "E1";
			}
		}
	}
	
	public void cancelLifeCycle() {
	
		if(state.equalsIgnoreCase("E2")) {
			
				dfGenerator.resetDataform();
				dfdGenerator.resetDiagram(runTimePath+"/PGR/domain/model.tooldataform_diagram");
				
				label1.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
				lblStep1.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
				label2.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
				lblStep2.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
				btnCargarExcel.setEnabled(true);
				btnCapturarMM.setEnabled(true);
				btnEjecutarConsulta.setEnabled(false);
				btnCancelar.setEnabled(false);
				btnActualizar.setEnabled(true);
				btnEliminar.setEnabled(true);
				state = "E1";
			
		}

		if(state.equalsIgnoreCase("E3")) {
			
			dfGenerator.resetDataform();
			dfdGenerator.resetDiagram(runTimePath+"/PGR/domain/model.tooldataform_diagram");
			excelGenarator.removeSheets();
			
			label1.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
			lblStep1.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
			label2.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
			lblStep2.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
			label3.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
			lblStep3.setForeground(pgr.swt.SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
			btnCargarExcel.setEnabled(true);
			btnCapturarMM.setEnabled(true);
			btnGenerarReporte.setEnabled(false);
			btnCancelar.setEnabled(false);
			btnActualizar.setEnabled(true);
			btnEliminar.setEnabled(true);
			state = "E1";
		}
	}

	public void dispose() { toolkit.dispose(); super.dispose(); }

	/**
	 * Create the actions.
	 */
	private void createActions() { }


	@Override
	public void setFocus() { }

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
		IObservableMap observeMap = PojoObservables.observeMap(listContentProvider.getKnownElements(), ReportViewModel.class, "name");
		tableViewer.setLabelProvider(new ObservableMapLabelProvider(observeMap));
		tableViewer.setContentProvider(listContentProvider);
		//
		IObservableList listReportViewModelReportViewObserveList = PojoProperties.list("listReportViewModel").observe(reportView);
		tableViewer.setInput(listReportViewModelReportViewObserveList);
		//
		return bindingContext;
	}
	
	public void closeAllEditors() {
		
		IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		IEditorReference[] editorRefs = page.getEditorReferences();
		int a = editorRefs.length;
		
		while (editorRefs.length != 0) {
			
			IEditorPart editor = editorRefs[0].getEditor(true);
			IEditorInput input = editor.getEditorInput();
			IFile file = (IFile)input.getAdapter(IFile.class);
			page.closeEditor(editor, true);
			
			editorRefs = page.getEditorReferences();
		}
	
	}
}