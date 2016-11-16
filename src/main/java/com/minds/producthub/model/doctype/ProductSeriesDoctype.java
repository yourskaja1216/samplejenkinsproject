package com.minds.producthub.model.doctype;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import com.minds.producthub.model.Benefitreduction;
import com.minds.producthub.model.Diagnosislimitation;
import com.minds.producthub.model.Eligibility;
import com.minds.producthub.model.Employee;
import com.minds.producthub.model.Evidenceofinsurability;
import com.minds.producthub.model.Exclusion;
import com.minds.producthub.model.Issuedage;
import com.minds.producthub.model.Legal;
import com.minds.producthub.model.Minpayorsrequired;
import com.minds.producthub.model.Noticeandstatement;
import com.minds.producthub.model.Portability;
import com.minds.producthub.model.Productlimitation;
import com.minds.producthub.model.Spouse;
import com.minds.producthub.model.Version;
import com.minds.producthub.model.Waits;
import com.minds.producthub.model.Waiverofpremium;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "_id", "productname", "lob", "productfamily_lob_ids", "productcode", "statename", "statecode",
		"version", "coverage_type_offered", "minpayorsrequired", "Employee", "Spouse", "waits", "diagnosislimitations",
		"eligibility", "evidenceofinsurability", "legal", "productlimitations", "exclusions", "benefitreduction",
		"portability", "noticeandstatements", "formnumber", "waiverofpremium", "issuedage" })
public class ProductSeriesDoctype {

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
	@JsonProperty("coverage_type_offered")
	private List<String> coverageTypeOffered = new ArrayList<String>();
	@JsonProperty("minpayorsrequired")
	private Minpayorsrequired minpayorsrequired;
	@JsonProperty("Employee")
	private Employee employee;
	@JsonProperty("Spouse")
	private Spouse spouse;
	@JsonProperty("waits")
	private Waits waits;
	@JsonProperty("diagnosislimitations")
	private List<Diagnosislimitation> diagnosislimitations = new ArrayList<Diagnosislimitation>();
	@JsonProperty("eligibility")
	private List<Eligibility> eligibility = new ArrayList<Eligibility>();
	@JsonProperty("evidenceofinsurability")
	private List<Evidenceofinsurability> evidenceofinsurability = new ArrayList<Evidenceofinsurability>();
	@JsonProperty("legal")
	private Legal legal;
	@JsonProperty("productlimitations")
	private List<Productlimitation> productlimitations = new ArrayList<Productlimitation>();
	@JsonProperty("exclusions")
	private List<Exclusion> exclusions = new ArrayList<Exclusion>();
	@JsonProperty("benefitreduction")
	private Benefitreduction benefitreduction;
	@JsonProperty("portability")
	private List<Portability> portability = new ArrayList<Portability>();
	@JsonProperty("noticeandstatements")
	private List<Noticeandstatement> noticeandstatements = new ArrayList<Noticeandstatement>();
	@JsonProperty("formnumber")
	private List<String> formnumber = new ArrayList<String>();
	@JsonProperty("waiverofpremium")
	private List<Waiverofpremium> waiverofpremium = new ArrayList<Waiverofpremium>();
	@JsonProperty("issuedage")
	private List<Issuedage> issuedage = new ArrayList<Issuedage>();

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
	 * @return The coverageTypeOffered
	 */
	@JsonProperty("coverage_type_offered")
	public List<String> getCoverageTypeOffered() {
		return coverageTypeOffered;
	}

	/**
	 * 
	 * @param coverageTypeOffered
	 *            The coverage_type_offered
	 */
	@JsonProperty("coverage_type_offered")
	public void setCoverageTypeOffered(List<String> coverageTypeOffered) {
		this.coverageTypeOffered = coverageTypeOffered;
	}

	/**
	 * 
	 * @return The minpayorsrequired
	 */
	@JsonProperty("minpayorsrequired")
	public Minpayorsrequired getMinpayorsrequired() {
		return minpayorsrequired;
	}

	/**
	 * 
	 * @param minpayorsrequired
	 *            The minpayorsrequired
	 */
	@JsonProperty("minpayorsrequired")
	public void setMinpayorsrequired(Minpayorsrequired minpayorsrequired) {
		this.minpayorsrequired = minpayorsrequired;
	}

	/**
	 * 
	 * @return The employee
	 */
	@JsonProperty("Employee")
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * 
	 * @param employee
	 *            The Employee
	 */
	@JsonProperty("Employee")
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * 
	 * @return The spouse
	 */
	@JsonProperty("Spouse")
	public Spouse getSpouse() {
		return spouse;
	}

	/**
	 * 
	 * @param spouse
	 *            The Spouse
	 */
	@JsonProperty("Spouse")
	public void setSpouse(Spouse spouse) {
		this.spouse = spouse;
	}

	/**
	 * 
	 * @return The waits
	 */
	@JsonProperty("waits")
	public Waits getWaits() {
		return waits;
	}

	/**
	 * 
	 * @param waits
	 *            The waits
	 */
	@JsonProperty("waits")
	public void setWaits(Waits waits) {
		this.waits = waits;
	}

