package day07.demo01;

import java.util.Scanner;

/**
 * @author:Alex
 * @date:2019/10/25
 * @version:1.0
 * @description:
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("输入的整数为：" + num);
        String str = scanner.next();
        System.out.println("输入的字符串为：" + str);
    }
}
