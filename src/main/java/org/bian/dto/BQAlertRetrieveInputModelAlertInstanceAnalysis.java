package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAlertRetrieveInputModelAlertInstanceAnalysis
 */
public class BQAlertRetrieveInputModelAlertInstanceAnalysis   {
  private String alertInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return alertInstanceAnalysisReference
  **/

  public String getAlertInstanceAnalysisReference() {
    return alertInstanceAnalysisReference;
  }

  public void setAlertInstanceAnalysisReference(String alertInstanceAnalysisReference) {
    this.alertInstanceAnalysisReference = alertInstanceAnalysisReference;
  }


}

