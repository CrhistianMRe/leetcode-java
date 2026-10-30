public class MyHashSet {

    private BSTNode head;

    public MyHashSet() {}

    public void add(int key) { 
        if(this.head == null) {
            this.head = new BSTNode(key);
            return;
        }
        this.head.insert(key);
    }

    public void remove(int key) {
        if(this.head == null) return;
        this.head = this.head.remove(key);
    }

    public boolean contains(int key) {
        if(this.head == null) return false;
        return this.head.containsValue(key);
    }

    static class BSTNode {

        int val;
        BSTNode left;
        BSTNode right;

        BSTNode(int val) { this.val = val; }

        void insert(int val) {
            //No duplicates
            if(this.val == val) return;

            //When child of a side does not exist
            if(this.left == null && val < this.val) this.left = new BSTNode(val);
            if(this.right == null && val > this.val) this.right = new BSTNode(val);

            //Recursively calling to get last corresponding node
            if(val > this.val) this.right.insert(val);
            if(val < this.val) this.left.insert(val);

        }

        BSTNode remove(int val) {
            /*
             * We are assigning to the parent for the value that I want to search either null or any of the childs
             * The non null validation is in a nested if because it always needs to return to assign correct value if found.
             */

            if(val < this.val) {
                if(this.left != null) this.left = this.left.remove(val);
                return this;
            }

            if(val > this.val) {
                if(this.right != null) this.right = this.right.remove(val);
                return this;
            }

            /**
             * Here if it is not lower or higher it is equal, then this happens
             *
             * Here is what it is assigned to the parent.
             */
            if(this.right == null) return this.left;
            if(this.left == null) return this.right;

            this.val = this.right.getMinimumValue();
            this.right = this.right.remove(this.val);
            return this;

        }

        private int getMinimumValue(){
            BSTNode current = this;
            while(current.left != null) {
                current = current.left;
            }
            return current.val;
        }

        boolean containsValue(int val) {  
            if(this.val == val) return true;

            if(this.left != null && val < this.val) return this.left.containsValue(val);
            if(this.right != null && val > this.val) return this.right.containsValue(val);

            return false;
        }

    }

}
