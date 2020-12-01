package swordfingeroffer;

import java.util.LinkedList;

public class Solution4 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public static int[] reversePrint(ListNode head) {

         if(head==null){
             return  new int[]{};
         }
          //上一个结点
         ListNode pre=head;
         // 当前结点
         ListNode cur=head.next;
         // 保存当前结点的指针域
         ListNode tmp;
         while (cur!=null){
             tmp=cur.next;
             //反转指针指向
             cur.next=pre;
             //指针向下移动
             pre=cur;
             cur=tmp;
         }
         head.next=null;
        LinkedList <Integer> list =new LinkedList();
         while (pre!=null){
             list.add(pre.val);
             pre=pre.next;
         }
        int  [] resultList = new int[list.size()];
         for(int  i= 0 ; i < list.size(); i++){
             resultList[i]=list.get(i);
        }

         return  resultList;
    }


    public static void main(String[] args) {
       ListNode head = new ListNode(1);
        head.next=new ListNode(3);
        head.next.next=new ListNode(2);
        int[] ints = reversePrint(head);
        for(int num:ints){
            System.out.println(num);
        }
    }
}
