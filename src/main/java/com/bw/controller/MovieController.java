package com.bw.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.service.MovieService;


@Controller
public class MovieController {
	
	@Resource
	private MovieService movieService;
	
	@RequestMapping("list.do")
	public String list(Model model) {
		List<Map<String,Object>> shopList = movieService.getShopList();
		model.addAttribute("shopList", shopList);
		return "list";
	}

}
