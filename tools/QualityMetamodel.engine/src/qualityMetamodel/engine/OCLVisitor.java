package qualityMetamodel.engine;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;

import QualityMetamodel.AggregatedValue;
import QualityMetamodel.IntegerValueType;
import QualityMetamodel.RealValueType;
import QualityMetamodel.SingleValue;
import QualityMetamodel.ValueType;
import QualityMetamodel.QMM_OCL.AddOpCallExp;
import QualityMetamodel.QMM_OCL.BraceExp;
import QualityMetamodel.QMM_OCL.IntegerExp;
import QualityMetamodel.QMM_OCL.MulOpCallExp;
import QualityMetamodel.QMM_OCL.PropertyCallExp;
import QualityMetamodel.QMM_OCL.RealExp;
import QualityMetamodel.QMM_OCL.VariableExp;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class OCLVisitor extends AbstractVisitor {
	private HashMap<EObject, Object> values = new HashMap<EObject, Object>();
	
	public HashMap<EObject, Object> getValues() {
		return values;
	}
	public void setValues(HashMap<EObject, Object> values) {
		this.values = values;
	}
	@Override
	public void beforeRealExp(RealExp self) {
		values.put(self, self.getRealSymbol());
	}
	@Override
	public void inAggregatedValue(AggregatedValue self) {
		
		Object o1 = values.get(self.getCalculatedBy().getRef());
		values.put(self.getValueType(),o1);
		
	    ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    System.out.println(self.getVarName() + ": " + o1);
	    try {
			Object res = engine.eval((String) o1);
			values.put(self,res);
		} catch (ScriptException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void inMulOpCallExp(MulOpCallExp self) {
		Object o1 = values.get(self.getSource());
		Object o2 = values.get(self.getArgument());
		values.put(self, o1 + "*" + o2);
	}
	@Override
	public void inBraceExp(BraceExp self) {
		values.put(self, "(" + ((String)values.get(self.getExp())) + ")");
	}
	@Override
	public void inAddOpCallExp(AddOpCallExp self) {
		Object o1 = values.get(self.getSource());
		Object o2 = values.get(self.getArgument());
		values.put(self, o1 + "+" + o2);
	}
	
	@Override
	public void beforeIntegerExp(IntegerExp self) {
		values.put(self, self.getIntegerSymbol());
	}
	
	@Override
	public void inPropertyCallExp(PropertyCallExp self) {
//		System.out.println(values.get(((VariableExp)self.getSource()).getReferredVariable()));
		values.put(self, values.get(((VariableExp)self.getSource()).getReferredVariable()));
	}
	
	@Override
	public void beforeSingleValue(SingleValue self) {
		ValueType res = self.getValueType(); 
		if(res instanceof IntegerValueType){
			values.put(self,((IntegerValueType)res).getValue());
			//System.out.println("SV" + ((IntegerValueType)res).getValue());
		}
		if(res instanceof RealValueType){
			values.put(self, ((RealValueType)res).getValue());
			//System.out.println("SV" + ((RealValueType)res).getValue());
		}
	}
}
