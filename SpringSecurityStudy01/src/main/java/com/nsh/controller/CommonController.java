package com.nsh.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

/**
 * accessError 처리
 */

@Controller
@Log4j
public class CommonController {

	@GetMapping("/accessError")
	public void accessDenied(Authentication auth, Model model) {
		
		log.info("access Denied: " + auth);
		
		model.addAttribute("msg", "엑세스 디나이");
		
	}
	
	@GetMapping("/customLogin")
	public void loginInput(String error, String logout, Model model) {
		
		log.info("에러: " + error);
		log.info("로그아웃: " + logout);
		
		if (error != null) {
			model.addAttribute("error", "로그인 에러! 회원정보 확인하셈");
		}
		
		if (logout != null) {
			model.addAttribute("logout", "로그아웃 성공");
		}
	}
	
	@GetMapping("/customLogout")
	public void logoutGET() {
		
		log.info("커스텀 로그아웃");
	}
}
