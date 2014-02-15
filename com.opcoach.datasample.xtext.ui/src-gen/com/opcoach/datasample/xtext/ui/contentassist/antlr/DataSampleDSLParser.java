/*
* generated by Xtext
*/
package com.opcoach.datasample.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.opcoach.datasample.xtext.services.DataSampleDSLGrammarAccess;

public class DataSampleDSLParser extends AbstractContentAssistParser {
	
	@Inject
	private DataSampleDSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.opcoach.datasample.xtext.ui.contentassist.antlr.internal.InternalDataSampleDSLParser createParser() {
		com.opcoach.datasample.xtext.ui.contentassist.antlr.internal.InternalDataSampleDSLParser result = new com.opcoach.datasample.xtext.ui.contentassist.antlr.internal.InternalDataSampleDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEClassifierAccess().getAlternatives(), "rule__EClassifier__Alternatives");
					put(grammarAccess.getEStructuralFeatureAccess().getAlternatives(), "rule__EStructuralFeature__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getLanguageAccess().getAlternatives(), "rule__Language__Alternatives");
					put(grammarAccess.getDataSampleAccess().getGroup(), "rule__DataSample__Group__0");
					put(grammarAccess.getDataSampleAccess().getGroup_4(), "rule__DataSample__Group_4__0");
					put(grammarAccess.getDataSampleAccess().getGroup_5(), "rule__DataSample__Group_5__0");
					put(grammarAccess.getDataSampleAccess().getGroup_6(), "rule__DataSample__Group_6__0");
					put(grammarAccess.getDataSampleAccess().getGroup_7(), "rule__DataSample__Group_7__0");
					put(grammarAccess.getDataSampleAccess().getGroup_7_3(), "rule__DataSample__Group_7_3__0");
					put(grammarAccess.getDataSampleAccess().getGroup_8(), "rule__DataSample__Group_8__0");
					put(grammarAccess.getDataSampleAccess().getGroup_9(), "rule__DataSample__Group_9__0");
					put(grammarAccess.getDataSampleAccess().getGroup_10(), "rule__DataSample__Group_10__0");
					put(grammarAccess.getDataSampleAccess().getGroup_10_3(), "rule__DataSample__Group_10_3__0");
					put(grammarAccess.getDataSampleAccess().getGroup_11(), "rule__DataSample__Group_11__0");
					put(grammarAccess.getDataSampleAccess().getGroup_11_3(), "rule__DataSample__Group_11_3__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getEPackageAccess().getGroup(), "rule__EPackage__Group__0");
					put(grammarAccess.getEPackageAccess().getGroup_4(), "rule__EPackage__Group_4__0");
					put(grammarAccess.getEPackageAccess().getGroup_5(), "rule__EPackage__Group_5__0");
					put(grammarAccess.getEPackageAccess().getGroup_6(), "rule__EPackage__Group_6__0");
					put(grammarAccess.getEPackageAccess().getGroup_6_3(), "rule__EPackage__Group_6_3__0");
					put(grammarAccess.getEPackageAccess().getGroup_7(), "rule__EPackage__Group_7__0");
					put(grammarAccess.getEPackageAccess().getGroup_7_3(), "rule__EPackage__Group_7_3__0");
					put(grammarAccess.getEPackageAccess().getGroup_8(), "rule__EPackage__Group_8__0");
					put(grammarAccess.getEPackageAccess().getGroup_8_3(), "rule__EPackage__Group_8_3__0");
					put(grammarAccess.getEntityGeneratorAccess().getGroup(), "rule__EntityGenerator__Group__0");
					put(grammarAccess.getEntityGeneratorAccess().getGroup_3(), "rule__EntityGenerator__Group_3__0");
					put(grammarAccess.getEntityGeneratorAccess().getGroup_4(), "rule__EntityGenerator__Group_4__0");
					put(grammarAccess.getEntityGeneratorAccess().getGroup_5(), "rule__EntityGenerator__Group_5__0");
					put(grammarAccess.getFieldGeneratorAccess().getGroup(), "rule__FieldGenerator__Group__0");
					put(grammarAccess.getFieldGeneratorAccess().getGroup_2(), "rule__FieldGenerator__Group_2__0");
					put(grammarAccess.getFieldGeneratorAccess().getGroup_3(), "rule__FieldGenerator__Group_3__0");
					put(grammarAccess.getFieldGeneratorAccess().getGroup_4(), "rule__FieldGenerator__Group_4__0");
					put(grammarAccess.getFieldGeneratorAccess().getGroup_5(), "rule__FieldGenerator__Group_5__0");
					put(grammarAccess.getFieldGeneratorAccess().getGroup_8(), "rule__FieldGenerator__Group_8__0");
					put(grammarAccess.getEClassAccess().getGroup(), "rule__EClass__Group__0");
					put(grammarAccess.getEClassAccess().getGroup_6(), "rule__EClass__Group_6__0");
					put(grammarAccess.getEClassAccess().getGroup_7(), "rule__EClass__Group_7__0");
					put(grammarAccess.getEClassAccess().getGroup_8(), "rule__EClass__Group_8__0");
					put(grammarAccess.getEClassAccess().getGroup_8_3(), "rule__EClass__Group_8_3__0");
					put(grammarAccess.getEClassAccess().getGroup_9(), "rule__EClass__Group_9__0");
					put(grammarAccess.getEClassAccess().getGroup_9_3(), "rule__EClass__Group_9_3__0");
					put(grammarAccess.getEClassAccess().getGroup_10(), "rule__EClass__Group_10__0");
					put(grammarAccess.getEClassAccess().getGroup_10_3(), "rule__EClass__Group_10_3__0");
					put(grammarAccess.getEClassAccess().getGroup_11(), "rule__EClass__Group_11__0");
					put(grammarAccess.getEClassAccess().getGroup_11_3(), "rule__EClass__Group_11_3__0");
					put(grammarAccess.getEClassAccess().getGroup_12(), "rule__EClass__Group_12__0");
					put(grammarAccess.getEClassAccess().getGroup_12_3(), "rule__EClass__Group_12_3__0");
					put(grammarAccess.getEClassAccess().getGroup_13(), "rule__EClass__Group_13__0");
					put(grammarAccess.getEClassAccess().getGroup_13_3(), "rule__EClass__Group_13_3__0");
					put(grammarAccess.getEAnnotationAccess().getGroup(), "rule__EAnnotation__Group__0");
					put(grammarAccess.getEAnnotationAccess().getGroup_3(), "rule__EAnnotation__Group_3__0");
					put(grammarAccess.getEAnnotationAccess().getGroup_4(), "rule__EAnnotation__Group_4__0");
					put(grammarAccess.getEAnnotationAccess().getGroup_4_3(), "rule__EAnnotation__Group_4_3__0");
					put(grammarAccess.getEAnnotationAccess().getGroup_5(), "rule__EAnnotation__Group_5__0");
					put(grammarAccess.getEAnnotationAccess().getGroup_5_3(), "rule__EAnnotation__Group_5_3__0");
					put(grammarAccess.getEAnnotationAccess().getGroup_6(), "rule__EAnnotation__Group_6__0");
					put(grammarAccess.getEAnnotationAccess().getGroup_6_3(), "rule__EAnnotation__Group_6_3__0");
					put(grammarAccess.getEAnnotationAccess().getGroup_7(), "rule__EAnnotation__Group_7__0");
					put(grammarAccess.getEAnnotationAccess().getGroup_7_3(), "rule__EAnnotation__Group_7_3__0");
					put(grammarAccess.getEStringToStringMapEntryAccess().getGroup(), "rule__EStringToStringMapEntry__Group__0");
					put(grammarAccess.getEStringToStringMapEntryAccess().getGroup_3(), "rule__EStringToStringMapEntry__Group_3__0");
					put(grammarAccess.getEStringToStringMapEntryAccess().getGroup_4(), "rule__EStringToStringMapEntry__Group_4__0");
					put(grammarAccess.getEObjectAccess().getGroup(), "rule__EObject__Group__0");
					put(grammarAccess.getETypeParameterAccess().getGroup(), "rule__ETypeParameter__Group__0");
					put(grammarAccess.getETypeParameterAccess().getGroup_4(), "rule__ETypeParameter__Group_4__0");
					put(grammarAccess.getETypeParameterAccess().getGroup_4_3(), "rule__ETypeParameter__Group_4_3__0");
					put(grammarAccess.getETypeParameterAccess().getGroup_5(), "rule__ETypeParameter__Group_5__0");
					put(grammarAccess.getETypeParameterAccess().getGroup_5_3(), "rule__ETypeParameter__Group_5_3__0");
					put(grammarAccess.getEDataType_ImplAccess().getGroup(), "rule__EDataType_Impl__Group__0");
					put(grammarAccess.getEDataType_ImplAccess().getGroup_4(), "rule__EDataType_Impl__Group_4__0");
					put(grammarAccess.getEDataType_ImplAccess().getGroup_5(), "rule__EDataType_Impl__Group_5__0");
					put(grammarAccess.getEDataType_ImplAccess().getGroup_6(), "rule__EDataType_Impl__Group_6__0");
					put(grammarAccess.getEDataType_ImplAccess().getGroup_7(), "rule__EDataType_Impl__Group_7__0");
					put(grammarAccess.getEDataType_ImplAccess().getGroup_7_3(), "rule__EDataType_Impl__Group_7_3__0");
					put(grammarAccess.getEDataType_ImplAccess().getGroup_8(), "rule__EDataType_Impl__Group_8__0");
					put(grammarAccess.getEDataType_ImplAccess().getGroup_8_3(), "rule__EDataType_Impl__Group_8_3__0");
					put(grammarAccess.getEEnumAccess().getGroup(), "rule__EEnum__Group__0");
					put(grammarAccess.getEEnumAccess().getGroup_4(), "rule__EEnum__Group_4__0");
					put(grammarAccess.getEEnumAccess().getGroup_5(), "rule__EEnum__Group_5__0");
					put(grammarAccess.getEEnumAccess().getGroup_6(), "rule__EEnum__Group_6__0");
					put(grammarAccess.getEEnumAccess().getGroup_7(), "rule__EEnum__Group_7__0");
					put(grammarAccess.getEEnumAccess().getGroup_7_3(), "rule__EEnum__Group_7_3__0");
					put(grammarAccess.getEEnumAccess().getGroup_8(), "rule__EEnum__Group_8__0");
					put(grammarAccess.getEEnumAccess().getGroup_8_3(), "rule__EEnum__Group_8_3__0");
					put(grammarAccess.getEEnumAccess().getGroup_9(), "rule__EEnum__Group_9__0");
					put(grammarAccess.getEEnumAccess().getGroup_9_3(), "rule__EEnum__Group_9_3__0");
					put(grammarAccess.getEGenericTypeAccess().getGroup(), "rule__EGenericType__Group__0");
					put(grammarAccess.getEGenericTypeAccess().getGroup_3(), "rule__EGenericType__Group_3__0");
					put(grammarAccess.getEGenericTypeAccess().getGroup_4(), "rule__EGenericType__Group_4__0");
					put(grammarAccess.getEGenericTypeAccess().getGroup_5(), "rule__EGenericType__Group_5__0");
					put(grammarAccess.getEGenericTypeAccess().getGroup_6(), "rule__EGenericType__Group_6__0");
					put(grammarAccess.getEGenericTypeAccess().getGroup_6_3(), "rule__EGenericType__Group_6_3__0");
					put(grammarAccess.getEGenericTypeAccess().getGroup_7(), "rule__EGenericType__Group_7__0");
					put(grammarAccess.getEEnumLiteralAccess().getGroup(), "rule__EEnumLiteral__Group__0");
					put(grammarAccess.getEEnumLiteralAccess().getGroup_4(), "rule__EEnumLiteral__Group_4__0");
					put(grammarAccess.getEEnumLiteralAccess().getGroup_5(), "rule__EEnumLiteral__Group_5__0");
					put(grammarAccess.getEEnumLiteralAccess().getGroup_6(), "rule__EEnumLiteral__Group_6__0");
					put(grammarAccess.getEEnumLiteralAccess().getGroup_6_3(), "rule__EEnumLiteral__Group_6_3__0");
					put(grammarAccess.getELongAccess().getGroup(), "rule__ELong__Group__0");
					put(grammarAccess.getReferenceGeneratorAccess().getGroup(), "rule__ReferenceGenerator__Group__0");
					put(grammarAccess.getReferenceGeneratorAccess().getGroup_3(), "rule__ReferenceGenerator__Group_3__0");
					put(grammarAccess.getReferenceGeneratorAccess().getGroup_4(), "rule__ReferenceGenerator__Group_4__0");
					put(grammarAccess.getReferenceGeneratorAccess().getGroup_5(), "rule__ReferenceGenerator__Group_5__0");
					put(grammarAccess.getReferenceGeneratorAccess().getGroup_6(), "rule__ReferenceGenerator__Group_6__0");
					put(grammarAccess.getReferenceGeneratorAccess().getGroup_7(), "rule__ReferenceGenerator__Group_7__0");
					put(grammarAccess.getReferenceGeneratorAccess().getGroup_8(), "rule__ReferenceGenerator__Group_8__0");
					put(grammarAccess.getEAttributeAccess().getGroup(), "rule__EAttribute__Group__0");
					put(grammarAccess.getEAttributeAccess().getGroup_9(), "rule__EAttribute__Group_9__0");
					put(grammarAccess.getEAttributeAccess().getGroup_10(), "rule__EAttribute__Group_10__0");
					put(grammarAccess.getEAttributeAccess().getGroup_11(), "rule__EAttribute__Group_11__0");
					put(grammarAccess.getEAttributeAccess().getGroup_12(), "rule__EAttribute__Group_12__0");
					put(grammarAccess.getEAttributeAccess().getGroup_13(), "rule__EAttribute__Group_13__0");
					put(grammarAccess.getEAttributeAccess().getGroup_14(), "rule__EAttribute__Group_14__0");
					put(grammarAccess.getEAttributeAccess().getGroup_15(), "rule__EAttribute__Group_15__0");
					put(grammarAccess.getEAttributeAccess().getGroup_16(), "rule__EAttribute__Group_16__0");
					put(grammarAccess.getEAttributeAccess().getGroup_16_3(), "rule__EAttribute__Group_16_3__0");
					put(grammarAccess.getEAttributeAccess().getGroup_17(), "rule__EAttribute__Group_17__0");
					put(grammarAccess.getEReferenceAccess().getGroup(), "rule__EReference__Group__0");
					put(grammarAccess.getEReferenceAccess().getGroup_9(), "rule__EReference__Group_9__0");
					put(grammarAccess.getEReferenceAccess().getGroup_10(), "rule__EReference__Group_10__0");
					put(grammarAccess.getEReferenceAccess().getGroup_11(), "rule__EReference__Group_11__0");
					put(grammarAccess.getEReferenceAccess().getGroup_12(), "rule__EReference__Group_12__0");
					put(grammarAccess.getEReferenceAccess().getGroup_13(), "rule__EReference__Group_13__0");
					put(grammarAccess.getEReferenceAccess().getGroup_14(), "rule__EReference__Group_14__0");
					put(grammarAccess.getEReferenceAccess().getGroup_15(), "rule__EReference__Group_15__0");
					put(grammarAccess.getEReferenceAccess().getGroup_16(), "rule__EReference__Group_16__0");
					put(grammarAccess.getEReferenceAccess().getGroup_17(), "rule__EReference__Group_17__0");
					put(grammarAccess.getEReferenceAccess().getGroup_18(), "rule__EReference__Group_18__0");
					put(grammarAccess.getEReferenceAccess().getGroup_18_3(), "rule__EReference__Group_18_3__0");
					put(grammarAccess.getEReferenceAccess().getGroup_19(), "rule__EReference__Group_19__0");
					put(grammarAccess.getEReferenceAccess().getGroup_19_3(), "rule__EReference__Group_19_3__0");
					put(grammarAccess.getEReferenceAccess().getGroup_20(), "rule__EReference__Group_20__0");
					put(grammarAccess.getEOperationAccess().getGroup(), "rule__EOperation__Group__0");
					put(grammarAccess.getEOperationAccess().getGroup_4(), "rule__EOperation__Group_4__0");
					put(grammarAccess.getEOperationAccess().getGroup_5(), "rule__EOperation__Group_5__0");
					put(grammarAccess.getEOperationAccess().getGroup_6(), "rule__EOperation__Group_6__0");
					put(grammarAccess.getEOperationAccess().getGroup_7(), "rule__EOperation__Group_7__0");
					put(grammarAccess.getEOperationAccess().getGroup_8(), "rule__EOperation__Group_8__0");
					put(grammarAccess.getEOperationAccess().getGroup_9(), "rule__EOperation__Group_9__0");
					put(grammarAccess.getEOperationAccess().getGroup_9_3(), "rule__EOperation__Group_9_3__0");
					put(grammarAccess.getEOperationAccess().getGroup_10(), "rule__EOperation__Group_10__0");
					put(grammarAccess.getEOperationAccess().getGroup_10_3(), "rule__EOperation__Group_10_3__0");
					put(grammarAccess.getEOperationAccess().getGroup_11(), "rule__EOperation__Group_11__0");
					put(grammarAccess.getEOperationAccess().getGroup_12(), "rule__EOperation__Group_12__0");
					put(grammarAccess.getEOperationAccess().getGroup_12_3(), "rule__EOperation__Group_12_3__0");
					put(grammarAccess.getEOperationAccess().getGroup_13(), "rule__EOperation__Group_13__0");
					put(grammarAccess.getEOperationAccess().getGroup_13_3(), "rule__EOperation__Group_13_3__0");
					put(grammarAccess.getEOperationAccess().getGroup_14(), "rule__EOperation__Group_14__0");
					put(grammarAccess.getEOperationAccess().getGroup_14_3(), "rule__EOperation__Group_14_3__0");
					put(grammarAccess.getEParameterAccess().getGroup(), "rule__EParameter__Group__0");
					put(grammarAccess.getEParameterAccess().getGroup_4(), "rule__EParameter__Group_4__0");
					put(grammarAccess.getEParameterAccess().getGroup_5(), "rule__EParameter__Group_5__0");
					put(grammarAccess.getEParameterAccess().getGroup_6(), "rule__EParameter__Group_6__0");
					put(grammarAccess.getEParameterAccess().getGroup_7(), "rule__EParameter__Group_7__0");
					put(grammarAccess.getEParameterAccess().getGroup_8(), "rule__EParameter__Group_8__0");
					put(grammarAccess.getEParameterAccess().getGroup_9(), "rule__EParameter__Group_9__0");
					put(grammarAccess.getEParameterAccess().getGroup_9_3(), "rule__EParameter__Group_9_3__0");
					put(grammarAccess.getEParameterAccess().getGroup_10(), "rule__EParameter__Group_10__0");
					put(grammarAccess.getDataSampleAccess().getNameAssignment_2(), "rule__DataSample__NameAssignment_2");
					put(grammarAccess.getDataSampleAccess().getSeedAssignment_4_1(), "rule__DataSample__SeedAssignment_4_1");
					put(grammarAccess.getDataSampleAccess().getLanguageAssignment_5_1(), "rule__DataSample__LanguageAssignment_5_1");
					put(grammarAccess.getDataSampleAccess().getPackageURIAssignment_6_1(), "rule__DataSample__PackageURIAssignment_6_1");
					put(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesAssignment_7_2(), "rule__DataSample__BadValueGeneratorNamesAssignment_7_2");
					put(grammarAccess.getDataSampleAccess().getBadValueGeneratorNamesAssignment_7_3_1(), "rule__DataSample__BadValueGeneratorNamesAssignment_7_3_1");
					put(grammarAccess.getDataSampleAccess().getPackageAssignment_8_1(), "rule__DataSample__PackageAssignment_8_1");
					put(grammarAccess.getDataSampleAccess().getRootEntityAssignment_9_1(), "rule__DataSample__RootEntityAssignment_9_1");
					put(grammarAccess.getDataSampleAccess().getEntityGeneratorsAssignment_10_2(), "rule__DataSample__EntityGeneratorsAssignment_10_2");
					put(grammarAccess.getDataSampleAccess().getEntityGeneratorsAssignment_10_3_1(), "rule__DataSample__EntityGeneratorsAssignment_10_3_1");
					put(grammarAccess.getDataSampleAccess().getFieldGeneratorsAssignment_11_2(), "rule__DataSample__FieldGeneratorsAssignment_11_2");
					put(grammarAccess.getDataSampleAccess().getFieldGeneratorsAssignment_11_3_1(), "rule__DataSample__FieldGeneratorsAssignment_11_3_1");
					put(grammarAccess.getEPackageAccess().getNameAssignment_2(), "rule__EPackage__NameAssignment_2");
					put(grammarAccess.getEPackageAccess().getNsURIAssignment_4_1(), "rule__EPackage__NsURIAssignment_4_1");
					put(grammarAccess.getEPackageAccess().getNsPrefixAssignment_5_1(), "rule__EPackage__NsPrefixAssignment_5_1");
					put(grammarAccess.getEPackageAccess().getEAnnotationsAssignment_6_2(), "rule__EPackage__EAnnotationsAssignment_6_2");
					put(grammarAccess.getEPackageAccess().getEAnnotationsAssignment_6_3_1(), "rule__EPackage__EAnnotationsAssignment_6_3_1");
					put(grammarAccess.getEPackageAccess().getEClassifiersAssignment_7_2(), "rule__EPackage__EClassifiersAssignment_7_2");
					put(grammarAccess.getEPackageAccess().getEClassifiersAssignment_7_3_1(), "rule__EPackage__EClassifiersAssignment_7_3_1");
					put(grammarAccess.getEPackageAccess().getESubpackagesAssignment_8_2(), "rule__EPackage__ESubpackagesAssignment_8_2");
					put(grammarAccess.getEPackageAccess().getESubpackagesAssignment_8_3_1(), "rule__EPackage__ESubpackagesAssignment_8_3_1");
					put(grammarAccess.getEntityGeneratorAccess().getNumberAssignment_3_1(), "rule__EntityGenerator__NumberAssignment_3_1");
					put(grammarAccess.getEntityGeneratorAccess().getEntityNameAssignment_4_1(), "rule__EntityGenerator__EntityNameAssignment_4_1");
					put(grammarAccess.getEntityGeneratorAccess().getEntityAssignment_5_1(), "rule__EntityGenerator__EntityAssignment_5_1");
					put(grammarAccess.getFieldGeneratorAccess().getEntityNameAssignment_2_1(), "rule__FieldGenerator__EntityNameAssignment_2_1");
					put(grammarAccess.getFieldGeneratorAccess().getFieldNameAssignment_3_1(), "rule__FieldGenerator__FieldNameAssignment_3_1");
					put(grammarAccess.getFieldGeneratorAccess().getErrorRateAssignment_4_1(), "rule__FieldGenerator__ErrorRateAssignment_4_1");
					put(grammarAccess.getFieldGeneratorAccess().getGeneratorNameAssignment_5_1(), "rule__FieldGenerator__GeneratorNameAssignment_5_1");
					put(grammarAccess.getFieldGeneratorAccess().getGeneratorAssignment_7(), "rule__FieldGenerator__GeneratorAssignment_7");
					put(grammarAccess.getFieldGeneratorAccess().getStructuralFeatureAssignment_8_1(), "rule__FieldGenerator__StructuralFeatureAssignment_8_1");
					put(grammarAccess.getEClassAccess().getAbstractAssignment_1(), "rule__EClass__AbstractAssignment_1");
					put(grammarAccess.getEClassAccess().getInterfaceAssignment_2(), "rule__EClass__InterfaceAssignment_2");
					put(grammarAccess.getEClassAccess().getNameAssignment_4(), "rule__EClass__NameAssignment_4");
					put(grammarAccess.getEClassAccess().getInstanceClassNameAssignment_6_1(), "rule__EClass__InstanceClassNameAssignment_6_1");
					put(grammarAccess.getEClassAccess().getInstanceTypeNameAssignment_7_1(), "rule__EClass__InstanceTypeNameAssignment_7_1");
					put(grammarAccess.getEClassAccess().getESuperTypesAssignment_8_2(), "rule__EClass__ESuperTypesAssignment_8_2");
					put(grammarAccess.getEClassAccess().getESuperTypesAssignment_8_3_1(), "rule__EClass__ESuperTypesAssignment_8_3_1");
					put(grammarAccess.getEClassAccess().getEAnnotationsAssignment_9_2(), "rule__EClass__EAnnotationsAssignment_9_2");
					put(grammarAccess.getEClassAccess().getEAnnotationsAssignment_9_3_1(), "rule__EClass__EAnnotationsAssignment_9_3_1");
					put(grammarAccess.getEClassAccess().getETypeParametersAssignment_10_2(), "rule__EClass__ETypeParametersAssignment_10_2");
					put(grammarAccess.getEClassAccess().getETypeParametersAssignment_10_3_1(), "rule__EClass__ETypeParametersAssignment_10_3_1");
					put(grammarAccess.getEClassAccess().getEOperationsAssignment_11_2(), "rule__EClass__EOperationsAssignment_11_2");
					put(grammarAccess.getEClassAccess().getEOperationsAssignment_11_3_1(), "rule__EClass__EOperationsAssignment_11_3_1");
					put(grammarAccess.getEClassAccess().getEStructuralFeaturesAssignment_12_2(), "rule__EClass__EStructuralFeaturesAssignment_12_2");
					put(grammarAccess.getEClassAccess().getEStructuralFeaturesAssignment_12_3_1(), "rule__EClass__EStructuralFeaturesAssignment_12_3_1");
					put(grammarAccess.getEClassAccess().getEGenericSuperTypesAssignment_13_2(), "rule__EClass__EGenericSuperTypesAssignment_13_2");
					put(grammarAccess.getEClassAccess().getEGenericSuperTypesAssignment_13_3_1(), "rule__EClass__EGenericSuperTypesAssignment_13_3_1");
					put(grammarAccess.getEAnnotationAccess().getSourceAssignment_3_1(), "rule__EAnnotation__SourceAssignment_3_1");
					put(grammarAccess.getEAnnotationAccess().getReferencesAssignment_4_2(), "rule__EAnnotation__ReferencesAssignment_4_2");
					put(grammarAccess.getEAnnotationAccess().getReferencesAssignment_4_3_1(), "rule__EAnnotation__ReferencesAssignment_4_3_1");
					put(grammarAccess.getEAnnotationAccess().getEAnnotationsAssignment_5_2(), "rule__EAnnotation__EAnnotationsAssignment_5_2");
					put(grammarAccess.getEAnnotationAccess().getEAnnotationsAssignment_5_3_1(), "rule__EAnnotation__EAnnotationsAssignment_5_3_1");
					put(grammarAccess.getEAnnotationAccess().getDetailsAssignment_6_2(), "rule__EAnnotation__DetailsAssignment_6_2");
					put(grammarAccess.getEAnnotationAccess().getDetailsAssignment_6_3_1(), "rule__EAnnotation__DetailsAssignment_6_3_1");
					put(grammarAccess.getEAnnotationAccess().getContentsAssignment_7_2(), "rule__EAnnotation__ContentsAssignment_7_2");
					put(grammarAccess.getEAnnotationAccess().getContentsAssignment_7_3_1(), "rule__EAnnotation__ContentsAssignment_7_3_1");
					put(grammarAccess.getEStringToStringMapEntryAccess().getKeyAssignment_3_1(), "rule__EStringToStringMapEntry__KeyAssignment_3_1");
					put(grammarAccess.getEStringToStringMapEntryAccess().getValueAssignment_4_1(), "rule__EStringToStringMapEntry__ValueAssignment_4_1");
					put(grammarAccess.getETypeParameterAccess().getNameAssignment_2(), "rule__ETypeParameter__NameAssignment_2");
					put(grammarAccess.getETypeParameterAccess().getEAnnotationsAssignment_4_2(), "rule__ETypeParameter__EAnnotationsAssignment_4_2");
					put(grammarAccess.getETypeParameterAccess().getEAnnotationsAssignment_4_3_1(), "rule__ETypeParameter__EAnnotationsAssignment_4_3_1");
					put(grammarAccess.getETypeParameterAccess().getEBoundsAssignment_5_2(), "rule__ETypeParameter__EBoundsAssignment_5_2");
					put(grammarAccess.getETypeParameterAccess().getEBoundsAssignment_5_3_1(), "rule__ETypeParameter__EBoundsAssignment_5_3_1");
					put(grammarAccess.getEDataType_ImplAccess().getNameAssignment_2(), "rule__EDataType_Impl__NameAssignment_2");
					put(grammarAccess.getEDataType_ImplAccess().getInstanceClassNameAssignment_4_1(), "rule__EDataType_Impl__InstanceClassNameAssignment_4_1");
					put(grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameAssignment_5_1(), "rule__EDataType_Impl__InstanceTypeNameAssignment_5_1");
					put(grammarAccess.getEDataType_ImplAccess().getSerializableAssignment_6_1(), "rule__EDataType_Impl__SerializableAssignment_6_1");
					put(grammarAccess.getEDataType_ImplAccess().getEAnnotationsAssignment_7_2(), "rule__EDataType_Impl__EAnnotationsAssignment_7_2");
					put(grammarAccess.getEDataType_ImplAccess().getEAnnotationsAssignment_7_3_1(), "rule__EDataType_Impl__EAnnotationsAssignment_7_3_1");
					put(grammarAccess.getEDataType_ImplAccess().getETypeParametersAssignment_8_2(), "rule__EDataType_Impl__ETypeParametersAssignment_8_2");
					put(grammarAccess.getEDataType_ImplAccess().getETypeParametersAssignment_8_3_1(), "rule__EDataType_Impl__ETypeParametersAssignment_8_3_1");
					put(grammarAccess.getEEnumAccess().getNameAssignment_2(), "rule__EEnum__NameAssignment_2");
					put(grammarAccess.getEEnumAccess().getInstanceClassNameAssignment_4_1(), "rule__EEnum__InstanceClassNameAssignment_4_1");
					put(grammarAccess.getEEnumAccess().getInstanceTypeNameAssignment_5_1(), "rule__EEnum__InstanceTypeNameAssignment_5_1");
					put(grammarAccess.getEEnumAccess().getSerializableAssignment_6_1(), "rule__EEnum__SerializableAssignment_6_1");
					put(grammarAccess.getEEnumAccess().getEAnnotationsAssignment_7_2(), "rule__EEnum__EAnnotationsAssignment_7_2");
					put(grammarAccess.getEEnumAccess().getEAnnotationsAssignment_7_3_1(), "rule__EEnum__EAnnotationsAssignment_7_3_1");
					put(grammarAccess.getEEnumAccess().getETypeParametersAssignment_8_2(), "rule__EEnum__ETypeParametersAssignment_8_2");
					put(grammarAccess.getEEnumAccess().getETypeParametersAssignment_8_3_1(), "rule__EEnum__ETypeParametersAssignment_8_3_1");
					put(grammarAccess.getEEnumAccess().getELiteralsAssignment_9_2(), "rule__EEnum__ELiteralsAssignment_9_2");
					put(grammarAccess.getEEnumAccess().getELiteralsAssignment_9_3_1(), "rule__EEnum__ELiteralsAssignment_9_3_1");
					put(grammarAccess.getEGenericTypeAccess().getETypeParameterAssignment_3_1(), "rule__EGenericType__ETypeParameterAssignment_3_1");
					put(grammarAccess.getEGenericTypeAccess().getEClassifierAssignment_4_1(), "rule__EGenericType__EClassifierAssignment_4_1");
					put(grammarAccess.getEGenericTypeAccess().getEUpperBoundAssignment_5_1(), "rule__EGenericType__EUpperBoundAssignment_5_1");
					put(grammarAccess.getEGenericTypeAccess().getETypeArgumentsAssignment_6_2(), "rule__EGenericType__ETypeArgumentsAssignment_6_2");
					put(grammarAccess.getEGenericTypeAccess().getETypeArgumentsAssignment_6_3_1(), "rule__EGenericType__ETypeArgumentsAssignment_6_3_1");
					put(grammarAccess.getEGenericTypeAccess().getELowerBoundAssignment_7_1(), "rule__EGenericType__ELowerBoundAssignment_7_1");
					put(grammarAccess.getEEnumLiteralAccess().getNameAssignment_2(), "rule__EEnumLiteral__NameAssignment_2");
					put(grammarAccess.getEEnumLiteralAccess().getValueAssignment_4_1(), "rule__EEnumLiteral__ValueAssignment_4_1");
					put(grammarAccess.getEEnumLiteralAccess().getLiteralAssignment_5_1(), "rule__EEnumLiteral__LiteralAssignment_5_1");
					put(grammarAccess.getEEnumLiteralAccess().getEAnnotationsAssignment_6_2(), "rule__EEnumLiteral__EAnnotationsAssignment_6_2");
					put(grammarAccess.getEEnumLiteralAccess().getEAnnotationsAssignment_6_3_1(), "rule__EEnumLiteral__EAnnotationsAssignment_6_3_1");
					put(grammarAccess.getReferenceGeneratorAccess().getBadValueProportionAssignment_3_1(), "rule__ReferenceGenerator__BadValueProportionAssignment_3_1");
					put(grammarAccess.getReferenceGeneratorAccess().getRandomSeedAssignment_4_1(), "rule__ReferenceGenerator__RandomSeedAssignment_4_1");
					put(grammarAccess.getReferenceGeneratorAccess().getIDAssignment_5_1(), "rule__ReferenceGenerator__IDAssignment_5_1");
					put(grammarAccess.getReferenceGeneratorAccess().getLocaleAssignment_6_1(), "rule__ReferenceGenerator__LocaleAssignment_6_1");
					put(grammarAccess.getReferenceGeneratorAccess().getStepAssignment_7_1(), "rule__ReferenceGenerator__StepAssignment_7_1");
					put(grammarAccess.getReferenceGeneratorAccess().getBadValueGeneratorAssignment_8_1(), "rule__ReferenceGenerator__BadValueGeneratorAssignment_8_1");
					put(grammarAccess.getEAttributeAccess().getVolatileAssignment_1(), "rule__EAttribute__VolatileAssignment_1");
					put(grammarAccess.getEAttributeAccess().getTransientAssignment_2(), "rule__EAttribute__TransientAssignment_2");
					put(grammarAccess.getEAttributeAccess().getUnsettableAssignment_3(), "rule__EAttribute__UnsettableAssignment_3");
					put(grammarAccess.getEAttributeAccess().getDerivedAssignment_4(), "rule__EAttribute__DerivedAssignment_4");
					put(grammarAccess.getEAttributeAccess().getIDAssignment_5(), "rule__EAttribute__IDAssignment_5");
					put(grammarAccess.getEAttributeAccess().getNameAssignment_7(), "rule__EAttribute__NameAssignment_7");
					put(grammarAccess.getEAttributeAccess().getOrderedAssignment_9_1(), "rule__EAttribute__OrderedAssignment_9_1");
					put(grammarAccess.getEAttributeAccess().getUniqueAssignment_10_1(), "rule__EAttribute__UniqueAssignment_10_1");
					put(grammarAccess.getEAttributeAccess().getLowerBoundAssignment_11_1(), "rule__EAttribute__LowerBoundAssignment_11_1");
					put(grammarAccess.getEAttributeAccess().getUpperBoundAssignment_12_1(), "rule__EAttribute__UpperBoundAssignment_12_1");
					put(grammarAccess.getEAttributeAccess().getChangeableAssignment_13_1(), "rule__EAttribute__ChangeableAssignment_13_1");
					put(grammarAccess.getEAttributeAccess().getDefaultValueLiteralAssignment_14_1(), "rule__EAttribute__DefaultValueLiteralAssignment_14_1");
					put(grammarAccess.getEAttributeAccess().getETypeAssignment_15_1(), "rule__EAttribute__ETypeAssignment_15_1");
					put(grammarAccess.getEAttributeAccess().getEAnnotationsAssignment_16_2(), "rule__EAttribute__EAnnotationsAssignment_16_2");
					put(grammarAccess.getEAttributeAccess().getEAnnotationsAssignment_16_3_1(), "rule__EAttribute__EAnnotationsAssignment_16_3_1");
					put(grammarAccess.getEAttributeAccess().getEGenericTypeAssignment_17_1(), "rule__EAttribute__EGenericTypeAssignment_17_1");
					put(grammarAccess.getEReferenceAccess().getVolatileAssignment_1(), "rule__EReference__VolatileAssignment_1");
					put(grammarAccess.getEReferenceAccess().getTransientAssignment_2(), "rule__EReference__TransientAssignment_2");
					put(grammarAccess.getEReferenceAccess().getUnsettableAssignment_3(), "rule__EReference__UnsettableAssignment_3");
					put(grammarAccess.getEReferenceAccess().getDerivedAssignment_4(), "rule__EReference__DerivedAssignment_4");
					put(grammarAccess.getEReferenceAccess().getContainmentAssignment_5(), "rule__EReference__ContainmentAssignment_5");
					put(grammarAccess.getEReferenceAccess().getNameAssignment_7(), "rule__EReference__NameAssignment_7");
					put(grammarAccess.getEReferenceAccess().getOrderedAssignment_9_1(), "rule__EReference__OrderedAssignment_9_1");
					put(grammarAccess.getEReferenceAccess().getUniqueAssignment_10_1(), "rule__EReference__UniqueAssignment_10_1");
					put(grammarAccess.getEReferenceAccess().getLowerBoundAssignment_11_1(), "rule__EReference__LowerBoundAssignment_11_1");
					put(grammarAccess.getEReferenceAccess().getUpperBoundAssignment_12_1(), "rule__EReference__UpperBoundAssignment_12_1");
					put(grammarAccess.getEReferenceAccess().getChangeableAssignment_13_1(), "rule__EReference__ChangeableAssignment_13_1");
					put(grammarAccess.getEReferenceAccess().getDefaultValueLiteralAssignment_14_1(), "rule__EReference__DefaultValueLiteralAssignment_14_1");
					put(grammarAccess.getEReferenceAccess().getResolveProxiesAssignment_15_1(), "rule__EReference__ResolveProxiesAssignment_15_1");
					put(grammarAccess.getEReferenceAccess().getETypeAssignment_16_1(), "rule__EReference__ETypeAssignment_16_1");
					put(grammarAccess.getEReferenceAccess().getEOppositeAssignment_17_1(), "rule__EReference__EOppositeAssignment_17_1");
					put(grammarAccess.getEReferenceAccess().getEKeysAssignment_18_2(), "rule__EReference__EKeysAssignment_18_2");
					put(grammarAccess.getEReferenceAccess().getEKeysAssignment_18_3_1(), "rule__EReference__EKeysAssignment_18_3_1");
					put(grammarAccess.getEReferenceAccess().getEAnnotationsAssignment_19_2(), "rule__EReference__EAnnotationsAssignment_19_2");
					put(grammarAccess.getEReferenceAccess().getEAnnotationsAssignment_19_3_1(), "rule__EReference__EAnnotationsAssignment_19_3_1");
					put(grammarAccess.getEReferenceAccess().getEGenericTypeAssignment_20_1(), "rule__EReference__EGenericTypeAssignment_20_1");
					put(grammarAccess.getEOperationAccess().getNameAssignment_2(), "rule__EOperation__NameAssignment_2");
					put(grammarAccess.getEOperationAccess().getOrderedAssignment_4_1(), "rule__EOperation__OrderedAssignment_4_1");
					put(grammarAccess.getEOperationAccess().getUniqueAssignment_5_1(), "rule__EOperation__UniqueAssignment_5_1");
					put(grammarAccess.getEOperationAccess().getLowerBoundAssignment_6_1(), "rule__EOperation__LowerBoundAssignment_6_1");
					put(grammarAccess.getEOperationAccess().getUpperBoundAssignment_7_1(), "rule__EOperation__UpperBoundAssignment_7_1");
					put(grammarAccess.getEOperationAccess().getETypeAssignment_8_1(), "rule__EOperation__ETypeAssignment_8_1");
					put(grammarAccess.getEOperationAccess().getEExceptionsAssignment_9_2(), "rule__EOperation__EExceptionsAssignment_9_2");
					put(grammarAccess.getEOperationAccess().getEExceptionsAssignment_9_3_1(), "rule__EOperation__EExceptionsAssignment_9_3_1");
					put(grammarAccess.getEOperationAccess().getEAnnotationsAssignment_10_2(), "rule__EOperation__EAnnotationsAssignment_10_2");
					put(grammarAccess.getEOperationAccess().getEAnnotationsAssignment_10_3_1(), "rule__EOperation__EAnnotationsAssignment_10_3_1");
					put(grammarAccess.getEOperationAccess().getEGenericTypeAssignment_11_1(), "rule__EOperation__EGenericTypeAssignment_11_1");
					put(grammarAccess.getEOperationAccess().getETypeParametersAssignment_12_2(), "rule__EOperation__ETypeParametersAssignment_12_2");
					put(grammarAccess.getEOperationAccess().getETypeParametersAssignment_12_3_1(), "rule__EOperation__ETypeParametersAssignment_12_3_1");
					put(grammarAccess.getEOperationAccess().getEParametersAssignment_13_2(), "rule__EOperation__EParametersAssignment_13_2");
					put(grammarAccess.getEOperationAccess().getEParametersAssignment_13_3_1(), "rule__EOperation__EParametersAssignment_13_3_1");
					put(grammarAccess.getEOperationAccess().getEGenericExceptionsAssignment_14_2(), "rule__EOperation__EGenericExceptionsAssignment_14_2");
					put(grammarAccess.getEOperationAccess().getEGenericExceptionsAssignment_14_3_1(), "rule__EOperation__EGenericExceptionsAssignment_14_3_1");
					put(grammarAccess.getEParameterAccess().getNameAssignment_2(), "rule__EParameter__NameAssignment_2");
					put(grammarAccess.getEParameterAccess().getOrderedAssignment_4_1(), "rule__EParameter__OrderedAssignment_4_1");
					put(grammarAccess.getEParameterAccess().getUniqueAssignment_5_1(), "rule__EParameter__UniqueAssignment_5_1");
					put(grammarAccess.getEParameterAccess().getLowerBoundAssignment_6_1(), "rule__EParameter__LowerBoundAssignment_6_1");
					put(grammarAccess.getEParameterAccess().getUpperBoundAssignment_7_1(), "rule__EParameter__UpperBoundAssignment_7_1");
					put(grammarAccess.getEParameterAccess().getETypeAssignment_8_1(), "rule__EParameter__ETypeAssignment_8_1");
					put(grammarAccess.getEParameterAccess().getEAnnotationsAssignment_9_2(), "rule__EParameter__EAnnotationsAssignment_9_2");
					put(grammarAccess.getEParameterAccess().getEAnnotationsAssignment_9_3_1(), "rule__EParameter__EAnnotationsAssignment_9_3_1");
					put(grammarAccess.getEParameterAccess().getEGenericTypeAssignment_10_1(), "rule__EParameter__EGenericTypeAssignment_10_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.opcoach.datasample.xtext.ui.contentassist.antlr.internal.InternalDataSampleDSLParser typedParser = (com.opcoach.datasample.xtext.ui.contentassist.antlr.internal.InternalDataSampleDSLParser) parser;
			typedParser.entryRuleDataSample();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DataSampleDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DataSampleDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
