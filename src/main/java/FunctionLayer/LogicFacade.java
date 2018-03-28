package FunctionLayer;

import DBAccess.OrderMapper;
import DBAccess.UserMapper;
import java.util.ArrayList;
import java.util.List;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
    public static Order createOrder(Order ord) throws LoginSampleException{
        OrderMapper.createOrder(ord);
        return ord;
    }
    public static ArrayList<Order> getOrders(User user) throws LoginSampleException {
        return (ArrayList<Order>) OrderMapper.getOrders(user);
    }
    public static ArrayList<Order> getAllOrders() throws LoginSampleException{
        return OrderMapper.getAllOrders();
    }
    public static void approveOrder(int i) throws LoginSampleException{
        OrderMapper.approveOrder(i);
    }
}
