package edu.neu.mgen.HW13;

import java.sql.Connection;

public class Dbtest {
    public static void main(String[] args) {
        DbAccess dbAccess = new DbAccess();
        Connection conn = dbAccess.connectToDatabase();
        dbAccess.queryDatabase(conn);
        dbAccess.updateDatabase(conn, 1, "testname", "test@testmail.com");
        dbAccess.queryDatabase(conn);
    }
}
