package com.minds.producthub.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "description", "unit", "minperiod", "maxperiod", "fixedperiod" })
public class Diagnosislimitation {

	@JsonProperty("description")
	private String description;
	@JsonProperty("unit")
	private String unit;
	@JsonProperty("minperiod")
	private String minperiod;
	@JsonProperty("maxperiod")
	private String maxperiod;
	@JsonProperty("fixedperiod")
	private String fixedperiod;

	/**
	 * 
	 * @return The description
	 */
	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 *            The description
	 */
	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
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
	 * @return The minperiod
	 */
	@JsonProperty("minperiod")
	public String getMinperiod() {
		return minperiod;
	}

	/**
	 * 
	 * @param minperiod
	 *            The minperiod
	 */
	@JsonProperty("minperiod")
	public void setMinperiod(String minperiod) {
		this.minperiod = minperiod;
	}

	/**
	 * 
	 * @return The maxperiod
	 */
	@JsonProperty("maxperiod")
	public String getMaxperiod() {
		return maxperiod;
	}

	/**
	 * 
	 * @param maxperiod
	 *            The maxperiod
	 */
	@JsonProperty("maxperiod")
	public void setMaxperiod(String maxperiod) {
		this.maxperiod = maxperiod;
	}

	/**
	 * 
	 * @return The fixedperiod
	 */
	@JsonProperty("fixedperiod")
	public String getFixedperiod() {
		return fixedperiod;
	}

	/**
	 * 
	 * @param fixedperiod
	 *            The fixedperiod
	 */
	@JsonProperty("fixedperiod")
	public void setFixedperiod(String fixedperiod) {
		this.fixedperiod = fixedperiod;
	}

}