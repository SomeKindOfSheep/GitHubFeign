package Search.controllers;


import Search.clients.SearchClient;
import Search.models.Result;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.jackson.JacksonDecoder;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SearchController {

    public static void main(String... args) {

        SearchClient search = Feign.builder()
                .decoder(new GsonDecoder())
                .target(SearchClient.class, "https://dsbggena115v.standardbank.co.za:443/");

        Map<String,String> headermap = new LinkedHashMap<>();
        headermap.put("Content-Type","application/json");
        headermap.put("Authorization","Bearer search-a8t5kmo7nvg72rzhv4nz91my");
        List<Result> listOfSearchResults = search.findBySearchQuery(headermap, "Lotto").getResults();
        for (Result result : listOfSearchResults) {
            System.out.println("------------");
            System.out.println("Question: "+ result.getQuestion().getRaw());
            System.out.println("Answer: "+result.getAnswer().getRaw());
        }

    }
}
