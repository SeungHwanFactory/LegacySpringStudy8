package com.nsh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/sample/*")
@Controller
public class SampleController {

	/**
	 * Spring-Security 테스트
	 */
	@GetMapping("/all")
	public void doAll() {
		log.info("모두 접속 가능");
	}
	
	@GetMapping("/member")
	public void doMember() {
		log.info("회원만 접속가능");
	}
	
	@GetMapping("/admin")
	public void doAdmin() {
		log.info("관리자만 접속");
	}
}
