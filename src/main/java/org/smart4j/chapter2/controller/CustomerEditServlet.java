package org.smart4j.chapter2.controller;

;import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * http://www.otvcloud.com/
 * <p>
 * <p>
 * 客户编辑
 * </p>
 *
 * @author roadoor
 * @create 2017-09-22 16:17.
 */
@WebServlet("/customer_edit")
public class CustomerEditServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}