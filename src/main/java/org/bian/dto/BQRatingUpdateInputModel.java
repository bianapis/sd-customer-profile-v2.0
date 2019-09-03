package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRatingUpdateInputModelRatingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRatingUpdateInputModel
 */
public class BQRatingUpdateInputModel   {
  private String partyStateInstanceReference = null;

  private String ratingInstanceReference = null;

  private BQRatingUpdateInputModelRatingInstanceRecord ratingInstanceRecord = null;

  private Object ratingUpdateActionTaskRecord = null;

  private String ratingUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return ratingUpdateActionRequest
  **/

  public String getRatingUpdateActionRequest() {
    return ratingUpdateActionRequest;
  }

  public void setRatingUpdateActionRequest(String ratingUpdateActionRequest) {
    this.ratingUpdateActionRequest = ratingUpdateActionRequest;
  }


}

