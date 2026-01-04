package com.stackandqueue.circulartour;

public class CircularTour {

    static int findStartingPoint(PetrolPump[] pumps) {
        int start = 0, surplus = 0, deficit = 0;

        for (int i = 0; i < pumps.length; i++) {
            surplus += pumps[i].petrol - pumps[i].distance;

            if (surplus < 0) {
                deficit += surplus;
                start = i + 1;
                surplus = 0;
            }
        }

        return (surplus + deficit >= 0) ? start : -1;
    }
}