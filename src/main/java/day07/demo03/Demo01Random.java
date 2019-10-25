package day07.demo03;

import java.util.Random;

/**
 * @author:Alex
 * @date:2019/10/25
 * @version:1.0
 * @description:
 * 获取一个随机的int数字（范围是int所有范围，有正负两种）：int num = r.nextInt()
 * 获取一个随机的int数字（参数代表了范围，左闭右开区间）：int num = r.nextInt(3)
 * 实际上代表的含义是：[0,3)，也就是0~2
 */
public class Demo01Random {
    public static void main(String[] args) {
        Random random = new Random();
        // 随机数范围0~9
        int num1 = random.nextInt(10);
        System.out.println("产生的随机数为："+ num1);
        // 随机数范围1~10
        int num2 = random.nextInt(10)+1;
        System.out.println("产生的随机数为："+ num2);
    }
}
