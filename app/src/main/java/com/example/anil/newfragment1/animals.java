package com.example.anil.newfragment1;

/**
 * Created by anil on 30/06/16.
 */
public class animals {

    private String name;
    private String description;
    public static final animals [] animls1 = { new animals("cat", "this is cat"),
            new animals("Dog", "This is dog")


    };
    animals(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String getDescription()
    {

        return  description;

    }
    public String getName()
    {

        return  name;

    }


}
