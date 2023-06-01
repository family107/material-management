package com.family.config;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * Description:
 *
 * @Author qxy
 * @Create 2023/6/1 10:55
 * @Version 1.0
 */
@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfig {

    @Bean
    public Docket systemAppApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                //获取接口信息
                .apiInfo(apiInfo())
                //分组
                .groupName("物资管理系统api")
                .select()
                //-------- 指定扫描那些接口 --------
                //扫描所有
                //.apis(RequestHandlerSelectors.any())
                //扫描所有有注解的api
                //.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                //扫描指定位置
                .apis(RequestHandlerSelectors.basePackage("com.family.*"))
                //-------- 指定扫描路径 --------
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //标题
                .title("物资管理系统")
                //描述
                .description("用于管理物资的系统")
                //许可
                .license("family 2023/06/01")
                //许可链接
//                .licenseUrl("https://blog.csdn.net/qq_26103133?spm=1001.2101.3001.5343")
                //服务条款网址
                .termsOfServiceUrl("www.spring.io")
                //版本
                .version("1.0")
                //维护人信息
                .contact(new Contact("family","www.family.com","546464354@qq.com"))
                .build();
    }

}
