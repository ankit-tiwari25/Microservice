package com.microservice.department_service.controller;

import org.apache.http.HttpStatus;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/department")
public class DepartmentController {

//    private static final Logger logger = (Logger) LoggerFactory.getLogger(Logger.class);
    @GetMapping("/test")
    public ResponseEntity<String> testDepartment(){
//        logger.info("Test Department Called");
        return  ResponseEntity.ok("Test Successful");
    }
}
