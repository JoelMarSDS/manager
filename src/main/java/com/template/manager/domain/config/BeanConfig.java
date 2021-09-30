package com.template.manager.domain.config;

import com.template.manager.domain.service.manager.managerdocfiles.ManagerDocFile;
import com.template.manager.domain.service.manager.managerdocfiles.concretetemplate.TemplateHTML;
import com.template.manager.domain.utils.DownloadTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public ManagerDocFile managerDocFile(){
        return new TemplateHTML();
    }
}
