package com.minds.producthub.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "unitobacco", "tobaccodistinct", "tobaccoquestions" })
public class Tobaccousage {

	@JsonProperty("unitobacco")
	private String unitobacco;
	@JsonProperty("tobaccodistinct")
	private String tobaccodistinct;
	@JsonProperty("tobaccoquestions")
	private List<Tobaccoquestion> tobaccoquestions = new ArrayList<Tobaccoquestion>();

	/**
	 * 
	 * @return The unitobacco
	 */
	@JsonProperty("unitobacco")
	public String getUnitobacco() {
		return unitobacco;
	}

	/**
	 * 
	 * @param unitobacco
	 *            The unitobacco
	 */
	@JsonProperty("unitobacco")
	public void setUnitobacco(String unitobacco) {
		this.unitobacco = unitobacco;
	}

	/**
	 * 
	 * @return The tobaccodistinct
	 */
	@JsonProperty("tobaccodistinct")
	public String getTobaccodistinct() {
		return tobaccodistinct;
	}

	/**
	 * 
	 * @param tobaccodistinct
	 *            The tobaccodistinct
	 */
	@JsonProperty("tobaccodistinct")
	public void setTobaccodistinct(String tobaccodistinct) {
		this.tobaccodistinct = tobaccodistinct;
	}

	/**
	 * 
	 * @return The tobaccoquestions
	 */
	@JsonProperty("tobaccoquestions")
	public List<Tobaccoquestion> getTobaccoquestions() {
		return tobaccoquestions;
	}

	/**
	 * 
	 * @param tobaccoquestions
	 *            The tobaccoquestions
	 */
	@JsonProperty("tobaccoquestions")
	public void setTobaccoquestions(List<Tobaccoquestion> tobaccoquestions) {
		this.tobaccoquestions = tobaccoquestions;
	}

}