 package com.portfoliomanagment.controllers;

 import com.portfoliomanagment.service.PositionService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.http.ResponseEntity;
 import org.springframework.security.access.prepost.PreAuthorize;
 import org.springframework.web.bind.annotation.*;

 @CrossOrigin(origins = "*", maxAge = 3600)
 @RestController
 @RequestMapping("/api/positions/")
 public class PositionController {

     @Autowired
     PositionService positionService;

     @GetMapping("/")
     @PreAuthorize("hasRole('USER')")
     public ResponseEntity<?> getPosition() {
         return ResponseEntity.status(200).body(positionService.getPosition());
     }
 }
