package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRatingRetrieveInputModelRatingInstanceReport
 */
public class BQRatingRetrieveInputModelRatingInstanceReport   {
  private String ratingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return ratingInstanceReportReference
  **/

  public String getRatingInstanceReportReference() {
    return ratingInstanceReportReference;
  }

  public void setRatingInstanceReportReference(String ratingInstanceReportReference) {
    this.ratingInstanceReportReference = ratingInstanceReportReference;
  }


}

