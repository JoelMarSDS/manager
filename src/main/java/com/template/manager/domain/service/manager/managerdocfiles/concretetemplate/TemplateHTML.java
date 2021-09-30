package com.template.manager.domain.service.manager.managerdocfiles.concretetemplate;

import com.template.manager.domain.model.TemplateModel;
import com.template.manager.domain.service.manager.managerdocfiles.ManagerDocFile;
import com.template.manager.domain.utils.Constant;
import com.template.manager.domain.utils.DownloadTemplate;
import com.template.manager.domain.utils.TemplateTest;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TemplateHTML extends ManagerDocFile{

    public TemplateHTML() {
        super();
    }

    public TemplateHTML(ManagerDocFile next) {
        super(next);
    }

    @Override
    public String assembleModel(TemplateModel templateModel) {
        DownloadTemplate downloadTemplate = new DownloadTemplate();
        return replaceVariable(downloadTemplate.downloadFile(templateModel.getTemplateName(),templateModel.getType()), new HashMap<>(templateModel.getData()));
    }

    @Override
    public boolean apply(TemplateModel templateModel) {
        return templateModel.getType().equalsIgnoreCase(Constant.HTML)|
                templateModel.getType().equalsIgnoreCase(Constant.HTM);
    }

    private String replaceVariable(String template, HashMap<String, Object> stringObjectMap) {
        StringBuilder stringBuilder = new StringBuilder();

        String[] templateArray = template.split(" ");
        for (String arrayPosition : templateArray) {
            for (String key: stringObjectMap.keySet()) {
                if (arrayPosition.contains(variableTemplate(key))){
                    arrayPosition = arrayPosition.replace(variableTemplate(key), String.valueOf(stringObjectMap.get(key)));
                }
            }
            stringBuilder.append(arrayPosition).append(" ");
        }

        return stringBuilder.toString();
    }

    private String variableTemplate(String key) {
        return String.format("<<%s>>",key);
    }
}
