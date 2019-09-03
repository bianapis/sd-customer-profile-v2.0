package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAlertExchangeOutputModel
 */
public class BQAlertExchangeOutputModel   {
  private String alertExchangeActionTaskReference = null;

  private Object alertExchangeActionTaskRecord = null;

  private String alertExchangeActionResponse = null;

  private String alertInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Alert instance exchange service call 
   * @return alertExchangeActionTaskReference
  **/

  public String getAlertExchangeActionTaskReference() {
    return alertExchangeActionTaskReference;
  }

  public void setAlertExchangeActionTaskReference(String alertExchangeActionTaskReference) {
    this.alertExchangeActionTaskReference = alertExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return alertExchangeActionResponse
  **/

  public String getAlertExchangeActionResponse() {
    return alertExchangeActionResponse;
  }

  public void setAlertExchangeActionResponse(String alertExchangeActionResponse) {
    this.alertExchangeActionResponse = alertExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Alert instance (e.g. accepted, rejected, verified) 
   * @return alertInstanceStatus
  **/

  public String getAlertInstanceStatus() {
    return alertInstanceStatus;
  }

  public void setAlertInstanceStatus(String alertInstanceStatus) {
    this.alertInstanceStatus = alertInstanceStatus;
  }


}

