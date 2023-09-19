package com.example.webclient_project;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class RickUndMortyService {
    public final WebClient webClient = WebClient.create("https://rickandmortyapi.com/api/character");
    public RickUndMortyCharacterResponse getAllCharacters(){

        ResponseEntity<RickUndMortyCharacterResponse> response = webClient
                .get()
                .retrieve()
                .toEntity(RickUndMortyCharacterResponse.class)
                .block();

        return response.getBody();
    }
}
