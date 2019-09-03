package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRatingUpdateInputModelRatingInstanceRecord
 */
public class BQRatingUpdateInputModelRatingInstanceRecord   {
  private String customerRelationshipRatingType = null;

  private String customerRelationshipRating = null;

  private String customerRelationshipRatingNarrative = null;

  private String customerRelationshipRatingValidFromToDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the type of rating (e.g. credit rating) 
   * @return customerRelationshipRatingType
  **/

  public String getCustomerRelationshipRatingType() {
    return customerRelationshipRatingType;
  }

  public void setCustomerRelationshipRatingType(String customerRelationshipRatingType) {
    this.customerRelationshipRatingType = customerRelationshipRatingType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The maintained rating value (historical values may be retained as appropriate) 
   * @return customerRelationshipRating
  **/

  public String getCustomerRelationshipRating() {
    return customerRelationshipRating;
  }

  public void setCustomerRelationshipRating(String customerRelationshipRating) {
    this.customerRelationshipRating = customerRelationshipRating;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Explanation/description for given rating value if necessary 
   * @return customerRelationshipRatingNarrative
  **/

  public String getCustomerRelationshipRatingNarrative() {
    return customerRelationshipRatingNarrative;
  }

  public void setCustomerRelationshipRatingNarrative(String customerRelationshipRatingNarrative) {
    this.customerRelationshipRatingNarrative = customerRelationshipRatingNarrative;
  }


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

