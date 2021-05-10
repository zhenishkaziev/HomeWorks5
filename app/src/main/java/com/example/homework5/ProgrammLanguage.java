package com.example.homework5;

public class ProgrammLanguage  {

 private String name, description;
 private  int image;


    public ProgrammLanguage(String name, int image, String description) {
        this.name = name;
        this.image = image;
        this.description = description;
    }



    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
    }


