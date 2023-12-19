package com.itheima.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Version 1.0
 * @Date: 2023/11/14 0:24
 * @ClassName : SpringMvcConfig
 * @Author : GUO_HONG_YU
 * @Description: TODO
 */
@Configuration
@ComponentScan("com.itheima.controller")
@EnableWebMvc
public class SpringMvcConfig  implements WebMvcConfigurer {

}
