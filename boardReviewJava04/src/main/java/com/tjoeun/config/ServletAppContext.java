package com.tjoeun.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.tjoeun.interceptor.TopMenuInterceptor;
import com.tjoeun.mapper.BoardMapper;
import com.tjoeun.mapper.TopMenuMapper;



@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.tjoeun.controller", "com.tjoeun.dao", "com.tjoeun.service"})
public class ServletAppContext implements WebMvcConfigurer{
	
	@Value("${oracle.classname}")
	private String oracleClassName;
	
	@Value("${oracle.url}")
	private String oracleClassUrl;
	
	@Value("${oracle.username}")
	private String oracleUserName;
	
	@Value("${oracle.password}")
	private String oraclePassword;
	
	// Controller 의 메소드가 반환하는 jsp(view) 이름 앞뒤로
	// 있는 경로의 접두사, 접미사 설정하기
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");
	}
  	
	// 이미지, 음악파일, js, css 파일 등을 저장하는 경로 지정하기
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resources/");
	}
	
	//database 접속 정보 관리
	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName(oracleClassName);
		source.setUrl(oracleClassUrl);
		source.setUsername(oracleUserName);
		source.setPassword(oraclePassword);
		
		return source;
	}
	
	//query 와 접속 정보 관리
	@Bean
	public SqlSessionFactory factory(BasicDataSource source) throws Exception{
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(source);
		SqlSessionFactory factory = factoryBean.getObject();
		return factory;
	}
	
	//Mapper 관리 - query 실행 : MapperFactoryBean 사용 (java)
	@Bean
	public MapperFactoryBean<BoardMapper> getBoardMapper(SqlSessionFactory factory) throws Exception{
		MapperFactoryBean<BoardMapper> factoryBean = 
				new MapperFactoryBean<>(BoardMapper.class);
		factoryBean.setSqlSessionFactory(factory);
		return factoryBean;
	}
	
	@Bean
	public MapperFactoryBean<TopMenuMapper> getTopMenuList(SqlSessionFactory factory) throws Exception{
		MapperFactoryBean<TopMenuMapper> factoryBean = 
				new MapperFactoryBean<>(TopMenuMapper.class);
		factoryBean.setSqlSessionFactory(factory);
		return factoryBean;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		WebMvcConfigurer.super.addInterceptors(registry);
		 TopMenuInterceptor topMenuInterceptor = new TopMenuInterceptor(topMenuService);
			InterceptorRegistration regi1 = registry.addInterceptor(topMenuInterceptor);
			
			regi1.addPathPatterns("/**"); 
			
	}
	
}



