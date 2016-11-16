package com.minds.producthub.model.doctype;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "_id", "name", "productseries_id" })
public class LineOfBusinessDoctype {

	@JsonProperty("_id")
	private String id;
	@JsonProperty("name")
	private String name;
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
	 * @return The name
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            The name
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
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