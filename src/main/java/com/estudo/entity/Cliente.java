package com.estudo.entity; 
public class Cliente {
   private int codigo;
   private String nome;
   private String endereco;
   private String contato;

   public int getCodigo() {
      return codigo;
   }

   public void setCodigo(int codigo) {
      this.codigo = codigo;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getEndereco() {
      return endereco;
   }

   public void setEndereco(String endereco) {
      this.endereco = endereco;
   }

   public String getContato() {
      return contato;
   }

   public void setContato(String contato) {
      this.contato = contato;
   }
}
