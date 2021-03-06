package Search.controllers;


import Search.clients.SearchClient;
import Search.models.SearchResponse;
import Search.models.SearchResult;
import Search.models.request.Page;
import Search.models.request.SearchRequest;

import com.fasterxml.jackson.databind.JsonNode;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

import java.util.LinkedHashMap;
import java.util.Map;

public class SearchController {

    public static void main(String... args) {

        // this would be inside the init method
        SearchClient searchClient = Feign.builder()
                // TODO limit what returns
                // can we trick the deserializer to just return the object
        		.encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                // TODO Add interceptor to abstract the bearer token
                .target(SearchClient.class, "https://dsbggena115v.standardbank.co.za:443/");


        Map<String, String> headermap = new LinkedHashMap<>();
//        headermap.put("Content-Type", "application/json");
        headermap.put("Authorization", "Bearer search-a8t5kmo7nvg72rzhv4nz91my");


        // JSON node response
        SearchResult node = searchClient.findBySearchQuery(headermap, "sa-faq-feed", SearchRequest.builder().query("lotto").page(Page.builder().size(1).build()).build());
        
        System.out.println(node.getMeta());
//        SearchResponse response = new SearchResponse();
//        response.setNode(node);

//        JsonNode result = node.get("results");
        JsonNode result = node.getResults();


        if (result.isArray()) {
            for (JsonNode resultNode : result) {
                System.out.println(resultNode.toPrettyString());
            }
        }

      /*  // search response object
        SearchResponse searchResponse = searchClient.findBySearchQueryJsonNodeReturn(headermap, "lotto");
        System.out.println(searchResponse.toString());*/

    }
}
