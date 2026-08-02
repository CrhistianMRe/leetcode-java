import java.math.BigInteger;

class Main {

    public static void main(String[] args) {

        ListNode l1 = new ListNode();
        l1.val = 2;
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode();
        l2.val = 5;
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Main main = new Main();

        main.addTwoNumbers(l1, l2);
        
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next){ this.val = val; this.next = next;}
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        final int firstNodeSize = getSize(l1);
        final int secondNodeSize = getSize(l2);

        String firstNodeNumber = "";
        String secondNodeNumber = "";

        for(int i = firstNodeSize-1; i >= 0; i--) {
            String temp = String.valueOf(getValAtIndex(i, l1));
            firstNodeNumber = firstNodeNumber.concat(temp);
        }

        for(int a = secondNodeSize-1; a >= 0; a--) {
            String temp = String.valueOf(getValAtIndex(a, l2));
            secondNodeNumber = secondNodeNumber.concat(temp);
        }

        BigInteger first = new BigInteger(firstNodeNumber);
        BigInteger second = new BigInteger(secondNodeNumber);

        final String sum = String.valueOf(first.add(second));

        ListNode sumNode = new ListNode();
        ListNode tempNode = sumNode;

        for(int x = sum.length()-1; x  >= 0; x--) {
            tempNode.val = Integer.valueOf(String.valueOf(sum.charAt(x)));
            if(x != 0) {
                tempNode.next = new ListNode();
                tempNode = tempNode.next;
            }
        }

        return sumNode;
    }

    //Assuming index is valid
    public int getValAtIndex(int index, ListNode node) {
        if(node == null) return 0;

        int count = 0; 

        while(count < index) {
            node = node.next;
            count++;
        }

        return node.val;
    }

    public int getSize(ListNode node) {
        if(node == null) return 0;
        int count = 1;

        while(node.next != null) {
            node = node.next;
            count++;
        }

        return count;
    }

}
