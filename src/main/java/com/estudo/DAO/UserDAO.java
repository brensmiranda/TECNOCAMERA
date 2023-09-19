package com.estudo.DAO;

import com.estudo.connection.Conexao;
import com.estudo.entity.Cliente;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    public void cadastrarCliente(Cliente cliente){
        String sql = "INSERT INTO CLIENTES (NOME, ENDERECO, CONTATO) VALUES (?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2,cliente.getContato());
            ps.setString(3, cliente.getEndereco());
            ps.execute();
            ps.close();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
