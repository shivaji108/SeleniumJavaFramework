package com.selenium.master;

import java.net.HttpURLConnection;
import java.net.URL;

public class GetLinkStatus {

	static int invalidLink;
	
	public static void verifyLink(String linkString) throws Exception {
		
			URL url = new URL(linkString);
			// Open HTTTP Connection
			HttpURLConnection urlConnect = (HttpURLConnection) url.openConnection();

			// Define TimeOut
			urlConnect.setConnectTimeout(5000);

			// Hit URL
			urlConnect.connect();

			if (urlConnect.getResponseCode() == 200) {

			} else {
				System.out.println(linkString + " : " + urlConnect.getResponseMessage() + " : " + urlConnect.HTTP_NOT_FOUND);
				invalidLink++;
			}

	}

	public static void getInvalidLinkCount() {
		
		System.out.println("Total Invalid Links : " + invalidLink);
	}

}
