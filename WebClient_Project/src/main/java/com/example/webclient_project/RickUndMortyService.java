package com.example.webclient_project;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class RickUndMortyService {
    public final WebClient webClient = WebClient.create("https://rickandmortyapi.com/api/character");
    public List<RickUndMortyCharacter> getAllCharacters(){

        ResponseEntity<RickUndMortyCharacterResponse> response = webClient
                .get()
                .retrieve()
                .toEntity(RickUndMortyCharacterResponse.class)
                .block();

        return response.getBody().results();
    }


    public RickUndMortyCharacter getCharacterById(String id) {
        String uriString = "/" + id;
        ResponseEntity<RickUndMortyCharacter> responseEntity = webClient
                .get()
                .uri(uriString)
                .retrieve()
                .toEntity(RickUndMortyCharacter.class)
                .block();
        return responseEntity.getBody();

    }


     public List<RickUndMortyCharacter> getCharactersByStatus(String status) {
        String newUri = "?status=" + status;
        ResponseEntity<RickUndMortyCharacterResponse> responseEntity = webClient
                .get()
                .uri(newUri)
                .retrieve()
                .toEntity(RickUndMortyCharacterResponse.class)
                .block();
        return responseEntity.getBody().results();
    }

    public int getStatisticForSpecies(String request, String species) {
        String newUri = "?status=" + request + "&species=" + species;
        ResponseEntity<RickUndMortyCharacterResponse> responseEntity = webClient
                .get()
                .uri(newUri)
                .retrieve()
                .toEntity(RickUndMortyCharacterResponse.class)
                .block();
        return responseEntity.getBody().info().count();
    }

}
