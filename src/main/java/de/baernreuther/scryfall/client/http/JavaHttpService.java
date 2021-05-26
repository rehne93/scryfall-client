package de.baernreuther.scryfall.client.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;

/**
 * Implements web-requeets using javas default HttpClient Implementation.
 */
public class JavaHttpService implements HttpService {


    /**
     * HttpClient-Instance
     */
    private final HttpClient httpClient;

    /**
     * Timeout for requests in second.
     */
    private int timeOut = 60;

    /**
     * Creates a default JavaHttpService.
     */
    public JavaHttpService() {
        httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2)
                .build();
    }

    /**
     * @param timeOut timeout in seconds to configure the HTTP-Client.
     */
    public JavaHttpService(int timeOut) {
        this();
        this.timeOut = timeOut;
    }

    /**
     * @param httpClient httpClient to use.
     */
    public JavaHttpService(HttpClient httpClient) {
        this.httpClient = httpClient;
    }


    /**
     * Executes a get-request to the given URL.
     *
     * @param url Full URL
     * @return WebRespponse containt Body and statuscode.
     */
    @Override
    public WebResponse get(String url) {
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).timeout(Duration.ofSeconds(timeOut)).header("accept", "application/json").GET().build();
        WebResponse response = new WebResponse();
        try {
            java.net.http.HttpResponse<String> getResponse = this.httpClient.send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
            response.setHttpResponseBody(getResponse.body());
            response.setHttpStatusCode(getResponse.statusCode());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            response.setHttpStatusCode(500);
        }

        return response;
    }
}
