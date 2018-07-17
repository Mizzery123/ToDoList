package sg.edu.rp.c346.todolist;

import java.util.Calendar;

/**
 * Created by 17000719 on 17/7/2018.
 */

public class Doitem {
    private String name;
    private Calendar date;


    public Doitem(String name, Calendar date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getDateString() {



        String str= date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);
        return str;
    }


    @Override
    public String toString() {
        return "Doitem{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

}
