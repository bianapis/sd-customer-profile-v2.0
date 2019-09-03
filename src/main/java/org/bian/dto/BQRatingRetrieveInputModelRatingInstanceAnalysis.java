package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRatingRetrieveInputModelRatingInstanceAnalysis
 */
public class BQRatingRetrieveInputModelRatingInstanceAnalysis   {
  private String ratingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return ratingInstanceAnalysisReference
  **/

  public String getRatingInstanceAnalysisReference() {
    return ratingInstanceAnalysisReference;
  }

  public void setRatingInstanceAnalysisReference(String ratingInstanceAnalysisReference) {
    this.ratingInstanceAnalysisReference = ratingInstanceAnalysisReference;
  }


}

