package board.dto;

import lombok.Data;

@Data
public class Board {
	private int seq;
	private String title;
	private String contents;
	private String regId;
	private String regDate;
	private String uptDate;
}
