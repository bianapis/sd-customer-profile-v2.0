package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStatusUpdateInputModelStatusInstanceRecord
 */
public class BQStatusUpdateInputModelStatusInstanceRecord   {
  private String customerRelationshipStatusType = null;

  private String customerRelationshipStatus = null;

  private String customerRelationshipStatusNarrative = null;

  private String customerRelationshipStatusValidFromToDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the type of status (e.g. account in distress) 
   * @return customerRelationshipStatusType
  **/

  public String getCustomerRelationshipStatusType() {
    return customerRelationshipStatusType;
  }

  public void setCustomerRelationshipStatusType(String customerRelationshipStatusType) {
    this.customerRelationshipStatusType = customerRelationshipStatusType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The maintained state value (historical values may be retained as appropriate) 
   * @return customerRelationshipStatus
  **/

  public String getCustomerRelationshipStatus() {
    return customerRelationshipStatus;
  }

  public void setCustomerRelationshipStatus(String customerRelationshipStatus) {
    this.customerRelationshipStatus = customerRelationshipStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Explanation/description for given status value if necessary 
   * @return customerRelationshipStatusNarrative
  **/

  public String getCustomerRelationshipStatusNarrative() {
    return customerRelationshipStatusNarrative;
  }

  public void setCustomerRelationshipStatusNarrative(String customerRelationshipStatusNarrative) {
    this.customerRelationshipStatusNarrative = customerRelationshipStatusNarrative;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Indication when the status value is updated and time until given value applies/is relevant as appropriate 
   * @return customerRelationshipStatusValidFromToDate
  **/

  public String getCustomerRelationshipStatusValidFromToDate() {
    return customerRelationshipStatusValidFromToDate;
  }

  public void setCustomerRelationshipStatusValidFromToDate(String customerRelationshipStatusValidFromToDate) {
    this.customerRelationshipStatusValidFromToDate = customerRelationshipStatusValidFromToDate;
  }


}

