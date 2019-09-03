package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAlertUpdateInputModelAlertInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAlertUpdateOutputModel
 */
public class BQAlertUpdateOutputModel   {
  private BQAlertUpdateInputModelAlertInstanceRecord alertInstanceRecord = null;

  private String alertUpdateActionTaskReference = null;

  private Object alertUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get alertInstanceRecord
   * @return alertInstanceRecord
  **/

  public BQAlertUpdateInputModelAlertInstanceRecord getAlertInstanceRecord() {
    return alertInstanceRecord;
  }

  public void setAlertInstanceRecord(BQAlertUpdateInputModelAlertInstanceRecord alertInstanceRecord) {
    this.alertInstanceRecord = alertInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return alertUpdateActionTaskReference
  **/

  public String getAlertUpdateActionTaskReference() {
    return alertUpdateActionTaskReference;
  }

  public void setAlertUpdateActionTaskReference(String alertUpdateActionTaskReference) {
    this.alertUpdateActionTaskReference = alertUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return alertUpdateActionTaskRecord
  **/

  public Object getAlertUpdateActionTaskRecord() {
    return alertUpdateActionTaskRecord;
  }

  public void setAlertUpdateActionTaskRecord(Object alertUpdateActionTaskRecord) {
    this.alertUpdateActionTaskRecord = alertUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

