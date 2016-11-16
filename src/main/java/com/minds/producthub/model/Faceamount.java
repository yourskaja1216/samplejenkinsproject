package com.minds.producthub.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "minimumamount", "maximumamount", "steplevel" })
public class Faceamount {

	@JsonProperty("minimumamount")
	private String minimumamount;
	@JsonProperty("maximumamount")
	private String maximumamount;
	@JsonProperty("steplevel")
	private String steplevel;

	/**
	 * 
	 * @return The minimumamount
	 */
	@JsonProperty("minimumamount")
	public String getMinimumamount() {
		return minimumamount;
	}

	/**
	 * 
	 * @param minimumamount
	 *            The minimumamount
	 */
	@JsonProperty("minimumamount")
	public void setMinimumamount(String minimumamount) {
		this.minimumamount = minimumamount;
	}

	/**
	 * 
	 * @return The maximumamount
	 */
	@JsonProperty("maximumamount")
	public String getMaximumamount() {
		return maximumamount;
	}

	/**
	 * 
	 * @param maximumamount
	 *            The maximumamount
	 */
	@JsonProperty("maximumamount")
	public void setMaximumamount(String maximumamount) {
		this.maximumamount = maximumamount;
	}

	/**
	 * 
	 * @return The steplevel
	 */
	@JsonProperty("steplevel")
	public String getSteplevel() {
		return steplevel;
	}

	/**
	 * 
	 * @param steplevel
	 *            The steplevel
	 */
	@JsonProperty("steplevel")
	public void setSteplevel(String steplevel) {
		this.steplevel = steplevel;
	}

}