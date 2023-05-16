package school.mjc.stage0.conditions.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String simvol = Character.toString(character);

        Matcher match1 = Pattern.compile("[aioeuyAIOEUY]").matcher(simvol);
        Matcher match2 = Pattern.compile("[a-zA-Z]").matcher(simvol);
        if (match1.find()) {
            System.out.println("Vowel");
        } else if (match2.find()) {
            System.out.println("Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
