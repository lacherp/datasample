/**
 * � OPCoach 2012
 */
package com.opcoach.dsgen.provider;

import com.opcoach.dsgen.BadValueGeneratorRegistry;
import com.opcoach.dsgen.DataSampleGenPackage;

import com.opcoach.dsgen.generator.DSGenGeneratorFactory;

import com.opcoach.generator.GeneratorFactory;

import com.opcoach.generator.basic.BasicFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.opcoach.dsgen.BadValueGeneratorRegistry} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BadValueGeneratorRegistryItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemFontProvider
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "� OPCoach 2012";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BadValueGeneratorRegistryItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(DataSampleGenPackage.Literals.BAD_VALUE_GENERATOR_REGISTRY__GENERATORS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BadValueGeneratorRegistry.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BadValueGeneratorRegistry"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		return getString("_UI_BadValueGeneratorRegistry_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(BadValueGeneratorRegistry.class))
		{
		case DataSampleGenPackage.BAD_VALUE_GENERATOR_REGISTRY__GENERATORS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.BAD_VALUE_GENERATOR_REGISTRY__GENERATORS,
				DSGenGeneratorFactory.eINSTANCE.createEObjectGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.BAD_VALUE_GENERATOR_REGISTRY__GENERATORS,
				DSGenGeneratorFactory.eINSTANCE.createChildrenGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.BAD_VALUE_GENERATOR_REGISTRY__GENERATORS,
				DSGenGeneratorFactory.eINSTANCE.createSingleAssociationGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.BAD_VALUE_GENERATOR_REGISTRY__GENERATORS,
				DSGenGeneratorFactory.eINSTANCE.createMultipleAssociationGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.BAD_VALUE_GENERATOR_REGISTRY__GENERATORS,
				GeneratorFactory.eINSTANCE.createReferenceGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.BAD_VALUE_GENERATOR_REGISTRY__GENERATORS,
				BasicFactory.eINSTANCE.createBooleanGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.BAD_VALUE_GENERATOR_REGISTRY__GENERATORS,
				BasicFactory.eINSTANCE.createDateGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.BAD_VALUE_GENERATOR_REGISTRY__GENERATORS,
				BasicFactory.eINSTANCE.createDoubleGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.BAD_VALUE_GENERATOR_REGISTRY__GENERATORS,
				BasicFactory.eINSTANCE.createFloatGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.BAD_VALUE_GENERATOR_REGISTRY__GENERATORS,
				BasicFactory.eINSTANCE.createIDGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.BAD_VALUE_GENERATOR_REGISTRY__GENERATORS,
				BasicFactory.eINSTANCE.createIntGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.BAD_VALUE_GENERATOR_REGISTRY__GENERATORS,
				BasicFactory.eINSTANCE.createLongGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.BAD_VALUE_GENERATOR_REGISTRY__GENERATORS,
				BasicFactory.eINSTANCE.createNullValueGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.BAD_VALUE_GENERATOR_REGISTRY__GENERATORS,
				BasicFactory.eINSTANCE.createStringGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.BAD_VALUE_GENERATOR_REGISTRY__GENERATORS,
				BasicFactory.eINSTANCE.createTrueGenerator()));

		newChildDescriptors.add(createChildParameter(DataSampleGenPackage.Literals.BAD_VALUE_GENERATOR_REGISTRY__GENERATORS,
				BasicFactory.eINSTANCE.createFalseGenerator()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		return DataSampleEditPlugin.INSTANCE;
	}

}
