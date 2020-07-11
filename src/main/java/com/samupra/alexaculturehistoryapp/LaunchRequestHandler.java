package com.samupra.alexaculturehistoryapp;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class LaunchRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.requestType(LaunchRequest.class));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Welcome to the Alexa Learning History Application. " +
                "Please specify which culture you would like to learn?" +
                "Currently, I support only" + SupportedModules.ANCIENT_GREECE.toString().replace("_", "") + " History";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("HelloToApp", speechText)
                .withReprompt(speechText)
                .build();
    }

}