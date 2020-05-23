package lv.raimonds.abstractclass;

public class RedMonster extends Monster implements Skills{

    public RedMonster(String name) {
        super(name);
    }

    public String getName(){
        return super.getName();
    }

    @Override
    public String attack() {
        return "Red monster go attack..Arr";
    }

    @Override
    public String heal() {
        return "I have no heal sorry bro";
    }

    @Override
    public void fireBall() {
        System.out.println("I get fireball!!!");
    }

    @Override
    public String jump() {
        return "Jump";
    }
}
