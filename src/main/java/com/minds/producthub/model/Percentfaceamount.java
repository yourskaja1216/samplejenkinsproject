package com.minds.producthub.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "minamount", "maxamount", "fixedamount" })
public class Percentfaceamount {

	@JsonProperty("minamount")
	private String minamount;
	@JsonProperty("maxamount")
	private String maxamount;
	@JsonProperty("fixedamount")
	private String fixedamount;

	/**
	 * 
	 * @return The minamount
	 */
	@JsonProperty("minamount")
	public String getMinamount() {
		return minamount;
	}

	/**
	 * 
	 * @param minamount
	 *            The minamount
	 */
	@JsonProperty("minamount")
	public void setMinamount(String minamount) {
		this.minamount = minamount;
	}

	/**
	 * 
	 * @return The maxamount
	 */
	@JsonProperty("maxamount")
	public String getMaxamount() {
		return maxamount;
	}

	/**
	 * 
	 * @param maxamount
	 *            The maxamount
	 */
	@JsonProperty("maxamount")
	public void setMaxamount(String maxamount) {
		this.maxamount = maxamount;
	}

	/**
	 * 
	 * @return The fixedamount
	 */
	@JsonProperty("fixedamount")
	public String getFixedamount() {
		return fixedamount;
	}

	/**
	 * 
	 * @param fixedamount
	 *            The fixedamount
	 */
	@JsonProperty("fixedamount")
	public void setFixedamount(String fixedamount) {
		this.fixedamount = fixedamount;
	}

}