package Day01;

/**
 * Created by xqhuang on 16/5/30.
 */

// 循环练习1: 定义两个任意数字,当a>b 输出大;当a<b时,输出小; 当a=b 输出等于;

public class Try2 {
    public static void main (String[] args) {
        int a = 0;
        int b = 0;

/* 方法1:
        if ( a != b) {
            if (a > b) {
                System.out.print("输出:" + "大");
            } else {
                System.out.print("输出:" + "小");
            }
        } else {
            System.out.print("输出:" + "等于");
        }

*/

// 建议使用方法2:
        if (a > b) {
            System.out.print("输出:" + "大");

        } else if ( a < b ) {
            System.out.print("输出:" + "小");

        } else {
            System.out.print("输出:" + "等于");
        }
    }
}

