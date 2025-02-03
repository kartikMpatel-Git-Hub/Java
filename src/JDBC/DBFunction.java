package JDBC;

import java.sql.*;

public class DBFunction {
    public void createDatabase(){
        try{
            String url = "jdbc:mysql://localhost:3306/";
            String userName = "root";
            String password = "K@rtik.018";

            Connection con = DriverManager.getConnection(url,userName,password);
            Statement stm = con.createStatement();
            String query = "create database test_JDBC_DB";
            System.out.println("Database Connected");
            stm.execute(query);
            System.out.println("Database Created Succesfully");
            con.close();
            System.out.println("Database Closed Succesfully");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void createTable(String dbName){
        try{
            String url = "jdbc:mysql://localhost:3306/";
            String userName = "root";
            String password = "K@rtik.018";

            Connection con = DriverManager.getConnection(url+dbName,userName,password);
            Statement stm = con.createStatement();
            String query = "create table Test (id int(3),name varchar(20))";
            stm.execute(query);
            System.out.println("Table Created Succesfully");
            con.close();
            System.out.println("Database Closed Succesfully");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void insertData(int id,String name,String dbName,String tableName){
        try{
            String url = "jdbc:mysql://localhost:3306/";
            String userName = "root";
            String password = "K@rtik.018";

            Connection con = DriverManager.getConnection(url+dbName,userName,password);
            Statement stm = con.createStatement();
//            String query = "insert into "+tableName+" Values (" + id +" ,' "+ name + " ') ";
//            stm.execute(query);
            /*

            Other Way To DO Same With Easy
             */

            String query = "insert into "+tableName+" Values (?,?)";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1,id);
            pstm.setString(2,name);

            pstm.execute();
            System.out.println("Table Data Inserted Succesfully");
            con.close();
            System.out.println("Database Closed Succesfully");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void readData(String dbName,String tableName){
        try{
            String url = "jdbc:mysql://localhost:3306/";
            String userName = "root";
            String password = "K@rtik.018";

            Connection con = DriverManager.getConnection(url+dbName,userName,password);
            Statement stm = con.createStatement();
            String query = "select * from " + tableName;
            ResultSet rs = stm.executeQuery(query);
            System.out.println("ID\tName");
            while (rs.next()){
                System.out.print(rs.getInt(1));
                System.out.println("\t" + rs.getString(2));
            }
            System.out.println("Table Readed Succesfully");
            con.close();
            System.out.println("Database Closed Succesfully");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void updateData(String dbName,String tableName,int setId,int findId){
        try{
            String url = "jdbc:mysql://localhost:3306/";
            String userName = "root";
            String password = "K@rtik.018";

            Connection con = DriverManager.getConnection(url+dbName,userName,password);
            Statement stm = con.createStatement();
            String query = "update "+tableName+" set id = ? where id = ?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1,setId);
            pstm.setInt(2,findId);

            pstm.execute();
            System.out.println("Table Data Updated Succesfully");
            con.close();
            System.out.println("Database Closed Succesfully");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void deleteData(String dbName, String tableName, int id) {
        try{
            String url = "jdbc:mysql://localhost:3306/";
            String userName = "root";
            String password = "K@rtik.018";

            Connection con = DriverManager.getConnection(url+dbName,userName,password);
            Statement stm = con.createStatement();
            String query = "delete from "+tableName+" where id = ?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1,id);

            pstm.execute();
            System.out.println("Table Data Deleted Succesfully");
            con.close();
            System.out.println("Database Closed Succesfully");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
