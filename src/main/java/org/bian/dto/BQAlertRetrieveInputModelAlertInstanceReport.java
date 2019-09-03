package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAlertRetrieveInputModelAlertInstanceReport
 */
public class BQAlertRetrieveInputModelAlertInstanceReport   {
  private String alertInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return alertInstanceReportReference
  **/

  public String getAlertInstanceReportReference() {
    return alertInstanceReportReference;
  }

  public void setAlertInstanceReportReference(String alertInstanceReportReference) {
    this.alertInstanceReportReference = alertInstanceReportReference;
  }


}

