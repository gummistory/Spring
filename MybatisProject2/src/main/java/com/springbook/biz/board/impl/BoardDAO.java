package com.springbook.biz.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.SqlSessionFactoryBean;

public class BoardDAO {
	
//	public List selectList(String statement)
//	public List selectList(String statement,Object parameter)
	
//	public int insert(String statement,Object parameter)
//	public int update(String statement,Object parameter) throws SQLException
//	public int delete(String statement,Object parameter) throws SQLException
	
	private SqlSession mybatis;
	
	public BoardDAO() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	
	public void insertBoard(BoardVO vo) {
		mybatis.insert("BoardDAO.insertBoard",vo);
		mybatis.commit();
	}
	
	public void updateBoard(BoardVO vo) {
		mybatis.update("BoardDAO.updateBoard",vo);
		mybatis.commit();
	}
	
	public void deleteBoard(BoardVO vo) {
		mybatis.delete("BoardDAO.deleteBoard",vo);
		mybatis.commit();
	}
	
	public BoardVO getBoard(BoardVO vo) {
		
		return mybatis.selectOne("BoardDAO.getBoard",vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo){
		
		return mybatis.selectList("BoardDAO.getBoardList",vo);
	}
}










