package com.ddtong.service.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ddtong.core.dao.conofig.annotation.WriteDataSource;
import com.ddtong.core.entity.YshDemoUserEntity;


@Service
public class YshDemoBlendUserService {

	@Autowired
	private YshDemoUserService yshDemoUserService;

	/**
	 * 写事务里面调用读
	 * 
	 * @param u
	 */
	@WriteDataSource
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,readOnly=false)
	public void wirteAndRead(YshDemoUserEntity u) {
		yshDemoUserService.insertUser(u);// 这里走写库，那后面的读也都要走写库
		// 这是刚刚插入的
		YshDemoUserEntity uu = yshDemoUserService.findById(u.getId());
		System.out.println("==读写混合测试中的读(刚刚插入的)====id=" + u.getId() + ",  user_name=" + uu.getUserName());
		// 为了测试,3个库中id=1的user_name是不一样的
		YshDemoUserEntity uuu = yshDemoUserService.findById("1");
		System.out.println("==读写混合测试中的读====id=1,  user_name=" + uuu.getUserName());

	}
	
	@WriteDataSource
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,readOnly=false)
	public void readAndWirte(YshDemoUserEntity u){
		//为了测试,3个库中id=1的user_name是不一样的
		YshDemoUserEntity uu = yshDemoUserService. findById("1");
		System.out.println("==ysh ysh 读写混合测试中的读====id=1,user_name=" + uu.getUserName());
		yshDemoUserService.insertUser(u);
		
	}

}
