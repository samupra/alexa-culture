package com.samupra.alexaculturehistoryapp.cultures.greece;

import java.util.Optional;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import static com.amazon.ask.request.Predicates.intentName;

public class AncientGreeceCultureRequestHandler implements RequestHandler {

    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AncientGreeceCultureIntent"));
    }

    // Wikipedia: https://en.wikipedia.org/wiki/Culture_of_Greece
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Greece is widely considered to be the cradle of Western culture and democracy. " +
                "Modern democracies owe a debt to Greek beliefs in government by the people, trial by jury, and equality under the law. " +
                "The ancient Greeks pioneered in many fields that rely on systematic thought, " +
                "including biology, geometry, history, philosophy, and physics. " +
                "They introduced such important literary forms as epic and lyric poetry, history, tragedy, and comedy. " +
                "In their pursuit of order and proportion, the Greeks created an ideal of beauty that strongly influenced Western art.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("WelcomeToAncientGreeceCulture", speechText)
                .build();
    }

}