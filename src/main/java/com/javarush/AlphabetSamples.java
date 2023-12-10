package com.javarush;

import java.util.ArrayList;
import java.util.Arrays;

public class AlphabetSamples {
    public static final ArrayList<Character> EN_ALPHABET = new ArrayList<>(Arrays.asList('A','B','C','D','E','F','G',
            'H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a',
            'b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','.',
            '\'','\"','!','?'));
    public static final ArrayList<Character> UA_ALPHABET = new ArrayList<>(Arrays.asList('А','Б','Г','Ґ','Д','Е','Є',
            'Ж','З','И','І','Ї','Й','К','Л','М','Н','О','П','Р','С','Т','У','Х','Ф','Ц','Ч',
            'Ш','Щ','Ь','Ю','Я','а','б','в','г','ґ','д','е','є','ж','з','и','і','ї','й','к','л','м','н','о','п','р','с',
            'т','у','х','ф','ц','ч','Ш','Щ','Ь','Ю','Я','.',' ',',','"','\'','«','»','!','?','~','`'));
    public static final ArrayList<String> SIMPLE_WORDS = new ArrayList<>(Arrays.asList("the"," a "," of "," in "," at ",
            " an "," above"," about ","Hi "," is ","will "," later"," are"," they"," this "," you "));
}

