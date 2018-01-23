package br.com.gabriel.jokesapp.service

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import spock.lang.Specification

class JokeServiceTest extends Specification {

    JokeService jokeService
    ChuckNorrisQuotes chuckNorrisQuotesMock

    void setup() {
        chuckNorrisQuotesMock = Mock(ChuckNorrisQuotes)
        jokeService = new JokeService(chuckNorrisQuotesMock)
    }

    def "should return a random chuck norris quote"() {
        when:
            String quote = jokeService.getChuckNorrisQuote()
        then:
            1 * chuckNorrisQuotesMock.getRandomQuote() >> 'RANDOM QUOTE'
            !quote.isEmpty()
            quote
    }
}
