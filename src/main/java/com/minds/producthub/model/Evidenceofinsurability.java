package com.minds.producthub.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "questiontext", "description" })
public class Evidenceofinsurability {

	@JsonProperty("questiontext")
	private String questiontext;
	@JsonProperty("description")
	private String description;

	/**
	 * 
	 * @return The questiontext
	 */
	@JsonProperty("questiontext")
	public String getQuestiontext() {
		return questiontext;
	}

	/**
	 * 
	 * @param questiontext
	 *            The questiontext
	 */
	@JsonProperty("questiontext")
	public void setQuestiontext(String questiontext) {
		this.questiontext = questiontext;
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