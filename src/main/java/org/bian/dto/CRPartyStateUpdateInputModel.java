package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyStateUpdateInputModel
 */
public class CRPartyStateUpdateInputModel   {
  private String customerProfileServicingSessionReference = null;

  private String partyStateInstanceReference = null;

  private Object partyStateUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerProfileServicingSessionReference
  **/

  public String getCustomerProfileServicingSessionReference() {
    return customerProfileServicingSessionReference;
  }

  public void setCustomerProfileServicingSessionReference(String customerProfileServicingSessionReference) {
    this.customerProfileServicingSessionReference = customerProfileServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Party State instance 
   * @return partyStateInstanceReference
  **/

  public String getPartyStateInstanceReference() {
    return partyStateInstanceReference;
  }

  public void setPartyStateInstanceReference(String partyStateInstanceReference) {
    this.partyStateInstanceReference = partyStateInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return partyStateUpdateActionTaskRecord
  **/

  public Object getPartyStateUpdateActionTaskRecord() {
    return partyStateUpdateActionTaskRecord;
  }

  public void setPartyStateUpdateActionTaskRecord(Object partyStateUpdateActionTaskRecord) {
    this.partyStateUpdateActionTaskRecord = partyStateUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

