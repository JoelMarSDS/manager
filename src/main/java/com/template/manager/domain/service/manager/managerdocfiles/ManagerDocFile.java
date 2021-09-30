package com.template.manager.domain.service.manager.managerdocfiles;

import com.template.manager.domain.model.TemplateModel;

public abstract class ManagerDocFile {

    private ManagerDocFile next;

    public ManagerDocFile(){}
    public ManagerDocFile(ManagerDocFile next) {
        this.next = next;
    }

    public String fitter(TemplateModel templateModel) {
        try {
            if (apply(templateModel)) {
                return assembleModel(templateModel);
            }
            return next!=null? next.fitter(templateModel):"";
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
    public abstract String assembleModel(TemplateModel templateModel);
    public abstract boolean apply(TemplateModel templateModel);
}
