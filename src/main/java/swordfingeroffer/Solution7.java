package swordfingeroffer;

import java.util.Stack;

public class Solution7 {
    class CQueue {
        Stack <Integer>stack1=new Stack<>();
        Stack <Integer>stack2=new Stack<>();
        public CQueue() {

        }

        public void appendTail(int value) {
         stack1.push(value);
        }

        public int deleteHead() {
           if(stack2.isEmpty()){
               while (!stack1.isEmpty()){
                   stack2.push(stack1.pop());
               }
           }
           if(!stack2.isEmpty()){
               return  stack2.pop();
           }
         return  -1;
        }
    }


}
