package com.example.boot.diner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data public class TrivialDinerRequest {

	private String day;
	
}
