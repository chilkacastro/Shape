/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import java.util.Random;

/**
 * 
 * @author Chilka Castro
 */
public class Rectangular {
    private int width;
    private int length;
    private String color;
    private static int numOfSide = 4;    // how many sides are there in a rectangle? 4 and every object has this same value (4)
    // don't put private double area;  -> if people change this it will also affect the others 
    // dont put double perimeter; 
    // private int area;
    
    // Both of these could affect all the other data members.
    
    /**
     * default constructor                          // -> initialize width and length with two random numbers (1, 10]
     */                                         
    public Rectangular() {                          // default constructor has an initialzed value that doesn't come from the outside
        Random rand = new Random();
        
        int minNum = 1;
        int maxNum = 10;
        
        this.width = rand.nextInt(maxNum - minNum + 1) + minNum;
        this.length = rand.nextInt(maxNum - minNum + 1) + minNum;
        this.color = "black";
    }
    
    /**
     * constructor with all members
     * @param width the width of a rectangular
     * @param length the length of a rectangular
     * @param color the color of the rectangular
     */
    public Rectangular(int width, int length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }
    
    /**
     * Copy constructor
     * @param rectangular another rectangular
     */
    public Rectangular(Rectangular rectangular) {
        this.width = rectangular.width;
        this.length = rectangular.length;
        this.color = rectangular.color;
    }
    
    /**
     * To calculate the area of a rectangular
     * @return the area of a rectangular
     */
    public int calcArea() {         // no more static like procedural programming
        return width * length;      // you write this method in the class, so this method calcArea() can see the other data members
       // directly reading the data members    // can read the other values.. so no need to give the parameter here because in OOP it can directly read the data members
                                               // this method should be applied in object level

//----------------------------------
    /* With procedural programming
     
    public static int calcArea(int width, int length) {
        return width * length;
    
    }

    if you have a data member private int area (line21)
    
    public void calcArea() {                // change int to void  | if calculating the area; who's area to calculate? this rectangle1 or this rectangle2
        area = width * length;              // remove the return   | because I need to read this rectangle's width and this rectangle's length --> a specific object's width and length
                                            
    }

    
    
    // When you write special method in the class-> remove static for now
    // Sometimes when you write a specific method in a class, sometimes you want to update
    the parameters and also you want to change the return type.--> make it a void sometimes
    // general rule: if you need a value but that value is data member, you don't pass it--> no paramater because you could read it
    */
    }
    
    /**
     * To calculate the perimeter of a rectangular
     * @return the perimeter of a rectangular
     */
    public int calcPerimeter () {
        return (width + length) * 2;
        
    }
    
    /**
     * To compare two rectangular
     * @param rectangular another rectangular
     * @return if the two rectangular are the same
     */
    public boolean equals(Rectangular rectangular) {        // compare two objects -> because both width and length are compared
        return this.width == rectangular.width && this.length == rectangular.length
                && this.color.equals(rectangular.color);
    }
    
    /**
     * To generate a string to represent the rectangular
     * @return a string to represent the rectangular
     */
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-10s: %d\n", "Width", width);
        str += String.format("%-10s: %d\n", "Length", length);
        str += String.format("%-10s: %s\n", "Color", color); 
        str += String.format("%-10s: %d\n", "Area", calcArea());  
        str += String.format("%-10s: %d\n", "Perimeter", calcPerimeter()); 
       
        
        return str;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}


/* default constructor -> init width and length with two random numbers [1, 10]
                     -> init the color to black

    copy constructor 
    equals(Rectangular rectangular)

    toString (not the default one)

    getter setter 
    
*/


/* 

- when you create a class you have a blueprint 
- one class many objects
  
ex: if there is one class there is 1000 objects how many width are there? 1000 widths too because each object has their own width
    each object will have their own width, length and color.

    - the data member will belong to the object for the case of the length, width and color because there is 1000 objects and 1 class
    - data members belong to each object, every data, my account 

private int width;
private int length;
private String color;           // this three are applied on object level

- every data members belong to the object, every object has its own width has its own length and have its own color; it is not shared

When you call a constructor, you create an object
main of another class

-----------------------------------------------------------------

    - one single value shared by everyone -> belong to the class

    private int width;          // object level-> non -static   --> belong to the object
    private int length;         // object level
    private String color;       // object level
    private static int numOfSide = 4;   // class level --> only single value stored in there because no matter how many objects ypu create, there is only one single class. So in this case, if I create on a class level
                                        then there will be only one copy stored, even though there are a 1000 objects--> only one number of sides
                                        // static belong to the class


the private static int numOfSide shouldnt be initialized in a constructor because it is always the same value
- when u say static it isnt a data member anymore it belongs to the class which means every object should share the same value 
- initialize it directly(not in constructor)
------------------------------------------------------------------



The purpose of using a constructor is to initialize all the data member and its on object level. So it 
                                            



*/