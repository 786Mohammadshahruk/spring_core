package org.spring.annotationBasedConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.spring.annotationBasedConfiguration")
public class AppConfiguration {
}
