package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyStateControlOutputModel
 */
public class CRPartyStateControlOutputModel   {
  private String partyStateControlActionTaskReference = null;

  private Object partyStateControlActionTaskRecord = null;

  private String partyStateControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Party State instance control processing service call 
   * @return partyStateControlActionTaskReference
  **/

  public String getPartyStateControlActionTaskReference() {
    return partyStateControlActionTaskReference;
  }

  public void setPartyStateControlActionTaskReference(String partyStateControlActionTaskReference) {
    this.partyStateControlActionTaskReference = partyStateControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return partyStateControlActionResponse
  **/

  public String getPartyStateControlActionResponse() {
    return partyStateControlActionResponse;
  }

  public void setPartyStateControlActionResponse(String partyStateControlActionResponse) {
    this.partyStateControlActionResponse = partyStateControlActionResponse;
  }


}

