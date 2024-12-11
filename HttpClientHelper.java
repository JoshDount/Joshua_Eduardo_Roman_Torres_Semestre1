import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClientHelper {

	public String get(String endpoint) throws IOException {
		URL url = new URL(endpoint);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		return readResponse(conn);
	}

	public String post(String endpoint, String jsonBody) throws IOException {
		URL url = new URL(endpoint);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json");
		conn.setDoOutput(true);

		try (OutputStream os = conn.getOutputStream()) {
			os.write(jsonBody.getBytes());
		}
		return readResponse(conn);
	}

	public String delete(String endpoint) throws IOException {
		URL url = new URL(endpoint);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("DELETE");
		return readResponse(conn);
	}

	private String readResponse(HttpURLConnection conn) throws IOException {
		int responseCode = conn.getResponseCode();

		if (responseCode >= 200 && responseCode < 300) {
			try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
				StringBuilder response = new StringBuilder();
				String line;
				while ((line = in.readLine()) != null) {
					response.append(line);
				}
				return response.toString();
			}
		} else {
			throw new IOException("Error HTTP: " + responseCode);
		}
	}
}
