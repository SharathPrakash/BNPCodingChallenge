package com.bnp.coding.Coding.Challenge.model;

public class BerlinClock {
    private int hours;
    private int minutes;
    private int seconds;

    public BerlinClock(String time) {
        String[] timeParts = time.split(":");
        this.hours = Integer.parseInt(timeParts[0]);
        this.minutes = Integer.parseInt(timeParts[1]);
        this.seconds = Integer.parseInt(timeParts[2]);
    }

    public String getSeconds() {
        if (seconds % 2 == 0) {
            return "Y";
        } else {
            return "O";
        }
    }

    public String getTopHours() {
        int numTopHoursLights = hours / 5;
        String topHours = "";
        for (int i = 0; i < 4; i++) {
            if (i < numTopHoursLights) {
                topHours += "R";
            } else {
                topHours += "O";
            }
        }
        return topHours;
    }

    public String getBottomHours() {
        int numBottomHoursLights = hours % 5;
        String bottomHours = "";
        for (int i = 0; i < 4; i++) {
            if (i < numBottomHoursLights) {
                bottomHours += "R";
            } else {
                bottomHours += "O";
            }
        }
        return bottomHours;
    }

    public String getTopMinutes() {
        int numTopMinutesLights = minutes / 5;
        String topMinutes = "";
        for (int i = 0; i < 11; i++) {
            if (i < numTopMinutesLights) {
                if ((i + 1) % 3 == 0) {
                    topMinutes += "R";
                } else {
                    topMinutes += "Y";
                }
            } else {
                topMinutes += "O";
            }
        }
        return topMinutes;
    }

    public String getBottomMinutes() {
        int numBottomMinutesLights = minutes % 5;
        String bottomMinutes = "";
        for (int i = 0; i < 4; i++) {
            if (i < numBottomMinutesLights) {
                bottomMinutes += "Y";
            } else {
                bottomMinutes += "O";
            }
        }
        return bottomMinutes;
    }

    public String[] getClock() {
        String[] clock = new String[5];
        clock[0] = getSeconds();
        clock[1] = getTopHours();
        clock[2] = getBottomHours();
        clock[3] = getTopMinutes();
        clock[4] = getBottomMinutes();
        return clock;
    }
}