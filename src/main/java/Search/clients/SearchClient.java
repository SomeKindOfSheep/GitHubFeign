package Search.clients;

import Search.models.SearchResponse;
import Search.models.SearchResult;
import Search.models.request.SearchRequest;
import feign.*;

import java.util.Map;

public interface SearchClient {

    /*@RequestLine("GET api/as/v1/engines/sa-faq-feed/search")
    @Body("%7B\"query\": \"{searchParam}\"%7D")
    SearchResult findBySearchQuery(@HeaderMap Map<String, String> headerMap, @Param("searchParam") String searchParam);*/

    @RequestLine("POST api/as/v1/engines/{engineName}/search")
    //TODO limit search query
    SearchResult findBySearchQuery(@HeaderMap Map<String, String> headerMap, @Param("engineName") String engineName, SearchRequest request);

    @RequestLine("POST api/as/v1/engines/sa-faq-feed/search")
    @Body("%7B\"query\": \"{searchParam}\"%7D")
        //TODO limit search query
    SearchResponse findBySearchQueryJsonNodeReturn(@HeaderMap Map<String, String> headerMap, @Param("searchParam") String searchParam);

}


