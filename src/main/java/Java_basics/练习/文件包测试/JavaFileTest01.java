package Java_basics.练习.文件包测试;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class JavaFileTest01 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\HUAWEI\\Desktop\\Java1\\src\\练习\\文件包测试");
        File f1=new File("./");
        System.out.println(file.exists()); //判读该文件目录是否存在
        System.out.println(file.isDirectory()); //判断是否存在子目录
        System.out.println(Arrays.toString(file.listFiles()));  //获取子目录的文件名
        System.out.println(file.isFile());  //判断是否为单文件
        System.out.println(file.getAbsolutePath());//返回该文件的绝对路径
        System.out.println(f1.getAbsolutePath());
        System.out.println("——————————————————————————分割线——————————————————————————");
        display(file);
//        file.delete();//删除目录
        File f2=new File("C:\\Users\\HUAWEI\\Desktop\\Java1\\src\\练习\\文件包测试\\空目录");
        remove(f2);
    }
    /*
    获取目录下的所有文件，包括子目录下的文件
     */
    public static void display(File file){
        if (!file.exists()){
            System.out.println("目录不存在");
        } else if (file.isFile()) {
            System.out.println("    "+file.getAbsolutePath());

        }else {
            File[] files=file.listFiles();
            if (files != null) {
                for (File f:files){
                    if (f.isFile()){
                        System.out.println("    "+f.getAbsolutePath());

                    }else {
                        display(f);
                    }
                }
            }
        }
    }
    /*
    删除给定目录下的空目录（包含子目录下的空目录）
     */
    public static void remove(File file) {
        // 判断是否为空目录
        if (file.isDirectory() && Objects.requireNonNull(file.listFiles()).length == 0) {
            file.delete();
            System.out.println("删除空目录：" + file.getAbsolutePath());
            remove(file.getParentFile());

        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    remove(f);
                }
            }
        }
    }


}
//    将一个音频文件复制一份
class FileCopy {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        try (
                InputStream is = new FileInputStream("C:\\Users\\HUAWEI\\Desktop\\Java1\\src\\练习\\文件包测试\\test.mp3");
                OutputStream os = new FileOutputStream("C:\\Users\\HUAWEI\\Desktop\\Java1\\src\\练习\\文件包测试\\test.mp3");
        ) {
            byte[] buffer = new byte[1024 * 1024];  // 1M
            int num = -1;
            while ((num = is.read(buffer)) != -1) {
                os.write(buffer, 0, num);
            }
            System.out.println("文件复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//将一个文本文件复制一份
class FileReaderFileWriter {
    public static void main(String[] args) {
        try(
                Reader reader=new FileReader("C:\\Users\\HUAWEI\\Desktop\\Java1\\src\\练习\\文件包测试\\test.xt");
                Writer writer = new FileWriter("C:\\Users\\HUAWEI\\Desktop\\Java1\\src\\练习\\文件包测试\\test.xt")
        ){
            char[] buffer=new char[5];
            int num = -1;
            while((num=reader.read(buffer))!=-1){
                System.out.println("当前读取到的内容为：" + new String(buffer,0,num));
                writer.write(buffer, 0, num);
            }
            System.out.println("复制文件成功");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
//复制文件
class BufferedReaderBufferedWriter {
    public static void main(String[] args) {
        try(
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\HUAWEI\\Desktop\\Java1\\src\\练习\\文件包测试\\test.xt"));
                PrintWriter writer=new PrintWriter("C:\\Users\\HUAWEI\\Desktop\\Java1\\src\\练习\\文件包测试\\test.xt");

        ){
            String data = null;
            while((data=reader.readLine())!=null){
                System.out.println("当前读取内容为：" + data);
                writer.println(data);

            }
            System.out.println("复制文件成功");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
//提示用户输入一行英文（比如：hello java），将英文单词的首尾字母大写，其它字母小写，然后逐行保存到文件test.txt中，文件内容为：
class Practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一段英文：");
        String str = input.nextLine();

        String[] arr = str.split("\\s+");

        try (PrintWriter writer = new PrintWriter("C:\\Users\\HUAWEI\\Desktop\\Java1\\src\\练习\\文件包测试\\test.xt");){
            for (String s : arr) {
                String firstLetter = (s.charAt(0)+"").toUpperCase();
                String s_new = firstLetter + s.substring(1,s.length()).toLowerCase();
                System.out.println("当前写入内容为：" + s_new);
                writer.println(s_new);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
