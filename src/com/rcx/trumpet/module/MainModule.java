package com.rcx.trumpet.module;

import org.nutz.mvc.annotation.IocBy;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.ioc.provider.JsonIocProvider;

@Modules(scanPackage = true)
@IocBy(type=JsonIocProvider.class, args={"conf/datasource.json"})
public class MainModule {

}
