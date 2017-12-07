package com.ddtong.core.dao.conofig.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ddtong.core.dao.conofig.dbconfig.DataSourceContextHolder;


/**
 * 在dao层决定数据源(注：如果用这方式，service层不能使用事务，否则出问题，因为打开事务打开时，就会觉得数据库源了）
 *
 */
//@Aspect
//@Component
public class DataSourceAopInDao {

	private static Logger log = LoggerFactory.getLogger(DataSourceAopInDao.class);
	
	@Before("execution(* com.ddtong.core.dao.mapper..*.find*(..)) "
			+ " or execution(* com.ddtong.core.dao.mapper..*.get*(..)) "
			+ " or execution(* com.ddtong.core.dao.mapper..*.query*(..))")
    public void setReadDataSourceType() {
        DataSourceContextHolder.setRead();
    }

    @Before("execution(* com.ddtong.core.dao.mapper..*.insert*(..)) "
    		+ " or execution(* com.ddtong.core.dao.mapper..*.update*(..))"
    		+ " or execution(* com.ddtong.core.dao.mapper..*.add*(..))")
    public void setWriteDataSourceType() {
        DataSourceContextHolder.setWrite();
    }
    
    
/*    @Before("execution(* com.ddtong.core.dao.mapper..*.*(..)) "
			+ " and @annotation(com.ddtong.core.dao.conofig.annotation.ReadDataSource) ")
	public void setReadDataSourceType() {
		//如果已经开启写事务了，那之后的所有读都从写库读
		if(!DataSourceType.write.getType().equals(DataSourceContextHolder.getReadOrWrite())){
			DataSourceContextHolder.setRead();
		}
	    
	}
	
	@Before("execution(* com.ddtong.core.dao.mapper..*.*(..)) "
			+ " and @annotation(com.ddtong.core.dao.conofig.annotation.WriteDataSource) ")
	public void setWriteDataSourceType() {
	    DataSourceContextHolder.setWrite();
	}*/
}
