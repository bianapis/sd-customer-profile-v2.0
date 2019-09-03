package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyStateControlInputModelPartyStateControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRPartyStateControlInputModel
 */
public class CRPartyStateControlInputModel   {
  private String customerProfileServicingSessionReference = null;

  private String partyStateInstanceReference = null;

  private Object partyStateControlActionTaskRecord = null;

  private CRPartyStateControlInputModelPartyStateControlActionRequest partyStateControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return partyStateControlActionTaskRecord
  **/

  public Object getPartyStateControlActionTaskRecord() {
    return partyStateControlActionTaskRecord;
  }

  public void setPartyStateControlActionTaskRecord(Object partyStateControlActionTaskRecord) {
    this.partyStateControlActionTaskRecord = partyStateControlActionTaskRecord;
  }


  /**
   * Get partyStateControlActionRequest
   * @return partyStateControlActionRequest
  **/

  public CRPartyStateControlInputModelPartyStateControlActionRequest getPartyStateControlActionRequest() {
    return partyStateControlActionRequest;
  }

  public void setPartyStateControlActionRequest(CRPartyStateControlInputModelPartyStateControlActionRequest partyStateControlActionRequest) {
    this.partyStateControlActionRequest = partyStateControlActionRequest;
  }


}

