package com.nsh.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.nsh.domain.MemberVO;

import com.nsh.mapper.MemberMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
})
@Log4j
public class MemberMapperTest {

	
	@Setter(onMethod_ = @Autowired)
	private MemberMapper mapper;
	
	@Test
	public void 회원읽기테스트() {
		
		MemberVO vo = mapper.read("admin90");
		
		log.info("회원 정보: " + vo);
		
		vo.getAuthList().forEach(authVO -> log.info("회원 인증정보: " + authVO));
	}
}
