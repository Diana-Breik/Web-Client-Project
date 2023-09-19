package com.example.webclient_project;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
@RequiredArgsConstructor
public class RickUndMortyController {

    private final RickUndMortyService rickUndMortyService;

    @GetMapping("characters/")
    RickUndMortyCharacterResponse getAllCharacters(){
        return rickUndMortyService.getAllCharacters();
    }

}
