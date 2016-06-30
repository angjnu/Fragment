package com.example.anil.newfragment1;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AnimalDetails extends Fragment {

long detailID;
    public AnimalDetails() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_animal_details, container, false);
    }
    public void onStart(){
        super.onStart();
        View v= getView();
        if (v!=null){
            TextView textView = (TextView)v.findViewById(R.id.text1);
            textView.setText( animals.animls1[(int) detailID].getName().toString());
            TextView textView2 = (TextView)v.findViewById(R.id.text2);
            textView2.setText(animals.animls1[(int) detailID].getDescription().toString());

        }

    }

    void setId(long id)
    {

        detailID = id;
    }

}
