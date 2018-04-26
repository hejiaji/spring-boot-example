package com.example.configuration;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
public class SwaggerConfiguration {
    @Bean
    public Docket personApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("person-api")
                .apiInfo(apiInfo())
                .select()
                .paths(personPaths())
                .build()
                .ignoredParameterTypes(ApiIgnore.class);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Jeremy Service API")
                .description("Jeremy Swagger.")
                .termsOfServiceUrl("http://springfox.io")
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE")
                .version("2.0")
                .build();
    }

    private Predicate<String> personPaths() {
        return or(regex("/api/person.*"), regex("/api/person"), regex("/api/person"));
    }
}
