package com.patterns.example.ch03.io;

import java.io.*;

/**
 * @author wangrui
 * @date 2020/5/22.
 * @desc
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String path = Test.class.getResource("").toString() + "test";
        path = path.replace("file:/", "");
        path = path.replace("/", "//");
        InputStream lowerCaseInputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(path)));
        int c;
        while ((c = lowerCaseInputStream.read()) > 0) {
            System.out.print((char) c);
        }
    }
  /*  public  String getPath(){
        this.getClass().getClassLoader().getResource().getPath();
    }*/
}
