package GithubFeign;

import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface Github {

    @RequestLine("GET /repos/{owner}/{repo}/contributors")
    List<Contributor> getContributors(@Param("owner") String owner, @Param("repo") String repo);

    @RequestLine("POST /repos/{owner}/{repo}/issues")
    void createIssue(Issue issue, @Param("owner") String owner, @Param("repo") String repo);
}
