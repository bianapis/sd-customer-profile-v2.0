package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQStatusCaptureOutputModelStatusInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQStatusCaptureOutputModel
 */
public class BQStatusCaptureOutputModel   {
  private BQStatusCaptureOutputModelStatusInstanceRecord statusInstanceRecord = null;

  private String statusCaptureActionTaskReference = null;

  private Object statusCaptureActionTaskRecord = null;

  private String statusCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get statusInstanceRecord
   * @return statusInstanceRecord
  **/

  public BQStatusCaptureOutputModelStatusInstanceRecord getStatusInstanceRecord() {
    return statusInstanceRecord;
  }

  public void setStatusInstanceRecord(BQStatusCaptureOutputModelStatusInstanceRecord statusInstanceRecord) {
    this.statusInstanceRecord = statusInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Status instance capture service call 
   * @return statusCaptureActionTaskReference
  **/

  public String getStatusCaptureActionTaskReference() {
    return statusCaptureActionTaskReference;
  }

  public void setStatusCaptureActionTaskReference(String statusCaptureActionTaskReference) {
    this.statusCaptureActionTaskReference = statusCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return statusCaptureActionTaskRecord
  **/

  public Object getStatusCaptureActionTaskRecord() {
    return statusCaptureActionTaskRecord;
  }

  public void setStatusCaptureActionTaskRecord(Object statusCaptureActionTaskRecord) {
    this.statusCaptureActionTaskRecord = statusCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Status structured input transaction/record 
   * @return statusCaptureRecordReference
  **/

  public String getStatusCaptureRecordReference() {
    return statusCaptureRecordReference;
  }

  public void setStatusCaptureRecordReference(String statusCaptureRecordReference) {
    this.statusCaptureRecordReference = statusCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

