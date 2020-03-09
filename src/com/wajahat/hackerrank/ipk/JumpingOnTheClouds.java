package com.wajahat.hackerrank.ipk;

/**
 * Created by Syed Wajahat on 3/6/2020.
 * Emma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds
 * are thunderheads and others are cumulus. She can jump on any cumulus cloud having a number that is equal
 * to the number of the current cloud plus 1 or 2. She must avoid the thunderheads. Determine the minimum
 * number of jumps it will take Emma to jump from her
 */
public class JumpingOnTheClouds {
    public static void main(String[] args) {
        int[] c = {0, 0, 0, 0, 1, 0};
        System.out.print(jumpingOnClouds(c));
    }

    static int jumpingOnClouds(int[] c) {
        int turns = 0;
        for (int i = 1; i < c.length;) {
            if (c[i] == 0) {
                if (i + 1 < c.length && c[i + 1] == 0) {
                    turns++;
                    i += 2;
                } else {
                    turns++;
                    i++;
                }
            } else {
                if (i + 1 < c.length && c[i + 1] == 0) {
                    turns++;
                    i += 2;
                }
            }
        }
        return turns;
    }
}
