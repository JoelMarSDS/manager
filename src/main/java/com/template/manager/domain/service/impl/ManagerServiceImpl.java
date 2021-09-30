package com.template.manager.domain.service.impl;

import com.template.manager.domain.model.TemplateModel;
import com.template.manager.domain.model.TemplateModelDto;
import com.template.manager.domain.service.ManagerService;
import com.template.manager.domain.service.manager.managerfactory.ManagerFactoryFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerFactoryFile managerFactoryDoc;

    @Override
    public String managerTemplate(TemplateModelDto templateModelDto) {

        String html="";

        TemplateModel templateModel = TemplateModel.builder()
                .templateName(templateModelDto.getTemplateName())
                .type(templateModelDto.getType())
                .data(templateModelDto.getData())
                .build();

        return managerFactoryDoc.exec(templateModel);
    }
}
