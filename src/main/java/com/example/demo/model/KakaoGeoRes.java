package com.example.demo.model;

import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class KakaoGeoRes {
    private HashMap<String, Object> meta;
    private List<Documents> documents;
	
    public HashMap<String, Object> getMeta() {
		return meta;
	}
	public void setMeta(HashMap<String, Object> meta) {
		this.meta = meta;
	}
	public List<Documents> getDocuments() {
		return documents;
	}
	public void setDocuments(List<Documents> documents) {
		this.documents = documents;
	}
	
	@Override
	public String toString() {
		return "KakaoGeoRes [meta=" + meta + ", documents=" + documents + "]";
	}
    
}

    