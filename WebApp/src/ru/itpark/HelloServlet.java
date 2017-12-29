package ru.itpark;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

public class HelloServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Writer writer = resp.getWriter();
    writer.write("<html>\n" +
        "<body>\n" +
        "<h1>Hello, dear user!</h1>\n" +
        "</body>\n" +
        "</html>\n");
  }


}
