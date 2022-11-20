/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.Service;

import com.mycompany.Domainmodel.ThongTinThuePhong;
import java.util.List;

/**
 *
 * @author Hung
 */
public interface ThongTinThuePhongService {
    public List<ThongTinThuePhong> getAll();
    boolean add(ThongTinThuePhong tttp);
    boolean delete(String Id);
    boolean update(String Id, ThongTinThuePhong tttp);
}
