package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvDo;

    ArrayList<Doitem> alDoList;
    CustomAdapter caDo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDo = findViewById(R.id.ListViewDo);

        alDoList = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2018,7,1);

        Calendar date2 = Calendar.getInstance();
        date2.set(2018,9,22);


        Doitem do1 = new Doitem("MSA",date1);
        Doitem do2 = new Doitem("Go for haircut", date2);
        alDoList.add(do1);
        alDoList.add(do2);


        caDo = new CustomAdapter(this, R.layout.do_item, alDoList);

        lvDo.setAdapter(caDo);

    }
}
