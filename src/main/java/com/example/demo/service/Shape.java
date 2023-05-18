package com.example.demo.service;

public interface Shape extends Comparable<Shape> {

    String getType();

    double getPerimeter();

    double getArea();

}
