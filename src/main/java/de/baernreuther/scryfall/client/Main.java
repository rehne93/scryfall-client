package de.baernreuther.scryfall.client;

import de.baernreuther.scryfall.client.http.WebResponse;
import de.baernreuther.scryfall.client.http.HttpService;
import de.baernreuther.scryfall.client.http.JavaHttpService;

public class Main {

    public static void main(String[] args){
        System.out.println("Test");
        HttpService httpService = new JavaHttpService();
        WebResponse webResponse = httpService.get("https://api.scryfall.com/cards/named?fuzzy=aust+com");
        System.out.println(webResponse);
        System.out.println(webResponse.wasSuccessful());
    }
}
