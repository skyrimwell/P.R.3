package ru.mirea.ikbo2019.pr3.ch2;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(0, 0, 0, 0);
        MovableCircle mc = new MovableCircle(0, 0, 0, 0);
        MovableRectangle mr = new MovableRectangle(0, 0, 0, 0, 0, 0);

        System.out.println("Movable Point:");
        mc.moveDown();
        mp.moveUp();
        mp.moveRight();
        System.out.println(mp);
        mp.moveLeft();
        mp.moveLeft();
        mp.moveLeft();
        System.out.println(mp);

        System.out.println("\nMovable Circle:");
        mc.moveRight();
        mc.moveRight();
        mc.moveRight();
        System.out.println(mc);
        mc.moveDown();
        mc.moveLeft();
        mc.moveDown();
        System.out.println(mc);

        System.out.println("\nMovable Rectangle:");
        mr.moveUp();
        mc.moveDown();
        mr.moveRight();
        System.out.println(mr);
        mr.moveDown();
        mr.moveLeft();
        mr.moveUp();
        System.out.println(mr);
    }
}
