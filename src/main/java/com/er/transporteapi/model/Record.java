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
@JsonPropertyOrder({ "linha", "nome", "_id" })
public class Record {

	@JsonProperty("linha")
	private String linha;
	@JsonProperty("nome")
	private String nome;
	@JsonProperty("_id")
	private Integer id;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("linha")
	public String getLinha() {
		return linha;
	}

	@JsonProperty("linha")
	public void setLinha(String linha) {
		this.linha = linha;
	}

	@JsonProperty("nome")
	public String getNome() {
		return nome;
	}

	@JsonProperty("nome")
	public void setNome(String nome) {
		this.nome = nome;
	}

	@JsonProperty("_id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("_id")
	public void setId(Integer id) {
		this.id = id;
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
