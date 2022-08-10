/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Project implements Calculate {

    int a,b;
    
    public static void main(String a[]) {
        Project project = new Project();
        project.getValues();
    }

    @Override
    public void calculateArea() {

    }

    @Override
    public void getValues(){
    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a");
    a  = sc.nextInt();

    System.out.println (
    "Enter b");
    b  = sc.nextInt();
}

}
