package com.samupra.alexaculturehistoryapp.cultures.thai;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class ThaiHistoryRequestHandler implements RequestHandler {

    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("ThaiHistoryIntent"));
    }

    private String topicsSupported () {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < SupportedTopics.values().length; i ++){
            str.append(SupportedTopics.values()[i].toString()).append(",");
        }

        return str.toString();
    }

    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Which topic of Thai would you like to learn about?" +
                "Currently I support the following topics: " + this.topicsSupported();
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("WelcomeToThaiHistory", speechText)
                .build();
    }

}