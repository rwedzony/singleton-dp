package com.rafsoft;

public class SingletonObject {
    private static SingletonObject singletonObject = new SingletonObject();

    private SingletonObject(){ };

    public static SingletonObject getInstance(){
        return singletonObject;
    }

}
