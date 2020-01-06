package com.caodongwei.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.caodongwei.bean.Goods;
import com.caodongwei.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {

	@Resource
	private GoodsService gService;
	
	@RequestMapping("/list")
	public String sayLisy(Model model,@RequestParam(defaultValue="1")Integer pageNum,String id,String zi,String shu,String name,String pin,String zhi,String ben,String cheng,String jian,String tai,String zhu){
		
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("zi", zi);
		map.put("shu", shu);
		map.put("name", name);
		map.put("pin", pin);
		map.put("zhi", zhi);
		map.put("ben", ben);
		map.put("cheng", cheng);
		map.put("jian", jian);
		map.put("tai", tai);
		map.put("zhu", zhu);
		PageHelper.startPage(pageNum, 2);
		List<Goods> list = gService.selectGoods(map);
		PageInfo<Goods> info = new PageInfo<Goods>(list);
		model.addAttribute("info", info);
		return "list";
	}
}
