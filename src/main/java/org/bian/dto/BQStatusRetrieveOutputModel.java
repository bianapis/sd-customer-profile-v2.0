package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQStatusRetrieveOutputModelStatusInstanceAnalysis;
import org.bian.dto.BQStatusRetrieveOutputModelStatusInstanceReport;
import org.bian.dto.BQStatusUpdateInputModelStatusInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQStatusRetrieveOutputModel
 */
public class BQStatusRetrieveOutputModel   {
  private BQStatusUpdateInputModelStatusInstanceRecord statusInstanceRecord = null;

  private String statusRetrieveActionTaskReference = null;

  private Object statusRetrieveActionTaskRecord = null;

  private String statusRetrieveActionResponse = null;

  private BQStatusRetrieveOutputModelStatusInstanceReport statusInstanceReport = null;

  private BQStatusRetrieveOutputModelStatusInstanceAnalysis statusInstanceAnalysis = null;


  /**
   * Get statusInstanceRecord
   * @return statusInstanceRecord
  **/

  public BQStatusUpdateInputModelStatusInstanceRecord getStatusInstanceRecord() {
    return statusInstanceRecord;
  }

  public void setStatusInstanceRecord(BQStatusUpdateInputModelStatusInstanceRecord statusInstanceRecord) {
    this.statusInstanceRecord = statusInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Status instance retrieve service call 
   * @return statusRetrieveActionTaskReference
  **/

  public String getStatusRetrieveActionTaskReference() {
    return statusRetrieveActionTaskReference;
  }

  public void setStatusRetrieveActionTaskReference(String statusRetrieveActionTaskReference) {
    this.statusRetrieveActionTaskReference = statusRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return statusRetrieveActionResponse
  **/

  public String getStatusRetrieveActionResponse() {
    return statusRetrieveActionResponse;
  }

  public void setStatusRetrieveActionResponse(String statusRetrieveActionResponse) {
    this.statusRetrieveActionResponse = statusRetrieveActionResponse;
  }


  /**
   * Get statusInstanceReport
   * @return statusInstanceReport
  **/

  public BQStatusRetrieveOutputModelStatusInstanceReport getStatusInstanceReport() {
    return statusInstanceReport;
  }

  public void setStatusInstanceReport(BQStatusRetrieveOutputModelStatusInstanceReport statusInstanceReport) {
    this.statusInstanceReport = statusInstanceReport;
  }


  /**
   * Get statusInstanceAnalysis
   * @return statusInstanceAnalysis
  **/

  public BQStatusRetrieveOutputModelStatusInstanceAnalysis getStatusInstanceAnalysis() {
    return statusInstanceAnalysis;
  }

  public void setStatusInstanceAnalysis(BQStatusRetrieveOutputModelStatusInstanceAnalysis statusInstanceAnalysis) {
    this.statusInstanceAnalysis = statusInstanceAnalysis;
  }


}

