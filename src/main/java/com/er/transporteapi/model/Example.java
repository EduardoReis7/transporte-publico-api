package com.er.transporteapi.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "help", "success", "result" })
public class Example {

	@JsonProperty("help")
	private String help;
	@JsonProperty("success")
	private Boolean success;
	@JsonProperty("result")
	private Example result;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("help")
	public String getHelp() {
		return help;
	}

	@JsonProperty("help")
	public void setHelp(String help) {
		this.help = help;
	}

	@JsonProperty("success")
	public Boolean getSuccess() {
		return success;
	}

	@JsonProperty("success")
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	@JsonProperty("result")
	public Example getResult() {
		return result;
	}

	@JsonProperty("result")
	public void setResult(Example result) {
		this.result = result;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}