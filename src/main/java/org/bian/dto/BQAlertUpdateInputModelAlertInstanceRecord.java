package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAlertUpdateInputModelAlertInstanceRecord
 */
public class BQAlertUpdateInputModelAlertInstanceRecord   {
  private String customerRelationshipAlertType = null;

  private String customerRelationshipAlert = null;

  private String customerRelationshipAlertNarrative = null;

  private String customerRelationshipAlertValidFromToDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the type of alert (e.g. detected potential fraud) 
   * @return customerRelationshipAlertType
  **/

  public String getCustomerRelationshipAlertType() {
    return customerRelationshipAlertType;
  }

  public void setCustomerRelationshipAlertType(String customerRelationshipAlertType) {
    this.customerRelationshipAlertType = customerRelationshipAlertType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The maintained alert value (historical values may be retained as appropriate) 
   * @return customerRelationshipAlert
  **/

  public String getCustomerRelationshipAlert() {
    return customerRelationshipAlert;
  }

  public void setCustomerRelationshipAlert(String customerRelationshipAlert) {
    this.customerRelationshipAlert = customerRelationshipAlert;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Explanation/description for given alert value if necessary 
   * @return customerRelationshipAlertNarrative
  **/

  public String getCustomerRelationshipAlertNarrative() {
    return customerRelationshipAlertNarrative;
  }

  public void setCustomerRelationshipAlertNarrative(String customerRelationshipAlertNarrative) {
    this.customerRelationshipAlertNarrative = customerRelationshipAlertNarrative;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Indication when the alert value is updated and time until given value applies/is relevant as appropriate 
   * @return customerRelationshipAlertValidFromToDate
  **/

  public String getCustomerRelationshipAlertValidFromToDate() {
    return customerRelationshipAlertValidFromToDate;
  }

  public void setCustomerRelationshipAlertValidFromToDate(String customerRelationshipAlertValidFromToDate) {
    this.customerRelationshipAlertValidFromToDate = customerRelationshipAlertValidFromToDate;
  }


}

