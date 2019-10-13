package com.hsys.tea.milktea.comm.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hsys.tea.milktea.utils.FileBizUtils;

@Controller
public class UpLoadController {
	
	@Autowired
	private HttpServletRequest req;
	
	/**
	 * 用于上传图片
	 */
	@RequestMapping("/upLoadImage.do")
	public String upLoadImage() {
		HashMap<String, String> upload = FileBizUtils.getInstance().upload(req, "service");
		return upload.get("imger");
	}
}
