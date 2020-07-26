package com.samupra.alexaculturehistoryapp.cultures.greece;

import java.util.Optional;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import static com.amazon.ask.request.Predicates.intentName;

public class AncientGreeceScienceRequestHandler implements RequestHandler {

    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AncientGreeceScienceIntent"));
    }

    //https://www.ancient.eu/Greek_Science/
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "The achievements of ancient Greek science were amongst the finest in antiquity. " +
                "Building on Egyptian and Babylonian knowledge, figures such as Thales of Miletus, Pythagoras, " +
                "and Aristotle developed ideas in mathematics, astronomy, and logic " +
                "that would influence Western thought, science, and philosophy for centuries to come. " +
                "Aristotle was the first philosopher who developed a systematic study of logic, " +
                "an early form of evolution was taught by such figures of Greek philosophy as Anaximander and Empedocles, " +
                "and Pythagoras' mathematical theorem is still used today.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("WelcomeToAncientGreeceScience", speechText)
                .build();
    }

}