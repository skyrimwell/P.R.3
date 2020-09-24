package ru.mirea.ikbo2019.pr3.ch2;

public class MovablePoint implements Movable {
    private int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        y += 1;
        ySpeed += 1;
    }

    @Override
    public void moveDown() {
        y -= 1;
        ySpeed -= 1;
    }

    @Override
    public void moveLeft() {
        x -= 1;
        xSpeed -= 1;
    }

    @Override
    public void moveRight() {
        x += 1;
        xSpeed += 1;
    }
}
