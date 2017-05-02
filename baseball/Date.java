package baseball;




	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

	/**
	 * データベースアクセス
	 *
	 * @author ab000015
	 *
	 */
	public class Date {

		/**
		 * @param args
		 */
		public static void main(String[] args) {

			try {
				Class.forName("org.h2.Driver");
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			String dburl = "jdbc:h2:~/test";
			String sql = "SELECT * FROM BASEBALLMENBER";

			Connection conn;
			try {
				conn = DriverManager.getConnection(dburl, "sa", "");
				ResultSet resultset = conn.createStatement().executeQuery(sql);
				while (resultset.next()) {
					System.out.println(resultset.getInt(1) + ", " + resultset.getString(2));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

