package com.template.manager.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class TemplateModelDto {

    @JsonProperty("template_name")
    private String templateName;
    @JsonProperty("type")
    private String type;
    @JsonProperty("data")
    private Map<String, Object> data;

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
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
