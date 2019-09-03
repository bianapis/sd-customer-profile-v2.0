package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRatingCaptureOutputModelRatingInstanceRecord
 */
public class BQRatingCaptureOutputModelRatingInstanceRecord   {
  private String customerRelationshipRatingValidFromToDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Indication when the rate value is updated and time until given value applies/is relevant as appropriate 
   * @return customerRelationshipRatingValidFromToDate
  **/

  public String getCustomerRelationshipRatingValidFromToDate() {
    return customerRelationshipRatingValidFromToDate;
  }

  public void setCustomerRelationshipRatingValidFromToDate(String customerRelationshipRatingValidFromToDate) {
    this.customerRelationshipRatingValidFromToDate = customerRelationshipRatingValidFromToDate;
  }


}

