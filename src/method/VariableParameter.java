package method;

import java.util.Arrays;

/**
 * @author 叶嘉卫
 * @date 2022/10/23/20:04
 * @Description:可变参数的使用
 */
public class VariableParameter {
    public static void main(String[] args) {
        Person person = new Person();
        //String...(可变参数) 调用时可以传入不同参数
        person.setNames("小明","小红");
        System.out.println(person);
        person.setNames("小蓝");
        System.out.println(person);
    }
}
class Person{
    private String[] names;
    public void setNames(String... names) {
        this.names=names;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                '}';
    }
}