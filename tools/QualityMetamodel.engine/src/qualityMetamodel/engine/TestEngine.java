package qualityMetamodel.engine;

import org.mdeforge.business.model.ATLTransformation;
import org.mdeforge.business.model.EcoreMetamodel;

public class TestEngine {

	public static void main(String[] args) throws Exception {
		Connector c = new MDEForgeConnector("http://localhost:8080/mdeforge/", "Admin", "juri");
		/**
		 * METAMODEL EXAMPLE (WITH ARTIFACT INTO THE REPOSITORY)
		 */
		TestEngine te = new TestEngine();

//		String inputQualityMMPath = "resources/quality_metamodels/QM_MM.qualitymetamodel";
//		String inputMMToEvaluateID = "59662e97640e83c4a446dbef"; // Metamodel
//																	// (Families.ecore)
//		te.testMetamodelQualityEvaluation(c, inputQualityMMPath, inputMMToEvaluateID);

		/**
		 * ATL TRANSFORMATION EXAMPLE (WITH ARTIFACT INTO THE REPOSITORY)
		 */
		String inputQualityTPath = "resources/quality_metamodels/QM_T.qualitymetamodel";
		String inputTToEvaluateID = "59663734640e02c09b443033"; // Transformation
																// (Ant2Maven.atl)
		te.testTransformationQualityEvaluation(c, inputQualityTPath, inputTToEvaluateID);

//		/**
//		 * METAMODEL UPLOAD AND QUALITY EVALUATION EXAMPLE
//		 */
//		String qualityMetamodelPath = "resources/test_cases/Bascio4.ecore";
//		te.testMetamodelUploadWithQualityEvaluation(c, qualityMetamodelPath, inputQualityMMPath);
//
//		/**
//		 * TRANSFORMATION UPLOAD AND QUALITY EVALUATION EXAMPLE (WITH INPUT AND
//		 * OUTPUT METAMODELS INTO THE REPOSITORY)
//		 */
//		String transformationPath = "resources/test_cases/Ant2Maven7.atl";
//		String inputMetamodelID = "58a048be8d6a3547999c64c2"; // Ant
//		String outputMetamodelID = "57eccf750f0c487db7b19935"; // Maven
//		te.testTransformationUploadWithQualityEvaluation(c, inputQualityTPath, transformationPath, inputMetamodelID,
//				outputMetamodelID);
//
//		/**
//		 * TRANSFORMATION UPLOAD AND QUALITY EVALUATION EXAMPLE
//		 */
//		String transformationPath2 = "resources/test_cases/ant2maven/Ant2Maven.atl";
//		String inputMetamodelPath = "resources/test_cases/ant2maven/Ant.ecore"; // Ant
//		String outputMetamodelPath = "resources/test_cases/ant2maven/maven.ecore"; // Maven
//		te.testTransformationAndMetamodelsUploadWithQualityEvaluation(c, inputQualityTPath, transformationPath2,
//				inputMetamodelPath, outputMetamodelPath);

	}

	private void testMetamodelQualityEvaluation(Connector connector, String qualityMetamodelPath, String metamodelToEvaluate) {
		Engine engine = new Engine();
		System.out.println("Calculating Metamodel Quality...");
		try {
			engine.calculateQuality(connector, qualityMetamodelPath, metamodelToEvaluate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void testTransformationQualityEvaluation(Connector connector, String qualityMetamodelPath, String metamodelToEvaluate) {
		Engine engine = new Engine();
		System.out.println("Calculating Transformation Quality...");
		try {
			engine.calculateQuality(connector, qualityMetamodelPath, metamodelToEvaluate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void testMetamodelUploadWithQualityEvaluation(Connector connector, String qualityMetamodelPath,
			String metamodelToUploadAndEvaluate) {
		/**
		 * METAMODEL QUALITY CALCULATION EXAMPLE
		 */
		Engine engine = new Engine();
		EcoreMetamodel uploadedMetamodel = connector.uploadMetamodel(metamodelToUploadAndEvaluate);
		if (uploadedMetamodel.getId() != null) {
			System.out.println(uploadedMetamodel.getName() + " imported! Id = " + uploadedMetamodel.getId());
			System.out.println("Calculating Metamodel Quality...");
			try {
				engine.calculateQuality(connector, qualityMetamodelPath, uploadedMetamodel.getId());
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Not ID setted!");
		}
	}

	private void testTransformationUploadWithQualityEvaluation(Connector connector, String qualityMetamodelPath,
			String transformationToUploadAndEvaluate, String inputMetamodelID, String outputMetamodelID) {
		/**
		 * TRANSFORMATION QUALITY CALCULATION EXAMPLE
		 */
		Engine engine = new Engine();
		ATLTransformation atlTransformation = connector.uploadTransformation(transformationToUploadAndEvaluate);
		if (atlTransformation.getId() != null) {
			System.out.println(atlTransformation.getName() + " imported! Id = " + atlTransformation.getId());
			System.out.println("Calculating Transformation Quality...");
			try {
				engine.calculateQuality(connector, qualityMetamodelPath, atlTransformation.getId());
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Not ID setted!");
		}
	}

	private void testTransformationAndMetamodelsUploadWithQualityEvaluation(Connector connector, String inputQualityTPath,
			String transformationPath2, String inputMetamodelPath, String outputMetamodelPath) {
		/**
		 * TRANSFORMATION QUALITY CALCULATION EXAMPLE
		 */
		Engine engine = new Engine();

		EcoreMetamodel inputMetamodel = connector.uploadMetamodel(inputMetamodelPath);
		EcoreMetamodel outputMetamodel = connector.uploadMetamodel(outputMetamodelPath);
		// Check if metamodels exists into the repository
		if (inputMetamodel.getId() != null && outputMetamodel.getId() != null) {
			ATLTransformation atlTransformation = connector.uploadTransformation(transformationPath2);
			if (atlTransformation.getId() != null) {
				System.out.println(atlTransformation.getName() + " imported! Id = " + atlTransformation.getId());
				System.out.println("Calculating Transformation Quality...");
				try {
					engine.calculateQuality(connector, inputQualityTPath, atlTransformation.getId());
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Not ID setted!");
			}
		}

	}

}
