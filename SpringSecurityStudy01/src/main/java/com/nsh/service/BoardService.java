package com.nsh.service;

import java.util.List;

import com.nsh.domain.BoardAttachVO;
import com.nsh.domain.BoardVO;
import com.nsh.domain.Criteria;

public interface BoardService {

	public void register(BoardVO board);

	public BoardVO get(Long bno);

	public boolean modify(BoardVO board);

	public boolean remove(Long bno);

	// public List<BoardVO> getList();

	public List<BoardVO> getList(Criteria cri);

	//추가
	public int getTotal(Criteria cri);
	
	public List<BoardAttachVO> getAttachList(Long bno);
	
	//spublic void removeAttach(Long bno);

}
