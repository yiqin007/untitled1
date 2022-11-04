package javabean;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 * @author 叶嘉卫
 * @date 2022/10/27/18:23
 * @Description: javabean练习
 */
public class test {
    public static void main(String[] args) throws IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
        for (PropertyDescriptor p:beanInfo.getPropertyDescriptors()) {
            System.out.println(p.getName());
            System.out.println(p.getReadMethod());
            System.out.println(p.getWriteMethod());
        }

       

    }

}
class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
