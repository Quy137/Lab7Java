/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phuongtiendichuyen;

/**
 *
 * @author Wys.Dao
 */
public abstract class PhuongTienDiChuyen extends HangSanXuat {
    protected String loaiPhuongTien;
    protected HangSanXuat hangSanXuat;
    
    public String layTenHangSanXuat() {
        return tenHangSanXuat;
    }
    
    public void batDau() {};
    public void tangToc() {};
    public void dungLai() {};
    abstract double layVanToc();
}
