package com.example.testjenkis.controllers;

import com.example.testjenkis.entities.TestPerson;
import com.example.testjenkis.services.Impl.TestPersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/test")
@RestController
public record TestPersonController(TestPersonService testPersonService) {

    @GetMapping()
    public ResponseEntity<List<TestPerson>> findAll(){ return ResponseEntity.ok(testPersonService.findAll());}

    @GetMapping("/{id}")
    public ResponseEntity<TestPerson> findById(Long id){ return ResponseEntity.ok(testPersonService.findById(id));}

    @PostMapping()
    public ResponseEntity<TestPerson> create(TestPerson testPerson){ return ResponseEntity.ok(testPersonService.create(testPerson));}

    @PutMapping("/{id}")
    public ResponseEntity<TestPerson> update(Long id, TestPerson testPerson){ return ResponseEntity.ok(testPersonService.update(id, testPerson));}

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(Long id){
        testPersonService.delete(id);
        return ResponseEntity.ok("Delete by id: " + id);
    }
}
