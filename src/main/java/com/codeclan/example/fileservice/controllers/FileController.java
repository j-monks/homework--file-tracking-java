//package com.codeclan.example.fileservice.controllers;
//
//import com.codeclan.example.fileservice.models.File;
//import com.codeclan.example.fileservice.repositories.FileRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class FileController {
//
//    @Autowired
//    FileRepository fileRepository;
//
//    @GetMapping(value = "/files")
//    public ResponseEntity<List<File>> getAllFiles() {
//        return new ResponseEntity<>()(fileRepository.findAll(), HttpStatus.OK);
//    }
//}
