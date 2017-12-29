package ru.itpark;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

public class CongratsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        resp.setCharacterEncoding("UTF-8");
        Writer writer = resp.getWriter();
        writer.write("<html>\n" +
                "<head><meta charset = \"UTF-8\"></head>" +
                "\t<body>\n" +
                "<p>С Новым годом, " + username + "</p>\n" +
                "\t</body>\n" +
                "</html>");
    }
}
