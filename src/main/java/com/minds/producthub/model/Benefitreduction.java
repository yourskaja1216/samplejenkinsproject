package com.minds.producthub.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "minage", "maxage", "unit", "minvalue", "maxvalue" })
public class Benefitreduction {

	@JsonProperty("minage")
	private String minage;
	@JsonProperty("maxage")
	private String maxage;
	@JsonProperty("unit")
	private String unit;
	@JsonProperty("minvalue")
	private String minvalue;
	@JsonProperty("maxvalue")
	private String maxvalue;

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

	/**
	 * 
	 * @return The unit
	 */
	@JsonProperty("unit")
	public String getUnit() {
		return unit;
	}

	/**
	 * 
	 * @param unit
	 *            The unit
	 */
	@JsonProperty("unit")
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * 
	 * @return The minvalue
	 */
	@JsonProperty("minvalue")
	public String getMinvalue() {
		return minvalue;
	}

	/**
	 * 
	 * @param minvalue
	 *            The minvalue
	 */
	@JsonProperty("minvalue")
	public void setMinvalue(String minvalue) {
		this.minvalue = minvalue;
	}

	/**
	 * 
	 * @return The maxvalue
	 */
	@JsonProperty("maxvalue")
	public String getMaxvalue() {
		return maxvalue;
	}

	/**
	 * 
	 * @param maxvalue
	 *            The maxvalue
	 */
	@JsonProperty("maxvalue")
	public void setMaxvalue(String maxvalue) {
		this.maxvalue = maxvalue;
	}

}