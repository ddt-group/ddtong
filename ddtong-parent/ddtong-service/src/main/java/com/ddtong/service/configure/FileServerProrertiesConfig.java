package com.ddtong.service.configure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = { "classpath:/conf/ddt-config.properties" }, ignoreResourceNotFound = true)
public class FileServerProrertiesConfig {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	Environment env;

	public String getProperty(String key) {
		return env.getProperty(key);
	}

	public String getProperty(String key, String defVal) {
		String val = getProperty(key);
		if (null == val || val.equals("")) {
			logger.info("the " + key + " property is not find or empty");
			return defVal;
		}
		return val;
	}

}
