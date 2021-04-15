/*
package trials;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        */
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. *//*

        Scanner input=new Scanner(System.in);
        String line=input.next();
        while(input.hasNext()) {
            System.out.println(input.nextLine());
        }
    }
}
*/
package trials;
import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;



    public class Solution{
        static Scanner input=new Scanner(System.in);
        private static int B;
        private static int H;
        private static boolean flag;
        static{
            B=input.nextInt();
            input.nextLine();
            H=input.nextInt();
            if(H>0&&B>0){
                if(B<=100){
                     flag=true;}
            }else{
             flag=false;
                System.out.print("java.lang.Exception: Breadth and height must be positive");
            }}


        public static void main(String[] args){
            if(flag){
                int area=B*H;
                System.out.print(area);
            }

        }//end of main

    }//end of class


