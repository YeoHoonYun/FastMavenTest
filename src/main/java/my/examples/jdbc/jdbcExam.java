package my.examples.jdbc;

import java.sql.*;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-14
 * Github : https://github.com/YeoHoonYun
 */
public class jdbcExam {
    public static void main(String[] args) {
        Connection connection = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fastshop?characterEncoding=UTF-8&serverTimezone=UTC","root","hadoop");
            st = connection.createStatement();

            String sql;
            sql = "select * FROM users";

            ResultSet rs = st.executeQuery(sql);

            while(rs.next()){
                String sqlRecipeProcess = rs.getString(2);
                System.out.println(sqlRecipeProcess);
            }

            rs.close();
            st.close();
            connection.close();
        } catch (SQLException se1){
            se1.printStackTrace();
        } catch (Exception ex){
            ex.printStackTrace();
        }finally {
            try {
                if(st != null)
                    st.close();
            } catch (SQLException se2){

            }
            try {
                if (connection != null)
                    connection.close();
            }catch (SQLException se){
                se.printStackTrace();
            }
        }
    }
}
