import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// Project 3 - Pokemon Stat Battle using PokeAPI
// https://pokeapi.co/docs/v2
public class PokemonBattle {

    public static void main(String[] args) {
        // hard-coded for the check-in, will ask the user for this later
        String pokemon = "pikachu";

        String url = buildUrl(pokemon);
        String json = getPokemon(url);

        if (json != null) {
            System.out.println(json);
        }
    }

    // builds the request URL for a pokemon name or number
    public static String buildUrl(String pokemon) {
        return "https://pokeapi.co/api/v2/pokemon/" + pokemon.toLowerCase().trim();
    }

    // sends the request and returns the response text if the code is 200
    public static String getPokemon(String url) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                return response.body();
            }
            System.out.println("Request failed, code: " + response.statusCode());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    // ---- methods I'll finish for the final submission ----

    // TODO: use Scanner to ask the user which pokemon they want
    public static String getUserPokemon() {
        return "";
    }

    // TODO: pick a random pokemon number (1-1025) for the computer
    public static String pickComputerPokemon() {
        return "";
    }

    // TODO: pull the 6 base stats out of the JSON (hp, attack, defense, sp atk, sp def, speed)
    public static int[] getStats(String json) {
        return new int[6];
    }

    // TODO: compare the stats round by round and return who won
    public static String battle(String name1, int[] stats1, String name2, int[] stats2) {
        return "";
    }

    // TODO: print both pokemon's stats side by side and the winner
    public static void showResults(String name1, int[] stats1, String name2, int[] stats2, String winner) {
    }
}
