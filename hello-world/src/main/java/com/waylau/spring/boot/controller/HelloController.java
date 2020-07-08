package com.waylau.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Hello控制器
 * @author caohui
 *
 */
@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
}
