package com.demo.javademo.io.file;

import java.io.*;

public class FileDemo {

    public static void main(String[] args) {
        listAllFiles(new File("/Users/nicole317/project/LeetcodeTrial"));
    }


    public static void listAllFiles(File dir) {
        if (dir == null || !dir.exists()) {
            return;
        }
        if (dir.isFile()) {
            System.out.println(dir.getName());
            return;
        }
        for (File file : dir.listFiles()) {
            listAllFiles(file);
        }
    }

    public static void copyFile(String src, String dist) throws IOException {
        FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(dist);
        byte[] buffer = new byte[20 * 1024];
        // read() 最多读取 buffer.length 个字节
        // 返回的是实际读取的个数
        // 返回 -1 的时候表示读到 eof，即文件尾
        while (in.read(buffer, 0, buffer.length) != -1) {
            out.write(buffer);
        }
        in.close();
        out.close();
    }


    public static void readFileContent(String filePath) throws IOException {
        /**
         * 编码就是把字符转换为字节，而解码是把字节重新组合成字符。
         */
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        // 装饰者模式使得 BufferedReader 组合了一个 Reader 对象
        // 在调用 BufferedReader 的 close() 方法时会去调用 fileReader 的 close() 方法
        // 因此只要一个 close() 调用即可
        bufferedReader.close();
    }
}
