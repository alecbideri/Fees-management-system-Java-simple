package DAO;
import java.sql.*;
import MODEL.Model_fees;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class D_fees {
    
    String url = "jdbc:mysql://localhost:3306/examination2024";
    String username = "root";
    String password = "Alecb200@.";
    
        
    public void create_student(Model_fees obj){
    try {
        Connection con = DriverManager.getConnection(url, username, password);
        String sql_insert = "INSERT INTO studentfees(student_names , registration_number , department , academic_year,programme , trimester_fees , supervision_fees , graduation_fees, registration_fees) VALUES (?, ?, ?, ?, ? ,? ,?,?,?)";
        PreparedStatement st = con.prepareStatement(sql_insert);

        st.setString(1, obj.getStudent_names());
        st.setString(2, obj.getReg_number());
        st.setString(3, obj.getDepartment());
        st.setInt (4, obj.getAcademic_year());
        st.setString(5, obj.getProgramme());
        st.setDouble(6, obj.getTrimester_fees());
        st.setDouble(7, obj.getSupervision_fees());
        st.setDouble(8, obj.getGraduation_fees());
        st.setDouble(9, obj.getRegistration_fees());

        int check = st.executeUpdate();

        if (check > 0) {
            JOptionPane.showMessageDialog(null, "Student records registered successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to register students record");
        }
        
        st.close();
        con.close();
        
        
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database error");
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Server error");
     }
   }
    
        public List<Model_fees> display_students(){
        
        List <Model_fees> fees = new ArrayList<>();
        try {
            
            Connection con = DriverManager.getConnection(url , username , password);
            String select_all = "select student_names , trimester_fees , supervision_fees , graduation_fees from studentfees ;";
            PreparedStatement st = con.prepareStatement(select_all);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                
                Model_fees fee  = new Model_fees();
                fee.setStudent_names(rs.getString("student_names"));
                fee.setTrimester_fees(rs.getDouble("trimester_fees"));
                fee.setSupervision_fees(rs.getDouble("supervision_fees"));
                fee.setGraduation_fees(rs.getDouble("graduation_fees"));
            
                fees.add(fee);
               
            }
        
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return fees ;
    }
}
