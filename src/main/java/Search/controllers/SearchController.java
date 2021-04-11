package Search.controllers;


import Search.clients.SearchClient;
import Search.models.Result;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.jackson.JacksonDecoder;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SearchController {

    public static void main(String... args) {
        /*ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.findAndRegisterModules();*/


        SearchClient searchClient = Feign.builder()
                // TODO use jackson decoder
                // TODO limit what returns
                // can we trick the deserializer to just return the object
                .decoder(new JacksonDecoder())
                .target(SearchClient.class, "https://dsbggena115v.standardbank.co.za:443/");


        Map<String,String> headermap = new LinkedHashMap<>();
        headermap.put("Content-Type","application/json");
        headermap.put("Authorization","Bearer search-a8t5kmo7nvg72rzhv4nz91my");
        JsonNode node = searchClient.findBySearchQuery(headermap, "lotto");
        JsonNode result = node.get("results");
        if (result.isArray()) {
            for (JsonNode resultNode : result) {
                System.out.println(resultNode);
            }
        }


        /*System.out.println(node.get("results").get(0).get("question").get("raw"));
        System.out.println(node.get("results").get(0).get("answer").get("raw"));
        System.out.println(node.get("results").get(0).get("faqs_order").get("raw"));
        System.out.println(node.get("results").get(0).get("category_title").get("raw"));
        System.out.println(node.get("results").get(0).get("category_order").get("raw"));
        System.out.println(node.get("results").get(0).get("faqs_title").get("raw"));
        System.out.println(node.get("results").get(0).get("faqs_id").get("raw"));
        System.out.println(node.get("results").get(0).get("basic_title").get("raw"));
        System.out.println(node.get("results").get(0).get("basic_id").get("raw"));
        System.out.println(node.get("results").get(0).get("faq_id").get("raw"));
        System.out.println(node.get("results").get(0).get("faq_title").get("raw"));*/



       /*Map<String,String> headermap = new LinkedHashMap<>();
        headermap.put("Content-Type","application/json");
        headermap.put("Authorization","Bearer search-a8t5kmo7nvg72rzhv4nz91my");
        List<Result> listOfSearchResults = search.findBySearchQuery(headermap, "Lotto").getResults();
        for (Result result : listOfSearchResults) {
            System.out.println("------------");
            System.out.println("Question: "+ result.getQuestion().getRaw());
            System.out.println("Answer: "+result.getAnswer().getRaw());
        }*/

    }
}
