package c346.rp.edu.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvTODO;
    ArrayList<ToDo> TODOList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTODO = findViewById(R.id.listViewTODO);
        TODOList = new ArrayList<>();

        TODOList.add(new ToDo("MSA", "1/7/2019"));
        TODOList.add(new ToDo("Go for Haircut", "22/9/2019"));

        adapter = new CustomAdapter(this, R.layout.row, TODOList);

        lvTODO.setAdapter(adapter);
    }
}
