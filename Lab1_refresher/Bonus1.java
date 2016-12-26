import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class Bonus1 {
    void checker(int[] arr,int a, int b,int n){
        int m = (a+b)/2;
        if(arr[n-1] == 0){
                System.out.println(n);
            }
        int flag = 0;
        while(flag == 0){
            if(arr[m] == 1){
                if(arr[m-1] == 0){
                    System.out.println(m);
                    flag = 1;
                }
                else{
                    m = m/2;
                }
            }
            else{
                m = (m+n)/2;
            }
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int[] arr = new int[n];
        Scanner inp = new Scanner(System.in);
        for(i=0;i<n;i++){
            arr[i] = inp.nextInt();
        }
        Bonus1 obj = new Bonus1();
        obj.checker(arr,0, n-1,n);
    }

}