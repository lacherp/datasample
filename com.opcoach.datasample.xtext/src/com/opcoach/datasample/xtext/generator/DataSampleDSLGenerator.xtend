/*
 * generated by Xtext
 */
package com.opcoach.datasample.xtext.generator

import com.opcoach.datasample.DataSample
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.common.util.URI
import java.io.ByteArrayOutputStream

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class DataSampleDSLGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		val ds = resource.contents.head as DataSample
		val generated = ds.generateValue
		
		println("Generated Object :" + generated.toString)
		
		val rset= new ResourceSetImpl
		rset.resourceFactoryRegistry.extensionToFactoryMap.put("xml", new XMIResourceFactoryImpl)
		val res = rset.createResource(URI.createFileURI("tmp.xml"));
		val baos= new ByteArrayOutputStream
		res.contents.add(generated)
		res.save(baos, null)
		
		fsa.generateFile("dataSampleGenerated.xml", baos.toString)
		
	}
	
	
}
