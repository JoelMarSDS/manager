package com.template.manager.domain.service.manager.managerdocfiles.concretetemplate;

import com.template.manager.domain.model.TemplateModel;
import com.template.manager.domain.service.manager.managerdocfiles.ManagerDocFile;
import com.template.manager.domain.utils.Constant;

public class TemplateDoc extends ManagerDocFile{

    public TemplateDoc() {
        super();
    }

    public TemplateDoc(ManagerDocFile next) {
        super(next);
    }

    @Override
    public String assembleModel(TemplateModel templateModel) {

        System.out.println(templateModel.toString()+TemplateDoc.class.getSimpleName());
        return templateModel.toString();
    }

    @Override
    public boolean apply(TemplateModel templateModel) {
        return templateModel.getType().equalsIgnoreCase(Constant.DOC)|
                templateModel.getType().equalsIgnoreCase(Constant.DOCX);
    }
}
