package StackQueue.ReverseStack;

import java.util.Arrays;

public class reverseStackTest {
    public static void main(String[] args) {
        int[] arr = {1,8,5,9,5,7};
        String str = "Code gym Hue!";
        System.out.println(Arrays.toString(reverseStack.ReserveNumberUseStack(arr)));
        System.out.print(reverseStack.ReserveStringUseStack(str));
    }
}