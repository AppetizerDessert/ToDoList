package c346.rp.edu.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ToDo> TODOList;

    public CustomAdapter(Context context, int resource,ArrayList<ToDo> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.TODOList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvTask = rowView.findViewById(R.id.textViewTask);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);


        // Obtain the Android Version information based on the position
        ToDo currentVersion = TODOList.get(position);

        // Set values to the TextView to display the corresponding information
        tvTask.setText(currentVersion.getTask());
        tvDate.setText(currentVersion.getDate());


        return rowView;
    }
}
