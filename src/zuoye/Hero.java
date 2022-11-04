package zuoye;

/**
 * @author 叶嘉卫
 * @date 2022/11/04/21:30
 * @Description:英雄类
 */
public class Hero implements Weapon{
    private String name;
    private int HP;
    private int LV;
    private int harm;
    private String weapon="空手";



    /**无参初始化*/
    public Hero() {
        this.HP = 100;
        this.LV = 1;
        this.harm=100;
    }
    public Hero(int type) {
        if(type==1) {
            this.name="普通英雄";
            this.HP=1000;
            this.harm=100;
        }else if(type==2){
            this.name="高级英雄";
            this.HP=2000;
            this.harm=200;
        }
    }
    /**攻击*/
    public void ttk(Hero hero) {
       int hp= hero.getHP();
       hp-=this.harm;
       hero.setHP(hp);
        System.out.println(this.getName()+"对对方英雄:"+hero.getName()+"发动了普通攻击:"+this.getHarm());
        System.out.println(hero.getName()+"剩余血量"+hero.getHP());
    }
    /**必杀技*/
    public void ttk(Hero hero,String BiSha){
        if(BiSha.equals("天地同寿")){
            hero.setHP(0);
            this.setHP(0);
            System.out.println(this.getName()+"与对手"+hero.getName()+"极限一换一，双方生命归于0");
        }
    }
    /**名字的输入*/
    public void addName(String name){
        this.name=name;
    }

    @Override
    public void equipWeapons(String weaponsType) {
        if(weaponsType.equals("诸葛连弩")){
            this.setWeapon(weaponsType);
            this.setHarm(this.getHarm()+40);
        }
    }

    @Override
    public void Martial_arts(Hero hero) {
        if(this.getWeapon().equals("诸葛连弩")){
            System.out.println("发动诸葛连弩，对敌方英雄连续攻击两次");
            for (int i = 0; i < 2; i++) {
                this.ttk(hero);
            }
            }
    }

    public int getHarm() {
        return harm;
    }

    public void setHarm(int harm) {
        this.harm = harm;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getLV() {
        return LV;
    }

    public void setLV(int LV) {
        this.LV = LV;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", HP=" + HP +
                ", LV=" + LV +
                ", harm=" + harm +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
