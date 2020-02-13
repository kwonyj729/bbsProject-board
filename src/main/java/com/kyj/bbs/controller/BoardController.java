package com.kyj.bbs.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kyj.bbs.dto.BoardVO;
import com.kyj.bbs.dto.Criteria;
import com.kyj.bbs.dto.PageMaker;
import com.kyj.bbs.service.BoardService;

@Controller
public class BoardController {

	@Inject
	private BoardService service;
	
//	@Inject
//	private PageMaker pageMaker;
	
//	@Inject
//	private Criteria cri;

	
	//전체보기
	@RequestMapping("/list")
	public String list(@ModelAttribute("cri") Criteria cri, Model model) {
		
		int totalCount = service.totalCount(cri);
		
		PageMaker pageMaker = new PageMaker();
		//cri 먼저 넣고, 그다음에 totalCount 를 해야한다.
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(totalCount);
		
		
		model.addAttribute("pageMaker", pageMaker);
		
		model.addAttribute("list", service.selectAll(cri));
		
		return "list";
	}
//	
//	//상세보기로 가기.
//	@GetMapping("/read")
//	public String readDetail(@RequestParam("bno") int bno, Model model) {
//		model.addAttribute("board", service.detailOne(bno));
//		return "read";
//	}
	
	@GetMapping("/input")
	public String insertForm() {
		 return "input";
	}
	
	@PostMapping("/input")
	public String insert(@ModelAttribute("board") BoardVO board) {
		service.insert(board);
		return "redirect:list";
	}
	
	
	
	@GetMapping("/update")
	public String updateForm(@RequestParam("bno") int bno, Model model) {		
		model.addAttribute("board", service.selectOne(bno));
		return "update";		
	}	
	@PostMapping("/update")
	public String update(@ModelAttribute("board") BoardVO board) {
		service.update(board);
		return "redirect:list";		
	}
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam("bno") int bno) {
		service.delete(bno);
		return "redirect:list";
	}
	
}
