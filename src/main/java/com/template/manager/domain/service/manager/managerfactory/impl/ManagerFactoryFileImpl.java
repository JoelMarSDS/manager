package com.template.manager.domain.service.manager.managerfactory.impl;

import com.template.manager.domain.model.TemplateModel;
import com.template.manager.domain.service.manager.managerdocfiles.ManagerDocFile;
import com.template.manager.domain.service.manager.managerdocfiles.concretetemplate.TemplateDoc;
import com.template.manager.domain.service.manager.managerdocfiles.concretetemplate.TemplateHTML;
import com.template.manager.domain.service.manager.managerfactory.ManagerFactoryFile;
import org.springframework.stereotype.Component;

@Component
public class ManagerFactoryFileImpl implements ManagerFactoryFile {

    private final ManagerDocFile managerDocFile;

    public ManagerFactoryFileImpl(ManagerDocFile managerDocFile) {
        this.managerDocFile = new TemplateHTML(new TemplateDoc(null));
    }

    @Override
    public String exec(TemplateModel templateModel) {
        return managerDocFile.fitter(templateModel);
    }
}
