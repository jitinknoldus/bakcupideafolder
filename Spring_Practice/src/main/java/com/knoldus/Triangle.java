package com.knoldus;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

 public class Triangle {

//    private String type;
    private Point point1;
//
//     private Point point2;
//     private Point point3;

     public Point getPoint1() {
         return point1;
     }

     public void setPoint1(Point point1) {
         this.point1 = point1;
     }
//
//     public Point getPoint2() {
//         return point2;
//     }
//
//     public void setPoint2(Point point2) {
//         this.point2 = point2;
//     }
//
//     public Point getPoint3() {
//         return point3;
//     }
//
//     public void setPoint3(Point point3) {
//         this.point3 = point3;
//     }

     public void draw(){
         System.out.println("point 1 x:"+point1.getX());
         System.out.println("point 1 y:"+point1.getY());
//         System.out.println("point 2 x:"+point2.getX());
//         System.out.println("point 2 y:"+point2.getY());
//         System.out.println("point 3 x:"+point3.getX());
//         System.out.println("point 3 y:"+point3.getY());
     }

     //    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }


//    public Triangle(String type) {
////        this.type = type;
//    }
//
//    public void draw(){
////        System.out.println("Drawing " + this.getType() + " Triangle");
//    }

}









