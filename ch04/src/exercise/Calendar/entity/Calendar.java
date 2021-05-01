package exercise.Calendar.entity;

import java.time.LocalDate;

public class Calendar {
    /**
     * Leap year
     * @param year
     * @return
     */
    public boolean isLeapYear(int year){
        return (year%400==0)||(year%4==0&&year%100!=0);
    }
    /**
     * 获得month的天数
     * @param year
     * @param month
     * @return
     */
    public int getDays(int year,int month){
        switch(month){
            case 1,3,5,7,8,10,12:return 31;
            case 2: return (isLeapYear(year))?29:28;
            default:return 30;
        }
    }
    /**
     * 求每个月第一天的星期数
     * @param year
     * @param month
     * @return
     */
    public int getFirstWeek(int year,int month){
        LocalDate date = LocalDate.of(year,month,1);
        return  date.getDayOfWeek().getValue();
    }
    /**
     * 打印输出日历
     * @param year
     */

    public void print(int year){
        System.out.printf("%10s年\n",year);
        for(int month=1;month<13;month++){
            System.out.printf("\n%10s月\n",month);
            System.out.println("\n日 一  二  三  四  五   六");
            int firstWeek=getFirstWeek(year,month);
            System.out.printf("%"+(firstWeek*3)+"s"," ");
            for(int day =1 ; day<=getDays(year,month);day++){
                if((day+firstWeek-1)%7==0)//换行
                    System.out.println();
                System.out.printf("%3d",day);
            }
        }
    }

    /**
     *请定义getCalendarStr方法
     * @param year 年份
     * @param
     */
    public String getCalendarStr(int year,int month){
        StringBuffer calendarStr=new StringBuffer(String.format("%10s月\n",month));
        calendarStr.append("\n  日  一  二  三 四  五 六\n");
        calendarStr.append(String.format("%"+(getFirstWeek(year,month)*5)+"s"," "));
        for(int day =1 ; day<=getDays(year,month);day++){
            if((day+getFirstWeek(year,month)-1)%7==0)//换行
                calendarStr.append("\n");
            if(day<10){
                calendarStr.append(String.format("%4d", day));//可以在此处判断days是否小于十 小于十的刷则修改
            }else {
                calendarStr.append(String.format("%3d", day));
            }
        }
        return calendarStr.toString();
    }
}
