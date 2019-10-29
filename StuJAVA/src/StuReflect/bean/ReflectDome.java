package StuReflect.bean;

import bean.Student;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//C:\Users\Administrator\IdeaProjects\StuJAVA\src\bean\Student.java
public class ReflectDome {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        new ReflectDome().demo();
    }

    public void demo() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {


//        File f = new File("D:\\Student.java");
//        System.out.println(f.exists());
//*/
        Class<Student> classObj = (Class<Student>) Class.forName("bean.Student");

        Student stu = classObj.newInstance();

       Method method =  classObj.getMethod("getName" ,null);

       method.invoke(stu);

            System.out.println(method);
    }
}
