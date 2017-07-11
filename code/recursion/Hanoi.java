package com.suanfa.recursion;

import java.util.Stack;

/**
 * 汉诺塔问题
 * Created by chang on 17/7/11.
 */
public class Hanoi {

    static void hanoi(Stack<Integer> from, int size, Stack<Integer> temp, Stack<Integer> to) {

        // 递归退出条件:
        // from只有一个元素时, 直接移动到to上
        if (size==1) {
            to.push(from.pop());
            return;
        }

        //将(size-1)个元素从from移动到临时temp上
        hanoi(from, size-1, to, temp);
        //将第size个元素从from移动到to上
        to.push(from.pop());
        //将(size-1)个元素从temp上移动到to上
        hanoi(temp, size-1, from, to);
    }

    static void hanoi1(char from, int size, char temp, char to) {

        if (size==1) {
            System.out.println(from + " --> " + to);
        } else {
            hanoi1(from, size-1, to, temp);
            System.out.println(from + " --> " + to);
            hanoi1(temp, size-1, from, to);
        }
    }



    public static void main(String[] args) {


//        hanoi1('A', 4, 'B', 'C');
        Stack<Integer> from = new Stack<>();
        from.push(5);
        from.push(4);
        from.push(3);
        from.push(2);
        from.push(1);
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> to = new Stack<>();
        hanoi(from, from.size(), temp, to);

        System.out.println(to.pop());
        System.out.println(to.pop());
        System.out.println(to.pop());
        System.out.println(to.pop());
        System.out.println(to.pop());


    }

}
