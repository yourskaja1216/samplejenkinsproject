package com.minds.producthub.model.doctype;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "_id", "statename", "statecode", "productseries_id" })
public class StateDocType {

	@JsonProperty("_id")
	private String id;
	@JsonProperty("statename")
	private String statename;
	@JsonProperty("statecode")
	private String statecode;
	@JsonProperty("productseries_id")
	private List<String> productseriesId = new ArrayList<String>();

	/**
	 * 
	 * @return The id
	 */
	@JsonProperty("_id")
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The _id
	 */
	@JsonProperty("_id")
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The statename
	 */
	@JsonProperty("statename")
	public String getStatename() {
		return statename;
	}

	/**
	 * 
	 * @param statename
	 *            The statename
	 */
	@JsonProperty("statename")
	public void setStatename(String statename) {
		this.statename = statename;
	}

	/**
	 * 
	 * @return The statecode
	 */
	@JsonProperty("statecode")
	public String getStatecode() {
		return statecode;
	}

	/**
	 * 
	 * @param statecode
	 *            The statecode
	 */
	@JsonProperty("statecode")
	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}

	/**
	 * 
	 * @return The productseriesId
	 */
	@JsonProperty("productseries_id")
	public List<String> getProductseriesId() {
		return productseriesId;
	}

	/**
	 * 
	 * @param productseriesId
	 *            The productseries_id
	 */
	@JsonProperty("productseries_id")
	public void setProductseriesId(List<String> productseriesId) {
		this.productseriesId = productseriesId;
	}

}