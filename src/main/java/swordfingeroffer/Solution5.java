package swordfingeroffer;

public class Solution5 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public static int[] reversePrint(ListNode head) {
        int count = 0;
        ListNode node = head;
        while (node!=null){
            count++;
            node=node.next;
        }
        int[] result = new int [count];
        node=head;
        for(int i = count-1 ; i >=0 ;i--){
            result[i] = node.val;
            node=node.next;
        }
       return   result;
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
