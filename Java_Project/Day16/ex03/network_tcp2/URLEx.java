package ex03.network_tcp2;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.*;

public class URLEx {
	public static void main(String[] args) throws MalformedURLException, IOException {
		URL url = new URL("https://www.en-core.com");
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		
		String inputLine;
		while ((inputLine = br.readLine()) != null) {
			System.out.println(inputLine);
		}
		br.close();
	}
}
