package forloop;

import java.util.Scanner;
public class Sequence {

public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[]num=new int [n];
    int count = 0 , temp=0;
    int same=0;
    for (int i=0;i<n;i++)
    {
        num [i] = scan.nextInt();
    }
    
    boolean flag=true;
    for(int i = 0 ; i<n-2;i++)
    { 
        
        if(num[i]<num[i+1] && num[i+1]>num[i+2])
        {
            flag=false;
            break;
        }
        
 
}
        System.out.println(flag);
}
}