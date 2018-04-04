package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import FunctionLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OrderMapper {

    public static void createOrder(Order ord) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO Orders (height, width, length, user_id) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ord.getHeight());
            ps.setInt(2, ord.getWidth());
            ps.setInt(3, ord.getLength());
            ps.setInt(4, ord.getUser_id());
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    public static List<Order> getOrders(User user) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            ArrayList<Order> orderList = new ArrayList<>();
            String SQL = "SELECT * FROM Legohus.Orders where user_id = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, user.getId());
            ResultSet results = ps.executeQuery();

            while (results.next()) {
                orderList.add(new Order(
                        results.getInt("id"),
                        results.getInt("height"),
                        results.getInt("width"),
                        results.getInt("length"),
                        results.getString("status")));
            }

            return orderList;
        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    public static ArrayList<Order> getAllOrders() throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            ArrayList<Order> orderList = new ArrayList<>();
            String SQL = "SELECT * FROM Legohus.Orders";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet results = ps.executeQuery();

            while (results.next()) {
                orderList.add(new Order(
                        results.getInt("id"),
                        results.getInt("height"),
                        results.getInt("width"),
                        results.getInt("length"),
                        results.getString("status")));
            }

            return orderList;
        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }

    }

    public static void approveOrder(int i) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "UPDATE Legohus.Orders SET status= ? WHERE id= ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, "approved");
            ps.setInt(2, i);
            ps.executeUpdate();
        }

         catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
    }

}
