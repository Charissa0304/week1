package com.bw.week1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.week1.domain.Brand;
import com.bw.week1.domain.Goods;
import com.bw.week1.domain.Type;
import com.bw.week1.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
/**
 * 
    * @ClassName: GoodsController
    * @Description: 持久层
    * @author YWY
    * @date 2019年12月3日
    *
 */
@Controller
public class GoodsController {

	@Autowired
	private GoodsService service;
	/**
	 * 
	    * @Title: getGoodsList
	    * @Description: 列表
	    * @param @param model
	    * @param @param pageNum
	    * @param @param gname
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	@RequestMapping("list")
	public String getGoodsList(Model model,@RequestParam(defaultValue="1")Integer pageNum,String gname) {
		int pageSize=4;
		PageHelper.startPage(pageNum, pageSize);
		List<Goods> list = service.getGoodsList(gname);
		PageInfo info=new PageInfo(list);
		model.addAttribute("list", list);
		model.addAttribute("info", info);
		return "list";
	}
	/**
	 * 
	    * @Title: toAdd
	    * @Description: 跳转到添加
	    * @param @param model
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	@RequestMapping("toAdd")
	public  String toAdd(Model model) {
		List<Type> types = service.getTypeList();
		List<Brand> brands = service.getBrandList();
		model.addAttribute("types", types);
		model.addAttribute("brands", brands);
		return "add";
	}
	/**
	 * 
	    * @Title: add
	    * @Description: 添加
	    * @param @param goods
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	@ResponseBody
	@RequestMapping("add")
	public String add(Goods goods) {
		service.add(goods);
		return "redirect:/list";
	}
	
	@RequestMapping("toLook")
	public String toSelect(Model model,Integer gid) {
		List<Type> types = service.getTypeList();
		List<Brand> brands = service.getBrandList();
		model.addAttribute("types", types);
		model.addAttribute("brands", brands);
        Goods g = service.getGoodsByGid(gid);
        model.addAttribute("g", g);
		return "look";
	}
	/**


	    * @Title: toUpdate
	    * @Description:跳转到修改
	    * @param @param model
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	@RequestMapping("toUpdate")
	public String toUpdate(Model model,Integer gid) {
		List<Type> types = service.getTypeList();
		List<Brand> brands = service.getBrandList();
		model.addAttribute("types", types);
		model.addAttribute("brands", brands);
        Goods g = service.getGoodsByGid(gid);
        model.addAttribute("g", g);
		return "update";
	}
	/**
	 * 
	    * @Title: update
	    * @Description: 修改
	    * @param @param goods
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	@ResponseBody
	@RequestMapping("update")
	public String update(Goods goods) {
		service.update(goods);
		return "redirect:/list";
	}
	/**
	 * 
	    * @Title: delete
	    * @Description: 删除
	    * @param @param gid
	    * @param @return    参数
	    * @return boolean    返回类型
	    * @throws
	 */
	
	@ResponseBody
	@RequestMapping("delete")
	public boolean delete(String gid) {
		try {
			service.delAll(gid);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
