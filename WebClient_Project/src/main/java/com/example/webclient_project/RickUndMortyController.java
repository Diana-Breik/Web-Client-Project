package com.example.webclient_project;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/characters")
@RequiredArgsConstructor
public class RickUndMortyController {

    private final RickUndMortyService rickUndMortyService;

    @GetMapping
    List<RickUndMortyCharacter> getAllCharacters(){
        return rickUndMortyService.getAllCharacters();
    }

    @GetMapping("{id}")
    RickUndMortyCharacter getCharacterById(@PathVariable String id) {
        return rickUndMortyService.getCharacterById(id);
    }



     @GetMapping("/status")
    List<RickUndMortyCharacter> getCharactersByStatus(@RequestParam String status) {
        return rickUndMortyService.getCharactersByStatus(status);
    }
/*
    @GetMapping("species-statistic")
    int getStatisticForSpecies(@RequestParam String status, @RequestParam String species) {
        return rickAndMortyCharacterService.getStatisticForSpecies(status, species);
    }
     */
}
