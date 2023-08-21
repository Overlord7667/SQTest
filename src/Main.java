import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            System.out.println("Successful");
            String url = "jdbc:mysql://flywood.com6.ru:3306/flywood_academi";
            String UserName = "flywood_academi_user";
            String Psw = "academi_user_test";
            try (Connection connection = DriverManager.getConnection(url, UserName, Psw)) {
                System.out.println("Connection MySqlDB complete");
                Statement statement = connection.createStatement();
                //statement.executeQuery(); Select
                //statement.execute();
                //statement.executeUpdate(); Update, Insert, Delete, Create, Drop


                //String SQL = "insert Persons(name, surname, age) values('Takeshi', 'Kitano', 86),('Takeshi', 'Kitano', 86) " ;
                //int value = statement.executeUpdate(SQL);
                //System.out.println(value + " Addet");
//                String SQL = "SELECT * FROM Persons " ;
//                ResultSet resultSet = statement.executeQuery(SQL);
//                while (resultSet.next()){
//                    System.out.println(resultSet.getString(2)+ " " + resultSet.getString("surname")+ " " + resultSet.getInt(4)+ " ");
//                };


//                String sqlScript = "CREATE TABLE Hotels (Id INTEGER AUTO_INCREMENT PRIMARY KEY, Names VARCHAR(30), Class VARCHAR(5), Likes INTEGER)";
//                int createTables = statement.executeUpdate(sqlScript);
//                System.out.println("Created" + createTables + " rows");


//                String sqlScript = "insert into Hotels (Names, Class, Likes) values ('Tokio','5','203985')";
//                int result = statement.executeUpdate(sqlScript);
//                System.out.println("Inserted" + result + " rows");


//                String sqlScript = "delete from Hotels where Class < 5 or Likes not like '%200000%'";
//                int result = statement.executeUpdate(sqlScript);
//                System.out.println("Deleted" + result + " rows");


//                String sqlScript = "UPDATE Hotels SET Class = 5 where Class <= 4";
//                int result = statement.executeUpdate(sqlScript);
//                System.out.println("Update" + result + " rows");


                String sqlScript = "drop TABLE Hotels";
                int result = statement.executeUpdate(sqlScript);
                System.out.println("Drop" + result + " rows");
            }
        } catch (Exception ex) {
            System.out.println("Connection false");
        }
    }
}