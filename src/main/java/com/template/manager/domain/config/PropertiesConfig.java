package com.template.manager.domain.config;

import org.springframework.context.annotation.Configuration;

import java.util.ResourceBundle;

@Configuration
public class PropertiesConfig {
    private static ResourceBundle bundle = null;

    public static ResourceBundle getBundle() {
        if (bundle==null){
            bundle = ResourceBundle.getBundle("application");
        }
        return bundle;
    }

    public static String getProperty(String key) {
        try {
            if(getBundle().containsKey(key)){
                return getBundle().getString(key);
            }
        } catch (Exception e) {
            throw new RuntimeException("Propiedade não encontrada");
        }
        return "";
    }
}
