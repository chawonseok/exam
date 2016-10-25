package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) throws SQLException {
		// 사용자 나이입력
		// 그 나이보다 큰 회원을 출력하는 프로그램 작성
		Scanner scan = new Scanner(System.in);
		int x;
		x = scan.nextInt();
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM MEMBER WHERE AGE>="+x;

		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

		String mid;
		String pwd;
		String name;
		String phone;

		while (rs.next()) {
			mid = rs.getString("MID");
			pwd = rs.getString("pwd");
			name = rs.getString("name");
			phone = rs.getString("phone");

			System.out.printf("mid%s,pwd:%s,name:%s,phone:%s\n", mid, pwd, name, phone);
		}
		rs.close();
		st.close();
		con.close();
	}

}
