package static_;

/**
 * @author 叶嘉卫
 * @date 2022/10/25/19:57
 * @Description: 静态方法练习
 */
public class test {
    public static void main(String[] args) {
        Person person = new Person("1");
        Person person1 = new Person("2");
        System.out.println(Person.getCount());
        Person person2 = new Person("3");
        System.out.println(Person.getCount());

    }
}
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
        count++;
    }

    private static  int count=0;


    public static int getCount() {
        return count;
    }
}
