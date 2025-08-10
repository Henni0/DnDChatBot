
package com.dndapp.backend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/characters")
public class CharacterController {

    @GetMapping
    public String getAllCharacters() {
        return "Liste aller Charaktere";
    }

    @PostMapping
    public String createCharacter(@RequestBody String payload) {
        return "Charakter erstellt: " + payload;
    }
}
