package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAlertUpdateInputModelAlertInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAlertUpdateInputModel
 */
public class BQAlertUpdateInputModel   {
  private String partyStateInstanceReference = null;

  private String alertInstanceReference = null;

  private BQAlertUpdateInputModelAlertInstanceRecord alertInstanceRecord = null;

  private Object alertUpdateActionTaskRecord = null;

  private String alertUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return alertUpdateActionTaskRecord
  **/

  public Object getAlertUpdateActionTaskRecord() {
    return alertUpdateActionTaskRecord;
  }

  public void setAlertUpdateActionTaskRecord(Object alertUpdateActionTaskRecord) {
    this.alertUpdateActionTaskRecord = alertUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return alertUpdateActionRequest
  **/

  public String getAlertUpdateActionRequest() {
    return alertUpdateActionRequest;
  }

  public void setAlertUpdateActionRequest(String alertUpdateActionRequest) {
    this.alertUpdateActionRequest = alertUpdateActionRequest;
  }


}

