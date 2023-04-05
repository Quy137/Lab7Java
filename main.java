/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moveable;

/**
 *
 * @author Wys.Dao
 */
public class main {
    public static void main(String[] args) {
        MoveablePoint mp = new MoveablePoint(5, 9, 1, 3);
        MoveableCircle mc = new MoveableCircle(4, mp, 5, 2, 3, 7);
        
        mp.moveDown();
        mp.moveUp();
        mp.moveLeft();
        mp.moveRight();
        mp.toString();
        
        mc.moveDown();
        mc.moveUp();
        mc.moveLeft();
        mc.moveRight();
        mc.toString();
    }
}
