package ru.luxtington.oop.geometry.points.interestingPoint;

public class Color extends Attribute{

    public Color(String value){
        super("Color", value);
    }

    public String getValue(){
        return (String)super.getValue();
    }
}
