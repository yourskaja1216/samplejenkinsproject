package com.minds.producthub.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "minage", "maxage" })
public class Rateband {

	@JsonProperty("minage")
	private String minage;
	@JsonProperty("maxage")
	private String maxage;

	/**
	 * 
	 * @return The minage
	 */
	@JsonProperty("minage")
	public String getMinage() {
		return minage;
	}

	/**
	 * 
	 * @param minage
	 *            The minage
	 */
	@JsonProperty("minage")
	public void setMinage(String minage) {
		this.minage = minage;
	}

	/**
	 * 
	 * @return The maxage
	 */
	@JsonProperty("maxage")
	public String getMaxage() {
		return maxage;
	}

	/**
	 * 
	 * @param maxage
	 *            The maxage
	 */
	@JsonProperty("maxage")
	public void setMaxage(String maxage) {
		this.maxage = maxage;
	}

}