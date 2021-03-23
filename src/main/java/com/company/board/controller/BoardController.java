package com.company.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.company.board.service.BoardVO;
import com.company.board.service.ReplyVO;
import com.company.board.service.impl.BoardMapper;

@Controller
public class BoardController {
	//서비스
	@Autowired BoardMapper boardMapper;
	
	//전체조회
	@RequestMapping("/getBoardList")
	public String getBoardList(Model model) {
		model.addAttribute("list",boardMapper.getBoardList());
		return "board/getBoardList";
	}
	
	//단건조회
	@RequestMapping("/getBoard")
	public String getBoard(Model model, BoardVO vo) {
		model.addAttribute("board", boardMapper.getBoard(vo));
		return "board/getBoard";
	}
	// GET방식으로 조회할 수 있다 => http://localhost/getBoard?seq=1
	
	
	// 댓글조회
	@RequestMapping("/getReplyList")
	public @ResponseBody List<ReplyVO> getReplyList(ReplyVO vo) { // @ResponseBody로 넘어간 값을 json구조로 변환
		return boardMapper.getReplyList(vo); // 리턴 타입이 List이므로 public List<ReplyVO>로 하는 것입니다.
	}
	
	// 댓글등록
	@RequestMapping("/insertReply")
	public @ResponseBody ReplyVO insertReply(ReplyVO vo) {
		boardMapper.insertReply(vo);
		return vo;
	}
}
