package StuIO;

/**
 *      需求 计算程序运行的次数 如果 超过5次 则 提升 次数已到 不能继续运行
 *
 *          1. 从配置文件上获取运行次数
 *
 *          2. 判断次数是否满足5次
 *
 *          3  修改次数并保存到配置文件
 *
 *
 *
 * */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class JudgeConent{


    // KYE 表示读取配置文件的键
    private final String KEY = "conent";

    // SUPLIMIT 表示程序运行次数的上限
    private final int SUPLIMIT = 5;

    // 默认次数 当文件不存在是 会写入该默认次数
    private final int  DEFAULT = 1;

    public void judgeTimes () throws IOException {

        // 关联文件
        File file = new File ("C:\\Users\\Administrator\\IdeaProjects\\StuJAVA\\StuIO\\propertis.ini");

        // 创建一个properties 集合
        Properties porper = new Properties();

        // 判断配置文件是否存在 如果不存在则创建一个新文件 并写入默认次数
        if (!file.exists()) {
//            file.mkdirs();
            file.createNewFile();

            porper.setProperty(KEY, String.valueOf(DEFAULT));

        }

        //  创建一个输入字节流对象并与 配置文件对象关联
        FileInputStream fileIn = new FileInputStream(file);

        // 将配置文件信息加载到内存种
        porper.load(fileIn);

        // 获取配置文件中程序运行的次数
        int conent = Integer.parseInt(porper.getProperty(KEY));

        // 判断运行次数是否到达上限 如果运行次数超过侧抛出异常
        if (SUPLIMIT < conent) {

            System.out.println("您使用的次数超过体验次数");

            throw new RuntimeException("使用的次数超过体验次数");
        }
        //  显示当前运行次数和剩余运行次数
        System.out.println("您也使用了"+conent+"次  目前还剩"+ (SUPLIMIT-conent) +"次");

        //对运行次数自增
        conent ++;

        // 创建一个输出流并关联配置文件
        FileOutputStream fileOut = new FileOutputStream(file);

        //将修改后的程序运行次数存入集合
        porper.setProperty(KEY,String.valueOf(conent));

        // 将集合写入输出流   ！！ 注意 该方法使用IOS 8859-1 编码  使用中文会保存U码
        /**注释中不在拉丁文-1中的字符写为 u xxxx ，用于其相应的unicode十六进制值xxxx*/

        porper.store(fileOut ,"程序使用次数表");

        // 关闭输入流和输出流资源
        fileOut.close();
        fileIn.close();

    }


}
