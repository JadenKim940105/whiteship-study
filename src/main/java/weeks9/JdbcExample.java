package weeks9;

import java.sql.*;

public class JdbcExample {

    private static final String URL = "jdbc:h2:~/test";
    private static final String ID = "sa";
    private static final String PW = "";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.h2.Driver");

        try (
        Connection conn = DriverManager.getConnection(URL, ID, PW);
        Statement stmt = conn.createStatement()){
        } catch (Exception e){
            e.printStackTrace();
        }
        /*try{
            // jdbc driver 등록


            con = DriverManager.getConnection(URL, ID, PW);

            stmt = con.createStatement();

            String sql = "CREATE TABLE TESTTABLE "
                    +"(id varchar(255))";

            stmt.executeUpdate(sql);

            stmt.close();
            con.close();
        } catch (SQLException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                if(stmt!=null) stmt.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
            try{
                if(con != null) con.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }*/
    }
}
