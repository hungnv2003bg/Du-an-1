/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Domainmodel;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "Phong")
public class Phong implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private String id;

    @Column(name = "MaPhong")
    private String maPhong;

    @ManyToOne
    @JoinColumn(name = "IdChiTietPhong")
    private ChiTietPhong loaiPhong;
    
    @Column(name = "TenPhong")
    private String tenPhong;
    
    @Column(name = "Tang")
    private String tang;
    
    
    @OneToMany(mappedBy = "phong")
    private List<DichVuDung> listdvd;
    
    @OneToMany(mappedBy = "phong")
    private List<ThongTinThuePhong> listTTTP;

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public ChiTietPhong getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(ChiTietPhong loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

}
