package com.template.manager;

import com.template.manager.domain.service.manager.managerdocfiles.ManagerDocFile;
import com.template.manager.domain.service.manager.managerdocfiles.concretetemplate.TemplateHTML;
import com.template.manager.domain.utils.DownloadTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
@EnableFeignClients
public class ManagerApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ManagerApplication.class, args);
	}
}
