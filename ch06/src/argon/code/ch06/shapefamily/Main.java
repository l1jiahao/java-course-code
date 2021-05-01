package argon.code.ch06.shapefamily;

import argon.code.ch06.shapefamily.entity.Rectangle;
import argon.code.ch06.shapefamily.utils.SourceHander;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IOException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
       var prop=new Properties();
       prop.setProperty("test","ok");
       prop.store(new FileOutputStream("D:\\Java\\code\\course\\ch06\\src\\Classresource.properties"),"ok");
    }
}
