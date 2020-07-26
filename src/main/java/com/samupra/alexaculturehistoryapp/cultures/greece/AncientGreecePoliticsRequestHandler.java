package com.samupra.alexaculturehistoryapp.cultures.greece;

import java.util.Optional;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import static com.amazon.ask.request.Predicates.intentName;

public class AncientGreecePoliticsRequestHandler implements RequestHandler {

    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AncientGreecePoliticsIntent"));
    }

    // https://www.metmuseum.org/toah/hd/gkru/hd_gkru.htm
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "The government systems of ancient Greece were varied as the Greeks searched for " +
                "the answers to such fundamental questions as who should rule and how? Should sovereignty" +
                " lie in the rule of law, the constitution, officials, or the citizens? " +
                "Not settling on a definitive answer to these questions, government in the ancient Greek world, " +
                "therefore, took extraordinarily diverse forms and, " +
                "across different city-states and over many centuries, " +
                "political power could rest in the hands of a single individual, " +
                "an elite or in every male citizen: democracy - widely regarded as the Greeks' greatest contribution to civilization.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("WelcomeToAncientGreecePolitics", speechText)
                .build();
    }

}
