package zuoye;

/**
 * @author 叶嘉卫
 * @date 2022/11/04/22:10
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        Hero hero1 = new Hero(1);
        Hero hero2 = new Hero(2);
        hero1.equipWeapons("诸葛连弩");
        hero1.ttk(hero2);
        hero1.Martial_arts(hero2);
        hero2.ttk(hero1,"天地同寿");
    }
}
