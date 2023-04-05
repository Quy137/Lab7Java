/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moveable;

/**
 *
 * @author Wys.Dao
 */
public class MoveableCircle extends MoveablePoint implements Moveable {
    public int radius;
    public MoveablePoint center;

    public MoveableCircle(int radius, MoveablePoint center, int x, int y, int xSend, int ySend) {
        super(x, y, xSend, ySend);
        this.radius = radius;
        this.center = center;
    }

    

    @Override
    public void moveUp() {
        this.center.x += this.xSend;
    }

    @Override
    public void moveDown() {
        this.center.x -= this.xSend;
    }

    @Override
    public void moveLeft() {
        this.center.y -= this.ySend;
    }

    @Override
    public void moveRight() {
        this.center.y += this.ySend;
    }
}
