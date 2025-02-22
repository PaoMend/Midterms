package com.mycompany.rectangle;

public class Rectangle {
    double width;
    double height;
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public double area(){
        return width*height;
    }

    public double perimeter(){
        return 2*(width+height);
    }
    
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(5,21);
        System.out.println("Length: 5");      
        System.out.println("Width: 21");      
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
    }
}
