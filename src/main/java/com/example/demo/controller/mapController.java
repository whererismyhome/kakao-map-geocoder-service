package com.example.demo.controller;

import java.net.URLEncoder;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.KakaoGeoRes;
import com.example.demo.model.addressModel;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;


@RestController
public class mapController {
	
	@GetMapping("/")
	public String index() {
		return "Main Page";
	}

	@CrossOrigin(origins="*")
	@RequestMapping(method = RequestMethod.POST, path = "/list")
	public List<addressModel> request(
		@RequestBody List<addressModel> addressList) throws Exception {
		
		addrToCoor(addressList);
		
		return addressList;
	}
	
	public static List<addressModel> addrToCoor(List<addressModel> addressList) throws Exception {
		try {
			String APIKey = " c8509e7cd83d124b2251722efb45e7e0";
			
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
			
			for (addressModel addressItem : addressList) {
				String address = addressItem.getAddress();
				String apiURL = "https://dapi.kakao.com/v2/local/search/address.json?query=" 
		                + URLEncoder.encode(address, "UTF-8");

				HttpResponse<JsonNode> response = Unirest.get(apiURL)
				        .header("Authorization", "KakaoAK" + APIKey)
				        .asJson();
				
				KakaoGeoRes bodyJson = objectMapper.readValue(response.getBody().toString(), KakaoGeoRes.class);
				addressItem.setX(bodyJson.getDocuments().get(0).getX());
				addressItem.setY(bodyJson.getDocuments().get(0).getY());
			}
			
		} catch(Exception e) {
			throw e;
		}
		return addressList;
	}

}
