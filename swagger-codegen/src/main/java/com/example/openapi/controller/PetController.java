package com.example.openapi.controller;

import io.swagger.api.PetsApi;
import io.swagger.model.Pet;
import io.swagger.model.Pets;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PetController implements PetsApi {
    @Override
    public ResponseEntity<Void> createPets(@Valid Pet body) {
        return null;
    }

    @Override
    public ResponseEntity<Pets> listPets(@Valid Integer limit) {
        return null;
    }

    @Override
    public ResponseEntity<Pet> showPetById(String petId) {
        return null;
    }
}
