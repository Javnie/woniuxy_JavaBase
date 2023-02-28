package com.woniuxy.day015;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 根据指定的文件夹名获取所有（包括子文件夹）的文件
 */
public class GetAllFiles {
    public static void main(String[] args) {
        getAllFiles("D:\\IdeaProject\\JavaBase").forEach(System.out::println);
    }

    static List<File> getAllFiles(String path) {
        if (path == null || path.trim().equals("")) throw new IllegalArgumentException("目标路径为空");
        File destFile = new File(path);
        if (!destFile.exists()) throw new IllegalArgumentException("目标路径不存在");

        List<File> dest = new ArrayList<>();

        if (destFile.isFile()) dest.add(destFile);
        else {
            for (File temp : destFile.listFiles()) {
                dest.addAll(getAllFiles(temp.getAbsolutePath()));
            }
        }
        return dest;
    }
}
