package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRatingRetrieveInputModelRatingInstanceAnalysis;
import org.bian.dto.BQRatingRetrieveInputModelRatingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRatingRetrieveInputModel
 */
public class BQRatingRetrieveInputModel   {
  private Object ratingRetrieveActionTaskRecord = null;

  private String ratingRetrieveActionRequest = null;

  private BQRatingRetrieveInputModelRatingInstanceReport ratingInstanceReport = null;

  private BQRatingRetrieveInputModelRatingInstanceAnalysis ratingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return ratingRetrieveActionTaskRecord
  **/

  public Object getRatingRetrieveActionTaskRecord() {
    return ratingRetrieveActionTaskRecord;
  }

  public void setRatingRetrieveActionTaskRecord(Object ratingRetrieveActionTaskRecord) {
    this.ratingRetrieveActionTaskRecord = ratingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return ratingRetrieveActionRequest
  **/

  public String getRatingRetrieveActionRequest() {
    return ratingRetrieveActionRequest;
  }

  public void setRatingRetrieveActionRequest(String ratingRetrieveActionRequest) {
    this.ratingRetrieveActionRequest = ratingRetrieveActionRequest;
  }


  /**
   * Get ratingInstanceReport
   * @return ratingInstanceReport
  **/

  public BQRatingRetrieveInputModelRatingInstanceReport getRatingInstanceReport() {
    return ratingInstanceReport;
  }

  public void setRatingInstanceReport(BQRatingRetrieveInputModelRatingInstanceReport ratingInstanceReport) {
    this.ratingInstanceReport = ratingInstanceReport;
  }


  /**
   * Get ratingInstanceAnalysis
   * @return ratingInstanceAnalysis
  **/

  public BQRatingRetrieveInputModelRatingInstanceAnalysis getRatingInstanceAnalysis() {
    return ratingInstanceAnalysis;
  }

  public void setRatingInstanceAnalysis(BQRatingRetrieveInputModelRatingInstanceAnalysis ratingInstanceAnalysis) {
    this.ratingInstanceAnalysis = ratingInstanceAnalysis;
  }


}

