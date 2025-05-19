package com.crhistianm;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { 
        this.val = val; 
    }
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
    protected ListNode addTwoNumber(ListNode n1, ListNode n2){
        ListNode list = new ListNode();
        while(n1.next.){}

        String first = String.valueOf(n1.next.next.val) + String.valueOf(n1.next.val) + String.valueOf(n1.val);
        String second = String.valueOf(n2.next.next.val) + String.valueOf(n2.next.val) + String.valueOf(n2.val);

        String answer = String.valueOf(Integer.valueOf(first)  + Integer.valueOf(second));


        list.val = Integer.valueOf(answer.charAt(2));
        list.next.val = Integer.valueOf(answer.charAt(1));
        list.next.next.val = Integer.valueOf(answer.charAt(0));

        return list;
    }
}
