package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAlertRetrieveOutputModelAlertInstanceAnalysis
 */
public class BQAlertRetrieveOutputModelAlertInstanceAnalysis   {
  private Object alertInstanceAnalysisRecord = null;

  private String alertInstanceAnalysisReportType = null;

  private String alertInstanceAnalysisParameters = null;

  private Object alertInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return alertInstanceAnalysisRecord
  **/

  public Object getAlertInstanceAnalysisRecord() {
    return alertInstanceAnalysisRecord;
  }

  public void setAlertInstanceAnalysisRecord(Object alertInstanceAnalysisRecord) {
    this.alertInstanceAnalysisRecord = alertInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return alertInstanceAnalysisReportType
  **/

  public String getAlertInstanceAnalysisReportType() {
    return alertInstanceAnalysisReportType;
  }

  public void setAlertInstanceAnalysisReportType(String alertInstanceAnalysisReportType) {
    this.alertInstanceAnalysisReportType = alertInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return alertInstanceAnalysisParameters
  **/

  public String getAlertInstanceAnalysisParameters() {
    return alertInstanceAnalysisParameters;
  }

  public void setAlertInstanceAnalysisParameters(String alertInstanceAnalysisParameters) {
    this.alertInstanceAnalysisParameters = alertInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return alertInstanceAnalysisReport
  **/

  public Object getAlertInstanceAnalysisReport() {
    return alertInstanceAnalysisReport;
  }

  public void setAlertInstanceAnalysisReport(Object alertInstanceAnalysisReport) {
    this.alertInstanceAnalysisReport = alertInstanceAnalysisReport;
  }


}

