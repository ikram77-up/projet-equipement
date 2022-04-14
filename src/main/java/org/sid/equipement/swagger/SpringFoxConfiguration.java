package org.sid.equipement.swagger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.Tag;

import static org.sid.equipement.swagger.SwaggerDocumen.EQUIPEMENT_CONTROLLER_DESCRIPTION;


@Configuration
@EnableSwagger2
public class SpringFoxConfiguration {
    /**
     *the BD Equipement
     */
    @Value(EQUIPEMENT_CONTROLLER_DESCRIPTION)
     String DbEquiv;

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .forCodeGeneration(true)
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.sid.equipement"))
                .paths(PathSelectors.any())
                .build()
                .tags(
                        new Tag(EQUIPEMENT_CONTROLLER_DESCRIPTION, DbEquiv )
                );
    }
    
}
