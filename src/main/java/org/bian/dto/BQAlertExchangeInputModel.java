package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAlertExchangeInputModelAlertExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQAlertExchangeInputModel
 */
public class BQAlertExchangeInputModel   {
  private String partyStateInstanceReference = null;

  private String alertInstanceReference = null;

  private Object alertExchangeActionTaskRecord = null;

  private BQAlertExchangeInputModelAlertExchangeActionRequest alertExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return alertExchangeActionTaskRecord
  **/

  public Object getAlertExchangeActionTaskRecord() {
    return alertExchangeActionTaskRecord;
  }

  public void setAlertExchangeActionTaskRecord(Object alertExchangeActionTaskRecord) {
    this.alertExchangeActionTaskRecord = alertExchangeActionTaskRecord;
  }


  /**
   * Get alertExchangeActionRequest
   * @return alertExchangeActionRequest
  **/

  public BQAlertExchangeInputModelAlertExchangeActionRequest getAlertExchangeActionRequest() {
    return alertExchangeActionRequest;
  }

  public void setAlertExchangeActionRequest(BQAlertExchangeInputModelAlertExchangeActionRequest alertExchangeActionRequest) {
    this.alertExchangeActionRequest = alertExchangeActionRequest;
  }


}

