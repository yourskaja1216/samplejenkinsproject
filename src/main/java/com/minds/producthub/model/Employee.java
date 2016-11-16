package com.minds.producthub.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "Faceamount", "Guaranteedissueamount", "Minimumissuedage" })
public class Employee {

	@JsonProperty("Faceamount")
	private Faceamount faceamount;
	@JsonProperty("Guaranteedissueamount")
	private Guaranteedissueamount guaranteedissueamount;
	@JsonProperty("Minimumissuedage")
	private String minimumissuedage;

	/**
	 * 
	 * @return The faceamount
	 */
	@JsonProperty("Faceamount")
	public Faceamount getFaceamount() {
		return faceamount;
	}

	/**
	 * 
	 * @param faceamount
	 *            The Faceamount
	 */
	@JsonProperty("Faceamount")
	public void setFaceamount(Faceamount faceamount) {
		this.faceamount = faceamount;
	}

	/**
	 * 
	 * @return The guaranteedissueamount
	 */
	@JsonProperty("Guaranteedissueamount")
	public Guaranteedissueamount getGuaranteedissueamount() {
		return guaranteedissueamount;
	}

	/**
	 * 
	 * @param guaranteedissueamount
	 *            The Guaranteedissueamount
	 */
	@JsonProperty("Guaranteedissueamount")
	public void setGuaranteedissueamount(Guaranteedissueamount guaranteedissueamount) {
		this.guaranteedissueamount = guaranteedissueamount;
	}

	/**
	 * 
	 * @return The minimumissuedage
	 */
	@JsonProperty("Minimumissuedage")
	public String getMinimumissuedage() {
		return minimumissuedage;
	}

	/**
	 * 
	 * @param minimumissuedage
	 *            The Minimumissuedage
	 */
	@JsonProperty("Minimumissuedage")
	public void setMinimumissuedage(String minimumissuedage) {
		this.minimumissuedage = minimumissuedage;
	}

}