package lv.raimonds.abstractclass;

abstract public class Monster implements Skills{
    private String name;

    public Monster(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public String attack();
    abstract public String heal();
}
