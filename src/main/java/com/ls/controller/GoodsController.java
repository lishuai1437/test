package com.ls.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.ls.pojo.Brand;
import com.ls.pojo.Goods;
import com.ls.pojo.Goodskind;
import com.ls.service.GoodsService;

@Controller
@RequestMapping("goods")
public class GoodsController {

	@Autowired
	GoodsService service;

	@RequestMapping("toList")
	private ModelAndView toList(Goods goods,
			@RequestParam(value = "pageNum", defaultValue = "0", required = false) int pageNum) {
		ModelAndView mv = new ModelAndView();
		PageInfo<Goods> findGoodsList = service.findGoodsList(pageNum, goods);
		mv.addObject("gname", goods.getGname());
		mv.addObject("list", findGoodsList);
		mv.setViewName("List");
		return mv;
	}

	@RequestMapping("toDel")
	@ResponseBody
	private int toDel(String ids) {
		int delete = service.delete(ids);
		if (delete > 0) {
			return 1;
		}
		return 0;
	}

	@RequestMapping("deleteAll")
	@ResponseBody
	private int deleteAll(String ids) {
		int delete = service.delete(ids);
		if (delete > 0) {
			return 1;
		}
		return 0;
	}

	@RequestMapping("toDetail/{gid}")
	private ModelAndView toDetail(@PathVariable("gid") int gid) {
		ModelAndView mv = new ModelAndView();
		Goods findByGid = service.findByGid(gid);
		mv.addObject("goods", findByGid);
		List<Brand> findBrand = service.findBrand();
		mv.addObject("findBrand", findBrand);
		List<Goodskind> findGoodskind = service.findGoodskind();
		mv.addObject("findGoodskind", findGoodskind);

		mv.setViewName("Detail");
		return mv;
	}
	
	@RequestMapping("toUpdate/{gid}")
	private ModelAndView toUpdate(@PathVariable("gid") int gid) {
		ModelAndView mv = new ModelAndView();
		Goods findByGid = service.findByGid(gid);
		mv.addObject("goods", findByGid);
		List<Brand> findBrand = service.findBrand();
		mv.addObject("findBrand", findBrand);
		List<Goodskind> findGoodskind = service.findGoodskind();
		mv.addObject("findGoodskind", findGoodskind);
		mv.setViewName("Update");
		return mv;
	}
	
	@RequestMapping("update")
	@ResponseBody
	private int update(Goods goods) {
		int update = service.update(goods);
		if(update>0) {
			return 1;
		}
		return 0;
	}

	@RequestMapping("toAdd")
	private ModelAndView toAdd() {
		ModelAndView mv = new ModelAndView();
		List<Brand> findBrand = service.findBrand();
		mv.addObject("findBrand", findBrand);
		List<Goodskind> findGoodskind = service.findGoodskind();
		mv.addObject("findGoodskind", findGoodskind);
		mv.setViewName("Add");
		return mv;
	}

	@RequestMapping("add")
	@ResponseBody
	private int add(Goods goods,int bid,int sid) {

		int add = service.add(goods,bid,sid);
		if (add > 0) {
			return 1;
		}
		return 0;
	}
}
