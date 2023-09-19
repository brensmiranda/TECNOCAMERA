package com.estudo.entity;

import com.estudo.DAO.UserDAO;
    public class Main {
        public static void main(String[] args) throws Exception {
            Cliente c1 = new Cliente();
            c1.setNome("Lucia");
            c1.setContato("81 984748585");
            c1.setEndereco("Rua da felicidade, 236");

            Cliente c2 = new Cliente();
            c2.setNome("Maria Jose Carmo");
            c2.setEndereco("Rua da Fé");
            c2.setContato("81 74587548");
            new UserDAO().cadastrarCliente(c2);

        }
    }

