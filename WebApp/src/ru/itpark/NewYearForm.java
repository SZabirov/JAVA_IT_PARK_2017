package ru.itpark;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

public class NewYearForm extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        Writer writer = resp.getWriter();
        writer.write("<html>\n" +
                "<head><meta charset = \"UTF-8\"></head>" +
                "\t<body>\n" +
                "\t\t<form action=\"/congrats\">\n" +
                "\t\t  Введите имя:<br>\n" +
                "\t\t  <input type=\"text\" name=\"username\"><br>\t\t  \n" +
                "\t\t  <input type=\"submit\" value=\"Submit\">\n" +
                "\t\t</form>\n" +
                "\t</body>\n" +
                "</html>");
    }
}
