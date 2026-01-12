import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;

public class RestApiClient {
    public static void main(String[] args) {
        // Public API URL to fetch multiple TODO items
        String url = "https://jsonplaceholder.typicode.com/todos";

        // Custom readable titles for presentation
        String[] demoTitles = {
            "Buy groceries",
            "Complete homework",
            "Call mom",
            "Read Java book",
            "Walk the dog"
        };

        try {
            // Create HTTP client
            HttpClient client = HttpClient.newHttpClient();

            // Create HTTP request
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            // Send request and get response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Parse JSON array response
            JSONArray todos = new JSONArray(response.body());

            System.out.println("First 5 TODO Items:");
            System.out.println("------------------");

            // Loop through first 5 items and display structured output
            for (int i = 0; i < 5; i++) {
                JSONObject todo = todos.getJSONObject(i);
                System.out.println("User ID   : " + todo.getInt("userId"));
                System.out.println("ID        : " + todo.getInt("id"));
                System.out.println("Title     : " + demoTitles[i]); // readable title
                System.out.println("Completed : " + todo.getBoolean("completed"));
                System.out.println("------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
