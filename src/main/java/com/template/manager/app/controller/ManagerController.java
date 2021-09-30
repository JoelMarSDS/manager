package com.template.manager.app.controller;

import com.template.manager.domain.model.TemplateModelDto;
import com.template.manager.domain.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @PostMapping("/posts")
    public ResponseEntity<String> managerTemplate(@RequestBody TemplateModelDto templateModelDto) {
        return ResponseEntity.ok(managerService.managerTemplate(templateModelDto));
    }
}
