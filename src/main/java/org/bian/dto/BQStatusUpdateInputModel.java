package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQStatusUpdateInputModelStatusInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQStatusUpdateInputModel
 */
public class BQStatusUpdateInputModel   {
  private String partyStateInstanceReference = null;

  private String statusInstanceReference = null;

  private BQStatusUpdateInputModelStatusInstanceRecord statusInstanceRecord = null;

  private Object statusUpdateActionTaskRecord = null;

  private String statusUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Status instance 
   * @return statusInstanceReference
  **/

  public String getStatusInstanceReference() {
    return statusInstanceReference;
  }

  public void setStatusInstanceReference(String statusInstanceReference) {
    this.statusInstanceReference = statusInstanceReference;
  }


  /**
   * Get statusInstanceRecord
   * @return statusInstanceRecord
  **/

  public BQStatusUpdateInputModelStatusInstanceRecord getStatusInstanceRecord() {
    return statusInstanceRecord;
  }

  public void setStatusInstanceRecord(BQStatusUpdateInputModelStatusInstanceRecord statusInstanceRecord) {
    this.statusInstanceRecord = statusInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return statusUpdateActionTaskRecord
  **/

  public Object getStatusUpdateActionTaskRecord() {
    return statusUpdateActionTaskRecord;
  }

  public void setStatusUpdateActionTaskRecord(Object statusUpdateActionTaskRecord) {
    this.statusUpdateActionTaskRecord = statusUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return statusUpdateActionRequest
  **/

  public String getStatusUpdateActionRequest() {
    return statusUpdateActionRequest;
  }

  public void setStatusUpdateActionRequest(String statusUpdateActionRequest) {
    this.statusUpdateActionRequest = statusUpdateActionRequest;
  }


}

