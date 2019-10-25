package day07.demo04;

import java.util.ArrayList;

/**
 * @author:Alex
 * @date:2019/10/25
 * @version:1.0
 * @description:
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList);
        String str1 = arrayList.get(1);
        System.out.println(str1);

    }
}
