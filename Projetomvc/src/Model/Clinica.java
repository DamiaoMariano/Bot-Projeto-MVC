/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Clinica {
    private String codigo;
    private String Nome;
    ArrayList<Cliente> ListCliente;

    public Clinica() {
        ListCliente= new ArrayList();
    }

    public Clinica(String codigo, String Nome) {
        this.codigo = codigo;
        this.Nome = Nome;
        ListCliente = new ArrayList();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public ArrayList<Cliente> getListCliente() {
        return ListCliente;
    }

    public void setListP(ArrayList<Cliente> ListCliente) {
        this.ListCliente = ListCliente;
    }
        
  
    
    public void addCliente(Cliente X){
        X.setCli(this);
        ListCliente.add(X);
    }                      

   
    }
    


