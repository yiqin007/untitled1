package Interface;

/**
 * @author 叶嘉卫
 * @date 2022/10/25/19:48
 * @Description: 接口练习
 */
public class test {
    public static void main(String[] args) {
       income[] incomes = new income[] {new Salary(6000),new royaltiesIncome(7000)};
        for (income i:incomes) {
            System.out.println(i.getTax());
        }
    }
}

interface income{
    double getTax();
}
class Salary implements income {
    private double income;
    public Salary(double income) {
        this.income=income;
    }
    @Override
    public double getTax() {
        if(income<=5000) {
            return 0;
        }
        return (income-5000)*0.2;
    }
}
class royaltiesIncome implements income {
    private double income;
    public royaltiesIncome(double income) {
        this.income=income;
    }

    @Override
    public double getTax() {
        return income*0.25;
    }
}