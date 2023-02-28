package com.woniuxy.day014;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 1、声明方法，获取目录中所有的jpg图片
 * 2、声明方法，删除指定的文件夹（不包含子文件夹）
 * 3、声明方法，将文件移动到指定的文件夹，目标文件夹不存在，则创建之
 */
public class Exercise {
    List<File> getJpgs(String pathname) {
        if (pathname == null) throw new RuntimeException("目标路径为空");
        if (new File(pathname).isFile()) throw new RuntimeException("目标路径为文件");

        List<File> list = new ArrayList<>();
        for (File temp : new File(pathname).listFiles()) {
            if (temp.isDirectory()) getJpgs(temp.getAbsolutePath());
            else if (temp.getName().endsWith(".jpg")) list.add(temp);
        }
        return list;
    }

    void delete(String pathname) {
        if (pathname == null) throw new RuntimeException("目标路径为空");
        if (new File(pathname).isFile()) throw new RuntimeException("目标路径为文件");

        File[] files = new File(pathname).listFiles();
        for (int i = 0; i < files.length; i++) {
            files[i].delete();
        }

        new File(pathname).delete();
    }

    void moveTo(String res, String dest) throws IOException {
        if (res == null || dest == null) throw new RuntimeException("目标路径和起始路径为空");
        if (!new File(res).exists()) throw new RuntimeException("原始文件不存在");

        File file = new File(dest);
        if (!file.exists()) {
            file.mkdirs();
            file.createNewFile();
        }
        new File(res).renameTo(file);
    }
}


