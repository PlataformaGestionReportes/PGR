package gestionmodelosconsultas.diagram_PROYECCION.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class GestionModelosConsultasModelingAssistantProviderOfQuienEditPart
		extends
		gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3011);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof gestionmodelosconsultas.diagram_PROYECCION.edit.parts.UnidadOrganizacionalEditPart) {
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		}
		if (targetEditPart instanceof gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DocumentoEditPart) {
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		}
		if (targetEditPart instanceof gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActividadEditPart) {
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		}
		if (targetEditPart instanceof gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ActorEditPart) {
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		}
		if (targetEditPart instanceof gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ArmarioEditPart) {
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		}
		if (targetEditPart instanceof gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ComunicacionEditPart) {
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		}
		if (targetEditPart instanceof gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ContactoEditPart) {
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		}
		if (targetEditPart instanceof gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DepositoEditPart) {
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		}
		if (targetEditPart instanceof gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DiscoEditPart) {
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		}
		if (targetEditPart instanceof gestionmodelosconsultas.diagram_PROYECCION.edit.parts.InstanciaProcesoEditPart) {
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		}
		if (targetEditPart instanceof gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart) {
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		}
		if (targetEditPart instanceof gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RolEditPart) {
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		}
		if (targetEditPart instanceof gestionmodelosconsultas.diagram_PROYECCION.edit.parts.FechaEditPart) {
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001) {
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.UnidadOrganizacional_2015);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Documento_2016);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Actividad_2017);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Actor_2018);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Armario_2019);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Comunicacion_2020);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Contacto_2021);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Deposito_2022);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Disco_2023);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.InstanciaProceso_2024);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Quien_2025);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Rol_2026);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Fecha_2027);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			gestionmodelosconsultas.diagram_PROYECCION.edit.parts.QuienEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001) {
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.UnidadOrganizacional_2015);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Documento_2016);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Actividad_2017);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Actor_2018);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Armario_2019);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Comunicacion_2020);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Contacto_2021);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Deposito_2022);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Disco_2023);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.InstanciaProceso_2024);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Quien_2025);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Rol_2026);
			types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Fecha_2027);
		}
		return types;
	}

}
