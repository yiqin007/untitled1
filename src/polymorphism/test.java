package polymorphism;

/**
 * @author 叶嘉卫
 * @date 2022/10/25/16:44
 * @Description: 多态练习
 */
public class test {
    public static void main(String[] args) {
        Person person = new Person("小明",6999);//总收入
        Salary salary = new Salary(6999);//工资税
        royaltiesIncome royaltiesIncome = new royaltiesIncome(6999);//稿费税
        double income = person.getIncome();
        income-=salary.getTax()+ royaltiesIncome.getTax();
        person.setIncome(income);
        System.out.println(person.getIncome());
        System.out.println(salary.getTax()+" "+ royaltiesIncome.getTax());

    }
}
class Income{
    protected double income;

    public Income(double income) {
        this.income = income;
    }
    //总税
    public double getTax() {
        return income*0.1;
    }
}
class Salary extends Income{
    public Salary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        if(income<=5000) {
            return 0;
        }
        return (income-5000)*0.2;
    }
}
class royaltiesIncome extends Income {

    public royaltiesIncome(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return income*0.25;
    }
}
class Person{
    private String name;

    private double income;

    public Person(String name, double income) {
        this.name = name;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", income=" + income +
                '}';
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}
