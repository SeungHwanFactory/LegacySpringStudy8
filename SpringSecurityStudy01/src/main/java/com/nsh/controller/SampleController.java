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
	 * Spring-Security �׽�Ʈ
	 */
	@GetMapping("/all")
	public void doAll() {
		log.info("��� ���� ����");
	}
	
	@GetMapping("/member")
	public void doMember() {
		log.info("ȸ���� ���Ӱ���");
	}
	
	@GetMapping("/admin")
	public void doAdmin() {
		log.info("�����ڸ� ����");
	}
}
