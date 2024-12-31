/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oldrain.gestion_de_reservas_restauranteoldrain.modelo;

import org.hibernate.Session;
import org.hibernate.Transaction;


import java.time.LocalDate;

public class PruebaHibernate {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        // Crear una nueva mesa
        Mesa mesa = new Mesa();
        mesa.setCapacidad(4);
        mesa.setEstado("Disponible");
        session.save(mesa);

        // Crear un cliente
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan Pérez");
        cliente.setTelefono("123456789");
        session.save(cliente);

        // Crear una nueva reserva
        Reserva reserva = new Reserva();
        reserva.setMesa(mesa);
        reserva.setCliente(cliente);
        reserva.setFechaReserva(LocalDate.now());
        session.save(reserva);

        transaction.commit();
        session.close();

        System.out.println("Reserva guardada con éxito!");
    }
}