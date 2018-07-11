# Tool Setup process
Given a source artifact to be measured (e.g., a model transformation or a metamodel) and an input quality model, the evaluation engine performing the automated quality assessment activity, executes all the metrics and expressions therein by producing at the end of the process the evaluated quality model. The evaluated quality model is the declared quality model where the quality attributes have been
evaluated on a specific artifact, given as input to the evaluation engine.
* <b>QualityMetamodel</b> contains emf ojects;
* <b>QualityMetamodel.engine</b> evaluates artifacts using quality models;
* <b>QualityMetamodel.resource.qualitymetamodel</b> defines concrete syntax;
* <b>QualityMetamodel.resource.qualitymetamodel.ui</b> defines editor;
* <b>QualityMetamodel.ui</b> contains eclipse graphical ui contributions;
In asda see demo video.
# Playing with quality model
[![IMAGE ALT TEXT HERE](https://img.youtube.com/vi/QDXaKHgeVM8/0.jpg)](https://www.youtube.com/watch?v=QDXaKHgeVM8)
# Run programmatically
```Java
private void metamodelQualityEvaluation(
		Connector connector, 
		String qualityMetamodelPath, 
		String metamodelToEvaluate) {
	Engine engine = new Engine();
	try {
		engine.calculateQuality(connector, qualityMetamodelPath, metamodelToEvaluate);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

