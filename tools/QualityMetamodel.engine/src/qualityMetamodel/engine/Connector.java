package qualityMetamodel.engine;

import org.mdeforge.business.model.ATLTransformation;
import org.mdeforge.business.model.EcoreMetamodel;

import QualityMetamodel.SingleValue;

public interface Connector {

	void getInstanciateValueType(SingleValue singleValue, String artifactName);
	EcoreMetamodel uploadMetamodel(String artifactPath);
	ATLTransformation uploadTransformation(String transformationPath);
}
