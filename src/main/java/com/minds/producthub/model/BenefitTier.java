package com.minds.producthub.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "tierno", "description", "unit", "minunits", "maxunits", "minimumunitamount",
		"maximumunitamount" })
public class BenefitTier {

	@JsonProperty("tierno")
	private String tierno;
	@JsonProperty("description")
	private String description;
	@JsonProperty("unit")
	private String unit;
	@JsonProperty("minunits")
	private String minunits;
	@JsonProperty("maxunits")
	private String maxunits;
	@JsonProperty("minimumunitamount")
	private String minimumunitamount;
	@JsonProperty("maximumunitamount")
	private String maximumunitamount;

	/**
	 * 
	 * @return The tierno
	 */
	@JsonProperty("tierno")
	public String getTierno() {
		return tierno;
	}

	/**
	 * 
	 * @param tierno
	 *            The tierno
	 */
	@JsonProperty("tierno")
	public void setTierno(String tierno) {
		this.tierno = tierno;
	}

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
	 * @return The minunits
	 */
	@JsonProperty("minunits")
	public String getMinunits() {
		return minunits;
	}

	/**
	 * 
	 * @param minunits
	 *            The minunits
	 */
	@JsonProperty("minunits")
	public void setMinunits(String minunits) {
		this.minunits = minunits;
	}

	/**
	 * 
	 * @return The maxunits
	 */
	@JsonProperty("maxunits")
	public String getMaxunits() {
		return maxunits;
	}

	/**
	 * 
	 * @param maxunits
	 *            The maxunits
	 */
	@JsonProperty("maxunits")
	public void setMaxunits(String maxunits) {
		this.maxunits = maxunits;
	}

	/**
	 * 
	 * @return The minimumunitamount
	 */
	@JsonProperty("minimumunitamount")
	public String getMinimumunitamount() {
		return minimumunitamount;
	}

	/**
	 * 
	 * @param minimumunitamount
	 *            The minimumunitamount
	 */
	@JsonProperty("minimumunitamount")
	public void setMinimumunitamount(String minimumunitamount) {
		this.minimumunitamount = minimumunitamount;
	}

	/**
	 * 
	 * @return The maximumunitamount
	 */
	@JsonProperty("maximumunitamount")
	public String getMaximumunitamount() {
		return maximumunitamount;
	}

	/**
	 * 
	 * @param maximumunitamount
	 *            The maximumunitamount
	 */
	@JsonProperty("maximumunitamount")
	public void setMaximumunitamount(String maximumunitamount) {
		this.maximumunitamount = maximumunitamount;
	}

}