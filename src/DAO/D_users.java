package DAO;
import MODEL.Model_users;
import java.sql.* ;
import javax.swing.JOptionPane;
public class D_users {
    
    String url = "jdbc:mysql://localhost:3306/examination2024";
    String username = "root";
    String password = "Alecb200@.";
    
    
     public void create_customer(Model_users obj){
    try {
        Connection con = DriverManager.getConnection(url, username, password);
        String sql_insert = "INSERT INTO users(names , password) VALUES (?, ?)";
        PreparedStatement st = con.prepareStatement(sql_insert);

        st.setString(1, obj.getName());
        st.setString(2, obj.getPassword());

        int check = st.executeUpdate();

        if (check > 0) {
            JOptionPane.showMessageDialog(null, "User registered successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to register User");
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
     
        public boolean check_login(String user_name, String pass) {
        boolean isValid = false;
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String sql_select = "SELECT * FROM users WHERE user_name = ? AND password = ?";
            PreparedStatement st = con.prepareStatement(sql_select);
            st.setString(1, user_name);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();

            isValid = rs.next();

            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Server error");
        }
        return isValid ;
    }

}


