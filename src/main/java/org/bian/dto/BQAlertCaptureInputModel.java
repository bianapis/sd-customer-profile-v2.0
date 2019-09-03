package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAlertUpdateInputModelAlertInstanceRecord;
import org.bian.dto.BQStatusCaptureInputModelCaptureRecordType;

import javax.validation.Valid;
  
/**
 * BQAlertCaptureInputModel
 */
public class BQAlertCaptureInputModel   {
  private String partyStateInstanceReference = null;

  private String alertInstanceReference = null;

  private BQAlertUpdateInputModelAlertInstanceRecord alertInstanceRecord = null;

  private Object alertCaptureActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Alert instance 
   * @return alertInstanceReference
  **/

  public String getAlertInstanceReference() {
    return alertInstanceReference;
  }

  public void setAlertInstanceReference(String alertInstanceReference) {
    this.alertInstanceReference = alertInstanceReference;
  }


  /**
   * Get alertInstanceRecord
   * @return alertInstanceRecord
  **/

  public BQAlertUpdateInputModelAlertInstanceRecord getAlertInstanceRecord() {
    return alertInstanceRecord;
  }

  public void setAlertInstanceRecord(BQAlertUpdateInputModelAlertInstanceRecord alertInstanceRecord) {
    this.alertInstanceRecord = alertInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return alertCaptureActionTaskRecord
  **/

  public Object getAlertCaptureActionTaskRecord() {
    return alertCaptureActionTaskRecord;
  }

  public void setAlertCaptureActionTaskRecord(Object alertCaptureActionTaskRecord) {
    this.alertCaptureActionTaskRecord = alertCaptureActionTaskRecord;
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

