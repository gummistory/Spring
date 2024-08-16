package com.springbook.biz.board;

import java.util.List;

import com.springbook.biz.board.impl.BoardDAO;

public class BoardServiceClient {
	public static void main(String[] args) {
		BoardDAO boardDAO = new BoardDAO();
		BoardVO vo = new BoardVO();
		
		vo.setTitle("myBatis 제목");
		vo.setWriter("홍길동");
		vo.setContent("myBatis 내용");
		//boardDAO.insertBoard(vo);
		
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		
		
		// 상세글조회
		
		// 글 수정
		
		// 글 삭제
		
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		
		for(BoardVO board : boardList) {
			System.out.println("==> " + board.toString());
		}
	}
}



