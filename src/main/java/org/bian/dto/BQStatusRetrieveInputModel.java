package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQStatusRetrieveInputModelStatusInstanceAnalysis;
import org.bian.dto.BQStatusRetrieveInputModelStatusInstanceReport;

import javax.validation.Valid;
  
/**
 * BQStatusRetrieveInputModel
 */
public class BQStatusRetrieveInputModel   {
  private Object statusRetrieveActionTaskRecord = null;

  private String statusRetrieveActionRequest = null;

  private BQStatusRetrieveInputModelStatusInstanceReport statusInstanceReport = null;

  private BQStatusRetrieveInputModelStatusInstanceAnalysis statusInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return statusRetrieveActionTaskRecord
  **/

  public Object getStatusRetrieveActionTaskRecord() {
    return statusRetrieveActionTaskRecord;
  }

  public void setStatusRetrieveActionTaskRecord(Object statusRetrieveActionTaskRecord) {
    this.statusRetrieveActionTaskRecord = statusRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return statusRetrieveActionRequest
  **/

  public String getStatusRetrieveActionRequest() {
    return statusRetrieveActionRequest;
  }

  public void setStatusRetrieveActionRequest(String statusRetrieveActionRequest) {
    this.statusRetrieveActionRequest = statusRetrieveActionRequest;
  }


  /**
   * Get statusInstanceReport
   * @return statusInstanceReport
  **/

  public BQStatusRetrieveInputModelStatusInstanceReport getStatusInstanceReport() {
    return statusInstanceReport;
  }

  public void setStatusInstanceReport(BQStatusRetrieveInputModelStatusInstanceReport statusInstanceReport) {
    this.statusInstanceReport = statusInstanceReport;
  }


  /**
   * Get statusInstanceAnalysis
   * @return statusInstanceAnalysis
  **/

  public BQStatusRetrieveInputModelStatusInstanceAnalysis getStatusInstanceAnalysis() {
    return statusInstanceAnalysis;
  }

  public void setStatusInstanceAnalysis(BQStatusRetrieveInputModelStatusInstanceAnalysis statusInstanceAnalysis) {
    this.statusInstanceAnalysis = statusInstanceAnalysis;
  }


}

