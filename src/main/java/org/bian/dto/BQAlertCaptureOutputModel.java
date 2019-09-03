package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAlertCaptureOutputModelAlertInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAlertCaptureOutputModel
 */
public class BQAlertCaptureOutputModel   {
  private BQAlertCaptureOutputModelAlertInstanceRecord alertInstanceRecord = null;

  private String alertCaptureActionTaskReference = null;

  private Object alertCaptureActionTaskRecord = null;

  private String alertCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get alertInstanceRecord
   * @return alertInstanceRecord
  **/

  public BQAlertCaptureOutputModelAlertInstanceRecord getAlertInstanceRecord() {
    return alertInstanceRecord;
  }

  public void setAlertInstanceRecord(BQAlertCaptureOutputModelAlertInstanceRecord alertInstanceRecord) {
    this.alertInstanceRecord = alertInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Alert instance capture service call 
   * @return alertCaptureActionTaskReference
  **/

  public String getAlertCaptureActionTaskReference() {
    return alertCaptureActionTaskReference;
  }

  public void setAlertCaptureActionTaskReference(String alertCaptureActionTaskReference) {
    this.alertCaptureActionTaskReference = alertCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Alert structured input transaction/record 
   * @return alertCaptureRecordReference
  **/

  public String getAlertCaptureRecordReference() {
    return alertCaptureRecordReference;
  }

  public void setAlertCaptureRecordReference(String alertCaptureRecordReference) {
    this.alertCaptureRecordReference = alertCaptureRecordReference;
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

