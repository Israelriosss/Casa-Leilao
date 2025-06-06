import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectaDAO {

    // Variáveis para configurar o banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/cenaflix"; // Substitua "nomedobanco"
    private static final String USER = "root"; // Substitua se o usuário for diferente
    private static final String PASSWORD = "jesusefiel123"; // Substitua pela senha correta, se tiver

    // Método para retornar a conexão
    public static Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Carrega o driver JDBC
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado: " + e.getMessage());
            return null;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados: " + e.getMessage());
            return null;
        }
    }
}
