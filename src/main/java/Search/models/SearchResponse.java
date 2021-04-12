package Search.models;

import com.fasterxml.jackson.databind.JsonNode;

public class SearchResponse {

    // TODO see if we can add a node to the response
    JsonNode node;

    public SearchResponse(JsonNode node) {
        this.node = node;
    }

    public SearchResponse() {

    }

    public JsonNode getNode() {
        return node;
    }

    public void setNode(JsonNode node) {
        this.node = node;
    }
}
