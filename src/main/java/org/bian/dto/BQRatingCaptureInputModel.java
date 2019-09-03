package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRatingUpdateInputModelRatingInstanceRecord;
import org.bian.dto.BQStatusCaptureInputModelCaptureRecordType;

import javax.validation.Valid;
  
/**
 * BQRatingCaptureInputModel
 */
public class BQRatingCaptureInputModel   {
  private String partyStateInstanceReference = null;

  private String ratingInstanceReference = null;

  private BQRatingUpdateInputModelRatingInstanceRecord ratingInstanceRecord = null;

  private Object ratingCaptureActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Rating instance 
   * @return ratingInstanceReference
  **/

  public String getRatingInstanceReference() {
    return ratingInstanceReference;
  }

  public void setRatingInstanceReference(String ratingInstanceReference) {
    this.ratingInstanceReference = ratingInstanceReference;
  }


  /**
   * Get ratingInstanceRecord
   * @return ratingInstanceRecord
  **/

  public BQRatingUpdateInputModelRatingInstanceRecord getRatingInstanceRecord() {
    return ratingInstanceRecord;
  }

  public void setRatingInstanceRecord(BQRatingUpdateInputModelRatingInstanceRecord ratingInstanceRecord) {
    this.ratingInstanceRecord = ratingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return ratingCaptureActionTaskRecord
  **/

  public Object getRatingCaptureActionTaskRecord() {
    return ratingCaptureActionTaskRecord;
  }

  public void setRatingCaptureActionTaskRecord(Object ratingCaptureActionTaskRecord) {
    this.ratingCaptureActionTaskRecord = ratingCaptureActionTaskRecord;
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

