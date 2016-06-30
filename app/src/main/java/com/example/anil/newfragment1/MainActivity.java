package com.example.anil.newfragment1;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity implements listFragment.animalListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void itemClicked(long id) {
        AnimalDetails animalDetails= new AnimalDetails();
        FragmentTransaction tr= getFragmentManager().beginTransaction();
        animalDetails.setId(id);
        tr.replace(R.id.container,animalDetails);
        tr.addToBackStack(null);
        tr.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        tr.commit();
    }
}
