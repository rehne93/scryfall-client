package de.baernreuther.scryfall.client.http;

/**
 * Service that executes HTTP-Requests
 * returning the Response in a specific format
 * containing the content as string as well as the statuscode.
 */
public interface HttpService {

    /**
     * Executes an HTTP-Get Request to the given URL
     * @param url Full URL
     * @return HttpResponse containing the response and statuscode.
     */
    WebResponse get(String url);
}
