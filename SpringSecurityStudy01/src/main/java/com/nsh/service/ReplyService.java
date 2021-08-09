package com.nsh.service;

import java.util.List;

import com.nsh.domain.Criteria;
import com.nsh.domain.ReplyPageDTO;
import com.nsh.domain.ReplyVO;

public interface ReplyService {

	public int register(ReplyVO vo);

	public ReplyVO get(Long rno);

	public int modify(ReplyVO vo);

	public int remove(Long rno);

	public List<ReplyVO> getList(Criteria cri, Long bno);
	
	public ReplyPageDTO getListPage(Criteria cri, Long bno);

}
