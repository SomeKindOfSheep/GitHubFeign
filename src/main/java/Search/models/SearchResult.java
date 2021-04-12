package Search.models;

import com.fasterxml.jackson.databind.JsonNode;

import lombok.Data;

@Data
public class SearchResult {

	private Meta meta;

	private JsonNode results;

	
}