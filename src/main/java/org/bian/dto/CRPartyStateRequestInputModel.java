package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyStateRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRPartyStateRequestInputModel
 */
public class CRPartyStateRequestInputModel   {
  private String customerProfileServicingSessionReference = null;

  private String partyStateInstanceReference = null;

  private Object partyStateRequestActionTaskRecord = null;

  private CRPartyStateRequestInputModelRequestRecordType requestRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return partyStateRequestActionTaskRecord
  **/

  public Object getPartyStateRequestActionTaskRecord() {
    return partyStateRequestActionTaskRecord;
  }

  public void setPartyStateRequestActionTaskRecord(Object partyStateRequestActionTaskRecord) {
    this.partyStateRequestActionTaskRecord = partyStateRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRPartyStateRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRPartyStateRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

