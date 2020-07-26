package com.samupra.alexaculturehistoryapp.cultures.thai;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class ThaiPhilosophyRequestHandler implements RequestHandler {

    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("ThaiPhilosophyIntent"));
    }

    //http://www.bbc.com/travel/story/20151119-can-thailand-teach-us-all-to-have-more-fun#:~:text=Thailand%20is%2C%20of%20course%2C%20a,of%20living%20in%20the%20moment.&text=A%20close%20companion%20to%20sanuk,%E2%80%9D%20or%20%E2%80%9Cno%20problem%E2%80%9D.
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Thailand is, of course, a Buddhist nation, and sanuk is a Buddhist concept, " +
                "a reminder of the impermanence of everything and the importance of living in the moment. " +
                "A close companion to sanuk is the Thai concept of mai pen rai, variously translated as " +
                "“don't bother”, “never mind” or “no problem”";

        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("WelcomeToThaiPhilosophy", speechText)
                .build();
    }

}