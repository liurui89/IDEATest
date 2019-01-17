import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        long longTime = new Date().getTime();




        System.out.println("字符串类型的Long日期转换成日期:");
        System.out.println("test");




        String str = "1540381294000";
        long dateLong = Long.parseLong(str);
        System.out.println("longToDate："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(dateLong)));

        System.out.println("============================");

        System.out.println("Date和Long互转:");
        System.out.println("日期转换成Long："+longTime);
    }
}
