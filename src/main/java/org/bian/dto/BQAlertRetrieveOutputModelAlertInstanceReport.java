package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAlertRetrieveOutputModelAlertInstanceReport
 */
public class BQAlertRetrieveOutputModelAlertInstanceReport   {
  private Object alertInstanceReportRecord = null;

  private String alertInstanceReportType = null;

  private String alertInstanceReportParameters = null;

  private Object alertInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return alertInstanceReportRecord
  **/

  public Object getAlertInstanceReportRecord() {
    return alertInstanceReportRecord;
  }

  public void setAlertInstanceReportRecord(Object alertInstanceReportRecord) {
    this.alertInstanceReportRecord = alertInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return alertInstanceReportType
  **/

  public String getAlertInstanceReportType() {
    return alertInstanceReportType;
  }

  public void setAlertInstanceReportType(String alertInstanceReportType) {
    this.alertInstanceReportType = alertInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return alertInstanceReportParameters
  **/

  public String getAlertInstanceReportParameters() {
    return alertInstanceReportParameters;
  }

  public void setAlertInstanceReportParameters(String alertInstanceReportParameters) {
    this.alertInstanceReportParameters = alertInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return alertInstanceReport
  **/

  public Object getAlertInstanceReport() {
    return alertInstanceReport;
  }

  public void setAlertInstanceReport(Object alertInstanceReport) {
    this.alertInstanceReport = alertInstanceReport;
  }


}

