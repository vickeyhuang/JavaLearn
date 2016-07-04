package Day01;

/**
 * Created by xqhuang on 16/5/31.
 */

//循环3: 五个数据,2 5 8, 数字两两相加,结果为偶数时,返回偶;结果为奇数时,返回奇;
public class Try4 {
    public static void main (String[] args) {
        int a = 2;
        int b = 5;
        int c = 8;

        if ((a + b) % 2 == 0) {
            System.out.println("输出为:" + "偶");
        } else {
            System.out.println("输出为:" + "奇");
        }

        if ((a + c) % 2 == 0) {
            System.out.println("输出为:" + "偶");
        } else {
            System.out.println("输出为:" + "奇");
        }

        if ((b + c) % 2 == 0) {
            System.out.println("输出为:" + "偶");
        } else {
            System.out.println("输出为:" + "奇");
        }
    }
}
