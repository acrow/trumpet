package com.rcx.trumpet.module;

import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;

@At("/Home")
public class HomeModule {

	@At
	@Ok("jsp:welcome")
	public void Hi() {
		
	}
}
