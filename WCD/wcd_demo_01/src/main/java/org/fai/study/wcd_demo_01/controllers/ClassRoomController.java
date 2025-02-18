package org.fai.study.wcd_demo_01.controllers;

import jakarta.persistence.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.fai.study.wcd_demo_01.entities.ClassRoom;

import java.io.IOException;
@WebServlet("/classroom")
public class ClassRoomController extends HttpServlet{
    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;
    @Override
    public void init() throws ServletException {
        entityManagerFactory = Persistence.createEntityManagerFactory("default1");
        entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        var classRooms = entityManager.createStoredProcedureQuery("GetAllClass", ClassRoom.class).getResultList();
        System.out.println("Do get" );
        req.setAttribute("classRooms", classRooms);
        req.getRequestDispatcher("/views/classroom/index.jsp").forward(req, resp);
    }
}
