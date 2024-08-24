package com.codestorm.springvalidations;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping("/post")
    public ResponseEntity<Student> validateMethods(@Valid @RequestBody Student student){
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
}
