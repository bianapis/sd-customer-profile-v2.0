package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRatingRetrieveOutputModelRatingInstanceAnalysis
 */
public class BQRatingRetrieveOutputModelRatingInstanceAnalysis   {
  private Object ratingInstanceAnalysisRecord = null;

  private String ratingInstanceAnalysisReportType = null;

  private String ratingInstanceAnalysisParameters = null;

  private Object ratingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return ratingInstanceAnalysisRecord
  **/

  public Object getRatingInstanceAnalysisRecord() {
    return ratingInstanceAnalysisRecord;
  }

  public void setRatingInstanceAnalysisRecord(Object ratingInstanceAnalysisRecord) {
    this.ratingInstanceAnalysisRecord = ratingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return ratingInstanceAnalysisReportType
  **/

  public String getRatingInstanceAnalysisReportType() {
    return ratingInstanceAnalysisReportType;
  }

  public void setRatingInstanceAnalysisReportType(String ratingInstanceAnalysisReportType) {
    this.ratingInstanceAnalysisReportType = ratingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return ratingInstanceAnalysisParameters
  **/

  public String getRatingInstanceAnalysisParameters() {
    return ratingInstanceAnalysisParameters;
  }

  public void setRatingInstanceAnalysisParameters(String ratingInstanceAnalysisParameters) {
    this.ratingInstanceAnalysisParameters = ratingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return ratingInstanceAnalysisReport
  **/

  public Object getRatingInstanceAnalysisReport() {
    return ratingInstanceAnalysisReport;
  }

  public void setRatingInstanceAnalysisReport(Object ratingInstanceAnalysisReport) {
    this.ratingInstanceAnalysisReport = ratingInstanceAnalysisReport;
  }


}

