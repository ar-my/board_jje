package board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import board.dto.Board;
import board.service.BoardService;

@RestController
public class BoardController {
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value="/board", method=RequestMethod.GET)
	public List<Board> select() {
		List<Board> boardList = null;
		try {
			boardList = boardService.selectBoard();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return boardList;
	}
	
	@RequestMapping(value="/board", method=RequestMethod.PUT)
	public String insert() {
		return "board Insert";
	}
	
	@RequestMapping(value="/board/{idx}", method=RequestMethod.POST)
	public String update() {
		return "board update";
	}	
	
	@RequestMapping(value="/board/{idx}", method=RequestMethod.DELETE)
	public String delete() {
		return "board delte";
	}
}
