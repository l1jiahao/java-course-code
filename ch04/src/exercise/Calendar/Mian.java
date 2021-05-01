package exercise.Calendar;

import exercise.Calendar.entity.Calendar;
import javafx.application.Application;
import javafx.stage.Stage;

public class Mian {

    public static void main(String[] args) {
        var calendar=new Calendar();
        System.out.println(calendar.getCalendarStr(2021,4));
    }
}
