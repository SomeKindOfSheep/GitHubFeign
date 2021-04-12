package Search.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "alerts", "warnings", "page", "engine", "request_id" })
@Generated("jsonschema2pojo")
public class Meta {

	@JsonProperty("alerts")
	private List<Object> alerts = null;
	@JsonProperty("warnings")
	private List<Object> warnings = null;
	@JsonProperty("page")
	private Page page;
	@JsonProperty("engine")
	private Engine engine;
	@JsonProperty("request_id")
	private String requestId;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("alerts")
	public List<Object> getAlerts() {
		return alerts;
	}

	@JsonProperty("alerts")
	public void setAlerts(List<Object> alerts) {
		this.alerts = alerts;
	}

	@JsonProperty("warnings")
	public List<Object> getWarnings() {
		return warnings;
	}

	@JsonProperty("warnings")
	public void setWarnings(List<Object> warnings) {
		this.warnings = warnings;
	}

	@JsonProperty("page")
	public Page getPage() {
		return page;
	}

	@JsonProperty("page")
	public void setPage(Page page) {
		this.page = page;
	}

	@JsonProperty("engine")
	public Engine getEngine() {
		return engine;
	}

	@JsonProperty("engine")
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@JsonProperty("request_id")
	public String getRequestId() {
		return requestId;
	}

	@JsonProperty("request_id")
	public void setRequestId(String requestId) {
		this.requestId = requestId;
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
