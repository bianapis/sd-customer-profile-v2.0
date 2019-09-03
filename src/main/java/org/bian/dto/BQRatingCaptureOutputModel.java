package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRatingCaptureOutputModelRatingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRatingCaptureOutputModel
 */
public class BQRatingCaptureOutputModel   {
  private BQRatingCaptureOutputModelRatingInstanceRecord ratingInstanceRecord = null;

  private String ratingCaptureActionTaskReference = null;

  private Object ratingCaptureActionTaskRecord = null;

  private String ratingCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get ratingInstanceRecord
   * @return ratingInstanceRecord
  **/

  public BQRatingCaptureOutputModelRatingInstanceRecord getRatingInstanceRecord() {
    return ratingInstanceRecord;
  }

  public void setRatingInstanceRecord(BQRatingCaptureOutputModelRatingInstanceRecord ratingInstanceRecord) {
    this.ratingInstanceRecord = ratingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Rating instance capture service call 
   * @return ratingCaptureActionTaskReference
  **/

  public String getRatingCaptureActionTaskReference() {
    return ratingCaptureActionTaskReference;
  }

  public void setRatingCaptureActionTaskReference(String ratingCaptureActionTaskReference) {
    this.ratingCaptureActionTaskReference = ratingCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Rating structured input transaction/record 
   * @return ratingCaptureRecordReference
  **/

  public String getRatingCaptureRecordReference() {
    return ratingCaptureRecordReference;
  }

  public void setRatingCaptureRecordReference(String ratingCaptureRecordReference) {
    this.ratingCaptureRecordReference = ratingCaptureRecordReference;
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

