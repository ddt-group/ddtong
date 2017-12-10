package com.ddtong.controller.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddtong.core.entity.custom.TCustom;
import com.ddtong.service.custom.CustomService;

@RestController
@RequestMapping("/custom/v1")
public class CustomController {
	@Autowired
	private CustomService customService;
	
	@RequestMapping("/{id}/getCustom")
	public TCustom getCustomByid(@PathVariable("id") long id)
	{
		TCustom tCustom = customService.selectById(id);
		return tCustom;
	}
}
