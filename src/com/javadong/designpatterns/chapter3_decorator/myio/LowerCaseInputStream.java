package com.javadong.designpatterns.chapter3_decorator.myio;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author DongShaowei
 * @description 将输入流内的所有的大写字符装换为小写
 * @date 2022/8/26 15:37
 */
public class LowerCaseInputStream extends FilterInputStream {

    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }


    @Override
    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? c :  Character.toLowerCase((char)c);
    }


    @Override
    public int read(byte[] b, int offset, int len) throws IOException {
        int res = super.read(b, offset, len);
        for (int i = offset; i < offset + res; i++) {
            b[i] = (byte)Character.toLowerCase((char) b[i]);
        }
        return res;
    }

}
