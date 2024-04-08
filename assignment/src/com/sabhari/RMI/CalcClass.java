package com.sabhari.RMI;
public class CalcClass implements CalcI{

    
    public int add(int x, int y) throws Exception {
        return x+y;
    }


    public int sub(int x, int y) throws Exception {
        return x-y;
    }
}
