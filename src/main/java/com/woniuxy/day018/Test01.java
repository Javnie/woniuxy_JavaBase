package com.woniuxy.day018;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test01 {
    void method01(String filePath, String dirPath) {
        if (filePath == null || dirPath == null) throw new IllegalArgumentException("参数路径不正确");

        File resFile = new File(filePath);
        if (!resFile.exists()) throw new RuntimeException("原始文件不存在");
        File destFile = new File(dirPath + "\\" + resFile.getName());

        if (destFile.exists()) {
            String newPath = dirPath + "\\" + resFile.getName() + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
            destFile = new File(newPath);
            resFile.renameTo(destFile);
        } else resFile.renameTo(destFile);
    }
}
