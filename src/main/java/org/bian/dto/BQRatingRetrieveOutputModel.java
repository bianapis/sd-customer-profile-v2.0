package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRatingRetrieveOutputModelRatingInstanceAnalysis;
import org.bian.dto.BQRatingRetrieveOutputModelRatingInstanceReport;
import org.bian.dto.BQRatingUpdateInputModelRatingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRatingRetrieveOutputModel
 */
public class BQRatingRetrieveOutputModel   {
  private BQRatingUpdateInputModelRatingInstanceRecord ratingInstanceRecord = null;

  private String ratingRetrieveActionTaskReference = null;

  private Object ratingRetrieveActionTaskRecord = null;

  private String ratingRetrieveActionResponse = null;

  private BQRatingRetrieveOutputModelRatingInstanceReport ratingInstanceReport = null;

  private BQRatingRetrieveOutputModelRatingInstanceAnalysis ratingInstanceAnalysis = null;


  /**
   * Get ratingInstanceRecord
   * @return ratingInstanceRecord
  **/

  public BQRatingUpdateInputModelRatingInstanceRecord getRatingInstanceRecord() {
    return ratingInstanceRecord;
  }

  public void setRatingInstanceRecord(BQRatingUpdateInputModelRatingInstanceRecord ratingInstanceRecord) {
    this.ratingInstanceRecord = ratingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Rating instance retrieve service call 
   * @return ratingRetrieveActionTaskReference
  **/

  public String getRatingRetrieveActionTaskReference() {
    return ratingRetrieveActionTaskReference;
  }

  public void setRatingRetrieveActionTaskReference(String ratingRetrieveActionTaskReference) {
    this.ratingRetrieveActionTaskReference = ratingRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return ratingRetrieveActionResponse
  **/

  public String getRatingRetrieveActionResponse() {
    return ratingRetrieveActionResponse;
  }

  public void setRatingRetrieveActionResponse(String ratingRetrieveActionResponse) {
    this.ratingRetrieveActionResponse = ratingRetrieveActionResponse;
  }


  /**
   * Get ratingInstanceReport
   * @return ratingInstanceReport
  **/

  public BQRatingRetrieveOutputModelRatingInstanceReport getRatingInstanceReport() {
    return ratingInstanceReport;
  }

  public void setRatingInstanceReport(BQRatingRetrieveOutputModelRatingInstanceReport ratingInstanceReport) {
    this.ratingInstanceReport = ratingInstanceReport;
  }


  /**
   * Get ratingInstanceAnalysis
   * @return ratingInstanceAnalysis
  **/

  public BQRatingRetrieveOutputModelRatingInstanceAnalysis getRatingInstanceAnalysis() {
    return ratingInstanceAnalysis;
  }

  public void setRatingInstanceAnalysis(BQRatingRetrieveOutputModelRatingInstanceAnalysis ratingInstanceAnalysis) {
    this.ratingInstanceAnalysis = ratingInstanceAnalysis;
  }


}

