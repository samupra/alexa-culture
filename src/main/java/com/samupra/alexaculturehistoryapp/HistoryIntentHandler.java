package com.samupra.alexaculturehistoryapp;

import java.util.Optional;import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import static com.amazon.ask.request.Predicates.intentName;

public class HistoryIntentHandler implements RequestHandler {

    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("LaunchHistoryIntent"));
    }

    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Hello. What would you like to learn about today?";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("WelcomeToApp", speechText)
                .build();
    }

}