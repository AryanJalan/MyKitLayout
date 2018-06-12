package aryan.com.mykitapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableRow;

public class Dashboard extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view=inflater.inflate(R.layout.fragment_dashboard,null);
        return view;
      //  final Dashboard fragment=new Dashboard();
       // getFragmentManager().beginTransaction().add(R.id.,fragment).commit();
    }
    public void attendance(View view){
        Intent intent=new Intent(getActivity(),attendance.class);
        getActivity().startActivity(intent);
    }
    public void timetable(View view){
        Intent intent=new Intent(null,timetable.class);
    }
    public void calender(View view){

    }
    public void result(View view){

    }
    public void gallery(View view){

    }
    public void Mysubjects(View view){

    }
    public void placements(View view){

    }
}