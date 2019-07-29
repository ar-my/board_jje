package board.service;

import java.util.List;
import org.springframework.stereotype.Service;
import board.dto.Board;

@Service
public class BoardServiceImpl implements BoardService {

	@Override
	public List<Board> selectBoard() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateBoard(List<Board> board) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteBoard(int seq) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int insertBoard(List<Board> board) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
