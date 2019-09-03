package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQStatusUpdateInputModelStatusInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQStatusUpdateOutputModel
 */
public class BQStatusUpdateOutputModel   {
  private BQStatusUpdateInputModelStatusInstanceRecord statusInstanceRecord = null;

  private String statusUpdateActionTaskReference = null;

  private Object statusUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get statusInstanceRecord
   * @return statusInstanceRecord
  **/

  public BQStatusUpdateInputModelStatusInstanceRecord getStatusInstanceRecord() {
    return statusInstanceRecord;
  }

  public void setStatusInstanceRecord(BQStatusUpdateInputModelStatusInstanceRecord statusInstanceRecord) {
    this.statusInstanceRecord = statusInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return statusUpdateActionTaskReference
  **/

  public String getStatusUpdateActionTaskReference() {
    return statusUpdateActionTaskReference;
  }

  public void setStatusUpdateActionTaskReference(String statusUpdateActionTaskReference) {
    this.statusUpdateActionTaskReference = statusUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return statusUpdateActionTaskRecord
  **/

  public Object getStatusUpdateActionTaskRecord() {
    return statusUpdateActionTaskRecord;
  }

  public void setStatusUpdateActionTaskRecord(Object statusUpdateActionTaskRecord) {
    this.statusUpdateActionTaskRecord = statusUpdateActionTaskRecord;
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

