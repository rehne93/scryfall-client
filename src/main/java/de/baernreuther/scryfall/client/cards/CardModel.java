package de.baernreuther.scryfall.client.cards;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Implements the Cardmodel from Scryfall.
 * Source: https://scryfall.com/docs/api/cards
 * Look at the given URL for documentation about specific flags.
 */
@Data
public class CardModel {
    // Core-Fields
    private int arena_id;
    private String id;
    private String lang;
    private int mtgo_id;
    private int mtgo_foil_id;
    private List<Integer> multiverse_ids;
    private int tcgplayer_id;
    private int cardmarket_id;
    private String object;
    private String oracle_id;
    private String prints_search_uri;
    private String rulings_uri;
    private String scryfall_uri;
    private String uri;
    // Gameplay-Fields
    private List<Object> all_parts;
    private List<Object> card_faces;
    private float cmc;
    private List<String> colors;
    private int edhrec_rank;
    private boolean foil;
    private String hand_modifier;
    private List<String> keywords;
    private String layout;
    private Object legalities;
    private String life_modifier;
    private String loyalty;
    private String mana_cost;
    private String name;
    private boolean nonfoil;
    private String oracle_text;
    private boolean oversized;
    private String power;
    private List<String> produced_mana;
    private boolean reserved;
    private String toughness;
    private String type_line;
    // Print Fields
    private String artist;
    private boolean booster;
    private String border_color;
    private String card_back_id;
    private String collector_number;
    private boolean content_warning;
    private boolean digital;
    private String flavor_name;
    private String flavor_text;
    private List<String> frame_effects;
    private String frame;
    private boolean full_art;
    private List<String> games;
    private boolean highres_image;
    private String illustration_id;
    private String image_status;
    private Object prices;
    private String printed_name;
    private String printed_text;
    private String printed_type_line;
    private boolean promo;
    private List<String> promo_types;
    private Object purchase_uris;
    private String rarity;
    private Object related_uris;
    private Date released_at;
    private boolean reprint;
    private String scryfall_set_uri;
    private String set_name;
    private String set_search_uri;
    private String set_type;
    private String set_uri;
    private String set;
    private boolean story_spotlight;
    private boolean textless;
    private boolean variation;
    private String variation_of;
    private String watermark;
}
