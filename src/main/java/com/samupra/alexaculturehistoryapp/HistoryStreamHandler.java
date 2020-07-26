package com.samupra.alexaculturehistoryapp;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.samupra.alexaculturehistoryapp.cultures.greece.*;
import com.samupra.alexaculturehistoryapp.cultures.thai.*;
import com.samupra.alexaculturehistoryapp.learning.ProgressTrackingIntent;

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
                        new AncientGreeceScienceRequestHandler(),
                        new ThaiHistoryRequestHandler(),
                        new ThaiCultureRequestHandler(),
                        new ThaiPhilosophyRequestHandler(),
                        new ThaiPoliticsRequestHandler(),
                        new ProgressTrackingIntent())
                .withSkillId("amzn1.ask.skill.9e14da97-88d4-48de-a7c3-46236a294a11")
                .build();
    }

    public HistoryStreamHandler() {
        super(getSkill());
    }

}