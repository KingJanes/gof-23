/**
 *
 *
 * TODO: 2019/7/14 0014     合并写入新文件时会将源数据写入2次并且合并后的数据不能使用
 *
 * */



package StuIO.separteAndMrege;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class MergeMP4 {

    private static final int BYTE_BUF_SICE = 1024 * 1024 * 5;

    public void merge(String sourceFileNamePath , String targetFilePath , String targetFileNameAndSiffix) throws IOException {

        // 关联源文件目录
        File sourceFile = new File(sourceFileNamePath);
            // 间接判断是否为目录
            if ( !sourceFile.isDirectory()) {
                System.out.println("找不到该目录");
                throw new RuntimeException("目录不存在");
            }
            //  创建一个文件过滤器
            FileSuffixFilter fsFileter = new FileSuffixFilter(".port");

            // 取出源目录下的port文件
            File[] files = sourceFile.listFiles();

            // 创建一个AaaayList集合用于存储源目录下的port文件
            ArrayList<FileInputStream> filelist = new ArrayList<FileInputStream>(files.length);

            //遍历port文件将其封装为FileInputStream并存储到ArrayList集合中
            for (File f : files) {
                filelist.add(new FileInputStream(f));

                    if (fsFileter.accept(f)) {
                        filelist.add(new FileInputStream(f));
                    }
            }

         // 通过工具类Collecptions获取一个枚举对象
        Enumeration enums = Collections.enumeration(filelist);

        // 创建一个泛型为FileInputStream类型的迭代器
        Iterator<FileInputStream> fileIt = filelist.iterator();

         //创建一个合并流对象关联存储为port文件的迭代器
        SequenceInputStream sisIn = new SequenceInputStream(new Enumeration<InputStream>() {

            // 重写hasMoreElenents
            @Override
            public boolean hasMoreElements() {
                return fileIt.hasNext();
            }

            // 重写nextElenents
            @Override
            public InputStream nextElement() {
                return fileIt.next();
            }
        });

        // 创建一个输出流对象
        FileOutputStream targetFile = null;

        // 创建一个合并后的文件对象
        File target = null;


            // 初始化合并后的文件对象
        File newFileDir = new File(targetFilePath);

        //如果存在则会自动覆盖 如果不存在则自动创建一个
            if ( ! newFileDir.exists() ) {
                newFileDir.mkdir();
            }
                target = new File(targetFilePath + targetFileNameAndSiffix);

                //如果存在则会自动覆盖 如果不存在则自动创建一个
                if ( ! target.exists() ) {
                    target.createNewFile();
                    System.out.println("新文件是否存在点测试");
                }
                target.createNewFile();

                //初始化新文件输入流对象 并关联文件
                targetFile = new FileOutputStream(target);

                //自定义一个大小为5M的缓冲区
                byte[] bufs = new byte[BYTE_BUF_SICE];

                int line = 0;

                // 记录写入源数据的次数
                int numberTimes = 1;

                //向目的文件写入数据
        /** @// TODO: 2019/7/14 0014   该循环会将源数据写入2次  而且合并后的数据不能使用   */
                while ((line = sisIn.read(bufs)) != -1) {

                    System.out.println(line + "              写入次数；" + numberTimes ++);

                    targetFile.write(bufs, 0, line);
                    targetFile.flush();
                }

                targetFile.close();
                sisIn.close();

    }
}

