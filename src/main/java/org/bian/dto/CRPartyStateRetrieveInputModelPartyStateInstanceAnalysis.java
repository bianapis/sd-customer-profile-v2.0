package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyStateRetrieveInputModelPartyStateInstanceAnalysis
 */
public class CRPartyStateRetrieveInputModelPartyStateInstanceAnalysis   {
  private String partyStateInstanceAnalysisReference = null;

  private String partyStateInstanceAnalysisReportType = null;

  private String partyStateInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return partyStateInstanceAnalysisReference
  **/

  public String getPartyStateInstanceAnalysisReference() {
    return partyStateInstanceAnalysisReference;
  }

  public void setPartyStateInstanceAnalysisReference(String partyStateInstanceAnalysisReference) {
    this.partyStateInstanceAnalysisReference = partyStateInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return partyStateInstanceAnalysisReportType
  **/

  public String getPartyStateInstanceAnalysisReportType() {
    return partyStateInstanceAnalysisReportType;
  }

  public void setPartyStateInstanceAnalysisReportType(String partyStateInstanceAnalysisReportType) {
    this.partyStateInstanceAnalysisReportType = partyStateInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return partyStateInstanceAnalysisParameters
  **/

  public String getPartyStateInstanceAnalysisParameters() {
    return partyStateInstanceAnalysisParameters;
  }

  public void setPartyStateInstanceAnalysisParameters(String partyStateInstanceAnalysisParameters) {
    this.partyStateInstanceAnalysisParameters = partyStateInstanceAnalysisParameters;
  }


}

