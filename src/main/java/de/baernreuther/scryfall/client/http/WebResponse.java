package de.baernreuther.scryfall.client.http;

import lombok.Data;

@Data
public class WebResponse {

    /**
     * Contains the full response as string.
     */
    private String httpResponseBody;
    /**
     * Contains the HTTP-Status Code.
     */
    private int httpStatusCode;

    /**
     * Checks whether the request was successful
     * A Response is defined as successful when the statuscode is between
     * 200 and 299.
     *
     * @return true if the request was successful, false otherwise.
     */
    public boolean wasSuccessful() {
        return (httpStatusCode >= 200 && httpStatusCode < 300);
    }
}
