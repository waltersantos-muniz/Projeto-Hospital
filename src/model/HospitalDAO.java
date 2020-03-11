
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class HospitalDAO {
    private Connection con = new ConnectionFactory().getConnection();
    
    public void cadastrar(Hospital hospital){
     try{
         String query = "insert into hospital (nm_hospital, ds_endereco) values(?,?)";
         
         PreparedStatement prepareStmt = con.prepareStatement(query);
         prepareStmt.setString (1, hospital.getNome());
         prepareStmt.setString (2, hospital.getEndereco());
         
         prepareStmt.execute();
         
         con.close();
     }catch(Exception e){
         
     }  
        
    }
    
    public ArrayList<Hospital> buscar(){
     ArrayList<Hospital> ah = new ArrayList();
        try{
            
            String query = "select * from hospital";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            ResultSet rs = preparedStmt.executeQuery(query);
            
            while (rs.next()){
             Hospital h = new Hospital(rs.getString("nm_hospital"));
             h.setIdHospital(rs.getInt("id_hospital"));
             
             ah.add(h);
            }
            con.close();
        }catch(Exception e){
            
        }
            return ah;
    }
}
