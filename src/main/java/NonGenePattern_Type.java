
/* First created by JCasGen Wed Oct 17 14:06:56 EDT 2012 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Oct 17 19:03:21 EDT 2012 <br>
 * This is the type for the nonGenePattern <br>
 * */
public class NonGenePattern_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NonGenePattern_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NonGenePattern_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NonGenePattern(addr, NonGenePattern_Type.this);
  			   NonGenePattern_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NonGenePattern(addr, NonGenePattern_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NonGenePattern.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("NonGenePattern");
 
  /** @generated */
  final Feature casFeat_GenStart;
  /** @generated */
  final int     casFeatCode_GenStart;
  /** @generated */ 
  public int getGenStart(int addr) {
        if (featOkTst && casFeat_GenStart == null)
      jcas.throwFeatMissing("GenStart", "NonGenePattern");
    return ll_cas.ll_getIntValue(addr, casFeatCode_GenStart);
  }
  /** @generated */    
  public void setGenStart(int addr, int v) {
        if (featOkTst && casFeat_GenStart == null)
      jcas.throwFeatMissing("GenStart", "NonGenePattern");
    ll_cas.ll_setIntValue(addr, casFeatCode_GenStart, v);}
    
  
 
  /** @generated */
  final Feature casFeat_GenEnd;
  /** @generated */
  final int     casFeatCode_GenEnd;
  /** @generated */ 
  public int getGenEnd(int addr) {
        if (featOkTst && casFeat_GenEnd == null)
      jcas.throwFeatMissing("GenEnd", "NonGenePattern");
    return ll_cas.ll_getIntValue(addr, casFeatCode_GenEnd);
  }
  /** @generated */    
  public void setGenEnd(int addr, int v) {
        if (featOkTst && casFeat_GenEnd == null)
      jcas.throwFeatMissing("GenEnd", "NonGenePattern");
    ll_cas.ll_setIntValue(addr, casFeatCode_GenEnd, v);}
    
  
 
  /** @generated */
  final Feature casFeat_SenID;
  /** @generated */
  final int     casFeatCode_SenID;
  /** @generated */ 
  public String getSenID(int addr) {
        if (featOkTst && casFeat_SenID == null)
      jcas.throwFeatMissing("SenID", "NonGenePattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SenID);
  }
  /** @generated */    
  public void setSenID(int addr, String v) {
        if (featOkTst && casFeat_SenID == null)
      jcas.throwFeatMissing("SenID", "NonGenePattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_SenID, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NonGenePattern_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_GenStart = jcas.getRequiredFeatureDE(casType, "GenStart", "uima.cas.Integer", featOkTst);
    casFeatCode_GenStart  = (null == casFeat_GenStart) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GenStart).getCode();

 
    casFeat_GenEnd = jcas.getRequiredFeatureDE(casType, "GenEnd", "uima.cas.Integer", featOkTst);
    casFeatCode_GenEnd  = (null == casFeat_GenEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GenEnd).getCode();

 
    casFeat_SenID = jcas.getRequiredFeatureDE(casType, "SenID", "uima.cas.String", featOkTst);
    casFeatCode_SenID  = (null == casFeat_SenID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SenID).getCode();

  }
}



    