package extend;

/**
 * @author 叶嘉卫
 * @date 2022/10/23/22:22
 * @Description: 直接向下转型
 */
public class test {
    public static void main(String[] args) {
        Object obj = "bos";
        //从Java 14开始，判断instanceof后，可以直接转型为指定变量
        if(obj instanceof String s) {
            System.out.println(s.getClass());
        }

    }
}
