package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyStateRetrieveOutputModelCRPartyStatusInstanceRecord;
import org.bian.dto.CRPartyStateRetrieveOutputModelPartyStateInstanceAnalysis;
import org.bian.dto.CRPartyStateRetrieveOutputModelPartyStateInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRPartyStateRetrieveOutputModel
 */
public class CRPartyStateRetrieveOutputModel   {
  private CRPartyStateRetrieveOutputModelCRPartyStatusInstanceRecord cRPartyStatusInstanceRecord = null;

  private String partyStateRetrieveActionTaskReference = null;

  private Object partyStateRetrieveActionTaskRecord = null;

  private String partyStateRetrieveActionResponse = null;

  private CRPartyStateRetrieveOutputModelPartyStateInstanceReportRecord partyStateInstanceReportRecord = null;

  private CRPartyStateRetrieveOutputModelPartyStateInstanceAnalysis partyStateInstanceAnalysis = null;


  /**
   * Get cRPartyStatusInstanceRecord
   * @return cRPartyStatusInstanceRecord
  **/

  public CRPartyStateRetrieveOutputModelCRPartyStatusInstanceRecord getCRPartyStatusInstanceRecord() {
    return cRPartyStatusInstanceRecord;
  }

  public void setCRPartyStatusInstanceRecord(CRPartyStateRetrieveOutputModelCRPartyStatusInstanceRecord cRPartyStatusInstanceRecord) {
    this.cRPartyStatusInstanceRecord = cRPartyStatusInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Party State instance retrieve service call 
   * @return partyStateRetrieveActionTaskReference
  **/

  public String getPartyStateRetrieveActionTaskReference() {
    return partyStateRetrieveActionTaskReference;
  }

  public void setPartyStateRetrieveActionTaskReference(String partyStateRetrieveActionTaskReference) {
    this.partyStateRetrieveActionTaskReference = partyStateRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return partyStateRetrieveActionTaskRecord
  **/

  public Object getPartyStateRetrieveActionTaskRecord() {
    return partyStateRetrieveActionTaskRecord;
  }

  public void setPartyStateRetrieveActionTaskRecord(Object partyStateRetrieveActionTaskRecord) {
    this.partyStateRetrieveActionTaskRecord = partyStateRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return partyStateRetrieveActionResponse
  **/

  public String getPartyStateRetrieveActionResponse() {
    return partyStateRetrieveActionResponse;
  }

  public void setPartyStateRetrieveActionResponse(String partyStateRetrieveActionResponse) {
    this.partyStateRetrieveActionResponse = partyStateRetrieveActionResponse;
  }


  /**
   * Get partyStateInstanceReportRecord
   * @return partyStateInstanceReportRecord
  **/

  public CRPartyStateRetrieveOutputModelPartyStateInstanceReportRecord getPartyStateInstanceReportRecord() {
    return partyStateInstanceReportRecord;
  }

  public void setPartyStateInstanceReportRecord(CRPartyStateRetrieveOutputModelPartyStateInstanceReportRecord partyStateInstanceReportRecord) {
    this.partyStateInstanceReportRecord = partyStateInstanceReportRecord;
  }


  /**
   * Get partyStateInstanceAnalysis
   * @return partyStateInstanceAnalysis
  **/

  public CRPartyStateRetrieveOutputModelPartyStateInstanceAnalysis getPartyStateInstanceAnalysis() {
    return partyStateInstanceAnalysis;
  }

  public void setPartyStateInstanceAnalysis(CRPartyStateRetrieveOutputModelPartyStateInstanceAnalysis partyStateInstanceAnalysis) {
    this.partyStateInstanceAnalysis = partyStateInstanceAnalysis;
  }


}

