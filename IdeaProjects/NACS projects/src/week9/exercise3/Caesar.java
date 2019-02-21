package week9.exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Caesar {

    protected String cipher(String message, int shift) {
        String cipheredWord = "";
        for (int position = 0; position < message.length(); position++) {
            char character = (char) (message.charAt(position) + shift);
            if (character > 'z')
                cipheredWord += (char) (message.charAt(position) - (26 - shift));
            else
                cipheredWord += (char) (message.charAt(position) + shift);
        }
        return cipheredWord.toUpperCase();
    }
}

