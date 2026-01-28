package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 雛形クラスです.<br>
 * これをコピーペーストして問題を解いて構いません。
 * 
 * @author igamasayuki
 */
public class Exam3 {
	public static void main(String[] args) {
		// 接続情報
		String url = "jdbc:postgresql://localhost:5432/student";
		String user = "postgres";
		String password = "1228";

		Connection con = null; // 使用する変数の宣言
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;

		try {
			// (1)データベースに接続
			con = DriverManager.getConnection(url, user, password);

			// (2)SQL文を作成
			sql = "SELECT m.id, m.name, m.age, d.name AS dep_name FROM test_members AS m INNER JOIN test_deps AS d ON m.dep_id = d.id";

			// (3)SQL実行準備
			pstmt = con.prepareStatement(sql);

			// (4)SQL実行
			rs = pstmt.executeQuery();

			// (5)結果の操作
			while (rs.next()) {
				int id = rs.getInt("m.id");
				String name = rs.getString("m.name");
				int age = rs.getInt("m.age");
				String dep_name = rs.getString("dep_name");

				System.out.print("id : " + id);
				System.out.print("name :" + name);
				System.out.print("age :" + age);
				System.out.println("dep_name :" + dep_name);
			}
		} catch (SQLException ex) {
			System.err.println("SQL = " + sql);
			ex.printStackTrace();
		} finally {
			try {
				// (6) メモリの解放(切断)
				con.close();
			} catch (Exception ex) {
			}
		}
	}
}
