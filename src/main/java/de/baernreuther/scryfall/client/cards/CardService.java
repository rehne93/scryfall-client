package de.baernreuther.scryfall.client.cards;

import com.google.gson.Gson;
import de.baernreuther.scryfall.client.http.HttpService;
import de.baernreuther.scryfall.client.http.JavaHttpService;
import de.baernreuther.scryfall.client.http.WebResponse;

public class CardService {


    private final HttpService httpService;

    private final Gson gson;

    public CardService() {
        this.httpService = new JavaHttpService();
        this.gson = new Gson();
    }

    public CardModel fuzzySearch() {
        WebResponse response = this.httpService.get("https://api.scryfall.com/cards/named?fuzzy=aust+com");
        if (!response.wasSuccessful()) {
            // TODO: Throw Exception
            return null;
        }
        CardModel model = this.gson.fromJson(response.getHttpResponseBody(), CardModel.class);
        return model;
    }

}
