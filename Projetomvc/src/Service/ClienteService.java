/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ClienteService {
      private List<Cliente>listaCliente;
    
    public ClienteService(){
        this.listaCliente = new ArrayList<> ();       
    }
    public void adicionarCliente(Cliente cliente) {
        this.listaCliente.add(cliente);
    }
    
    
    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void editarCliente(int indice, String CPF, String nome) {
        listaCliente.get(indice).setCPF(CPF);
        listaCliente.get(indice).setNome(nome);
    }
    
    public void deletarCliente(int indice) {
        listaCliente.remove(indice);
    }
    
}
