package jdbc;

import java.io.Console;
import java.sql.*;
import java.util.Properties;

/**
 * Author: Michal Szynkiewicz, michal.l.szynkiewicz@gmail.com Date: 5/27/15
 * Time: 10:52 PM
 */
public class JdbcExample {

    public static final String DB_URL = "jdbc:hsqldb:mem:testdb";
    public static final String USAGE = "commands: \n"
            + "\ta[dd] <employee name>,<salary>\n"
            + "\tl[ist]\n"
            + "\tq[uit]";

    Connection getConnection() throws SQLException {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    void init() throws SQLException {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /** Dodaje rekord do bazy. Zakłada że arguments jest listą dwóch argumentów
     * rozdzielonych przecinkiem
     * @param arguments
     * @return 
     */
    private boolean add(String arguments) {
        String[] args = arguments.split(",");
        throw new UnsupportedOperationException("Not yet implemented");
    }
    /** Wypisuje na ekranie wszystkie rekordy z bazy */
    private void list() throws SQLException {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static void main(String[] args) throws SQLException {
        JdbcExample example = new JdbcExample();
        example.init();
        Console console = createConsole();
        System.out.println(USAGE);
        while (true) {
            System.out.print("command: ");
            String line = console.readLine();
            String[] splittedLine = line.split("\\s");
            String command = splittedLine[0];
            switch (command) {
                case "quit":
                case "q":
                    return;
                case "add":
                case "a":
                    if (splittedLine.length < 2 || !example.add(splittedLine[1])) {
                        System.out.println(USAGE);
                        break;
                    }
                    break;
                case "list":
                case "l":
                    example.list();
                    break;
                default:
                    System.out.println(USAGE);
            }
        }
    }

    private static Console createConsole() {
        Console console = System.console();
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        return console;
    }
}
