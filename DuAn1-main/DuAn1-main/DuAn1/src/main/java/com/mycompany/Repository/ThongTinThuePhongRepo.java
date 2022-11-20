/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Repository;

import com.mycompany.Domainmodel.ThongTinThuePhong;
import com.mycompany.Utilities.HibernateUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Hung
 */
public class ThongTinThuePhongRepo {
    public List<ThongTinThuePhong> getALL() {
        Session session = HibernateUtil.getFACTORY().openSession();
        List<ThongTinThuePhong> listttthuephong = session.createCriteria(ThongTinThuePhong.class).list();
        return listttthuephong;
    }
    
    public boolean add(ThongTinThuePhong ttinthuephong){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(ttinthuephong);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean update(ThongTinThuePhong tttp, String Id){
        Transaction transac = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()){
            transac = session.beginTransaction();
            String update = "UPDATE ThongTinThuePhong set soNguoi = :soNguoi, thoiGianThue = :thoiGianThue, "
                    + "thoiGianTra = :thoiGianTra WHERE id = :id";
            Query query = session.createQuery(update);
            query.setParameter("soNguoi", tttp.getSoNguoi());
            query.setParameter("thoiGianThue", tttp.getThoiGianThue());
            query.setParameter("thoiGianTra", tttp.getThoiGianTra());
            query.setParameter("id", Id);
            if(query.executeUpdate() > 0){
                transac.commit();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean delete( String Id){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();         
            String hql = "DELETE FROM ThongTinThuePhong WHERE Id = :id";
            Query query = session.createQuery(hql);
            query.setParameter("id", Id);        
            if( query.executeUpdate() > 0 ){
                transaction.commit();
                return true;
            }          
        } catch (Exception e) {
            e.printStackTrace();           
        }
        return false;
    }
    
    
    
    
}
