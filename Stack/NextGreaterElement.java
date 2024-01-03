import java.util.*;

import javax.swing.text.AbstractDocument.LeafElement;
public class NextGreaterElement {
    public static void main(String args[])
    {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];


        for(int i=arr.length-1; i>=0;i--)
        {
            //1 While 
            while(!s.isEmpty() && arr[s.peek()] <= arr[i])
            {
                s.pop();
            }
            //2 if-else
            if(s.isEmpty())
            {
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }

            //3 push in stack
            s.push(i);
        }
        for(int i=0;i<nextGreater.length;i++)
        {
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();

        //Different Forms of NextGreater Question 

        //1.Next Greater Right
        // 2.Next Greater Left
        //3. Next Smaller in the right hand side
        // 4. next smaller in left hand

    }
}
