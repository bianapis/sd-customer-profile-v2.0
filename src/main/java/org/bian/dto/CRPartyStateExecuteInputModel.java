package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyStateExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRPartyStateExecuteInputModel
 */
public class CRPartyStateExecuteInputModel   {
  private String customerProfileServicingSessionReference = null;

  private String partyStateInstanceReference = null;

  private Object partyStateExecuteActionTaskRecord = null;

  private CRPartyStateExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return partyStateExecuteActionTaskRecord
  **/

  public Object getPartyStateExecuteActionTaskRecord() {
    return partyStateExecuteActionTaskRecord;
  }

  public void setPartyStateExecuteActionTaskRecord(Object partyStateExecuteActionTaskRecord) {
    this.partyStateExecuteActionTaskRecord = partyStateExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRPartyStateExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRPartyStateExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

