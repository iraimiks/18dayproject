package lv.raimonds;

import lv.raimonds.abstractclass.GreenMonster;
import lv.raimonds.abstractclass.Monster;
import lv.raimonds.abstractclass.RedMonster;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestAbstract {


    public static void main(String[] args) throws IOException {
        Monster monster1 = new RedMonster("Red Monster");
        Monster monster2 = new RedMonster("Red Monster1");
        Monster monster3 = new RedMonster("Red Monster2");
        Monster monster4 = new RedMonster("Red Monster3");
        System.out.println(monster1.attack());
        System.out.println(monster1.heal());
        System.out.println(monster2.getName());
        Monster monster5 = new GreenMonster("Green Monster");
        System.out.println(monster5.heal());

        System.out.println("New line");
        RedMonster monsterT = new RedMonster("RedM");
        Monster monsterS = new RedMonster("RedM");
        monsterT.jump();
        monsterS.jump();
        System.out.println(monsterT.jump());
        System.out.println(monsterS.jump());
        File file = new File("filetest.txt");

        writeInFile(file,monsterT.jump());
    }

    public static void writeInFile(File file, String intTex) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String str = intTex;
        byte[] bytes = str.getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

}
