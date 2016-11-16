package com.minds.producthub.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "option", "description" })
public class Waiverofpremium {

	@JsonProperty("option")
	private String option;
	@JsonProperty("description")
	private String description;

	/**
	 * 
	 * @return The option
	 */
	@JsonProperty("option")
	public String getOption() {
		return option;
	}

	/**
	 * 
	 * @param option
	 *            The option
	 */
	@JsonProperty("option")
	public void setOption(String option) {
		this.option = option;
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

}