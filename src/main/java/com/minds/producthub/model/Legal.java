package com.minds.producthub.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "replacementquestions", "conversionquestions", "minimumessentialcoveragequestions" })
public class Legal {

	@JsonProperty("replacementquestions")
	private List<Replacementquestion> replacementquestions = new ArrayList<Replacementquestion>();
	@JsonProperty("conversionquestions")
	private List<Conversionquestion> conversionquestions = new ArrayList<Conversionquestion>();
	@JsonProperty("minimumessentialcoveragequestions")
	private List<Minimumessentialcoveragequestion> minimumessentialcoveragequestions = new ArrayList<Minimumessentialcoveragequestion>();

	/**
	 * 
	 * @return The replacementquestions
	 */
	@JsonProperty("replacementquestions")
	public List<Replacementquestion> getReplacementquestions() {
		return replacementquestions;
	}

	/**
	 * 
	 * @param replacementquestions
	 *            The replacementquestions
	 */
	@JsonProperty("replacementquestions")
	public void setReplacementquestions(List<Replacementquestion> replacementquestions) {
		this.replacementquestions = replacementquestions;
	}

	/**
	 * 
	 * @return The conversionquestions
	 */
	@JsonProperty("conversionquestions")
	public List<Conversionquestion> getConversionquestions() {
		return conversionquestions;
	}

	/**
	 * 
	 * @param conversionquestions
	 *            The conversionquestions
	 */
	@JsonProperty("conversionquestions")
	public void setConversionquestions(List<Conversionquestion> conversionquestions) {
		this.conversionquestions = conversionquestions;
	}

	/**
	 * 
	 * @return The minimumessentialcoveragequestions
	 */
	@JsonProperty("minimumessentialcoveragequestions")
	public List<Minimumessentialcoveragequestion> getMinimumessentialcoveragequestions() {
		return minimumessentialcoveragequestions;
	}

	/**
	 * 
	 * @param minimumessentialcoveragequestions
	 *            The minimumessentialcoveragequestions
	 */
	@JsonProperty("minimumessentialcoveragequestions")
	public void setMinimumessentialcoveragequestions(
			List<Minimumessentialcoveragequestion> minimumessentialcoveragequestions) {
		this.minimumessentialcoveragequestions = minimumessentialcoveragequestions;
	}

}