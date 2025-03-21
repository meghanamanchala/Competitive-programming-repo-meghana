// 2. Merge Two Sorted Lists

// You are given the heads of two sorted linked lists list1 and list2.

// Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

// Return the head of the merged linked list.

// import java.lang.classfile.components.ClassPrinter.ListNode;


class problem2 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 != null && list2 != null){
            if(list1.val < list2.val){
                list1.next = mergeTwoLists(list1.next,list2);
                return list1;
            }else{
                list2.next = mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if(list1==null)
           return list2;
        return list1;
    }
}