package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPartyStateRetrieveOutputModelPartyStateInstanceReportRecord
 */
public class CRPartyStateRetrieveOutputModelPartyStateInstanceReportRecord   {
  private String partyStateInstanceReportData = null;

  private String partyStateInstanceReportType = null;

  private Object partyStateInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return partyStateInstanceReportData
  **/

  public String getPartyStateInstanceReportData() {
    return partyStateInstanceReportData;
  }

  public void setPartyStateInstanceReportData(String partyStateInstanceReportData) {
    this.partyStateInstanceReportData = partyStateInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return partyStateInstanceReport
  **/

  public Object getPartyStateInstanceReport() {
    return partyStateInstanceReport;
  }

  public void setPartyStateInstanceReport(Object partyStateInstanceReport) {
    this.partyStateInstanceReport = partyStateInstanceReport;
  }


}

