package com.minds.producthub.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "versionnumber", "versiondescription", "versioneffectivedate", "versionexpirationdate" })
public class Version {

	@JsonProperty("versionnumber")
	private String versionnumber;
	@JsonProperty("versiondescription")
	private String versiondescription;
	@JsonProperty("versioneffectivedate")
	private String versioneffectivedate;
	@JsonProperty("versionexpirationdate")
	private String versionexpirationdate;

	/**
	 * 
	 * @return The versionnumber
	 */
	@JsonProperty("versionnumber")
	public String getVersionnumber() {
		return versionnumber;
	}

	/**
	 * 
	 * @param versionnumber
	 *            The versionnumber
	 */
	@JsonProperty("versionnumber")
	public void setVersionnumber(String versionnumber) {
		this.versionnumber = versionnumber;
	}

	/**
	 * 
	 * @return The versiondescription
	 */
	@JsonProperty("versiondescription")
	public String getVersiondescription() {
		return versiondescription;
	}

	/**
	 * 
	 * @param versiondescription
	 *            The versiondescription
	 */
	@JsonProperty("versiondescription")
	public void setVersiondescription(String versiondescription) {
		this.versiondescription = versiondescription;
	}

	/**
	 * 
	 * @return The versioneffectivedate
	 */
	@JsonProperty("versioneffectivedate")
	public String getVersioneffectivedate() {
		return versioneffectivedate;
	}

	/**
	 * 
	 * @param versioneffectivedate
	 *            The versioneffectivedate
	 */
	@JsonProperty("versioneffectivedate")
	public void setVersioneffectivedate(String versioneffectivedate) {
		this.versioneffectivedate = versioneffectivedate;
	}

	/**
	 * 
	 * @return The versionexpirationdate
	 */
	@JsonProperty("versionexpirationdate")
	public String getVersionexpirationdate() {
		return versionexpirationdate;
	}

	/**
	 * 
	 * @param versionexpirationdate
	 *            The versionexpirationdate
	 */
	@JsonProperty("versionexpirationdate")
	public void setVersionexpirationdate(String versionexpirationdate) {
		this.versionexpirationdate = versionexpirationdate;
	}

}