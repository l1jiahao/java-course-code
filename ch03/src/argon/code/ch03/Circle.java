package argon.code.ch03;

import java.util.Arrays;

public class Circle {
    private String name;
    private double[] center;
    private double radius;
    public Circle(double[] xy,double r,String name){
        this.center=xy;
        this.radius=r;
        this.name=name;
    }

    public double getRadius() {
        return radius;
    }

    public double[] getCenter() {
        return center;
    }

    public double distance(Circle circle){//计算一个圆的圆心到另一个圆的圆心的距离
        return  Math.sqrt(Math.pow((this.center[0]-circle.center[0]),2)+Math.pow((this.center[1]-circle.center[1]),2));
    }
    public String comparebigRadius(Circle circle){
        return this.radius>circle.radius?this.name:circle.name;
    }
    //根据圆的半径比较哪一个圆较大或者较小
    public String comparesmallRadius(Circle circle){
        return this.radius<circle.radius?this.name:circle.name;
    }

    public static void circleRelation(Circle circle1,Circle circle2){//判断两个圆的关系
        if(Arrays.equals(circle1.getCenter(),circle2.getCenter())){//如果是同心圆
            corrdeCenter(circle1,circle2);
        }else notCenter(circle1,circle2);
    }
    /*
    * 圆心相同的情况
    * */
    public static void corrdeCenter(Circle circle1, Circle circle2){
        if(circle1.getRadius()==circle2.getRadius()){//如果同心圆且半径相等则两圆重合
            System.out.println(circle1.name+"和"+circle2.name+"重合");
        }
        else{
            System.out.printf("%s包含在%s内",circle1.comparesmallRadius(circle2),circle1.comparebigRadius(circle2));
        }
    }
    /*
    * 两圆的圆心不同
    * */
    public static void notCenter(Circle circle1, Circle circle2){
        if(circle1.getRadius()-circle2.getRadius()>=circle1.distance(circle2)){//两圆半径差小于圆心距则一圆在另一圆内

            System.out.printf("%s在%s内",circle1.comparesmallRadius(circle2),circle1.comparebigRadius(circle2));
        }else {
            System.out.println("两个圆既不重叠也不包含");
        }
    }

}
