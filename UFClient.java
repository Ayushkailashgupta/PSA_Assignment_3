package edu.neu.coe.info6205.union_find;
import java.util.Random;
import java.util.Scanner;


public class UFClient {

    private static int count(int n){
        int connectCount = 0;
        UF_HWQUPC uf_hwqupc = new UF_HWQUPC(n);
        Random r = new Random();
        while(uf_hwqupc.components()!=1){
            int p1 = r.nextInt(n);
            int p2 = r.nextInt(n);
            uf_hwqupc.connect(p1,p2);
            connectCount=connectCount+1;
        }
        return connectCount;
    }

    public static  void main(String args[]){
        int loop = 250;
        int count1 = 10;
        //To run code for 10 different values of n
        while(count1>0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a value of n: ");
            int n = sc.nextInt();
            long sum = 0;
            for (int i = 0; i < loop; i++) {
                sum += count(n);
            }
            long connections = sum / loop;
            System.out.println("n: " + n + "average number of pairs: " + connections);
            count1--;
        }
    }
}
