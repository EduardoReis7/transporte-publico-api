package com.er.transporteapi.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "include_total", "resource_id", "fields", "records_format", "records", "_links", "total" })
public class Result {

	@JsonProperty("include_total")
	private Boolean includeTotal;
	@JsonProperty("resource_id")
	private String resourceId;
	@JsonProperty("fields")
	private List<Field> fields = null;
	@JsonProperty("records_format")
	private String recordsFormat;
	@JsonProperty("records")
	private List<Record> records = null;
	@JsonProperty("_links")
	private Links links;
	@JsonProperty("total")
	private Integer total;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("include_total")
	public Boolean getIncludeTotal() {
		return includeTotal;
	}

	@JsonProperty("include_total")
	public void setIncludeTotal(Boolean includeTotal) {
		this.includeTotal = includeTotal;
	}

	@JsonProperty("resource_id")
	public String getResourceId() {
		return resourceId;
	}

	@JsonProperty("resource_id")
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	@JsonProperty("fields")
	public List<Field> getFields() {
		return fields;
	}

	@JsonProperty("fields")
	public void setFields(List<Field> fields) {
		this.fields = fields;
	}

	@JsonProperty("records_format")
	public String getRecordsFormat() {
		return recordsFormat;
	}

	@JsonProperty("records_format")
	public void setRecordsFormat(String recordsFormat) {
		this.recordsFormat = recordsFormat;
	}

	@JsonProperty("records")
	public List<Record> getRecords() {
		return records;
	}

	@JsonProperty("records")
	public void setRecords(List<Record> records) {
		this.records = records;
	}

	@JsonProperty("_links")
	public Links getLinks() {
		return links;
	}

	@JsonProperty("_links")
	public void setLinks(Links links) {
		this.links = links;
	}

	@JsonProperty("total")
	public Integer getTotal() {
		return total;
	}

	@JsonProperty("total")
	public void setTotal(Integer total) {
		this.total = total;
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