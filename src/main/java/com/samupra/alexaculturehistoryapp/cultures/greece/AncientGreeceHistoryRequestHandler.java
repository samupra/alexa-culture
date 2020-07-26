package com.samupra.alexaculturehistoryapp.cultures.greece;

import java.util.Optional;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import static com.amazon.ask.request.Predicates.intentName;

public class AncientGreeceHistoryRequestHandler implements RequestHandler {

    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AncientGreeceHistoryIntent"));
    }

    private String topicsSupported () {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < SupportedTopics.values().length; i ++){
            str.append(SupportedTopics.values()[i].toString()).append(",");
        }

        return str.toString();
    }

    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Which topic of Ancient Greece Culture and History would you like to learn about?" +
                "Currently I support the following topics: " + this.topicsSupported();
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("WelcomeToAncientGreece", speechText)
                .build();
    }

}