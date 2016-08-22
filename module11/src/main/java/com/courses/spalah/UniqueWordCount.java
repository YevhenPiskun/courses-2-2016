package com.courses.spalah;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Artem Uskov on 19.08.2016.
 */
public class UniqueWordCount {

    public static void calculateUniqueWord(String input, String output) throws IOException {
        FileWriter writer = new FileWriter(output, true);
        int uniqueCount = 0;
        ArrayList<String> list = CreateArrayList.createArrayList(input);

        for(String word : list) {
            if(Collections.frequency(list, word.toLowerCase()) == 1) {
                uniqueCount++;
            }
        }

        writer.append("Number of unique words - " + Integer.toString(uniqueCount));
        writer.append("\n");
        writer.flush();
        }

    }

