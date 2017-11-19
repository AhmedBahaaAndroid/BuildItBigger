package com.example;

import java.util.Random;

public class Joker {

    private static final String[] jokes = {
            "Q: Why did the witches' team lose the baseball game?\n" +
                    "A: Their bats flew away. ",
            "Wife: \"In my dream, I saw you in a jewelry store and you bought me a diamond ring.\"\n" +
                    "Husband: \"I had the same dream and I saw your dad paying the bill.\" ",
            "Q: Why did Adele cross the road?\n" +
                    "A: To sing, \"Hello from the other side! ",

    };

    public  String getJoke(){
        int size = jokes.length;

        Random r = new Random();
        int index = r.nextInt(size);

        return jokes[index];
    }

}
