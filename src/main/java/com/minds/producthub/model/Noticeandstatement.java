package com.minds.producthub.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "noticetext" })
public class Noticeandstatement {

	@JsonProperty("noticetext")
	private String noticetext;

	/**
	 * 
	 * @return The noticetext
	 */
	@JsonProperty("noticetext")
	public String getNoticetext() {
		return noticetext;
	}

	/**
	 * 
	 * @param noticetext
	 *            The noticetext
	 */
	@JsonProperty("noticetext")
	public void setNoticetext(String noticetext) {
		this.noticetext = noticetext;
	}

}