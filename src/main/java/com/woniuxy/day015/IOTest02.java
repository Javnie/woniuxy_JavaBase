package com.woniuxy.day015;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOTest02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("src\\DocTest\\test02.txt"))) {
            String s = null;
            while ((s = reader.readLine()) != null) {
                list.add(s);
            }
            list.sort((s1, s2) -> s1.length() - s2.length());
//          list.sort(String::compareTo);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src\\DocTest\\test02.txt"))) {
            for (String temp : list) {
                writer.write(temp);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
