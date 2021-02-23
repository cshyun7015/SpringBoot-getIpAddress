package com.example.demo.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
//import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
	public BoardController() {
		System.out.println("--- [ BoardController Created ]");
	}

	//@Autowired
	//Environment environment;
	
	@Bean
	public String localServerIp() {
		try {
			InetAddress ip = java.net.InetAddress.getLocalHost();
			return ip.getHostAddress();
		} catch (UnknownHostException e) {
	   	 //예외처리
		}
		return null;
	}
	@Autowired
	private String localServerIp;
	
	@GetMapping("/info")
	public String info() {
		return "IP Address : " + localServerIp;
	}
}
