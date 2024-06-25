import java.util.*;
import java.io.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int[] mountainHeights = new int[8];
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt();
                mountainHeights[i] = mountainH;
                System.err.println("Mountain Index " + i + " Mountain height: " + mountainHeights[i]);
            }

            int highestMountainIndex = findHighestMountain(mountainHeights);

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            System.out.println(highestMountainIndex); // The index of the mountain to fire on.
        }
    }

    public static int findHighestMountain(int[] heights) {
        int highest = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[highest]) {
                highest = i;
            }
        }
        return highest;
    }
}