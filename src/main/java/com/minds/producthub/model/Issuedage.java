package com.minds.producthub.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "membertype", "minage" })
public class Issuedage {

	@JsonProperty("membertype")
	private String membertype;
	@JsonProperty("minage")
	private String minage;

	/**
	 * 
	 * @return The membertype
	 */
	@JsonProperty("membertype")
	public String getMembertype() {
		return membertype;
	}

	/**
	 * 
	 * @param membertype
	 *            The membertype
	 */
	@JsonProperty("membertype")
	public void setMembertype(String membertype) {
		this.membertype = membertype;
	}

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

}