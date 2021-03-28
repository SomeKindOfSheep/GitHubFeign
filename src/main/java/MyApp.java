import feign.Feign;
import feign.gson.GsonDecoder;

import java.util.List;

public class MyApp {
    public static void main(String... args) {
        Github github = Feign.builder()
                .decoder(new GsonDecoder())
                .target(Github.class, "https://api.github.com");

        // Fetch and print a list of the contributors to this library.
        List<Contributor> contributors = github.contributors("OpenFeign", "feign");
        for (Contributor contributor : contributors) {
            System.out.println(contributor.login + " (" + contributor.contributions + ")");
        }
    }
}