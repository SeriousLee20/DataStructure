
/*
 * Author: Hui Xin
 * 07 Feb 2021
 */

import java.util.Random;

public class rand {
    public static void main(String[] args) {
        String[] ran = {"FF", "JP", "TH", "WEST"};

        Random rn = new Random();

        System.out.println(ran[rn.nextInt(4)]);

    }
}
