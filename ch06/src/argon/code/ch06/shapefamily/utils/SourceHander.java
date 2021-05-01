package argon.code.ch06.shapefamily.utils;

import argon.code.ch06.shapefamily.entity.Shapable;
import javafx.scene.paint.Color;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.Properties;

public class SourceHander {
    public static SourceHander sourceHander=null;
    private int count;
    public SourceHander(){
        count=0;
    }
    public static SourceHander getinstance() throws IOException {
        if(sourceHander==null)  sourceHander=new SourceHander();
        return sourceHander;
    }
    public Shapable getClasses() throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        var prop= new Properties();
        InputStream inputStream= ClassLoader.getSystemResourceAsStream("Classresource.properties");
        prop.load(inputStream);
        String inc=String.valueOf(getCount());//读入不同的键值对
        System.out.println("inc:"+inc);
        String name=prop.getProperty("name"+inc);
        double x=Double.parseDouble(prop.getProperty("x"+inc));
        double y=Double.parseDouble(prop.getProperty("y"+inc));
        double width=Double.parseDouble(prop.getProperty("width"+inc));
        double length=Double.parseDouble(prop.getProperty("length"+inc));
        Color color=Color.valueOf(prop.getProperty("color"+inc).toUpperCase(Locale.ROOT));
        inputStream.close();//读完文件之后关闭
        var entity=Class.forName("argon.code.ch06.shapefamily.entity."+name);
        var constructor=entity.getConstructor(double.class,double.class,double.class,double.class,Color.class);
        return (Shapable) constructor.newInstance(x,y,width,length,color);
    }

    public void setProperties(String name,String x,String y,String width,String length,String color) throws IOException {
        FileOutputStream oFile = new FileOutputStream("D:\\Java\\code\\course\\ch06\\src\\Classresource.properties", true);
        var prop=new Properties();
        setCount(getCount()+1);
        String inc=String.valueOf(getCount());
        prop.setProperty("name"+inc,name);
        prop.setProperty("x"+inc,x);
        prop.setProperty("y"+inc,y);
        prop.setProperty("width"+inc,width);
        prop.setProperty("length"+inc,length);
        prop.setProperty("color"+inc,color);
        prop.store(oFile,"changed");
        System.out.println("打开成功");
        oFile.close();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
