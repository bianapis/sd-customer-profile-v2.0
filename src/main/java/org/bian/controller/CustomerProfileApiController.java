/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Monitor;

@BianRestController
public class CustomerProfileApiController {

	@Autowired
	CustomerProfileApiService service;
	
	@Monitor.Activate
	public BianResponse<SDCustomerProfileActivateOutputModel> activate(@RequestBody BianRequest<SDCustomerProfileActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("alert")
	@Monitor.Capture
	public BianResponse<BQAlertCaptureOutputModel> captureAlert(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAlertCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureAlert(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("rating")
	@Monitor.Capture
	public BianResponse<BQRatingCaptureOutputModel> captureRating(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRatingCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureRating(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("status")
	@Monitor.Capture
	public BianResponse<BQStatusCaptureOutputModel> captureStatus(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQStatusCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureStatus(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Configure
	public BianResponse<SDCustomerProfileConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerProfileConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Control
	public BianResponse<CRPartyStateControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRPartyStateControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("alert")
	@Monitor.Exchange
	public BianResponse<BQAlertExchangeOutputModel> exchangeAlert(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAlertExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeAlert(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Execute
	public BianResponse<CRPartyStateExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRPartyStateExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Feedback
	public BianResponse<SDCustomerProfileFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerProfileFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Initiate
	public BianResponse<CRPartyStateInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRPartyStateInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Request
	public BianResponse<CRPartyStateRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRPartyStateRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Retrieve
	public BianResponse<CRPartyStateRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Monitor.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Monitor.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Monitor.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("alert")
	@Monitor.Retrieve
	public BianResponse<BQAlertRetrieveOutputModel> retrieveAlert(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAlert(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("rating")
	@Monitor.Retrieve
	public BianResponse<BQRatingRetrieveOutputModel> retrieveRating(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRating(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("status")
	@Monitor.Retrieve
	public BianResponse<BQStatusRetrieveOutputModel> retrieveStatus(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveStatus(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Monitor.RetrieveSD
	public BianResponse<SDCustomerProfileRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Monitor.Update
	public BianResponse<CRPartyStateUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRPartyStateUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("alert")
	@Monitor.Update
	public BianResponse<BQAlertUpdateOutputModel> updateAlert(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAlertUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAlert(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("rating")
	@Monitor.Update
	public BianResponse<BQRatingUpdateOutputModel> updateRating(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRatingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateRating(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("status")
	@Monitor.Update
	public BianResponse<BQStatusUpdateOutputModel> updateStatus(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQStatusUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateStatus(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
