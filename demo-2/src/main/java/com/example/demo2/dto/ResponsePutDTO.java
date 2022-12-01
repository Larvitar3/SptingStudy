package com.example.demo2.dto;

import java.util.List;

import com.example.demo2.dto.common.CarDTO;

import lombok.Data;

@Data
public class ResponsePutDTO {

	private int statusCode;
	private String name;
	private String age;
	private List<CarDTO> carList;
	
}
