package gestionmodelosconsultas.diagram_ENTITY.edit.parts;

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
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class EntityEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

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
	public EntityEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new gestionmodelosconsultas.diagram_ENTITY.edit.policies.EntityItemSemanticEditPolicy());
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
		return primaryShape = new EntityFigure();
	}

	/**
	 * @generated
	 */
	public EntityFigure getPrimaryShape() {
		return (EntityFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityNameEditPart) {
			((gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureEntityNameFigure());
			return true;
		}
		if (childEditPart instanceof gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityStereotypeEditPart) {
			((gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityStereotypeEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureEntityStereotypeFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityNameEditPart) {
			return true;
		}
		if (childEditPart instanceof gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityStereotypeEditPart) {
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
		return getChildBySemanticHint(gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
				.getType(gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == gestionmodelosconsultas.diagram_ENTITY.providers.GestionModelosConsultasElementTypes.Attribute_3002) {
				return getChildBySemanticHint(gestionmodelosconsultas.diagram_ENTITY.part.GestionModelosConsultasVisualIDRegistry
						.getType(gestionmodelosconsultas.diagram_ENTITY.edit.parts.EntityCompartmentEntityEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class EntityFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureEntityNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEntityStereotypeFigure;

		/**
		 * @generated
		 */
		public EntityFigure() {
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

			fFigureEntityStereotypeFigure = new WrappingLabel();

			fFigureEntityStereotypeFigure.setText("");

			GridData constraintFFigureEntityStereotypeFigure = new GridData();
			constraintFFigureEntityStereotypeFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureEntityStereotypeFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureEntityStereotypeFigure.horizontalIndent = 0;
			constraintFFigureEntityStereotypeFigure.horizontalSpan = 1;
			constraintFFigureEntityStereotypeFigure.verticalSpan = 1;
			constraintFFigureEntityStereotypeFigure.grabExcessHorizontalSpace = true;
			constraintFFigureEntityStereotypeFigure.grabExcessVerticalSpace = true;
			innerClass0.add(fFigureEntityStereotypeFigure,
					constraintFFigureEntityStereotypeFigure);

			fFigureEntityNameFigure = new WrappingLabel();

			fFigureEntityNameFigure.setText("Entity");

			GridData constraintFFigureEntityNameFigure = new GridData();
			constraintFFigureEntityNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureEntityNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureEntityNameFigure.horizontalIndent = 0;
			constraintFFigureEntityNameFigure.horizontalSpan = 1;
			constraintFFigureEntityNameFigure.verticalSpan = 1;
			constraintFFigureEntityNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureEntityNameFigure.grabExcessVerticalSpace = true;
			innerClass0.add(fFigureEntityNameFigure,
					constraintFFigureEntityNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEntityNameFigure() {
			return fFigureEntityNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEntityStereotypeFigure() {
			return fFigureEntityStereotypeFigure;
		}

	}

}
