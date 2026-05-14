package com.healthcare;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/appointment")
public class AppointmentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        // Get form data
        String patientName = request.getParameter("name");
        String doctorName = request.getParameter("doctor");
        String appointmentDate = request.getParameter("date");

        // Set response type
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        // Display booking confirmation
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Appointment Confirmation</title>");
        out.println("</head>");
        out.println("<body style='font-family:Arial;'>");

        out.println("<h1>Health Care Appointment Booked</h1>");

        out.println("<h3>Patient Details</h3>");

        out.println("<p><b>Patient Name:</b> "
                    + patientName + "</p>");

        out.println("<p><b>Doctor Name:</b> "
                    + doctorName + "</p>");

        out.println("<p><b>Appointment Date:</b> "
                    + appointmentDate + "</p>");

        out.println("<h2 style='color:green;'>");
        out.println("Appointment Successfully Booked");
        out.println("</h2>");

        out.println("</body>");
        out.println("</html>");
    }
}
