/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Service.impl;

import com.mycompany.Domainmodel.ThongTinThuePhong;
import com.mycompany.Repository.ThongTinThuePhongRepo;
import com.mycompany.Service.ThongTinThuePhongService;
import java.util.List;

/**
 *
 * @author Hung
 */
public class ThongTinThuePhongImpl implements ThongTinThuePhongService{
    ThongTinThuePhongRepo tttprepo = new ThongTinThuePhongRepo();

    @Override
    public List<ThongTinThuePhong> getAll() {
        return tttprepo.getALL();
    }

    @Override
    public boolean add(ThongTinThuePhong tttp) {
        return tttprepo.add(tttp);
    }

    @Override
    public boolean delete(String Id) {
        return tttprepo.delete(Id);
    }

    @Override
    public boolean update(String Id, ThongTinThuePhong tttp) {
        return tttprepo.update(tttp, Id);
    }
    
}
