/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 * @author Henry Yip
 */
public class Fib {
    
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        int prev0 = 0;
        int prev1 = 1;
        int next;
        for (int i=0;i <n-1; i++) {
            next = prev0 + prev1;
            prev0 = prev1;
            prev1 = next;
        }
        return prev0 + prev1;
    }
    
    public void fib_prn(int n) {
        int r = fib(n);
        System.out.println("fib("+n+")=" + r);
    }
    
    public static void main(String[] argc) {
        Fib fc = new Fib();
        fc.fib_prn(0);
        fc.fib_prn(1);
        fc.fib_prn(4);
        
    }
}
