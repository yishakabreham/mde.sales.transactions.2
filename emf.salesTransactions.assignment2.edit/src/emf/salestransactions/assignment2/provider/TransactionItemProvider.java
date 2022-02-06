/**
 */
package emf.salestransactions.assignment2.provider;


import emf.salestransactions.assignment2.Assignment2Factory;
import emf.salestransactions.assignment2.Assignment2Package;
import emf.salestransactions.assignment2.Transaction;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link emf.salestransactions.assignment2.Transaction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransactionItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTransactionNumberPropertyDescriptor(object);
			addIssuedDatePropertyDescriptor(object);
			addTransactionTypePropertyDescriptor(object);
			addPaymentMethodPropertyDescriptor(object);
			addGrandTotalPropertyDescriptor(object);
			addTotalItemsPurchasedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Transaction Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransactionNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transaction_transactionNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transaction_transactionNumber_feature", "_UI_Transaction_type"),
				 Assignment2Package.Literals.TRANSACTION__TRANSACTION_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Issued Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIssuedDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transaction_issuedDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transaction_issuedDate_feature", "_UI_Transaction_type"),
				 Assignment2Package.Literals.TRANSACTION__ISSUED_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transaction Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransactionTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transaction_transactionType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transaction_transactionType_feature", "_UI_Transaction_type"),
				 Assignment2Package.Literals.TRANSACTION__TRANSACTION_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Payment Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaymentMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transaction_paymentMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transaction_paymentMethod_feature", "_UI_Transaction_type"),
				 Assignment2Package.Literals.TRANSACTION__PAYMENT_METHOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Grand Total feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGrandTotalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transaction_grandTotal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transaction_grandTotal_feature", "_UI_Transaction_type"),
				 Assignment2Package.Literals.TRANSACTION__GRAND_TOTAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Items Purchased feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalItemsPurchasedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transaction_totalItemsPurchased_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transaction_totalItemsPurchased_feature", "_UI_Transaction_type"),
				 Assignment2Package.Literals.TRANSACTION__TOTAL_ITEMS_PURCHASED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Assignment2Package.Literals.TRANSACTION__CUSTOMER);
			childrenFeatures.add(Assignment2Package.Literals.TRANSACTION__CASHIER);
			childrenFeatures.add(Assignment2Package.Literals.TRANSACTION__LINE_ITEM);
			childrenFeatures.add(Assignment2Package.Literals.TRANSACTION__CARD);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Transaction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Transaction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Transaction)object).getTransactionNumber();
		return label == null || label.length() == 0 ?
			getString("_UI_Transaction_type") :
			getString("_UI_Transaction_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Transaction.class)) {
			case Assignment2Package.TRANSACTION__TRANSACTION_NUMBER:
			case Assignment2Package.TRANSACTION__ISSUED_DATE:
			case Assignment2Package.TRANSACTION__TRANSACTION_TYPE:
			case Assignment2Package.TRANSACTION__PAYMENT_METHOD:
			case Assignment2Package.TRANSACTION__GRAND_TOTAL:
			case Assignment2Package.TRANSACTION__TOTAL_ITEMS_PURCHASED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Assignment2Package.TRANSACTION__CUSTOMER:
			case Assignment2Package.TRANSACTION__CASHIER:
			case Assignment2Package.TRANSACTION__LINE_ITEM:
			case Assignment2Package.TRANSACTION__CARD:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Assignment2Package.Literals.TRANSACTION__CUSTOMER,
				 Assignment2Factory.eINSTANCE.createCustomer()));

		newChildDescriptors.add
			(createChildParameter
				(Assignment2Package.Literals.TRANSACTION__CASHIER,
				 Assignment2Factory.eINSTANCE.createCashier()));

		newChildDescriptors.add
			(createChildParameter
				(Assignment2Package.Literals.TRANSACTION__LINE_ITEM,
				 Assignment2Factory.eINSTANCE.createLineItem()));

		newChildDescriptors.add
			(createChildParameter
				(Assignment2Package.Literals.TRANSACTION__CARD,
				 Assignment2Factory.eINSTANCE.createCard()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Assignment2EditPlugin.INSTANCE;
	}

}
