package com.bridgelabz;

// Java program to reverse a string using stack
import java.util.*;
class StringIterativeMethods
{
    public static String recursiveReverse(char []str)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length; i++)
            st.push(str[i]);

        for (int i=0; i<str.length; i++) {
            str[i] = st.peek();
            st.pop();
        }
        return String.valueOf(str);// converting character array to string
    }

    // Driver program
    public static void main(String []args)
    {
        String str = "nileshdev";
        str = recursiveReverse(str.toCharArray());// passing character array as parameter
        System.out.println(str);
    }
}
// This code is contributed by Adarsh_Verma
