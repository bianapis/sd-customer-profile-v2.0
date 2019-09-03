package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRatingRetrieveOutputModelRatingInstanceReport
 */
public class BQRatingRetrieveOutputModelRatingInstanceReport   {
  private Object ratingInstanceReportRecord = null;

  private String ratingInstanceReportType = null;

  private String ratingInstanceReportParameters = null;

  private Object ratingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return ratingInstanceReportRecord
  **/

  public Object getRatingInstanceReportRecord() {
    return ratingInstanceReportRecord;
  }

  public void setRatingInstanceReportRecord(Object ratingInstanceReportRecord) {
    this.ratingInstanceReportRecord = ratingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return ratingInstanceReportType
  **/

  public String getRatingInstanceReportType() {
    return ratingInstanceReportType;
  }

  public void setRatingInstanceReportType(String ratingInstanceReportType) {
    this.ratingInstanceReportType = ratingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return ratingInstanceReportParameters
  **/

  public String getRatingInstanceReportParameters() {
    return ratingInstanceReportParameters;
  }

  public void setRatingInstanceReportParameters(String ratingInstanceReportParameters) {
    this.ratingInstanceReportParameters = ratingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return ratingInstanceReport
  **/

  public Object getRatingInstanceReport() {
    return ratingInstanceReport;
  }

  public void setRatingInstanceReport(Object ratingInstanceReport) {
    this.ratingInstanceReport = ratingInstanceReport;
  }


}

