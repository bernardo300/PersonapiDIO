package digital.one.PesonalApi.configuration;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfigurations {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("Kennag Software")
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public OpenAPI forumAluraOpenAPI() {
        return new OpenAPI()
        .info(new Info().title("People crud")
                .description("Projeto de Documentacao de API")
                .version("v0.0.1"));
        }
}