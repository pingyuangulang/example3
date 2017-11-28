/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 吉彬
 */
import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public static void main(String[] args){
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        ListNode node3 = new ListNode();
        ListNode node4 = new ListNode();
        ListNode node5 = new ListNode();
        node1.data = 1;node2.data = 2;
        node3.data = 3;node4.data = 4;
        node5.data = 5;node1.next = node2;
        node2.next = node3;node3.next = node4;
        node4.next = node5;node5.next = null;
        Solution s = new Solution();
        ArrayList<Integer> arr = s.printListFromTailToHead(node1);
        for(Integer a  : arr)
            System.out.println(a);
    }
    /*
    问题：
    输入一个链表，从尾到头打印链表每个节点的值。
    */
    
    /*
    解决思路：
    利用栈的先进后出特性。
    */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode==null)
            return null;
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        ListNode node = listNode;
        for(;node!=null;node = node.next){
            stack.add(node.data);
        }
        while(!stack.empty()){
            arraylist.add(stack.pop());
        }
        return arraylist;
    }
}
class ListNode{
    Integer data;
    ListNode next;
}
