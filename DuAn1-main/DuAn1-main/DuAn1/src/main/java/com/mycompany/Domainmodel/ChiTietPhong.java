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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "ChiTietPhong")
public class ChiTietPhong implements Serializable{
    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private String id;
    
    @Column(name = "MoTa")
    private String moTa;
    
    @Column(name = "TinhTrang")
    private String tinhTrang;
    
    @Column(name = "GiaPhong")
    private float giaPhong;
    
    @Column(name = "soLuong")
    private int soLuong;
    
    @OneToOne
    @JoinColumn(name = "IdPhong")
    private Phong phong;
    
    @OneToMany(mappedBy = "chiTietPhong")
    private List<DichVuDung> listdvd;
}
