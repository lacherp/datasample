/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.opcoach.generator.ecore.dsgen.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import com.opcoach.generator.ecore.dsgen.util.DataSampleGenAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataSampleGenItemProviderAdapterFactory extends DataSampleGenAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSampleGenItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.opcoach.generator.ecore.dsgen.DSGenModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenModelItemProvider dsGenModelItemProvider;

	/**
	 * This creates an adapter for a {@link com.opcoach.generator.ecore.dsgen.DSGenModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDSGenModelAdapter() {
		if (dsGenModelItemProvider == null)
		{
			dsGenModelItemProvider = new DSGenModelItemProvider(this);
		}

		return dsGenModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.opcoach.generator.ecore.dsgen.DSGenPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenPackageItemProvider dsGenPackageItemProvider;

	/**
	 * This creates an adapter for a {@link com.opcoach.generator.ecore.dsgen.DSGenPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDSGenPackageAdapter() {
		if (dsGenPackageItemProvider == null)
		{
			dsGenPackageItemProvider = new DSGenPackageItemProvider(this);
		}

		return dsGenPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.opcoach.generator.ecore.dsgen.DSGenClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenClassItemProvider dsGenClassItemProvider;

	/**
	 * This creates an adapter for a {@link com.opcoach.generator.ecore.dsgen.DSGenClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDSGenClassAdapter() {
		if (dsGenClassItemProvider == null)
		{
			dsGenClassItemProvider = new DSGenClassItemProvider(this);
		}

		return dsGenClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.opcoach.generator.ecore.dsgen.DSGenFeature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenFeatureItemProvider dsGenFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link com.opcoach.generator.ecore.dsgen.DSGenFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDSGenFeatureAdapter() {
		if (dsGenFeatureItemProvider == null)
		{
			dsGenFeatureItemProvider = new DSGenFeatureItemProvider(this);
		}

		return dsGenFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.opcoach.generator.ecore.dsgen.DSGenEnumLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenEnumLiteralItemProvider dsGenEnumLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link com.opcoach.generator.ecore.dsgen.DSGenEnumLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDSGenEnumLiteralAdapter() {
		if (dsGenEnumLiteralItemProvider == null)
		{
			dsGenEnumLiteralItemProvider = new DSGenEnumLiteralItemProvider(this);
		}

		return dsGenEnumLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.opcoach.generator.ecore.dsgen.DSGenDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenDataTypeItemProvider dsGenDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link com.opcoach.generator.ecore.dsgen.DSGenDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDSGenDataTypeAdapter() {
		if (dsGenDataTypeItemProvider == null)
		{
			dsGenDataTypeItemProvider = new DSGenDataTypeItemProvider(this);
		}

		return dsGenDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.opcoach.generator.ecore.dsgen.DSGenAnnotation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenAnnotationItemProvider dsGenAnnotationItemProvider;

	/**
	 * This creates an adapter for a {@link com.opcoach.generator.ecore.dsgen.DSGenAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDSGenAnnotationAdapter() {
		if (dsGenAnnotationItemProvider == null)
		{
			dsGenAnnotationItemProvider = new DSGenAnnotationItemProvider(this);
		}

		return dsGenAnnotationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.opcoach.generator.ecore.dsgen.DSGenTypeParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenTypeParameterItemProvider dsGenTypeParameterItemProvider;

	/**
	 * This creates an adapter for a {@link com.opcoach.generator.ecore.dsgen.DSGenTypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDSGenTypeParameterAdapter() {
		if (dsGenTypeParameterItemProvider == null)
		{
			dsGenTypeParameterItemProvider = new DSGenTypeParameterItemProvider(this);
		}

		return dsGenTypeParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.opcoach.generator.ecore.dsgen.DSGenAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenAttributeItemProvider dsGenAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link com.opcoach.generator.ecore.dsgen.DSGenAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDSGenAttributeAdapter() {
		if (dsGenAttributeItemProvider == null)
		{
			dsGenAttributeItemProvider = new DSGenAttributeItemProvider(this);
		}

		return dsGenAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.opcoach.generator.ecore.dsgen.DSGenReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenReferenceItemProvider dsGenReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link com.opcoach.generator.ecore.dsgen.DSGenReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDSGenReferenceAdapter() {
		if (dsGenReferenceItemProvider == null)
		{
			dsGenReferenceItemProvider = new DSGenReferenceItemProvider(this);
		}

		return dsGenReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.opcoach.generator.ecore.dsgen.DSGenEnum} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenEnumItemProvider dsGenEnumItemProvider;

	/**
	 * This creates an adapter for a {@link com.opcoach.generator.ecore.dsgen.DSGenEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDSGenEnumAdapter()
	{
		if (dsGenEnumItemProvider == null)
		{
			dsGenEnumItemProvider = new DSGenEnumItemProvider(this);
		}

		return dsGenEnumItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.opcoach.generator.ecore.dsgen.DSGenChild} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSGenChildItemProvider dsGenChildItemProvider;

	/**
	 * This creates an adapter for a {@link com.opcoach.generator.ecore.dsgen.DSGenChild}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDSGenChildAdapter()
	{
		if (dsGenChildItemProvider == null)
		{
			dsGenChildItemProvider = new DSGenChildItemProvider(this);
		}

		return dsGenChildItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type))
		{
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
			{
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null)
		{
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (dsGenModelItemProvider != null) dsGenModelItemProvider.dispose();
		if (dsGenPackageItemProvider != null) dsGenPackageItemProvider.dispose();
		if (dsGenClassItemProvider != null) dsGenClassItemProvider.dispose();
		if (dsGenFeatureItemProvider != null) dsGenFeatureItemProvider.dispose();
		if (dsGenEnumLiteralItemProvider != null) dsGenEnumLiteralItemProvider.dispose();
		if (dsGenDataTypeItemProvider != null) dsGenDataTypeItemProvider.dispose();
		if (dsGenAnnotationItemProvider != null) dsGenAnnotationItemProvider.dispose();
		if (dsGenTypeParameterItemProvider != null) dsGenTypeParameterItemProvider.dispose();
		if (dsGenAttributeItemProvider != null) dsGenAttributeItemProvider.dispose();
		if (dsGenReferenceItemProvider != null) dsGenReferenceItemProvider.dispose();
		if (dsGenEnumItemProvider != null) dsGenEnumItemProvider.dispose();
		if (dsGenChildItemProvider != null) dsGenChildItemProvider.dispose();
	}

}
