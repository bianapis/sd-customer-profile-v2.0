package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyStateRetrieveOutputModelPartyStateInstanceAnalysis
 */
public class CRPartyStateRetrieveOutputModelPartyStateInstanceAnalysis   {
  private String partyStateInstanceAnalysisData = null;

  private String partyStateInstanceAnalysisReportType = null;

  private Object partyStateInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return partyStateInstanceAnalysisData
  **/

  public String getPartyStateInstanceAnalysisData() {
    return partyStateInstanceAnalysisData;
  }

  public void setPartyStateInstanceAnalysisData(String partyStateInstanceAnalysisData) {
    this.partyStateInstanceAnalysisData = partyStateInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return partyStateInstanceAnalysisReport
  **/

  public Object getPartyStateInstanceAnalysisReport() {
    return partyStateInstanceAnalysisReport;
  }

  public void setPartyStateInstanceAnalysisReport(Object partyStateInstanceAnalysisReport) {
    this.partyStateInstanceAnalysisReport = partyStateInstanceAnalysisReport;
  }


}

