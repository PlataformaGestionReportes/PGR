/**
 */
package pgr.domain.util;

import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.emf.ecore.EObject;

import pgr.domain.Domain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unzip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pgr.domain.util.Unzip#getTheDomain <em>The Domain</em>}</li>
 * </ul>
 *
 * @see pgr.domain.util.UtilPackage#getUnzip()
 * @model
 * @generated
 */
public interface Unzip extends EObject {
	/**
	 * Returns the value of the '<em><b>The Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pgr.domain.Domain#getTheUnzip <em>The Unzip</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain</em>' container reference.
	 * @see #setTheDomain(Domain)
	 * @see pgr.domain.util.UtilPackage#getUnzip_TheDomain()
	 * @see pgr.domain.Domain#getTheUnzip
	 * @model opposite="theUnzip"
	 * @generated
	 */
	Domain getTheDomain();

	/**
	 * Sets the value of the '{@link pgr.domain.util.Unzip#getTheDomain <em>The Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Domain</em>' container reference.
	 * @see #getTheDomain()
	 * @generated
	 */
	void setTheDomain(Domain value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model inDataType="pgr.datatypes.datatypesjava.InputStream" outDataType="pgr.datatypes.datatypesjava.OutputStream"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tbyte[] buffer = new byte[1024];\r\n\t\tint len;\r\n\t\ttry {\r\n\t\t\twhile ((len = in.read(buffer)) >= 0)\r\n\t\t\t\tout.write(buffer, 0, len);\r\n\t\t\t\tin.close();\r\n\t\t\t\tout.close();\r\n\t\t} catch (java.io.IOException e) {\r\n\t\t\t// TODO Auto-generated catch block\r\n\t\t\te.printStackTrace();\r\n\t\t}'"
	 * @generated
	 */
	void copyInputStream(InputStream in, OutputStream out);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tint index = fileName.length()-1;\r\n\t\tchar c = fileName.charAt(index);\r\n\t\twhile(c!=\'.\'){\r\n\t\t\tindex--;\r\n\t\t\tc = fileName.charAt(index);\r\n\t\t}\r\n\t\treturn fileName.substring(0, index);'"
	 * @generated
	 */
	String removeExtension(String fileName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tjava.util.Enumeration<?> entries;\r\n\t\tjava.util.zip.ZipFile zipFile;\r\n\t\t\r\n\t\tString dir = \"OpenXML/\" + removeExtension(fileName)+\"/\";\r\n\t\r\n\t\ttry {\r\n\t\t\tzipFile = new java.util.zip.ZipFile(url);\r\n\t\t\tentries = zipFile.entries();\r\n\t\t\r\n\t\t\twhile (entries.hasMoreElements()) {\r\n\t\t\t\tjava.util.zip.ZipEntry entry = (java.util.zip.ZipEntry) entries.nextElement();\r\n\r\n\t\t\t\tif (entry.isDirectory()) {\r\n\t\t\t\t\t// Assume directories are stored parents first then\r\n\t\t\t\t\t// children.\r\n\t\t\t\t\tjava.io.File parent = new java.io.File(entry.getName()).getParentFile();\r\n\t\t\t\t\tif (parent != null)\r\n\t\t\t\t\t{\r\n\t\t\t\t\t    parent.mkdirs();\r\n\t\t\t\t\t}\r\n\t\t\t\t\t//System.err.println(\"Extracting directory: \"+ entry.getName());\r\n\t\t\t\t\t(new java.io.File(entry.getName())).mkdirs();\r\n\t\t\t\t\tcontinue;\r\n\t\t\t\t}\r\n\t\t\t\tjava.io.File parent = new java.io.File(dir+entry.getName()).getParentFile();\r\n\t\t\t\tif (parent != null)\r\n\t\t\t\t{\r\n\t\t\t\t    parent.mkdirs();\r\n\t\t\t\t}\r\n\t\t\t\t//System.err.println(\"Extracting file: \" + entry.getName());\r\n\t\t\t\tcopyInputStream( zipFile.getInputStream(entry), \r\n\t\t\t\t\t\tnew java.io.BufferedOutputStream(new java.io.FileOutputStream(dir+entry.getName())));\r\n\t\t\t}\r\n\t\t\tzipFile.close();\r\n\t\t} catch (java.io.IOException ioe) {\r\n\t\t\tSystem.err.println(\"Unhandled exception:\");\r\n\t\t\tioe.printStackTrace();\r\n\t\t\treturn;\r\n\t\t}'"
	 * @generated
	 */
	void unzip(String url, String fileName);

} // Unzip
