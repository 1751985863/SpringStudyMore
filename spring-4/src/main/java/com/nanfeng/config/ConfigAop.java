package com.nanfeng.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(value = {"com.nanfeng.aopanno"})
@EnableAspectJAutoProxy
public class ConfigAop {

}
