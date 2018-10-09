/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Clinica;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ClinicaService {
    
    private List<Clinica> listaClinica;

    public ClinicaService() {
        this.listaClinica = new ArrayList<>();
    }

    public void adicionarClinica(Clinica clinica) {
        this.listaClinica.add(clinica);
    }

    public List<Clinica> getListaClinica() {
        return listaClinica;
    }

    public void editarClinica(int indice, String codigo, String nome) {
        listaClinica.get(indice).setCodigo(codigo);
        listaClinica.get(indice).setNome(nome);
    }
    
    public void deletarClinica(int indice) {
        listaClinica.remove(indice);
    }
    
    
    
}
