package com.minds.producthub.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "composite", "issuedage", "attainedage", "classtype", "tobaccousage", "ratebands" })
public class Rates {

	@JsonProperty("composite")
	private String composite;
	@JsonProperty("issuedage")
	private String issuedage;
	@JsonProperty("attainedage")
	private String attainedage;
	@JsonProperty("classtype")
	private Classtype classtype;
	@JsonProperty("tobaccousage")
	private Tobaccousage tobaccousage;
	@JsonProperty("ratebands")
	private List<Rateband> ratebands = new ArrayList<Rateband>();

	/**
	 * 
	 * @return The composite
	 */
	@JsonProperty("composite")
	public String getComposite() {
		return composite;
	}

	/**
	 * 
	 * @param composite
	 *            The composite
	 */
	@JsonProperty("composite")
	public void setComposite(String composite) {
		this.composite = composite;
	}

	/**
	 * 
	 * @return The issuedage
	 */
	@JsonProperty("issuedage")
	public String getIssuedage() {
		return issuedage;
	}

	/**
	 * 
	 * @param issuedage
	 *            The issuedage
	 */
	@JsonProperty("issuedage")
	public void setIssuedage(String issuedage) {
		this.issuedage = issuedage;
	}

	/**
	 * 
	 * @return The attainedage
	 */
	@JsonProperty("attainedage")
	public String getAttainedage() {
		return attainedage;
	}

	/**
	 * 
	 * @param attainedage
	 *            The attainedage
	 */
	@JsonProperty("attainedage")
	public void setAttainedage(String attainedage) {
		this.attainedage = attainedage;
	}

	/**
	 * 
	 * @return The classtype
	 */
	@JsonProperty("classtype")
	public Classtype getClasstype() {
		return classtype;
	}

	/**
	 * 
	 * @param classtype
	 *            The classtype
	 */
	@JsonProperty("classtype")
	public void setClasstype(Classtype classtype) {
		this.classtype = classtype;
	}

	/**
	 * 
	 * @return The tobaccousage
	 */
	@JsonProperty("tobaccousage")
	public Tobaccousage getTobaccousage() {
		return tobaccousage;
	}

	/**
	 * 
	 * @param tobaccousage
	 *            The tobaccousage
	 */
	@JsonProperty("tobaccousage")
	public void setTobaccousage(Tobaccousage tobaccousage) {
		this.tobaccousage = tobaccousage;
	}

	/**
	 * 
	 * @return The ratebands
	 */
	@JsonProperty("ratebands")
	public List<Rateband> getRatebands() {
		return ratebands;
	}

	/**
	 * 
	 * @param ratebands
	 *            The ratebands
	 */
	@JsonProperty("ratebands")
	public void setRatebands(List<Rateband> ratebands) {
		this.ratebands = ratebands;
	}

}