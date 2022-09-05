package com.rednikeeg.bbuilder.builder.config;

import com.rednikeeg.bbuilder.config.ActionContextConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {ActionContextConfiguration.class})
public class ApplicationConfig {
}
