package Controller;

import Model.Cliente;
import java.util.List;
import Service.ClienteService;

/**
 *
 * @author User
 */
public class ClienteController {
     private ClienteService ClienteService = new ClienteService();
        public void criarCliente(Cliente cliente) {
        ClienteService.adicionarCliente(cliente);
    }
    
    public void editarCliente(int indice, String CPF, String nome) {
       ClienteService.editarCliente(indice, CPF, nome);
    }
    
    public List<Cliente> obterCliente() {
        return this.ClienteService.getListaCliente();
    }

    public void deletarCliente(int indice) {
        ClienteService.deletarCliente(indice);
    }
    
} 