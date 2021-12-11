package com.react.webflux.demo.dto;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Response {

	private int output;
	private Date date = new Date();
	
	public Response(int output) {
		this.output = output;
	}
}
