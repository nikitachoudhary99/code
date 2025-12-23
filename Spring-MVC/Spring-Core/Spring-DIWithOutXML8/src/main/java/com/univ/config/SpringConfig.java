package com.univ.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.univ.bean.ABC;
import com.univ.bean.Container;
import com.univ.bean.XYZ;

@Configuration
public class SpringConfig {

	@Bean
	public ABC getABC()
	{//constructor
		ABC abc= new ABC(100);
		return abc;
	}
	@Bean
	public XYZ getXYZ()
	{//setter
		XYZ xyz=new XYZ();
		xyz.setY(200);
		return xyz;
	}
	@Bean
	public Container getcontContainer()
	{
	 Container cnt=new Container();
	 cnt.setAbc(getABC());
	 cnt.setXyz(getXYZ());
	 return cnt;
	}
}
