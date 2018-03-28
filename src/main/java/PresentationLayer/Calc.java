package PresentationLayer;

import FunctionLayer.Calculator;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author steven
 */
public class Calc extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        int height = Integer.parseInt(request.getParameter("height"));
        int width = Integer.parseInt(request.getParameter("width"));
        int length = Integer.parseInt(request.getParameter("length"));
        Calculator calc = new Calculator();
        Order house = calc.calculate(height, width, length);
        HttpSession session = request.getSession();
        session.setAttribute("house", house);
        return "calculator";
    }

}
