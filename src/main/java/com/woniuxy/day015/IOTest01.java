package com.woniuxy.day015;

import java.io.*;
import java.nio.file.Files;

public class IOTest01 {
    public static void main(String[] args) {
        try (InputStream is = Files.newInputStream(new File("src\\main\\java\\com\\woniuxy\\day001\\HelloWorld.java").toPath());
             OutputStream os = new FileOutputStream(new File("src\\DocTest\\test01.java"))) {
            byte[] b = new byte[1024];
            int len = 0;
            while ((len = (is.read(b, 0, b.length))) != -1) {
                os.write(b, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
