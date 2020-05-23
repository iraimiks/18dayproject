package lv.raimonds.abstractclass;

public class GreenMonster extends Monster implements Skills{

    public GreenMonster(String name){
        super(name);
    }

    @Override
    public String attack() {
        return "Attack you...Arrr";
    }

    @Override
    public String heal() {
        return "I will heal you bro";
    }

    @Override
    public void fireBall() {
        System.out.println("Create fire ball!");
    }

    @Override
    public String jump() {
        return "Jump";
    }
}
