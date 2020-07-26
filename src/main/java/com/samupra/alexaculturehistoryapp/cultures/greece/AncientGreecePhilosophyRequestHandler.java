package com.samupra.alexaculturehistoryapp.cultures.greece;

import java.util.Optional;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import static com.amazon.ask.request.Predicates.intentName;

public class AncientGreecePhilosophyRequestHandler implements RequestHandler {

    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AncientGreecePhilosophyIntent"));
    }

    //https://www.iep.utm.edu/greekphi/
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "From Thales, who is often considered the first Western philosopher, to the Stoics and Skeptics, " +
                "ancient Greek philosophy opened the doors to a particular way of thinking " +
                "that provided the roots for the Western intellectual tradition. " +
                "Here, there is often an explicit preference for the life of reason and rational thought." +
                " We find proto-scientific explanations of the natural world in the Milesian thinkers, " +
                "and we hear Democritus posit atoms—indivisible and invisible units—as the basic stuff of all matter. " +
                "With Socrates comes a sustained inquiry into ethical matters—an orientation towards human living " +
                "and the best life for human beings.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("WelcomeToAncientGreecePhilosophy", speechText)
                .build();
    }

}