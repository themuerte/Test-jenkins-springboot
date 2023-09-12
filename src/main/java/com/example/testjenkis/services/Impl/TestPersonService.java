package com.example.testjenkis.services.Impl;

import com.example.testjenkis.entities.TestPerson;
import com.example.testjenkis.services.TestServiceI;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record TestPersonService() implements TestServiceI {

    @Override
    public List<TestPerson> findAll() {
        return List.of(new TestPerson("Pepito", "de la rasca y gana", "1900-2020", "si@si.com"),
                new TestPerson("Gomez", "de la selva, una arriba donde alejandro", "18900-2020", "no@no.com"));
    }

    @Override
    public TestPerson findById(Long aLong) {
        return new TestPerson("Pepito by findID", "de la rasca y gana", "1900-2020", "test@test.com");
    }

    @Override
    public TestPerson create(TestPerson entity) {
        return new TestPerson("Pepito by create", "de la rasca y gana", "1900-2020", "test@test.com");
    }

    @Override
    public TestPerson update(Long aLong, TestPerson entity) {
        return new TestPerson("Pepito by update", "de la rasca y gana", "1900-2020", "test@test.com");
    }

    @Override
    public void delete(Long aLong) {
        System.out.println("Delete by id: " + aLong);
    }

}
