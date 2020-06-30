package com.yh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsPipelineController {
	
	@RequestMapping("/pipeline")
	public String Jenkinspipeline() {
		return "hello jenkins pipeline";
	}

}
