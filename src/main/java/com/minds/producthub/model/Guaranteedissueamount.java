package com.minds.producthub.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "amount", "participationpercent", "gauranteeperiod" })
public class Guaranteedissueamount {

	@JsonProperty("amount")
	private String amount;
	@JsonProperty("participationpercent")
	private String participationpercent;
	@JsonProperty("gauranteeperiod")
	private String gauranteeperiod;

	/**
	 * 
	 * @return The amount
	 */
	@JsonProperty("amount")
	public String getAmount() {
		return amount;
	}

	/**
	 * 
	 * @param amount
	 *            The amount
	 */
	@JsonProperty("amount")
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * 
	 * @return The participationpercent
	 */
	@JsonProperty("participationpercent")
	public String getParticipationpercent() {
		return participationpercent;
	}

	/**
	 * 
	 * @param participationpercent
	 *            The participationpercent
	 */
	@JsonProperty("participationpercent")
	public void setParticipationpercent(String participationpercent) {
		this.participationpercent = participationpercent;
	}

	/**
	 * 
	 * @return The gauranteeperiod
	 */
	@JsonProperty("gauranteeperiod")
	public String getGauranteeperiod() {
		return gauranteeperiod;
	}

	/**
	 * 
	 * @param gauranteeperiod
	 *            The gauranteeperiod
	 */
	@JsonProperty("gauranteeperiod")
	public void setGauranteeperiod(String gauranteeperiod) {
		this.gauranteeperiod = gauranteeperiod;
	}

}