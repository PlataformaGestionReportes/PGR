/**
 */
package pgr.domain.util.impl;

import java.io.InputStream;
import java.io.OutputStream;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import pgr.domain.Domain;
import pgr.domain.DomainPackage;

import pgr.domain.util.Unzip;
import pgr.domain.util.UtilPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unzip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pgr.domain.util.impl.UnzipImpl#getTheDomain <em>The Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnzipImpl extends MinimalEObjectImpl.Container implements Unzip {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnzipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilPackage.Literals.UNZIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getTheDomain() {
		if (eContainerFeatureID() != UtilPackage.UNZIP__THE_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheDomain(Domain newTheDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheDomain, UtilPackage.UNZIP__THE_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheDomain(Domain newTheDomain) {
		if (newTheDomain != eInternalContainer() || (eContainerFeatureID() != UtilPackage.UNZIP__THE_DOMAIN && newTheDomain != null)) {
			if (EcoreUtil.isAncestor(this, newTheDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheDomain != null)
				msgs = ((InternalEObject)newTheDomain).eInverseAdd(this, DomainPackage.DOMAIN__THE_UNZIP, Domain.class, msgs);
			msgs = basicSetTheDomain(newTheDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilPackage.UNZIP__THE_DOMAIN, newTheDomain, newTheDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void copyInputStream(final InputStream in, final OutputStream out) {
				byte[] buffer = new byte[1024];
				int len;
				try {
					while ((len = in.read(buffer)) >= 0)
						out.write(buffer, 0, len);
						in.close();
						out.close();
				} catch (java.io.IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String removeExtension(final String fileName) {
				int index = fileName.length()-1;
				char c = fileName.charAt(index);
				while(c!='.'){
					index--;
					c = fileName.charAt(index);
				}
				return fileName.substring(0, index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unzip(final String url, final String fileName) {
				java.util.Enumeration<?> entries;
				java.util.zip.ZipFile zipFile;
				
				String dir = "OpenXML/" + removeExtension(fileName)+"/";
			
				try {
					zipFile = new java.util.zip.ZipFile(url);
					entries = zipFile.entries();
				
					while (entries.hasMoreElements()) {
						java.util.zip.ZipEntry entry = (java.util.zip.ZipEntry) entries.nextElement();
		
						if (entry.isDirectory()) {
							// Assume directories are stored parents first then
							// children.
							java.io.File parent = new java.io.File(entry.getName()).getParentFile();
							if (parent != null) {
							    parent.mkdirs();
							}
							//System.err.println("Extracting directory: "+ entry.getName());
							(new java.io.File(entry.getName())).mkdirs();
							continue;
						}
						java.io.File parent = new java.io.File(dir+entry.getName()).getParentFile();
						if (parent != null) {
						    parent.mkdirs();
						}
						//System.err.println("Extracting file: " + entry.getName());
						copyInputStream( zipFile.getInputStream(entry), 
								new java.io.BufferedOutputStream(new java.io.FileOutputStream(dir+entry.getName())));
					}
					zipFile.close();
				} catch (java.io.IOException ioe) {
					System.err.println("Unhandled exception:");
					ioe.printStackTrace();
					return;
				}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UtilPackage.UNZIP__THE_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheDomain((Domain)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UtilPackage.UNZIP__THE_DOMAIN:
				return basicSetTheDomain(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UtilPackage.UNZIP__THE_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__THE_UNZIP, Domain.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UtilPackage.UNZIP__THE_DOMAIN:
				return getTheDomain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UtilPackage.UNZIP__THE_DOMAIN:
				setTheDomain((Domain)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UtilPackage.UNZIP__THE_DOMAIN:
				setTheDomain((Domain)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UtilPackage.UNZIP__THE_DOMAIN:
				return getTheDomain() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case UtilPackage.UNZIP___COPY_INPUT_STREAM__INPUTSTREAM_OUTPUTSTREAM:
				copyInputStream((InputStream)arguments.get(0), (OutputStream)arguments.get(1));
				return null;
			case UtilPackage.UNZIP___REMOVE_EXTENSION__STRING:
				return removeExtension((String)arguments.get(0));
			case UtilPackage.UNZIP___UNZIP__STRING_STRING:
				unzip((String)arguments.get(0), (String)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //UnzipImpl
