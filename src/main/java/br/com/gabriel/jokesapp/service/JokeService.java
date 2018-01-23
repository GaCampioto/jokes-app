package br.com.gabriel.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

    @Autowired
    ChuckNorrisQuotes chuckNorrisQuotes;

    public String getChuckNorrisQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
