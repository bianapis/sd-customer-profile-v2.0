package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQStatusCaptureInputModelCaptureRecordType;
import org.bian.dto.BQStatusUpdateInputModelStatusInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQStatusCaptureInputModel
 */
public class BQStatusCaptureInputModel   {
  private String partyStateInstanceReference = null;

  private String statusInstanceReference = null;

  private BQStatusUpdateInputModelStatusInstanceRecord statusInstanceRecord = null;

  private Object statusCaptureActionTaskRecord = null;

  private BQStatusCaptureInputModelCaptureRecordType captureRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Party State instance 
   * @return partyStateInstanceReference
  **/

  public String getPartyStateInstanceReference() {
    return partyStateInstanceReference;
  }

  public void setPartyStateInstanceReference(String partyStateInstanceReference) {
    this.partyStateInstanceReference = partyStateInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Status instance 
   * @return statusInstanceReference
  **/

  public String getStatusInstanceReference() {
    return statusInstanceReference;
  }

  public void setStatusInstanceReference(String statusInstanceReference) {
    this.statusInstanceReference = statusInstanceReference;
  }


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
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQStatusCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQStatusCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

