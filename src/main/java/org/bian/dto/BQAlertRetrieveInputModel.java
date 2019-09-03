package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAlertRetrieveInputModelAlertInstanceAnalysis;
import org.bian.dto.BQAlertRetrieveInputModelAlertInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAlertRetrieveInputModel
 */
public class BQAlertRetrieveInputModel   {
  private Object alertRetrieveActionTaskRecord = null;

  private String alertRetrieveActionRequest = null;

  private BQAlertRetrieveInputModelAlertInstanceReport alertInstanceReport = null;

  private BQAlertRetrieveInputModelAlertInstanceAnalysis alertInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return alertRetrieveActionRequest
  **/

  public String getAlertRetrieveActionRequest() {
    return alertRetrieveActionRequest;
  }

  public void setAlertRetrieveActionRequest(String alertRetrieveActionRequest) {
    this.alertRetrieveActionRequest = alertRetrieveActionRequest;
  }


  /**
   * Get alertInstanceReport
   * @return alertInstanceReport
  **/

  public BQAlertRetrieveInputModelAlertInstanceReport getAlertInstanceReport() {
    return alertInstanceReport;
  }

  public void setAlertInstanceReport(BQAlertRetrieveInputModelAlertInstanceReport alertInstanceReport) {
    this.alertInstanceReport = alertInstanceReport;
  }


  /**
   * Get alertInstanceAnalysis
   * @return alertInstanceAnalysis
  **/

  public BQAlertRetrieveInputModelAlertInstanceAnalysis getAlertInstanceAnalysis() {
    return alertInstanceAnalysis;
  }

  public void setAlertInstanceAnalysis(BQAlertRetrieveInputModelAlertInstanceAnalysis alertInstanceAnalysis) {
    this.alertInstanceAnalysis = alertInstanceAnalysis;
  }


}

