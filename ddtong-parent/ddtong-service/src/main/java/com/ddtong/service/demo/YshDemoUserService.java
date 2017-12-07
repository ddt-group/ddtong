package com.ddtong.service.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ddtong.core.dao.conofig.annotation.ReadDataSource;
import com.ddtong.core.dao.conofig.annotation.WriteDataSource;
import com.ddtong.core.dao.mapper.YshDemoUserMpper;
import com.ddtong.core.entity.YshDemoUserEntity;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
/**
 * 如果需要事务，自行在方法上添加@Transactional
 * 如果方法有内部有数据库操作，则必须指定@WriteDataSource还是@ReadDataSource
 * 
 * 注：AOP ，内部方法之间互相调用时，如果是this.xxx()这形式，不会触发AOP拦截，可能会
 * 导致无法决定数据库是走写库还是读库
 * 方法：
 * 为了触发AOP的拦截，调用内部方法时，需要特殊处理下，看方法getService()
 * 
 *
 */
@Service
public class YshDemoUserService {

	@Autowired
	private YshDemoUserMpper yshDemoUserMpper;
	
	@WriteDataSource
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,readOnly=false)
	public void insertUser(YshDemoUserEntity u){
		this.yshDemoUserMpper.insert(u);
	
		//如果类上面没有@Transactional,方法上也没有，哪怕throw new RuntimeException,数据库也会成功插入数据
	//	throw new RuntimeException("测试插入事务");
	}
	
	@ReadDataSource
	public YshDemoUserEntity findById(String id){
		YshDemoUserEntity u = this.yshDemoUserMpper.findById(id);
		return u;
	}
	
	
	@ReadDataSource
	public PageInfo<YshDemoUserEntity> queryPage(String userName,int pageNum,int pageSize){
		Page<YshDemoUserEntity> page = PageHelper.startPage(pageNum, pageSize);
		//PageHelper会自动拦截到下面这查询sql
		this.yshDemoUserMpper.query(userName);
		return page.toPageInfo();
	}
	
//	private UserService getService(){
//		// 采取这种方式的话，
//		//@EnableAspectJAutoProxy(exposeProxy=true,proxyTargetClass=true)
//		//必须设置为true
//	/*	if(AopContext.currentProxy() != null){
//			return (UserService)AopContext.currentProxy();
//		}else{
//			return this;
//		}
//		*/
//		return SpringContextUtil.getBean(this.getClass());
//	}
	
}
