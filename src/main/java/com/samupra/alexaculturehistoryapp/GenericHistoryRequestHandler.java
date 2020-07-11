package com.samupra.alexaculturehistoryapp;

import java.util.Optional;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import static com.amazon.ask.request.Predicates.intentName;

public class GenericHistoryRequestHandler implements RequestHandler {

    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("LaunchHistoryIntent"));
    }

    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Hi. Please specify which country's history " +
                "and culture you would like to learn? Currently I support only "
                + SupportedModules.ANCIENT_GREECE.toString()  + " History";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("WelcomeToApp", speechText)
                .build();
    }

}