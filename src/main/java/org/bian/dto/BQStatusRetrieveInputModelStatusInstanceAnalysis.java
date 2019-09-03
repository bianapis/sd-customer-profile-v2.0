package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStatusRetrieveInputModelStatusInstanceAnalysis
 */
public class BQStatusRetrieveInputModelStatusInstanceAnalysis   {
  private String statusInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return statusInstanceAnalysisReference
  **/

  public String getStatusInstanceAnalysisReference() {
    return statusInstanceAnalysisReference;
  }

  public void setStatusInstanceAnalysisReference(String statusInstanceAnalysisReference) {
    this.statusInstanceAnalysisReference = statusInstanceAnalysisReference;
  }


}

