package Day01;

/**
 * Created by xqhuang on 16/5/31.
 */

// 循环练习2: 当a=1的时候走第一个分支,当a=2走第二个分支,以此类推,走五个分支
public class Try3 {
    public static void main (String[] args) {
        int a = 4;

        if ( a == 1) {
            System.out.print("分支1");
        } else if (a == 2) {
            System.out.print("分支2");
        } else if (a == 3) {
            System.out.print("分支3");
        } else if (a == 4) {
            System.out.print("分支4");
        } else if (a == 5) {
            System.out.print("分支5");
        }

    }

}
