/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        if(head == null)
            return null;
        
        HashMap<Node, Node> mp = new HashMap<Node, Node>();
        Node p = head, q = head;
        
        while(p != null){
            mp.put(p, new Node(p.val));
            p = p.next;
        }
        
        while(q != null){
            mp.get(q).next = mp.get(q.next);
            mp.get(q).random = mp.get(q.random);
            q = q.next;
        }
        
        
        return mp.get(head);
    }
}