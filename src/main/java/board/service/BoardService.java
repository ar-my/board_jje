package board.service;

import java.util.List;

import board.dto.Board;

public interface BoardService {
	List<Board> selectBoard() throws Exception;
	int updateBoard(List<Board> board) throws Exception;
	void deleteBoard(int seq) throws Exception;
	int insertBoard(List<Board> board) throws Exception;
}
