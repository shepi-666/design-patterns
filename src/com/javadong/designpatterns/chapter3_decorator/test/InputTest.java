package com.javadong.designpatterns.chapter3_decorator.test;

import com.javadong.designpatterns.chapter3_decorator.myio.LowerCaseInputStream;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author DongShaowei
 * @description 测试自己的IO流
 * @date 2022/8/26 15:43
 */
public class InputTest {

    @Test
    public void testInputStream() {
        int c;
        InputStream in = null;
        try {
             in = new LowerCaseInputStream(
                     new BufferedInputStream(
                             new FileInputStream(System.getProperty("user.dir") + "/docs/test.txt")
                     )
             );

             while ((c = in.read()) >= 0) {
                 System.out.print((char) c);
             }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testPath() {
        System.out.println(System.getProperty("user.dir"));
    }
}
