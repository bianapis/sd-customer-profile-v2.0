package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStatusRetrieveOutputModelStatusInstanceAnalysis
 */
public class BQStatusRetrieveOutputModelStatusInstanceAnalysis   {
  private Object statusInstanceAnalysisRecord = null;

  private String statusInstanceAnalysisReportType = null;

  private String statusInstanceAnalysisParameters = null;

  private Object statusInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return statusInstanceAnalysisRecord
  **/

  public Object getStatusInstanceAnalysisRecord() {
    return statusInstanceAnalysisRecord;
  }

  public void setStatusInstanceAnalysisRecord(Object statusInstanceAnalysisRecord) {
    this.statusInstanceAnalysisRecord = statusInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return statusInstanceAnalysisReportType
  **/

  public String getStatusInstanceAnalysisReportType() {
    return statusInstanceAnalysisReportType;
  }

  public void setStatusInstanceAnalysisReportType(String statusInstanceAnalysisReportType) {
    this.statusInstanceAnalysisReportType = statusInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return statusInstanceAnalysisParameters
  **/

  public String getStatusInstanceAnalysisParameters() {
    return statusInstanceAnalysisParameters;
  }

  public void setStatusInstanceAnalysisParameters(String statusInstanceAnalysisParameters) {
    this.statusInstanceAnalysisParameters = statusInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return statusInstanceAnalysisReport
  **/

  public Object getStatusInstanceAnalysisReport() {
    return statusInstanceAnalysisReport;
  }

  public void setStatusInstanceAnalysisReport(Object statusInstanceAnalysisReport) {
    this.statusInstanceAnalysisReport = statusInstanceAnalysisReport;
  }


}

