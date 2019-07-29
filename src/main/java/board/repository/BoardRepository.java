package board.repository;

import java.util.List;

import board.dto.Board;

public interface BoardRepository{
	List<Board> findById() throws Exception;

}
