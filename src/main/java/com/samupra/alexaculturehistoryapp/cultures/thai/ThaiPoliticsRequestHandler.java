package com.samupra.alexaculturehistoryapp.cultures.thai;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class ThaiPoliticsRequestHandler implements RequestHandler {

    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("ThaiPoliticsIntent"));
    }

    // https://en.wikipedia.org/wiki/Politics_of_Thailand
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Thai kingdoms and the late Kingdom of Siam were under absolute rule of kings." +
                " After the \"democratic revolution\" in 1932," +
                " led by Westernized bureaucrats and a tradition-oriented military," +
                " the country officially became a constitutional monarchy with a prime minister as the government head. " +
                "The first written constitution was issued." +
                " Politics became the arena of fighting factions between " +
                "old and new elites, bureaucrats, and generals." +
                " Coups happened from time to time, often bringing the country under the rule of yet another junta. " +
                "To date Thailand has had 17 charters and constitutions," +
                " reflecting a high degree of political instability. " +
                "After successful coups, military regimes have abrogated existing constitutions " +
                "and promulgated interim charters. Negotiations between politicians," +
                " bureaucrats, influence peddlers, " +
                "Corporate Leaders and Army Officers have become a driving force in the restoration of temporary political stability.";

        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("WelcomeToThaiPolitics", speechText)
                .build();
    }

}
