package gouzaomethod;

/**
 * @author 叶嘉卫
 * @date 2022/10/23/20:57
 * @Description: 构造方法
 */
public class Person {

        private String name;
        private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
