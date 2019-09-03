/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerProfileApiService {

	SDCustomerProfileActivateOutputModel activate(SDCustomerProfileActivateInputModel request);
	
	BQAlertCaptureOutputModel captureAlert(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAlertCaptureInputModel request);
	
	BQRatingCaptureOutputModel captureRating(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRatingCaptureInputModel request);
	
	BQStatusCaptureOutputModel captureStatus(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStatusCaptureInputModel request);
	
	SDCustomerProfileConfigureOutputModel configure(String sdReferenceId, SDCustomerProfileConfigureInputModel request);
	
	CRPartyStateControlOutputModel control(String sdReferenceId, String crReferenceId, CRPartyStateControlInputModel request);
	
	BQAlertExchangeOutputModel exchangeAlert(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAlertExchangeInputModel request);
	
	CRPartyStateExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRPartyStateExecuteInputModel request);
	
	SDCustomerProfileFeedbackOutputModel feedback(String sdReferenceId, SDCustomerProfileFeedbackInputModel request);
	
	CRPartyStateInitiateOutputModel initiate(String sdReferenceId, CRPartyStateInitiateInputModel request);
	
	CRPartyStateRequestOutputModel request(String sdReferenceId, String crReferenceId, CRPartyStateRequestInputModel request);
	
	CRPartyStateRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQAlertRetrieveOutputModel retrieveAlert(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQRatingRetrieveOutputModel retrieveRating(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQStatusRetrieveOutputModel retrieveStatus(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDCustomerProfileRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRPartyStateUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRPartyStateUpdateInputModel request);
	
	BQAlertUpdateOutputModel updateAlert(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAlertUpdateInputModel request);
	
	BQRatingUpdateOutputModel updateRating(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRatingUpdateInputModel request);
	
	BQStatusUpdateOutputModel updateStatus(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStatusUpdateInputModel request);
	
}
