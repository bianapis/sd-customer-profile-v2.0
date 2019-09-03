package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAlertRetrieveOutputModelAlertInstanceAnalysis;
import org.bian.dto.BQAlertRetrieveOutputModelAlertInstanceReport;
import org.bian.dto.BQAlertUpdateInputModelAlertInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAlertRetrieveOutputModel
 */
public class BQAlertRetrieveOutputModel   {
  private BQAlertUpdateInputModelAlertInstanceRecord alertInstanceRecord = null;

  private String alertRetrieveActionTaskReference = null;

  private Object alertRetrieveActionTaskRecord = null;

  private String alertRetrieveActionResponse = null;

  private BQAlertRetrieveOutputModelAlertInstanceReport alertInstanceReport = null;

  private BQAlertRetrieveOutputModelAlertInstanceAnalysis alertInstanceAnalysis = null;


  /**
   * Get alertInstanceRecord
   * @return alertInstanceRecord
  **/

  public BQAlertUpdateInputModelAlertInstanceRecord getAlertInstanceRecord() {
    return alertInstanceRecord;
  }

  public void setAlertInstanceRecord(BQAlertUpdateInputModelAlertInstanceRecord alertInstanceRecord) {
    this.alertInstanceRecord = alertInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Alert instance retrieve service call 
   * @return alertRetrieveActionTaskReference
  **/

  public String getAlertRetrieveActionTaskReference() {
    return alertRetrieveActionTaskReference;
  }

  public void setAlertRetrieveActionTaskReference(String alertRetrieveActionTaskReference) {
    this.alertRetrieveActionTaskReference = alertRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return alertRetrieveActionTaskRecord
  **/

  public Object getAlertRetrieveActionTaskRecord() {
    return alertRetrieveActionTaskRecord;
  }

  public void setAlertRetrieveActionTaskRecord(Object alertRetrieveActionTaskRecord) {
    this.alertRetrieveActionTaskRecord = alertRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return alertRetrieveActionResponse
  **/

  public String getAlertRetrieveActionResponse() {
    return alertRetrieveActionResponse;
  }

  public void setAlertRetrieveActionResponse(String alertRetrieveActionResponse) {
    this.alertRetrieveActionResponse = alertRetrieveActionResponse;
  }


  /**
   * Get alertInstanceReport
   * @return alertInstanceReport
  **/

  public BQAlertRetrieveOutputModelAlertInstanceReport getAlertInstanceReport() {
    return alertInstanceReport;
  }

  public void setAlertInstanceReport(BQAlertRetrieveOutputModelAlertInstanceReport alertInstanceReport) {
    this.alertInstanceReport = alertInstanceReport;
  }


  /**
   * Get alertInstanceAnalysis
   * @return alertInstanceAnalysis
  **/

  public BQAlertRetrieveOutputModelAlertInstanceAnalysis getAlertInstanceAnalysis() {
    return alertInstanceAnalysis;
  }

  public void setAlertInstanceAnalysis(BQAlertRetrieveOutputModelAlertInstanceAnalysis alertInstanceAnalysis) {
    this.alertInstanceAnalysis = alertInstanceAnalysis;
  }


}

