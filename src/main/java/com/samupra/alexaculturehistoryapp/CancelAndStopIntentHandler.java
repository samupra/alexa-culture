package com.samupra.alexaculturehistoryapp;

import java.util.Optional;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import static com.amazon.ask.request.Predicates.intentName;
import com.amazon.ask.model.Response;


public class CancelAndStopIntentHandler implements RequestHandler {

    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AMAZON.StopIntent").or(intentName("AMAZON.CancelIntent")));
    }

    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Thank you. Goodbye";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Goodbye", speechText)
                .build();
    }
}
