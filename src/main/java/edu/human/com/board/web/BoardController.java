package edu.human.com.board.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<?> selectBoard() {
		
		return null;
	}

}
