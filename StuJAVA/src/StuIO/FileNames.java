/***
 *
 *      需求 将一个目录下所有指定的文件获取并贮存到集合中 并将这个集合内的所有的文件名字 已经路径写入文本文件
 *
 *          1 获取目录
 *
 *
 */


package StuIO;

import java.io.*;
import java.util.ArrayList;

public class FileNames {

    //定义一个内部文件名过率器
    private FileSuffixFilter fSfuu = null;

    // 定义一个私有集合容器
    private ArrayList<File> arrayFiles = null;

    public ArrayList<File> fileNames(String dir , String fileSuffix ) {

        // 间接判断目录以及文件名后缀名 防止空指针异常
        if (dir == null || fileSuffix == null) {

            throw new RuntimeException("非法参数传递 ");
           }

                // 获取传入目录的目录 并封装成文件对象
                File file = new File(dir);

        // 判断该目录是否存在
        if ( !file.isDirectory()) {

            throw new RuntimeException("该目录不存在不");
        }

        //  初始化文件名过率器
        fSfuu = new FileSuffixFilter(fileSuffix);

        // 初始化集合容器
        arrayFiles = new ArrayList<File>();

        // 将目录以及过略传入并进行递归深度遍历
        getFiles(file , fSfuu);

        //  返回目录下所有的文集集合  结束该小功能
        return arrayFiles;
    }

    private void getFiles(File files ,FileSuffixFilter fSfuu) {

        // 获取传入的目录并重新封装为文件对象
        File[] f = files.listFiles();

            //  取出文件并进行判断
            for(File fileName : f) {

                //  如果该文件对象是目录则进行递归
                if(fileName.isDirectory()){

                    getFiles(fileName,fSfuu);

                } else {
                    // 如果是文件测获取该文件的文件会将名字传入过略器进行文件名过略
                        if(fSfuu.accept(fileName ,fileName.getName())){

                            // 拿到符合过略器条件的文件 并存储到集合容器种
                            arrayFiles.add(fileName);
                        }
                }
            }
    }


    /***
     *      功能： 将集合容器内的文件名写入到指定目录下的文件 如果没有测重新创建
     *
     *
     * @param listfile  内部集合容器预期里面应该存入文件对象
     *
     * @param purpose  文件名写入的目的地
     */
    public void WriterToFile(ArrayList<File> listfile ,File purpose) {

        // 创建一个字符流缓冲区
        BufferedWriter buffw = null;

        try {
            // 初始化缓冲区 并关联目的地文件
            buffw = new BufferedWriter(new FileWriter(purpose));

            //虚幻取出集合内的文件
            for(File list : listfile) {

                // 获取文件的绝对路径 并写入目的地文件增加换行以及刷新流
                buffw.write(list.getAbsolutePath());
                buffw.newLine();
                buffw.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            // 关闭流资源
            if ( buffw != null ){
                try {
                    buffw.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}



class FileSuffixFilter implements FilenameFilter {

    /**    定义一个按照制度后缀名文件的文件过略器
     *
     ** @param suffix  需要过略的文件后缀名
      */

    private String suffix = null;

    public FileSuffixFilter(String suffix){

        super();

        this.suffix = suffix;
    }

    @Override
    public boolean accept(File dir, String name) {

        // 调用String类的endsWith函数进行过略
        return name.endsWith(suffix);
    }
}
