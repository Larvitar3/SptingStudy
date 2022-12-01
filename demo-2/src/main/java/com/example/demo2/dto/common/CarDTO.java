package com.example.demo2.dto.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CarDTO {

	private String name;

	@JsonProperty("car_number")
	private String carNumber;
}
