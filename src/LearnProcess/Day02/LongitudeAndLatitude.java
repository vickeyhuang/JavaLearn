package Day02;


/**
 * Created by xqhuang on 16/6/22.
 */

// 定义五个参数,两个int 三个string,分别为经度和纬度,国家,地区和城市.
// 当经纬度其中一个没有或都没有时,显示城市; 当经纬度和城市都没有,显示地区; 当经纬度和城市和地区都没有时,显示国家

public class LongitudeAndLatitude {
    public static void main (String[] args) {

        int a = 0;
        int b = 1;

        String Country = "China";
        String State = "Shanxi";
        String City = null;

        if (a == 0 || b == 0) {

            if (City == null && State == null) {
                System.out.print("显示:" + Country);
            } else if (City == null){
                System.out.print("显示:" + State);
            } else {
                System.out.print("显示:" + City);
            }

        } else {
            System.out.print("显示:" + a + b);
        }
    }
}
