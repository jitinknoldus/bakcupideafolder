package com.spring.javabrains;


public class Triangle {

    private Circle circle;

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public void draw(){
        System.out.println("Drawing Circle");
        System.out.println("Radius  is at: " + this.getCircle().getRadius());
    }

}

















//*******************************************************************************************************
//used for object injection
//public class Triangle {
//
//    private Point pointOne;
//    private Point pointTwo;
//    private Point pointThree;
//
//    public Point getPointOne() {
//        return pointOne;
//    }
//
//    public void setPointOne(Point pointOne) {
//        this.pointOne = pointOne;
//    }
//
//    public Point getPointTwo() {
//        return pointTwo;
//    }
//
//    public void setPointTwo(Point pointTwo) {
//        this.pointTwo = pointTwo;
//    }
//
//    public Point getPointThree() {
//        return pointThree;
//    }
//
//    public void setPointThree(Point pointThree) {
//        this.pointThree = pointThree;
//    }
//
////    public void draw(){
////        System.out.println("PointOne x: " + getPointOne().getX() + " PointOne Y: " + this.pointOne.getY());
////        System.out.println("PointTwo x: " + this.pointTwo.getX() + " PointTwo Y: " + this.pointTwo.getY());
////        System.out.println("PointThree x: " + this.pointThree.getX() + " PointThree Y: " + this.pointThree.getY());
////    }
//    public void draw(){
//        System.out.println("PointOne x: " + getPointOne().getX());
//        System.out.println("PointOne y: " + getPointOne().getY());
//        System.out.println("PointTwo x: " + getPointTwo().getX());
//        System.out.println("PointTwo y: " + getPointTwo().getY());
//        System.out.println("PointThree x: " + getPointThree().getX());
//        System.out.println("PointThree y: " + getPointThree().getY());
//
//    }
//}

//*************************************************************************************************



//used for constructor injection
//public class Triangle {
//
//    private String type;
//    private int side;
//
//    public Triangle(String type, int side) {
//        this.type = type;
//        this.side = side;
//    }
//
//    public Triangle(String type) {
//        this.type = type;
//    }
//
//    public Triangle(int side) {
//        this.side = side;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public int getSide() {
//        return side;
//    }
//
//    //    public void setType(String type) {
////        this.type = type;
////    }
//
//    public void draw(){
//        System.out.println("Drawing Triangle: " + this.getType() + " with side = "  + this.getSide());
//    }
//}
