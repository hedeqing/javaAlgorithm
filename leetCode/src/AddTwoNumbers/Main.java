package AddTwoNumbers;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListNode listNode1 = null;
        ListNode listNode2 = null;
        ListNode new_list = null;
        listNode1 = init();
        listNode2 =  init();
        new_list = addTwoNumbers(listNode1,listNode2);
        while(new_list!=null){

            System.out.println("var  "+new_list.val);
            new_list = new_list.next;
        }
    }

    public  static  ListNode init (){
            Scanner in  = new Scanner(System.in);
            ListNode head = null;// 头部，空表
            System.out.println("现在使用头部插入法，请输入数据，以0为结束");
            int newDate;
            while ((newDate = in.nextInt())!=0) {
                ListNode listNode = new ListNode(newDate);//新建一个节点
                listNode.next = head;//通过指针找到上一个节点地址，让新节点的下一个地址指向新节点
                head = listNode;//让指针移动到新建的节点上
            }
            System.out.println("录入完毕");
            return head;

    }

    /**
     * @param l1
     * @param l2
     * @return
     */
    public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            ListNode next = new ListNode(sum % 10);
            curr.next = next;
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    static class ListNode {
            int val;
            ListNode next;
            ListNode(int x) {
                val = x; }
       }
}
