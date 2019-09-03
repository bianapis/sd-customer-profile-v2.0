package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPartyStateRetrieveInputModelPartyStateInstanceAnalysis;
import org.bian.dto.CRPartyStateRetrieveInputModelPartyStateInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRPartyStateRetrieveInputModel
 */
public class CRPartyStateRetrieveInputModel   {
  private Object partyStateRetrieveActionTaskRecord = null;

  private String partyStateRetrieveActionRequest = null;

  private CRPartyStateRetrieveInputModelPartyStateInstanceReportRecord partyStateInstanceReportRecord = null;

  private CRPartyStateRetrieveInputModelPartyStateInstanceAnalysis partyStateInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return partyStateRetrieveActionRequest
  **/

  public String getPartyStateRetrieveActionRequest() {
    return partyStateRetrieveActionRequest;
  }

  public void setPartyStateRetrieveActionRequest(String partyStateRetrieveActionRequest) {
    this.partyStateRetrieveActionRequest = partyStateRetrieveActionRequest;
  }


  /**
   * Get partyStateInstanceReportRecord
   * @return partyStateInstanceReportRecord
  **/

  public CRPartyStateRetrieveInputModelPartyStateInstanceReportRecord getPartyStateInstanceReportRecord() {
    return partyStateInstanceReportRecord;
  }

  public void setPartyStateInstanceReportRecord(CRPartyStateRetrieveInputModelPartyStateInstanceReportRecord partyStateInstanceReportRecord) {
    this.partyStateInstanceReportRecord = partyStateInstanceReportRecord;
  }


  /**
   * Get partyStateInstanceAnalysis
   * @return partyStateInstanceAnalysis
  **/

  public CRPartyStateRetrieveInputModelPartyStateInstanceAnalysis getPartyStateInstanceAnalysis() {
    return partyStateInstanceAnalysis;
  }

  public void setPartyStateInstanceAnalysis(CRPartyStateRetrieveInputModelPartyStateInstanceAnalysis partyStateInstanceAnalysis) {
    this.partyStateInstanceAnalysis = partyStateInstanceAnalysis;
  }


}

