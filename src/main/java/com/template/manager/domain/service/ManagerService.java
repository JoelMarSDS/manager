package com.template.manager.domain.service;

import com.template.manager.domain.model.TemplateModelDto;
import org.springframework.stereotype.Component;

public interface ManagerService {
    String managerTemplate(TemplateModelDto templateModelDto);
}
