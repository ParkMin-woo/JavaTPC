package com.tpc.first;

import kr.bit.structure.implement.connect.DbConnect;
import kr.bit.structure.implement.connect.MysqlConnect;
import kr.bit.structure.implement.connect.OracleConnect;

public class TPC32 {
	public static void main(String[] args) {
		// JDBC : Java DataBase Connectivity
		// Oracle, Mysql 연결 -> Driver Class 필요.
		DbConnect dbConnect = new OracleConnect();
		dbConnect.getConnection("127.0.0.1", "MWPARK", "1111");
		dbConnect = new MysqlConnect();
		dbConnect.getConnection("127.0.0.1", "MWPARK", "1111");
	}
}
