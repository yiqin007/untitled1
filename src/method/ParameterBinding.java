package method;

import java.util.Arrays;

/**
 * @author 叶嘉卫
 * @date 2022/10/23/20:24
 * @Description:参数绑定
 */
public class ParameterBinding {
    public static void main(String[] args) {
        test test = new test();
        //修改局部变量的值不影响字段age，因为setAge只是获得了n的复制
        int n=10;
        test.setAge(n);
        n=20;
        System.out.println(test.getAge());
        //数组是对象，传入的是引用，修改哪一个值都是同一个对象上的
        String[] name= new String[]{"bob","alice"};
        test.setName(name);
        System.out.println(test);
        name[0] = "blice"; // bob改名为blice
        System.out.println(test);

    }
}
class test{
    private int age;
    private String[] name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "test{" +
                "age=" + age +
                ", name=" + Arrays.toString(name) +
                '}';
    }
}