package com.example.demo.controller;

import java.net.URLEncoder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;


@RestController
public class mapController {

	@GetMapping("/")
	public String main() throws Exception {
		addrToCoor("강원도 춘천시 충혼길4번길 9");
		return "Hello!";
	}
	
	public static String addrToCoor(String address) throws Exception {
		try {
			String APIKey = " c8509e7cd83d124b2251722efb45e7e0";
			
			String apiURL = "https://dapi.kakao.com/v2/local/search/address.json?query=" 
	                + URLEncoder.encode(address, "UTF-8");

			HttpResponse<JsonNode> response = Unirest.get(apiURL)
			        .header("Authorization", "KakaoAK" + APIKey)
			        .asJson();
			
			System.out.println(response);
		} catch(Exception e) {
			throw e;
		}
		return  "";
	}

}
