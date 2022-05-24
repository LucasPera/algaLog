package com.algaworks.algalog.common;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
	
	//para injetar em outras classes dentro do spring
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
}
