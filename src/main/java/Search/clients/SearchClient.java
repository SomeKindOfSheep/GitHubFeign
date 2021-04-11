package Search.clients;

import Search.models.SearchResult;
import com.fasterxml.jackson.databind.JsonNode;
import feign.*;

import java.util.Map;

public interface SearchClient {

    /*@RequestLine("GET api/as/v1/engines/sa-faq-feed/search")
    @Body("%7B\"query\": \"{searchParam}\"%7D")
    SearchResult findBySearchQuery(@HeaderMap Map<String, String> headerMap, @Param("searchParam") String searchParam);*/

    @RequestLine("GET api/as/v1/engines/sa-faq-feed/search")
    @Body("%7B\"query\": \"{searchParam}\"%7D")
    //TODO limit search query
    JsonNode findBySearchQuery(@HeaderMap Map<String, String> headerMap, @Param("searchParam") String searchParam);

}