	/**
	 * 
	 * @return The diagnosislimitations
	 */
	@JsonProperty("diagnosislimitations")
	public List<Diagnosislimitation> getDiagnosislimitations() {
		return diagnosislimitations;
	}

	/**
	 * 
	 * @param diagnosislimitations
	 *            The diagnosislimitations
	 */
	@JsonProperty("diagnosislimitations")
	public void setDiagnosislimitations(List<Diagnosislimitation> diagnosislimitations) {
		this.diagnosislimitations = diagnosislimitations;
	}

	/**
	 * 
	 * @return The eligibility
	 */
	@JsonProperty("eligibility")
	public List<Eligibility> getEligibility() {
		return eligibility;
	}

	/**
	 * 
	 * @param eligibility
	 *            The eligibility
	 */
	@JsonProperty("eligibility")
	public void setEligibility(List<Eligibility> eligibility) {
		this.eligibility = eligibility;
	}

	/**
	 * 
	 * @return The evidenceofinsurability
	 */
	@JsonProperty("evidenceofinsurability")
	public List<Evidenceofinsurability> getEvidenceofinsurability() {
		return evidenceofinsurability;
	}

	/**
	 * 
	 * @param evidenceofinsurability
	 *            The evidenceofinsurability
	 */
	@JsonProperty("evidenceofinsurability")
	public void setEvidenceofinsurability(List<Evidenceofinsurability> evidenceofinsurability) {
		this.evidenceofinsurability = evidenceofinsurability;
	}

	/**
	 * 
	 * @return The legal
	 */
	@JsonProperty("legal")
	public Legal getLegal() {
		return legal;
	}

	/**
	 * 
	 * @param legal
	 *            The legal
	 */
	@JsonProperty("legal")
	public void setLegal(Legal legal) {
		this.legal = legal;
	}

	/**
	 * 
	 * @return The productlimitations
	 */
	@JsonProperty("productlimitations")
	public List<Productlimitation> getProductlimitations() {
		return productlimitations;
	}

	/**
	 * 
	 * @param productlimitations
	 *            The productlimitations
	 */
	@JsonProperty("productlimitations")
	public void setProductlimitations(List<Productlimitation> productlimitations) {
		this.productlimitations = productlimitations;
	}

	/**
	 * 
	 * @return The exclusions
	 */
	@JsonProperty("exclusions")
	public List<Exclusion> getExclusions() {
		return exclusions;
	}

	/**
	 * 
	 * @param exclusions
	 *            The exclusions
	 */
	@JsonProperty("exclusions")
	public void setExclusions(List<Exclusion> exclusions) {
		this.exclusions = exclusions;
	}

	/**
	 * 
	 * @return The benefitreduction
	 */
	@JsonProperty("benefitreduction")
	public Benefitreduction getBenefitreduction() {
		return benefitreduction;
	}

	/**
	 * 
	 * @param benefitreduction
	 *            The benefitreduction
	 */
	@JsonProperty("benefitreduction")
	public void setBenefitreduction(Benefitreduction benefitreduction) {
		this.benefitreduction = benefitreduction;
	}

	/**
	 * 
	 * @return The portability
	 */
	@JsonProperty("portability")
	public List<Portability> getPortability() {
		return portability;
	}

	/**
	 * 
	 * @param portability
	 *            The portability
	 */
	@JsonProperty("portability")
	public void setPortability(List<Portability> portability) {
		this.portability = portability;
	}

	/**
	 * 
	 * @return The noticeandstatements
	 */
	@JsonProperty("noticeandstatements")
	public List<Noticeandstatement> getNoticeandstatements() {
		return noticeandstatements;
	}

	/**
	 * 
	 * @param noticeandstatements
	 *            The noticeandstatements
	 */
	@JsonProperty("noticeandstatements")
	public void setNoticeandstatements(List<Noticeandstatement> noticeandstatements) {
		this.noticeandstatements = noticeandstatements;
	}

	/**
	 * 
	 * @return The formnumber
	 */
	@JsonProperty("formnumber")
	public List<String> getFormnumber() {
		return formnumber;
	}

	/**
	 * 
	 * @param formnumber
	 *            The formnumber
	 */
	@JsonProperty("formnumber")
	public void setFormnumber(List<String> formnumber) {
		this.formnumber = formnumber;
	}

	/**
	 * 
	 * @return The waiverofpremium
	 */
	@JsonProperty("waiverofpremium")
	public List<Waiverofpremium> getWaiverofpremium() {
		return waiverofpremium;
	}

	/**
	 * 
	 * @param waiverofpremium
	 *            The waiverofpremium
	 */
	@JsonProperty("waiverofpremium")
	public void setWaiverofpremium(List<Waiverofpremium> waiverofpremium) {
		this.waiverofpremium = waiverofpremium;
	}

	/**
	 * 
	 * @return The issuedage
	 */
	@JsonProperty("issuedage")
	public List<Issuedage> getIssuedage() {
		return issuedage;
	}

	/**
	 * 
	 * @param issuedage
	 *            The issuedage
	 */
	@JsonProperty("issuedage")
	public void setIssuedage(List<Issuedage> issuedage) {
		this.issuedage = issuedage;
	}

}