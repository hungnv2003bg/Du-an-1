/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Domainmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "DichVuDung")
public class DichVuDung {
    @Id 
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private String id;
    
    @Column(name = "thoiGianSuDung")
    private String thoiGianDung;
    
    @ManyToOne
    @JoinColumn(name = "IdDV")
    private DichVu dichVu;
    
    @ManyToOne
    @JoinColumn(name = "IdCTP")
    private ChiTietPhong chiTietPhong;
    
    @ManyToOne
    @JoinColumn(name = "IdHoaDon")
    private HoaDon hoaDon;
}
