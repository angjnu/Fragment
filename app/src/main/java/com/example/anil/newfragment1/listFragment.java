package com.example.anil.newfragment1;


import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class listFragment extends ListFragment {

static interface animalListener {
    void itemClicked(long id);
}
    public listFragment() {
        // Required empty public constructor
    }
private  animalListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       String[] name = new String[animals.animls1.length];
        for(int i=0;i< name.length; i++){
            name[i]=animals.animls1[i].getName();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1,name);
        setListAdapter(adapter);
        return super.onCreateView(inflater,container,savedInstanceState);

    }

    public void onListItemClick(ListView l, View v, int position, long id) {
        if (listener != null){
            listener.itemClicked(id);
        }
    }
    public void onAttach(Activity activity){
        super.onAttach(activity);
        this.listener = (animalListener)activity;
    }
    }