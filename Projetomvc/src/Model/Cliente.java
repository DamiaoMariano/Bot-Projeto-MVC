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
public class Cliente  {

    private String CPF;
    private String Nome;
    ArrayList<Clinica> ListClinicas;
    
    private Clinica cli;

    public Cliente() {
    }

    public Cliente(String CPF, String Nome,Clinica cli) {
        this.CPF = CPF;
        this.Nome = Nome;
        ListClinicas = new ArrayList();
        
       
    }

    public Cliente(String CPF, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
   
    }

    public Clinica getCli() {
        return cli;
    }

    public void setCli(Clinica cli) {
        this.cli = cli;
    }

    public boolean Persistir() {
        return true;
    }
    public ArrayList<Cliente>getCliente(){
        ArrayList<Cliente> cliente = new ArrayList();
            return cliente;
        
    }
}
