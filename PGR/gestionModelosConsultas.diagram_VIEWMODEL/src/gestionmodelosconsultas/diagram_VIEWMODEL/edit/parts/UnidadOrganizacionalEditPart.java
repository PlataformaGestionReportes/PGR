package gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class UnidadOrganizacionalEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2015;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public UnidadOrganizacionalEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new gestionmodelosconsultas.diagram_VIEWMODEL.edit.policies.UnidadOrganizacionalItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new UnidadOrganizacionalFigure();
	}

	/**
	 * @generated
	 */
	public UnidadOrganizacionalFigure getPrimaryShape() {
		return (UnidadOrganizacionalFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalNombreEditPart) {
			((gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalNombreEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureUnidadOrganizacionalNombreFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalNombreEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(80, 80);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(gestionmodelosconsultas.diagram_VIEWMODEL.part.GestionModelosConsultasVisualIDRegistry
				.getType(gestionmodelosconsultas.diagram_VIEWMODEL.edit.parts.UnidadOrganizacionalNombreEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class UnidadOrganizacionalFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnidadOrganizacionalNombreFigure;

		/**
		 * @generated
		 */
		public UnidadOrganizacionalFigure() {
			this.setForegroundColor(ColorConstants.black);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(80),
					getMapMode().DPtoLP(80)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure innerClass0 = new RectangleFigure();

			innerClass0.setFill(false);
			innerClass0.setOutline(false);
			innerClass0.setMaximumSize(new Dimension(getMapMode().DPtoLP(500),
					getMapMode().DPtoLP(60)));

			this.add(innerClass0);

			GridLayout layoutInnerClass0 = new GridLayout();
			layoutInnerClass0.numColumns = 1;
			layoutInnerClass0.makeColumnsEqualWidth = true;
			innerClass0.setLayoutManager(layoutInnerClass0);

			fFigureUnidadOrganizacionalNombreFigure = new WrappingLabel();

			fFigureUnidadOrganizacionalNombreFigure
					.setText("Unidad Organizacional");

			GridData constraintFFigureUnidadOrganizacionalNombreFigure = new GridData();
			constraintFFigureUnidadOrganizacionalNombreFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureUnidadOrganizacionalNombreFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureUnidadOrganizacionalNombreFigure.horizontalIndent = 0;
			constraintFFigureUnidadOrganizacionalNombreFigure.horizontalSpan = 1;
			constraintFFigureUnidadOrganizacionalNombreFigure.verticalSpan = 1;
			constraintFFigureUnidadOrganizacionalNombreFigure.grabExcessHorizontalSpace = true;
			constraintFFigureUnidadOrganizacionalNombreFigure.grabExcessVerticalSpace = true;
			innerClass0.add(fFigureUnidadOrganizacionalNombreFigure,
					constraintFFigureUnidadOrganizacionalNombreFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnidadOrganizacionalNombreFigure() {
			return fFigureUnidadOrganizacionalNombreFigure;
		}

	}

}
