package com.ronpotter99.simpleschoolwebapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {

    @Value("${spring.datasource.url}")
    private String datasourceUrl;
    @Value("${spring.datasource.driverClassName}")
    private String datasourceDriverClassName;
    @Value("${spring.datasource.username}")
    private String datasourceUsername;
    @Value("${spring.datasource.password}")
    private String datasourcePassword;

    // The database connection is actually configured in the 'src/main/resources/application.properties' file.
    // This configuration file exists as an example on how you may configure different Spring resources and
    // classes by using the @Bean annotation. This code below should be similar to what Spring is actually
    // doing when it configures the database automatically based off of the properties file.
//    @Bean
//    public DataSource dataSource() {
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.driverClassName(datasourceDriverClassName);
//        dataSourceBuilder.url(datasourceUrl);
//        dataSourceBuilder.username(datasourceUsername);
//        dataSourceBuilder.password(datasourcePassword);
//        return dataSourceBuilder.build();
//    }
}
