package com.gustavomont.url_nanificator.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class FirstController {
		@Value("${spring.datasource.url}")
		private String database;
		@GetMapping
		public String sendEnv(){
				return String.format("Olá, mundo! Estou usando database %s", database);
		}
}
