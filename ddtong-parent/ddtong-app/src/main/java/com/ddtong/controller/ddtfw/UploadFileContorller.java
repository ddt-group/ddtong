package com.ddtong.controller.ddtfw;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ddtong.core.common.DdtongConstant;
import com.ddtong.core.vo.ApiResponseResult;

/**
 * 文件上传
 */
@Controller
@RequestMapping(value = DdtongConstant.APP_API_PATH + "/ddtfw/uploadfile")
public class UploadFileContorller {

	private static final Logger logger = LoggerFactory.getLogger(UploadFileContorller.class);

	@RequestMapping(value = "/userHeadshot", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public ApiResponseResult uploadUserHeadshot(
			@RequestParam(value = "data1", required = false) String data1,
			@RequestParam(value = "data2", required = false) String data2,
			@RequestParam(value = "data3", required = false) String data3,
			@RequestParam(value = "headimage", required = false) MultipartFile file, HttpServletRequest request) {

		logger.info("进入上传用户头像");

		// 重命名上传后的文件名
		String fileName = UUID.randomUUID().toString()+getFileSuffix(file.getOriginalFilename());
		// 定义上传路径
		String path = "F:/ddt-upload/" + fileName;
		File destFile = new File(path);

		try {
			file.transferTo(destFile);
			return ApiResponseResult.success("成功");
		} catch (Exception e) {
			logger.error("上传用户头像异常", e);
			return ApiResponseResult.failure("上传用户头像失败").debugMessage(e.getMessage());
		}
	}
	
	
	@RequestMapping(value = "/morefile", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public ApiResponseResult morefile(
			@RequestParam(value = "data1", required = false) String data1,
			@RequestParam(value = "data2", required = false) String data2,
			@RequestParam(value = "data3", required = false) String data3,
			@RequestParam(value = "morefile", required = false) MultipartFile[] files, HttpServletRequest request) {

		logger.info("进入文件上传");
		try {
			if (files != null && files.length > 0) {
				for (MultipartFile file : files) {

					// 重命名上传后的文件名
					String fileName = UUID.randomUUID().toString()+getFileSuffix(file.getOriginalFilename());
					// 定义上传路径
					String path = "F:/ddt-upload/" + fileName;
					File destFile = new File(path);

					file.transferTo(destFile);
				}
			}else{
				logger.info("没有接受到文件");
			}
			return ApiResponseResult.success("成功");
		} catch (Exception e) {
			logger.error("上传用户头像异常", e);
			return ApiResponseResult.failure("上传用户头像失败").debugMessage(e.getMessage());
		}
	}
	
	public static String getFileSuffix(String fullfileName) {
		int i = fullfileName.lastIndexOf(".");
		if (i >= 0) {
			return fullfileName.substring(i, fullfileName.length());
		}
		return "";
	}

}
