package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStatusCaptureOutputModelStatusInstanceRecord
 */
public class BQStatusCaptureOutputModelStatusInstanceRecord   {
  private String customerRelationshipStatusValidFromToDate = null;


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

