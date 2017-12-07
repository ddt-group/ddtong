package com.ddtong.controller.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ddtong.core.entity.YshDemoUserEntity;
import com.ddtong.service.demo.YshDemoBlendUserService;
import com.ddtong.service.demo.YshDemoUserService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/user")
public class YshDemoUserController {

	
	@Autowired
	private YshDemoUserService yshDemoUserService;
	
	@Autowired
	private YshDemoBlendUserService yshDemoBlendUserService;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		return "hello";
	}
	/**
	 * 测试插入
	 * @return
	 */
	@RequestMapping("/add")
	@ResponseBody
	public String add(String id,String userName){
		YshDemoUserEntity u = new YshDemoUserEntity();
		u.setId(id);
		u.setUserName(userName);
		this.yshDemoUserService.insertUser(u);
		return u.getId()+"    " + u.getUserName();
	}
	/**
	 * 测试读
	 * @param id
	 * @return
	 */
	@RequestMapping("/get/{id}")
	@ResponseBody
	public String findById(@PathVariable("id") String id){
		YshDemoUserEntity u = this.yshDemoUserService.findById(id);
		return u.getId()+"    " + u.getUserName();
	}
	/**
	 * 测试写然后读
	 * @param id
	 * @param userName
	 * @return
	 */
	@RequestMapping("/addAndRead")
	@ResponseBody
	public String addAndRead(String id,String userName){
		YshDemoUserEntity u = new YshDemoUserEntity();
		u.setId(id);
		u.setUserName(userName);
		this.yshDemoBlendUserService.wirteAndRead(u);
		return u.getId()+"    " + u.getUserName();
	}
	
	/**
	 * 测试读然后写
	 * @param id
	 * @param userName
	 * @return
	 */
	@RequestMapping("/readAndAdd")
	@ResponseBody
	public String readAndWrite(String id,String userName){
		YshDemoUserEntity u = new YshDemoUserEntity();
		u.setId(id);
		u.setUserName(userName);
		this.yshDemoBlendUserService.readAndWirte(u);
		return u.getId()+"    " + u.getUserName();
	}
	
	/**
	 * 测试分页插件
	 * @return
	 */
	@RequestMapping("/queryPage")
	@ResponseBody
	public String queryPage(){
		PageInfo<YshDemoUserEntity> page = this.yshDemoUserService.queryPage("tes", 1, 2);
		StringBuilder sb = new StringBuilder();
		sb.append("<br/>总页数=" + page.getPages());
		sb.append("<br/>总记录数=" + page.getTotal()) ;
		for(YshDemoUserEntity u : page.getList()){
			sb.append("<br/>" + u.getId() + "      " + u.getUserName());
		}
		System.out.println("分页查询....\n" + sb.toString());
		return sb.toString();
	}
	
}
