package com.minds.producthub.model.doctype;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import com.minds.producthub.model.Benefit;
import com.minds.producthub.model.Coveragelimitation;
import com.minds.producthub.model.Rates;
import com.minds.producthub.model.Version;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "_id", "productname", "lob", "productfamily_lob_ids", "productcode", "statename", "statecode",
		"version", "coveraganame", "coveragecode", "coverageoption", "coveragestartdate", "coverageexpirationdate",
		"mandatory", "coveragekind", "membertype", "coveragelimitations", "benefit", "rates" })
public class ProductCoverageDoctype {

	@JsonProperty("_id")
	private String id;
	@JsonProperty("productname")
	private String productname;
	@JsonProperty("lob")
	private String lob;
	@JsonProperty("productfamily_lob_ids")
	private List<String> productfamilyLobIds = new ArrayList<String>();
	@JsonProperty("productcode")
	private String productcode;
	@JsonProperty("statename")
	private String statename;
	@JsonProperty("statecode")
	private String statecode;
	@JsonProperty("version")
	private Version version;
	@JsonProperty("coveraganame")
	private String coveraganame;
	@JsonProperty("coveragecode")
	private String coveragecode;
	@JsonProperty("coverageoption")
	private String coverageoption;
	@JsonProperty("coveragestartdate")
	private String coveragestartdate;
	@JsonProperty("coverageexpirationdate")
	private String coverageexpirationdate;
	@JsonProperty("mandatory")
	private String mandatory;
	@JsonProperty("coveragekind")
	private String coveragekind;
	@JsonProperty("membertype")
	private String membertype;
	@JsonProperty("coveragelimitations")
	private List<Coveragelimitation> coveragelimitations = new ArrayList<Coveragelimitation>();
	@JsonProperty("benefit")
	private List<Benefit> benefit = new ArrayList<Benefit>();
	@JsonProperty("rates")
	private Rates rates;

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
	 * @return The productname
	 */
	@JsonProperty("productname")
	public String getProductname() {
		return productname;
	}

	/**
	 * 
	 * @param productname
	 *            The productname
	 */
	@JsonProperty("productname")
	public void setProductname(String productname) {
		this.productname = productname;
	}

	/**
	 * 
	 * @return The lob
	 */
	@JsonProperty("lob")
	public String getLob() {
		return lob;
	}

	/**
	 * 
	 * @param lob
	 *            The lob
	 */
	@JsonProperty("lob")
	public void setLob(String lob) {
		this.lob = lob;
	}

	/**
	 * 
	 * @return The productfamilyLobIds
	 */
	@JsonProperty("productfamily_lob_ids")
	public List<String> getProductfamilyLobIds() {
		return productfamilyLobIds;
	}

	/**
	 * 
	 * @param productfamilyLobIds
	 *            The productfamily_lob_ids
	 */
	@JsonProperty("productfamily_lob_ids")
	public void setProductfamilyLobIds(List<String> productfamilyLobIds) {
		this.productfamilyLobIds = productfamilyLobIds;
	}

	/**
	 * 
	 * @return The productcode
	 */
	@JsonProperty("productcode")
	public String getProductcode() {
		return productcode;
	}

	/**
	 * 
	 * @param productcode
	 *            The productcode
	 */
	@JsonProperty("productcode")
	public void setProductcode(String productcode) {
		this.productcode = productcode;
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
	 * @return The version
	 */
	@JsonProperty("version")
	public Version getVersion() {
		return version;
	}

	/**
	 * 
	 * @param version
	 *            The version
	 */
	@JsonProperty("version")
	public void setVersion(Version version) {
		this.version = version;
	}

	/**
	 * 
	 * @return The coveraganame
	 */
	@JsonProperty("coveraganame")
	public String getCoveraganame() {
		return coveraganame;
	}

	/**
	 * 
	 * @param coveraganame
	 *            The coveraganame
	 */
	@JsonProperty("coveraganame")
	public void setCoveraganame(String coveraganame) {
		this.coveraganame = coveraganame;
	}

	/**
	 * 
	 * @return The coveragecode
	 */
	@JsonProperty("coveragecode")
	public String getCoveragecode() {
		return coveragecode;
	}

	/**
	 * 
	 * @param coveragecode
	 *            The coveragecode
	 */
	@JsonProperty("coveragecode")
	public void setCoveragecode(String coveragecode) {
		this.coveragecode = coveragecode;
	}

	/**
	 * 
	 * @return The coverageoption
	 */
	@JsonProperty("coverageoption")
	public String getCoverageoption() {
		return coverageoption;
	}

	/**
	 * 
	 * @param coverageoption
	 *            The coverageoption
	 */
	@JsonProperty("coverageoption")
	public void setCoverageoption(String coverageoption) {
		this.coverageoption = coverageoption;
	}

	/**
	 * 
	 * @return The coveragestartdate
	 */
	@JsonProperty("coveragestartdate")
	public String getCoveragestartdate() {
		return coveragestartdate;
	}

	/**
	 * 
	 * @param coveragestartdate
	 *            The coveragestartdate
	 */
	@JsonProperty("coveragestartdate")
	public void setCoveragestartdate(String coveragestartdate) {
		this.coveragestartdate = coveragestartdate;
	}

	/**
	 * 
	 * @return The coverageexpirationdate
	 */
	@JsonProperty("coverageexpirationdate")
	public String getCoverageexpirationdate() {
		return coverageexpirationdate;
	}

	/**
	 * 
	 * @param coverageexpirationdate
	 *            The coverageexpirationdate
	 */
	@JsonProperty("coverageexpirationdate")
	public void setCoverageexpirationdate(String coverageexpirationdate) {
		this.coverageexpirationdate = coverageexpirationdate;
	}

	/**
	 * 
	 * @return The mandatory
	 */
	@JsonProperty("mandatory")
	public String getMandatory() {
		return mandatory;
	}

	/**
	 * 
	 * @param mandatory
	 *            The mandatory
	 */
	@JsonProperty("mandatory")
	public void setMandatory(String mandatory) {
		this.mandatory = mandatory;
	}

	/**
	 * 
	 * @return The coveragekind
	 */
	@JsonProperty("coveragekind")
	public String getCoveragekind() {
		return coveragekind;
	}

	/**
	 * 
	 * @param coveragekind
	 *            The coveragekind
	 */
	@JsonProperty("coveragekind")
	public void setCoveragekind(String coveragekind) {
		this.coveragekind = coveragekind;
	}

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
	 * @return The coveragelimitations
	 */
	@JsonProperty("coveragelimitations")
	public List<Coveragelimitation> getCoveragelimitations() {
		return coveragelimitations;
	}

	/**
	 * 
	 * @param coveragelimitations
	 *            The coveragelimitations
	 */
	@JsonProperty("coveragelimitations")
	public void setCoveragelimitations(List<Coveragelimitation> coveragelimitations) {
		this.coveragelimitations = coveragelimitations;
	}

	/**
	 * 
	 * @return The benefit
	 */
	@JsonProperty("benefit")
	public List<Benefit> getBenefit() {
		return benefit;
	}

	/**
	 * 
	 * @param benefit
	 *            The benefit
	 */
	@JsonProperty("benefit")
	public void setBenefit(List<Benefit> benefit) {
		this.benefit = benefit;
	}

	/**
	 * 
	 * @return The rates
	 */
	@JsonProperty("rates")
	public Rates getRates() {
		return rates;
	}

	/**
	 * 
	 * @param rates
	 *            The rates
	 */
	@JsonProperty("rates")
	public void setRates(Rates rates) {
		this.rates = rates;
	}

}