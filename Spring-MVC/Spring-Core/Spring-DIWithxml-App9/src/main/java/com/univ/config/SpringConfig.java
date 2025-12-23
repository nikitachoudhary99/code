package com.univ.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.univ.bean.ABC;
import com.univ.bean.Container;
import com.univ.bean.XYZ;

@Configuration
@ComponentScan(basePackages = "com.univ.bean")
public class SpringConfig {

	
}
