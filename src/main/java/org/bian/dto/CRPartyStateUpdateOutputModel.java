package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyStateUpdateOutputModel
 */
public class CRPartyStateUpdateOutputModel   {
  private String partyStateUpdateActionTaskReference = null;

  private Object partyStateUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return partyStateUpdateActionTaskReference
  **/

  public String getPartyStateUpdateActionTaskReference() {
    return partyStateUpdateActionTaskReference;
  }

  public void setPartyStateUpdateActionTaskReference(String partyStateUpdateActionTaskReference) {
    this.partyStateUpdateActionTaskReference = partyStateUpdateActionTaskReference;
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

