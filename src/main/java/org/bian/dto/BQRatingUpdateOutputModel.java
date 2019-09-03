package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRatingUpdateInputModelRatingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRatingUpdateOutputModel
 */
public class BQRatingUpdateOutputModel   {
  private BQRatingUpdateInputModelRatingInstanceRecord ratingInstanceRecord = null;

  private String ratingUpdateActionTaskReference = null;

  private Object ratingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return ratingUpdateActionTaskReference
  **/

  public String getRatingUpdateActionTaskReference() {
    return ratingUpdateActionTaskReference;
  }

  public void setRatingUpdateActionTaskReference(String ratingUpdateActionTaskReference) {
    this.ratingUpdateActionTaskReference = ratingUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return ratingUpdateActionTaskRecord
  **/

  public Object getRatingUpdateActionTaskRecord() {
    return ratingUpdateActionTaskRecord;
  }

  public void setRatingUpdateActionTaskRecord(Object ratingUpdateActionTaskRecord) {
    this.ratingUpdateActionTaskRecord = ratingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

