package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStatusRetrieveOutputModelStatusInstanceReport
 */
public class BQStatusRetrieveOutputModelStatusInstanceReport   {
  private Object statusInstanceReportRecord = null;

  private String statusInstanceReportType = null;

  private String statusInstanceReportParameters = null;

  private Object statusInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return statusInstanceReportRecord
  **/

  public Object getStatusInstanceReportRecord() {
    return statusInstanceReportRecord;
  }

  public void setStatusInstanceReportRecord(Object statusInstanceReportRecord) {
    this.statusInstanceReportRecord = statusInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return statusInstanceReportType
  **/

  public String getStatusInstanceReportType() {
    return statusInstanceReportType;
  }

  public void setStatusInstanceReportType(String statusInstanceReportType) {
    this.statusInstanceReportType = statusInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return statusInstanceReportParameters
  **/

  public String getStatusInstanceReportParameters() {
    return statusInstanceReportParameters;
  }

  public void setStatusInstanceReportParameters(String statusInstanceReportParameters) {
    this.statusInstanceReportParameters = statusInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return statusInstanceReport
  **/

  public Object getStatusInstanceReport() {
    return statusInstanceReport;
  }

  public void setStatusInstanceReport(Object statusInstanceReport) {
    this.statusInstanceReport = statusInstanceReport;
  }


}

