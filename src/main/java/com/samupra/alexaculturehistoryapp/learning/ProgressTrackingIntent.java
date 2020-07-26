package com.samupra.alexaculturehistoryapp.learning;

import java.util.Optional;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import static com.amazon.ask.request.Predicates.intentName;

public class ProgressTrackingIntent implements RequestHandler {

    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("ProgressTrackingIntent"));
    }


    public Optional<Response> handle(HandlerInput input) {
        String speechText = "I would be happy to help you track your progress." +
                "At this stage. I can only help you track your progress in learning AncientGreece and Thai culture" +
                "There are currently 4 modules supported in Ancient Greece" +
                "1. Culture" +
                "2. Philosophy" +
                "3. Politics" +
                "4. Science" +
                ". For each module that you have learnt, you will be 25% along the way of your learning." +
                "There are currently 3 modules supported in Thai Culture" +
                "1. Culture" +
                "2. Philosophy" +
                "3. Politics" +
                "To ensure completeness, please learn all the modules. To do that, say Alexa, I want to learn Ancient Greece History" +
                " or Alexa, I want to learn Thai History" + ". Thank you";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("WelcomeToProgressTracking", speechText)
                .build();
    }

}