package com.inversionOfControl;

import com.inversionOfControl.Coach;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}
