/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.

 */
public class MergeTwoSortedList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        public void printNode(ListNode head){
          ListNode cur = head;
          while(cur!=null){
              System.out.print(cur.val + "->");
              cur=cur.next;
          }
            System.out.println("\n");
        }
  }
    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        while(cur1!=null){
            head = new ListNode(cur1.val,head);
            cur1 = cur1.next;
        }
        while(cur2!=null){
            head = new ListNode(cur2.val,head);
            cur2 = cur2.next;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode(4);
        head1 = new ListNode(2, head1);
        head1 = new ListNode(1, head1);

        ListNode head2 = new ListNode(4);
        head2 = new ListNode(3, head2);
        head2 = new ListNode(1, head2);

        MergeTwoSortedList.ListNode listNode = new MergeTwoSortedList.ListNode();
        listNode.printNode(head1);
        listNode.printNode(head2);

        ListNode mergedList = mergeTwoLists(head1,head2);
        listNode.printNode(mergedList);
    }
}
