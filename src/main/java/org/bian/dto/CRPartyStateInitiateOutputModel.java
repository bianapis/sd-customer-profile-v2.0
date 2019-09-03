package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyStateInitiateInputModelCRPartyStatusInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPartyStateInitiateOutputModel
 */
public class CRPartyStateInitiateOutputModel   {
  private String partyStateInstanceReference = null;

  private String partyStateInitiateActionReference = null;

  private Object partyStateInitiateActionRecord = null;

  private String partyStateInstanceStatus = null;

  private CRPartyStateInitiateInputModelCRPartyStatusInstanceRecord cRPartyStatusInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return partyStateInitiateActionReference
  **/

  public String getPartyStateInitiateActionReference() {
    return partyStateInitiateActionReference;
  }

  public void setPartyStateInitiateActionReference(String partyStateInitiateActionReference) {
    this.partyStateInitiateActionReference = partyStateInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return partyStateInitiateActionRecord
  **/

  public Object getPartyStateInitiateActionRecord() {
    return partyStateInitiateActionRecord;
  }

  public void setPartyStateInitiateActionRecord(Object partyStateInitiateActionRecord) {
    this.partyStateInitiateActionRecord = partyStateInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Party State instance (e.g. initialised, pending, active) 
   * @return partyStateInstanceStatus
  **/

  public String getPartyStateInstanceStatus() {
    return partyStateInstanceStatus;
  }

  public void setPartyStateInstanceStatus(String partyStateInstanceStatus) {
    this.partyStateInstanceStatus = partyStateInstanceStatus;
  }


  /**
   * Get cRPartyStatusInstanceRecord
   * @return cRPartyStatusInstanceRecord
  **/

  public CRPartyStateInitiateInputModelCRPartyStatusInstanceRecord getCRPartyStatusInstanceRecord() {
    return cRPartyStatusInstanceRecord;
  }

  public void setCRPartyStatusInstanceRecord(CRPartyStateInitiateInputModelCRPartyStatusInstanceRecord cRPartyStatusInstanceRecord) {
    this.cRPartyStatusInstanceRecord = cRPartyStatusInstanceRecord;
  }


}

