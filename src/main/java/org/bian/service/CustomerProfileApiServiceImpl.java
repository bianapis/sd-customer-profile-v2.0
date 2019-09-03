/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerProfileApiServiceImpl implements CustomerProfileApiService {

	public SDCustomerProfileActivateOutputModel activate(SDCustomerProfileActivateInputModel request){
		return JsonReader.read("activate-SDCustomerProfileActivateOutputModel.json",new TypeReference<SDCustomerProfileActivateOutputModel>(){});
	}
	
	public BQAlertCaptureOutputModel captureAlert(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAlertCaptureInputModel request){
		return JsonReader.read("capture-BQAlertCaptureOutputModel.json",new TypeReference<BQAlertCaptureOutputModel>(){});
	}
	
	public BQRatingCaptureOutputModel captureRating(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRatingCaptureInputModel request){
		return JsonReader.read("capture-BQRatingCaptureOutputModel.json",new TypeReference<BQRatingCaptureOutputModel>(){});
	}
	
	public BQStatusCaptureOutputModel captureStatus(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStatusCaptureInputModel request){
		return JsonReader.read("capture-BQStatusCaptureOutputModel.json",new TypeReference<BQStatusCaptureOutputModel>(){});
	}
	
	public SDCustomerProfileConfigureOutputModel configure(String sdReferenceId, SDCustomerProfileConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerProfileConfigureOutputModel.json",new TypeReference<SDCustomerProfileConfigureOutputModel>(){});
	}
	
	public CRPartyStateControlOutputModel control(String sdReferenceId, String crReferenceId, CRPartyStateControlInputModel request){
		return JsonReader.read("control-CRPartyStateControlOutputModel.json",new TypeReference<CRPartyStateControlOutputModel>(){});
	}
	
	public BQAlertExchangeOutputModel exchangeAlert(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAlertExchangeInputModel request){
		return JsonReader.read("exchange-BQAlertExchangeOutputModel.json",new TypeReference<BQAlertExchangeOutputModel>(){});
	}
	
	public CRPartyStateExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRPartyStateExecuteInputModel request){
		return JsonReader.read("execute-CRPartyStateExecuteOutputModel.json",new TypeReference<CRPartyStateExecuteOutputModel>(){});
	}
	
	public SDCustomerProfileFeedbackOutputModel feedback(String sdReferenceId, SDCustomerProfileFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerProfileFeedbackOutputModel.json",new TypeReference<SDCustomerProfileFeedbackOutputModel>(){});
	}
	
	public CRPartyStateInitiateOutputModel initiate(String sdReferenceId, CRPartyStateInitiateInputModel request){
		return JsonReader.read("initiate-CRPartyStateInitiateOutputModel.json",new TypeReference<CRPartyStateInitiateOutputModel>(){});
	}
	
	public CRPartyStateRequestOutputModel request(String sdReferenceId, String crReferenceId, CRPartyStateRequestInputModel request){
		return JsonReader.read("request-CRPartyStateRequestOutputModel.json",new TypeReference<CRPartyStateRequestOutputModel>(){});
	}
	
	public CRPartyStateRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRPartyStateRetrieveOutputModel.json",new TypeReference<CRPartyStateRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAlertRetrieveOutputModel retrieveAlert(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAlertRetrieveOutputModel.json",new TypeReference<BQAlertRetrieveOutputModel>(){});
	}
	
	public BQRatingRetrieveOutputModel retrieveRating(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRatingRetrieveOutputModel.json",new TypeReference<BQRatingRetrieveOutputModel>(){});
	}
	
	public BQStatusRetrieveOutputModel retrieveStatus(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQStatusRetrieveOutputModel.json",new TypeReference<BQStatusRetrieveOutputModel>(){});
	}
	
	public SDCustomerProfileRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerProfileRetrieveOutputModel.json",new TypeReference<SDCustomerProfileRetrieveOutputModel>(){});
	}
	
	public CRPartyStateUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRPartyStateUpdateInputModel request){
		return JsonReader.read("update-CRPartyStateUpdateOutputModel.json",new TypeReference<CRPartyStateUpdateOutputModel>(){});
	}
	
	public BQAlertUpdateOutputModel updateAlert(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAlertUpdateInputModel request){
		return JsonReader.read("update-BQAlertUpdateOutputModel.json",new TypeReference<BQAlertUpdateOutputModel>(){});
	}
	
	public BQRatingUpdateOutputModel updateRating(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRatingUpdateInputModel request){
		return JsonReader.read("update-BQRatingUpdateOutputModel.json",new TypeReference<BQRatingUpdateOutputModel>(){});
	}
	
	public BQStatusUpdateOutputModel updateStatus(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStatusUpdateInputModel request){
		return JsonReader.read("update-BQStatusUpdateOutputModel.json",new TypeReference<BQStatusUpdateOutputModel>(){});
	}
	
}
