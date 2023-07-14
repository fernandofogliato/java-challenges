package br.com.fogliato.miscellaneous;

import java.util.Arrays;

public class TandemBicycle {

    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);

        int idxRed = fastest ? redShirtSpeeds.length-1 : 0;
        int idxBlue = idxRed;
        int idx = 0;
        int totalSpeed = 0;
        while (idx < redShirtSpeeds.length) {
            int redSpeed = redShirtSpeeds[idxRed];
            int blueSpeed = blueShirtSpeeds[idxBlue];

            if (fastest) {
                if (redSpeed > blueSpeed) {
                    idxRed--;
                } else {
                    idxBlue--;
                }
            } else {
                idxRed++;
                idxBlue++;
            }
            totalSpeed += Math.max(redSpeed, blueSpeed);
            idx++;
        }

        return totalSpeed;
    }
}
