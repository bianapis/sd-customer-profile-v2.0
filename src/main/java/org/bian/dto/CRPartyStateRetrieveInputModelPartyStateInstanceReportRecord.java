package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyStateRetrieveInputModelPartyStateInstanceReportRecord
 */
public class CRPartyStateRetrieveInputModelPartyStateInstanceReportRecord   {
  private String partyStateInstanceReportReference = null;

  private String partyStateInstanceReportType = null;

  private String partyStateInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return partyStateInstanceReportReference
  **/

  public String getPartyStateInstanceReportReference() {
    return partyStateInstanceReportReference;
  }

  public void setPartyStateInstanceReportReference(String partyStateInstanceReportReference) {
    this.partyStateInstanceReportReference = partyStateInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return partyStateInstanceReportType
  **/

  public String getPartyStateInstanceReportType() {
    return partyStateInstanceReportType;
  }

  public void setPartyStateInstanceReportType(String partyStateInstanceReportType) {
    this.partyStateInstanceReportType = partyStateInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return partyStateInstanceReportParameters
  **/

  public String getPartyStateInstanceReportParameters() {
    return partyStateInstanceReportParameters;
  }

  public void setPartyStateInstanceReportParameters(String partyStateInstanceReportParameters) {
    this.partyStateInstanceReportParameters = partyStateInstanceReportParameters;
  }


}

