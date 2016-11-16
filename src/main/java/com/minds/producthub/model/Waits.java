package com.minds.producthub.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "waitingperiod", "additionaldiagnosticseperationperiod", "reoccuranceseperationperiod" })
public class Waits {

	@JsonProperty("waitingperiod")
	private Waitingperiod waitingperiod;
	@JsonProperty("additionaldiagnosticseperationperiod")
	private Additionaldiagnosticseperationperiod additionaldiagnosticseperationperiod;
	@JsonProperty("reoccuranceseperationperiod")
	private Reoccuranceseperationperiod reoccuranceseperationperiod;

	/**
	 * 
	 * @return The waitingperiod
	 */
	@JsonProperty("waitingperiod")
	public Waitingperiod getWaitingperiod() {
		return waitingperiod;
	}

	/**
	 * 
	 * @param waitingperiod
	 *            The waitingperiod
	 */
	@JsonProperty("waitingperiod")
	public void setWaitingperiod(Waitingperiod waitingperiod) {
		this.waitingperiod = waitingperiod;
	}

	/**
	 * 
	 * @return The additionaldiagnosticseperationperiod
	 */
	@JsonProperty("additionaldiagnosticseperationperiod")
	public Additionaldiagnosticseperationperiod getAdditionaldiagnosticseperationperiod() {
		return additionaldiagnosticseperationperiod;
	}

	/**
	 * 
	 * @param additionaldiagnosticseperationperiod
	 *            The additionaldiagnosticseperationperiod
	 */
	@JsonProperty("additionaldiagnosticseperationperiod")
	public void setAdditionaldiagnosticseperationperiod(
			Additionaldiagnosticseperationperiod additionaldiagnosticseperationperiod) {
		this.additionaldiagnosticseperationperiod = additionaldiagnosticseperationperiod;
	}

	/**
	 * 
	 * @return The reoccuranceseperationperiod
	 */
	@JsonProperty("reoccuranceseperationperiod")
	public Reoccuranceseperationperiod getReoccuranceseperationperiod() {
		return reoccuranceseperationperiod;
	}

	/**
	 * 
	 * @param reoccuranceseperationperiod
	 *            The reoccuranceseperationperiod
	 */
	@JsonProperty("reoccuranceseperationperiod")
	public void setReoccuranceseperationperiod(Reoccuranceseperationperiod reoccuranceseperationperiod) {
		this.reoccuranceseperationperiod = reoccuranceseperationperiod;
	}

}