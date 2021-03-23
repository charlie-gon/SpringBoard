package com.company.board.service;

import lombok.Data;

@Data
public class ReplyVO {
	
	private String seq; // 댓글번호
	private String content; // 댓글내용
	private String board_seq; // 게시글 번호
}
