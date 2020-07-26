package com.samupra.alexaculturehistoryapp.cultures.thai;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class ThaiCultureRequestHandler implements RequestHandler {

    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("ThaiCultureIntent"));
    }

    // Wikipedia: https://en.wikipedia.org/wiki/Culture_of_Thailand
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "" +
                "The culture of Thailand has evolved greatly over time, from its relative isolation during the " +
                "Sukhothai era, to its more contemporary Ayutthaya era, " +
                "which absorbed influences from all over Asia. Limited Indian, Chinese, " +
                "Burmese and other Southeast Asian influences are still evident in traditional Thai culture." +
                "Buddhism, Animism and Westernization also play a significant role in shaping the modern culture.";

        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("WelcomeToThaiCulture", speechText)
                .build();
    }

}