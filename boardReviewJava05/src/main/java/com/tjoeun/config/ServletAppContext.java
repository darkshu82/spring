package com.tjoeun.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.tjoeun.interceptor.DeveloperInteceptor;
import com.tjoeun.interceptor.OfficerInterceptor;
import com.tjoeun.interceptor.SophomoreInterceptor;
import com.tjoeun.interceptor.TopMenuInterceptor;
import com.tjoeun.mapper.BoardMapper;
import com.tjoeun.mapper.DeveloperMapper;
import com.tjoeun.mapper.OfficerMapper;
import com.tjoeun.mapper.SophomoreMapper;
import com.tjoeun.mapper.TopMenuMapper;
import com.tjoeun.service.DeveloperService;
import com.tjoeun.service.OfficerService;
import com.tjoeun.service.SophomoreService;
import com.tjoeun.service.TopMenuService;



@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.tjoeun.controller", "com.tjoeun.dao", "com.tjoeun.service"})
@PropertySource("/WEB-INF/properties/database.properties")
public class ServletAppContext implements WebMvcConfigurer{
	
	@Value("${oracle.classname}")
	private String oracleClassName;
	
	@Value("${oracle.url}")
	private String oracleUrl;
	
	@Value("${oracle.username}")
	private String oracleUserName;
	
	@Value("${oracle.password}")
	private String oraclePassword;
	
	@Autowired
	private TopMenuService topMenuService;
	
	@Autowired
	private DeveloperService developerService;
	
	@Autowired
	private OfficerService officerService;
	
	@Autowired
	private SophomoreService sophomoreService;
	
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
		source.setUrl(oracleUrl);
		source.setUsername(oracleUserName);
		source.setPassword(oraclePassword);
		
		return source;
	}
	
	//query 와 접속 정보 관리
	@Bean
	public SqlSessionFactory factory(BasicDataSource source) throws Exception{
		SqlSessionFactoryBean factoryBean = 
				new SqlSessionFactoryBean();
		factoryBean.setDataSource(source);
		SqlSessionFactory factory = factoryBean.getObject();
		return factory;
	}
	
	// 맵퍼 관리 - query 실행 : MapperFactoryBean 사용 (java)
	@Bean
	public MapperFactoryBean<BoardMapper> getBoardMapper(SqlSessionFactory factory) throws Exception{
		MapperFactoryBean<BoardMapper> factoryBean = 
				new MapperFactoryBean<>(BoardMapper.class);
		factoryBean.setSqlSessionFactory(factory);
		return factoryBean;
	}
	
	@Bean
	public MapperFactoryBean<TopMenuMapper> getTopMenuMapper(SqlSessionFactory factory) throws Exception{
		MapperFactoryBean<TopMenuMapper> factoryBean = 
				new MapperFactoryBean<>(TopMenuMapper.class);
		factoryBean.setSqlSessionFactory(factory);
		return factoryBean;
	}
	
	@Bean
	public MapperFactoryBean<DeveloperMapper> getDeveloperMapper(SqlSessionFactory factory) throws Exception{
		MapperFactoryBean<DeveloperMapper> factoryBean = 
				new MapperFactoryBean<>(DeveloperMapper.class);
		factoryBean.setSqlSessionFactory(factory);
		return factoryBean;
	}
	
	@Bean
	public MapperFactoryBean<OfficerMapper> getOfficerMapper(SqlSessionFactory factory) throws Exception{
		MapperFactoryBean<OfficerMapper> factoryBean = 
				new MapperFactoryBean<>(OfficerMapper.class);
		factoryBean.setSqlSessionFactory(factory);
		return factoryBean;
	}
	
	@Bean
	public MapperFactoryBean<SophomoreMapper> getSophomoreMapper(SqlSessionFactory factory) throws Exception{
		MapperFactoryBean<SophomoreMapper> factoryBean = 
				new MapperFactoryBean<>(SophomoreMapper.class);
		factoryBean.setSqlSessionFactory(factory);
		return factoryBean;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		WebMvcConfigurer.super.addInterceptors(registry);
		 TopMenuInterceptor topMenuInterceptor = new TopMenuInterceptor(topMenuService);
			InterceptorRegistration regi1 = registry.addInterceptor(topMenuInterceptor);
			
			regi1.addPathPatterns("/**"); 
		
		 DeveloperInteceptor developerInteceptor = new DeveloperInteceptor(developerService);
			InterceptorRegistration regi2 = registry.addInterceptor(developerInteceptor);
		
			regi2.addPathPatterns("/**");
			
			OfficerInterceptor officerInterceptor = new OfficerInterceptor(officerService);
  		InterceptorRegistration regi3 = registry.addInterceptor(officerInterceptor);
  	
  		regi3.addPathPatterns("/**");
  		
  		SophomoreInterceptor sophomoreInterceptor = new SophomoreInterceptor(sophomoreService);
  		InterceptorRegistration regi4 = registry.addInterceptor(sophomoreInterceptor);
  	
  		regi4.addPathPatterns("/**"); 	
	}
	
	
}


