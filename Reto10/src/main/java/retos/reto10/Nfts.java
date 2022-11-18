/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package retos.reto10;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author santi
 */
@WebServlet("/NTFs")
public class NTFs extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>NTFs</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Los NTFs</h1>");
            out.println("<p> NTFs (siglas en inglés de New Technology File System) es un sistema de Windows NT 3.1, Windows NT 3.5, Windows NT 3.51,"
                    + " Windows NT 4.0, Windows 2000 Windows XP, Windows Server 2003, Windows Server 2008,"
                    + " Windows Vista, Windows 7, Windows 8 , Windows 10 y Windows 11. Está basado en el sistema "
                    + "e archivos HPFS de IBM/Microsoft usado en el sistema operativo OS/2, "
                    + "y también tiene ciertas influencias del formato de archivos HFS diseñado por Apple. " );
            out.println("<h2> Quieres saber más? </h>");
            out.println("<ul>\n" +
           "<li><a href=\"https://es.wikipedia.org/wiki/NTFS\">Ir a Wikipedia</a></li>\n" +
            "<li><a href=\"https://dinahosting.com/blog/que-es-ntfs/\">Un poco menos formal</a></li>\n" +
            "<li><a href=\"https://www.nettix.com.pe/blog/soporte-blog/que-es-ntfs-y-porque-es-tan-util/\">Por qué es tan útil?</a></li>\n" +
            "<li><a href=\"https://learn.microsoft.com/es-es/windows-server/storage/file-server/ntfs-overview\">Información confiable</a></li>\n" +
            "<li><a href=\"https://learn.microsoft.com/es-es/troubleshoot/windows-client/backup-and-storage/fat-hpfs-and-ntfs-file-systems\">Ventajas y desventajas en comparación</a></li>\n" +
            "\n" +
            "</ul>\n");
            out.println("<a href='index.html'>Volver</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        System.out.println("");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// 
}
