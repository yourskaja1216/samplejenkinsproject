package com.minds.producthub.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "benefitname", "benefitcode", "description", "unit", "minimum", "maximum", "default",
		"percentfaceamount", "benefit_tier", "benefitlimitations" })
public class Benefit {

	@JsonProperty("benefitname")
	private String benefitname;
	@JsonProperty("benefitcode")
	private String benefitcode;
	@JsonProperty("description")
	private String description;
	@JsonProperty("unit")
	private String unit;
	@JsonProperty("minimum")
	private String minimum;
	@JsonProperty("maximum")
	private String maximum;
	@JsonProperty("default")
	private String _default;
	@JsonProperty("percentfaceamount")
	private Percentfaceamount percentfaceamount;
	@JsonProperty("benefit_tier")
	private List<BenefitTier> benefitTier = new ArrayList<BenefitTier>();
	@JsonProperty("benefitlimitations")
	private List<Benefitlimitation> benefitlimitations = new ArrayList<Benefitlimitation>();

	/**
	 * 
	 * @return The benefitname
	 */
	@JsonProperty("benefitname")
	public String getBenefitname() {
		return benefitname;
	}

	/**
	 * 
	 * @param benefitname
	 *            The benefitname
	 */
	@JsonProperty("benefitname")
	public void setBenefitname(String benefitname) {
		this.benefitname = benefitname;
	}

	/**
	 * 
	 * @return The benefitcode
	 */
	@JsonProperty("benefitcode")
	public String getBenefitcode() {
		return benefitcode;
	}

	/**
	 * 
	 * @param benefitcode
	 *            The benefitcode
	 */
	@JsonProperty("benefitcode")
	public void setBenefitcode(String benefitcode) {
		this.benefitcode = benefitcode;
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

	/**
	 * 
	 * @return The unit
	 */
	@JsonProperty("unit")
	public String getUnit() {
		return unit;
	}

	/**
	 * 
	 * @param unit
	 *            The unit
	 */
	@JsonProperty("unit")
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * 
	 * @return The minimum
	 */
	@JsonProperty("minimum")
	public String getMinimum() {
		return minimum;
	}

	/**
	 * 
	 * @param minimum
	 *            The minimum
	 */
	@JsonProperty("minimum")
	public void setMinimum(String minimum) {
		this.minimum = minimum;
	}

	/**
	 * 
	 * @return The maximum
	 */
	@JsonProperty("maximum")
	public String getMaximum() {
		return maximum;
	}

	/**
	 * 
	 * @param maximum
	 *            The maximum
	 */
	@JsonProperty("maximum")
	public void setMaximum(String maximum) {
		this.maximum = maximum;
	}

	/**
	 * 
	 * @return The _default
	 */
	@JsonProperty("default")
	public String getDefault() {
		return _default;
	}

	/**
	 * 
	 * @param _default
	 *            The default
	 */
	@JsonProperty("default")
	public void setDefault(String _default) {
		this._default = _default;
	}

	/**
	 * 
	 * @return The percentfaceamount
	 */
	@JsonProperty("percentfaceamount")
	public Percentfaceamount getPercentfaceamount() {
		return percentfaceamount;
	}

	/**
	 * 
	 * @param percentfaceamount
	 *            The percentfaceamount
	 */
	@JsonProperty("percentfaceamount")
	public void setPercentfaceamount(Percentfaceamount percentfaceamount) {
		this.percentfaceamount = percentfaceamount;
	}

	/**
	 * 
	 * @return The benefitTier
	 */
	@JsonProperty("benefit_tier")
	public List<BenefitTier> getBenefitTier() {
		return benefitTier;
	}

	/**
	 * 
	 * @param benefitTier
	 *            The benefit_tier
	 */
	@JsonProperty("benefit_tier")
	public void setBenefitTier(List<BenefitTier> benefitTier) {
		this.benefitTier = benefitTier;
	}

	/**
	 * 
	 * @return The benefitlimitations
	 */
	@JsonProperty("benefitlimitations")
	public List<Benefitlimitation> getBenefitlimitations() {
		return benefitlimitations;
	}

	/**
	 * 
	 * @param benefitlimitations
	 *            The benefitlimitations
	 */
	@JsonProperty("benefitlimitations")
	public void setBenefitlimitations(List<Benefitlimitation> benefitlimitations) {
		this.benefitlimitations = benefitlimitations;
	}

}