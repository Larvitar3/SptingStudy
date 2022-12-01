package com.example.demo2.dto;

import java.util.List;

import com.example.demo2.dto.common.CarDTO;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class RequestPutDTO {

	private String name;
	private String age;
	private List<CarDTO> carList;

}
