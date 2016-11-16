package com.minds.producthub.model.doctype;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "_id", "name", "companycode", "lob_ids" })
public class MasterProductDoctype {

	@JsonProperty("_id")
	private String id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("companycode")
	private String companycode;
	@JsonProperty("lob_ids")
	private List<String> lobIds = new ArrayList<String>();

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
	 * @return The companycode
	 */
	@JsonProperty("companycode")
	public String getCompanycode() {
		return companycode;
	}

	/**
	 * 
	 * @param companycode
	 *            The companycode
	 */
	@JsonProperty("companycode")
	public void setCompanycode(String companycode) {
		this.companycode = companycode;
	}

	/**
	 * 
	 * @return The lobIds
	 */
	@JsonProperty("lob_ids")
	public List<String> getLobIds() {
		return lobIds;
	}

	/**
	 * 
	 * @param lobIds
	 *            The lob_ids
	 */
	@JsonProperty("lob_ids")
	public void setLobIds(List<String> lobIds) {
		this.lobIds = lobIds;
	}

}