package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAlertCaptureOutputModelAlertInstanceRecord
 */
public class BQAlertCaptureOutputModelAlertInstanceRecord   {
  private String customerRelationshipAlertValidFromToDate = null;


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

