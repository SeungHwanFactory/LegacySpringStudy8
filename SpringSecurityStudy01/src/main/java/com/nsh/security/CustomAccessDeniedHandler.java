package com.nsh.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import lombok.extern.log4j.Log4j;

/**
 * ���� ���� �� ��� �پ��� ó���� �ϱ� ���ؼ�
 * AccessDeniedHandler �������̽��� �����ϴ� �� ����.
 * 
 * ���� ��� ���� ������ ���� �� ��Ű�� ���ǿ� Ư�� �۾��� �ϰų�
 * HttpServletResponse�� Ư���� ��� ������ �߰��ϴ� ���� ������ �� ���
 * ���� �����ϴ� ����� �� ����.
 */
@Log4j
public class CustomAccessDeniedHandler  implements AccessDeniedHandler {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		
		
		log.error("������ ���� �ڵ鷯");
		
		log.error("�����̷�Ʈ...");
		
		response.sendRedirect("/accessError");
		
	}

}
