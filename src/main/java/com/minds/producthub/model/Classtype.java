package com.minds.producthub.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "industryclass", "occupationclass" })
public class Classtype {

	@JsonProperty("industryclass")
	private String industryclass;
	@JsonProperty("occupationclass")
	private String occupationclass;

	/**
	 * 
	 * @return The industryclass
	 */
	@JsonProperty("industryclass")
	public String getIndustryclass() {
		return industryclass;
	}

	/**
	 * 
	 * @param industryclass
	 *            The industryclass
	 */
	@JsonProperty("industryclass")
	public void setIndustryclass(String industryclass) {
		this.industryclass = industryclass;
	}

	/**
	 * 
	 * @return The occupationclass
	 */
	@JsonProperty("occupationclass")
	public String getOccupationclass() {
		return occupationclass;
	}

	/**
	 * 
	 * @param occupationclass
	 *            The occupationclass
	 */
	@JsonProperty("occupationclass")
	public void setOccupationclass(String occupationclass) {
		this.occupationclass = occupationclass;
	}

}