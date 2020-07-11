package com.samupra.alexaculturehistoryapp;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.samupra.alexaculturehistoryapp.greece.*;

public class HistoryStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelAndStopIntentHandler(),
                        new GenericHistoryRequestHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new AncientGreeceHistoryRequestHandler(),
                        new AncientGreeceCultureRequestHandler(),
                        new AncientGreecePhilosophyRequestHandler(),
                        new AncientGreecePoliticsRequestHandler(),
                        new AncientGreeceScienceRequestHandler())
                .withSkillId("amzn1.ask.skill.9e14da97-88d4-48de-a7c3-46236a294a11")
                .build();
    }

    public HistoryStreamHandler() {
        super(getSkill());
    }

}