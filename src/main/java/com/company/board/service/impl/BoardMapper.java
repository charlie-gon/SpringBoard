package com.company.board.service.impl;

import java.util.List;

import com.company.board.service.BoardVO;
import com.company.board.service.ReplyVO;

public interface BoardMapper {

	
	// 전체조회
	public List<BoardVO> getBoardList();
	
	// 단건조회
	public BoardVO getBoard(BoardVO vo); 
	// board.mapper.xml에 vo 객체가 파라미터로 넘어가니까 BoardVO vo로 설정해야
	// 쿼리에 파라미터가 넘어가도록 설정되어 있으면 Mapper, Controller에 무조건 넘어가는 값을 받을 수 있도록 설정해야 한다.
	
	// 댓글
	// mapper에서 board_seq 값을 파라미터로 넘겨주므로 ReplyVO로 값을 받아오도록 설정
	public List<ReplyVO> getReplyList(ReplyVO vo); 
	
	public int insertReply(ReplyVO vo);

}
