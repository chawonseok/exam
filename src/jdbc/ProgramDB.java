package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class ProgramDB {

	public static void main(String[] args) throws SQLException {
		// 사용자 나이입력
		// 그 나이보다 큰 회원을 출력하는 프로그램 작성
		System.out.print("사용자아이디를 입력하세요:");
		Scanner scan = new Scanner(System.in);
		String x;
		x = scan.nextLine();
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		
		String sql = "SELECT * FROM MEMBER WHERE NAME LIKE ?";

		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, "%"+x+"%");
		ResultSet rs = st.executeQuery();

		String mid;
		String pwd;
		String name;
		String phone;
		String gender;
		String address;
		String age;
		while (rs.next()) {
			mid = rs.getString("MID");
			pwd = rs.getString("pwd");
			name = rs.getString("name");
			phone = rs.getString("phone");
			age = rs.getString("age");
			address = rs.getString("address");
			gender = rs.getString("gender");
			

			System.out.printf("name:%s,age:%s,phone:%s,address:%s,mid:%s,pwd:%s,gender:%s\n", name,age, phone,address,mid, pwd,gender );
		}
		rs.close();
		st.close();
		con.close();
	}

}
