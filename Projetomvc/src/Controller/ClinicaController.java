package Controller;


import Service.ClinicaService;
import Model.Clinica;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ClinicaController {
    
    private ClinicaService clinicaService = new ClinicaService();
    
    public void criarClinica(Clinica clinica) {
        clinicaService.adicionarClinica(clinica);
    }
    
    public void editarClinica(int indice, String codigo, String nome) {
       clinicaService.editarClinica(indice, codigo, nome);
    }
    
    public List<Clinica> obterClinicas() {
        return this.clinicaService.getListaClinica();
    }

    public void deletarClinica(int indice) {
        clinicaService.deletarClinica(indice);
    }
    
    
    
}
