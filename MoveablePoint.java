/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moveable;

/**
 *
 * @author Wys.Dao
 */
public class MoveablePoint implements Moveable{
    public int x, y, xSend, ySend;

    public MoveablePoint(int x, int y, int xSend, int ySend) {
        this.x = x;
        this.y = y;
        this.xSend = xSend;
        this.ySend = ySend;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" + "x=" + x + ", y=" + y + ", xSend=" + xSend + ", ySend=" + ySend + '}';
    }

    @Override
    public void moveUp() {
        this.x +=this.xSend;
    }

    @Override
    public void moveDown() {
        this.x -=this.xSend;
    }

    @Override
    public void moveLeft() {
        this.y -= this.ySend;
    }

    @Override
    public void moveRight() {
        this.y += this.ySend;
    }
    
}
