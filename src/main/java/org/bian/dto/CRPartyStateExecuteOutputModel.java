package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyStateExecuteOutputModel
 */
public class CRPartyStateExecuteOutputModel   {
  private String partyStateExecuteActionTaskReference = null;

  private Object partyStateExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Party State instance execute service call 
   * @return partyStateExecuteActionTaskReference
  **/

  public String getPartyStateExecuteActionTaskReference() {
    return partyStateExecuteActionTaskReference;
  }

  public void setPartyStateExecuteActionTaskReference(String partyStateExecuteActionTaskReference) {
    this.partyStateExecuteActionTaskReference = partyStateExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

