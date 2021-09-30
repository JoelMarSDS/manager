package com.template.manager.domain.utils;

import com.template.manager.domain.config.PropertiesConfig;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadTemplate {

    public String downloadFile(String templateName, String type) {
        try {
            StringBuilder stringBuilder = new StringBuilder();

            URL url = new URL(PropertiesConfig.getProperty("url.template.locale") + templateName + type);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int statusCode = connection.getResponseCode();

            if (statusCode == HttpStatus.OK.value()) {
                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(connection.getInputStream()));

                bufferedReader.lines().forEach(s->{
                    stringBuilder.append(s).append(System.lineSeparator());
                });
            }
            return stringBuilder.toString();
        } catch (Exception e) {
            throw new RuntimeException(e.getCause());
        }
    }
}
