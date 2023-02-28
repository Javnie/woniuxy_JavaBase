package com.woniuxy.day016;

import com.woniuxy.day013.User;

import java.io.*;

public class SerializableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User("Jack", 20);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\DocTest\\test04"));
        oos.writeObject(user);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\DocTest\\test04"));
        User newOne = (User) ois.readObject();
    }
}
