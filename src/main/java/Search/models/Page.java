package Search.models;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "current", "total_pages", "total_results", "size" })
@Generated("jsonschema2pojo")
public class Page {

	@JsonProperty("current")
	private Integer current;
	@JsonProperty("total_pages")
	private Integer totalPages;
	@JsonProperty("total_results")
	private Integer totalResults;
	@JsonProperty("size")
	private Integer size;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("current")
	public Integer getCurrent() {
		return current;
	}

	@JsonProperty("current")
	public void setCurrent(Integer current) {
		this.current = current;
	}

	@JsonProperty("total_pages")
	public Integer getTotalPages() {
		return totalPages;
	}

	@JsonProperty("total_pages")
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	@JsonProperty("total_results")
	public Integer getTotalResults() {
		return totalResults;
	}

	@JsonProperty("total_results")
	public void setTotalResults(Integer totalResults) {
		this.totalResults = totalResults;
	}

	@JsonProperty("size")
	public Integer getSize() {
		return size;
	}

	@JsonProperty("size")
	public void setSize(Integer size) {
		this.size = size;
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
