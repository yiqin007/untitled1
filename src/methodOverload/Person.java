package methodOverload;

/**
 * @author 叶嘉卫
 * @date 2022/10/23/21:02
 * @Description: 方法重载
 */
public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public void setName(String firstname,String name) {
        this.name = firstname+name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("叶","小小");
        System.out.println(person.getName());
    }
}

