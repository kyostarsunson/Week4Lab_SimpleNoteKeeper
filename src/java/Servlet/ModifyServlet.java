/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;
import java.io.*;

/**
 *
 * @author 886152
 */
public class ModifyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        // to read files
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));

        String title = br.readLine();
        String content = "";
        String line;
        while ((line = br.readLine()) != null) {
            content += (line + "\n");
        }
        Note mynote = new Note(title, content);

        request.setAttribute("mynote", mynote);

        getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                .forward(request, response);

        br.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String title = request.getParameter("title");
        String content = request.getParameter("content");

        // to write to a file
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        pw.println(title);
        pw.println(content);
        pw.close();

        // to read files
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));

        title = br.readLine();
        content = "";
        String line;
        while ((line = br.readLine()) != null) {
            content += (line + "<br>");
        }
        Note mynote = new Note(title, content);

        request.setAttribute("mynote", mynote);

        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);

        br.close();

    }

}
