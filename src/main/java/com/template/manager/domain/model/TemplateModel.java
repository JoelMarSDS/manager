package com.template.manager.domain.model;

import java.util.Map;

public class TemplateModel {
    private String templateName;
    private String type;
    private Map<String, Object> data;// = new HashMap<>();

    public String getTemplateName() {
        return templateName;
    }

    public String getType() {
        return type;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public static TemplateModel builder() {
        return new TemplateModel();
    }

    public TemplateModel templateName(String templateName){
        this.templateName = templateName;
        return this;
    }

    public TemplateModel type(String type){
        this.type = type;
        return this;
    }

    public TemplateModel data(Map<String, Object> data){
        this.data = data;
        return this;
    }

    public TemplateModel build() {
        TemplateModel templateModel = new TemplateModel();
        templateModel.type = this.type;
        templateModel.templateName = this.templateName;
        templateModel.data = this.data;
        return templateModel;
    }

    @Override
    public String toString() {
        return "TemplateModel{" +
                "templateName='" + templateName + '\'' +
                ", type='" + type + '\'' +
                ", data=" + data +
                '}';
    }
}
