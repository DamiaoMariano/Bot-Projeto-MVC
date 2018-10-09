/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewCliente;

import Model.Clinica;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Controller.ClinicaController;
import Model.Cliente;
import java.util.List;
import Controller.ClienteController;

public class Visao extends javax.swing.JFrame {

    String modoclinica;
    String modocliente;
    private ClinicaController clinicaController = new ClinicaController();

    public void LoadTableCli() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Código", "Nome"}, 0);
        List<Clinica> listaDeClinicas = clinicaController.obterClinicas();
        for (int i = 0; i < listaDeClinicas.size(); i++) {
            Object linha[] = new Object[]{listaDeClinicas.get(i).getCodigo(),
                listaDeClinicas.get(i).getNome()};
            modelo.addRow(linha);
        }
        tbl_clinicas.setModel(modelo);
        tbl_clinicas.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbl_clinicas.getColumnModel().getColumn(1).setPreferredWidth(200);
        LoadTableCBClinica();
    }
    
    public void LoadTableCBClinica() {
        List<Clinica> listaDeClinicas = clinicaController.obterClinicas();
        cb_cliente_clinica.removeAllItems();
         for (int i = 0; i < listaDeClinicas.size(); i++) {
           cb_cliente_clinica.addItem(listaDeClinicas.get(i).getNome());
        }
    }
    
    private final ClienteController ClienteController = new ClienteController();
    
     public void LoadTableCliente() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"CPF", "Nome"}, 0);
        List<Cliente> listaDeCliente = ClienteController.obterCliente();
        for (int i = 0; i < listaDeCliente.size(); i++) {
            Object linha[] = new Object[]{listaDeCliente.get(i).getCPF(),
                listaDeCliente.get(i).getNome()};
            modelo.addRow(linha);
        }
        tbl_cliente_cliente.setModel(modelo);
        tbl_cliente_cliente.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbl_cliente_cliente.getColumnModel().getColumn(1).setPreferredWidth(200);
        LoadTableCBCliente();
    }
    
    public void LoadTableCBCliente() {
        List<Cliente> listaDeCliente = ClienteController.obterCliente();
        cb_cliente_clinica.removeAllItems();
         for (int i = 0; i < listaDeCliente.size(); i++) {
           cb_cliente_clinica.addItem(listaDeCliente.get(i).getNome());
        }
    }
    

    public Visao() {
        initComponents();
        modoclinica = "navegar";
        modocliente = "navegar";
        InterfaceClinica();
        InterfaceCliente();
    }

    public void InterfaceClinica() {
        switch (modoclinica){
            case "navegar":
                btn_cli_salvar.setEnabled(false);
                btn_cli_cancelar.setEnabled(false);
                c_cli_codigo.setEnabled(false);
                c_cli_nome.setEnabled(false);
                btn_cli_novo.setEnabled(true);
                btn_cli_editar.setEnabled(false);
                btn_cli_excluir.setEnabled(false);
                break;
            
            case "novo":
                btn_cli_salvar.setEnabled(true);
                btn_cli_cancelar.setEnabled(true);
                c_cli_codigo.setEnabled(true);
                c_cli_nome.setEnabled(true);
                btn_cli_novo.setEnabled(false);
                btn_cli_editar.setEnabled(false);
                btn_cli_excluir.setEnabled(false); 
                break;
            
            case "Salvar":
                btn_cli_salvar.setEnabled(false);
                btn_cli_cancelar.setEnabled(false);
                c_cli_codigo.setEnabled(false);
                c_cli_nome.setEnabled(false);
                btn_cli_novo.setEnabled(true);
                btn_cli_editar.setEnabled(false);
                btn_cli_excluir.setEnabled(false); 
                break;
                     
            case "Editar":
            
                btn_cli_salvar.setEnabled(true);
                btn_cli_cancelar.setEnabled(true);
                c_cli_codigo.setEnabled(true);
                c_cli_nome.setEnabled(true);
                btn_cli_novo.setEnabled(true);
                btn_cli_editar.setEnabled(false);
                btn_cli_excluir.setEnabled(false); 
                break;
            
            case "cancelar":
                btn_cli_salvar.setEnabled(false);
                btn_cli_cancelar.setEnabled(false);
                c_cli_codigo.setEnabled(false);
                c_cli_nome.setEnabled(false);
                btn_cli_novo.setEnabled(true);
                btn_cli_editar.setEnabled(false);
                btn_cli_excluir.setEnabled(false); 
                break;
            
            case "Excluir":
                btn_cli_salvar.setEnabled(false);
                btn_cli_cancelar.setEnabled(false);
                c_cli_codigo.setEnabled(false);
                c_cli_nome.setEnabled(false);
                btn_cli_novo.setEnabled(true);
                btn_cli_editar.setEnabled(false);
                btn_cli_excluir.setEnabled(false); 
                break;
            
                case "selecao":    
                
                btn_cli_salvar.setEnabled(false);
                btn_cli_cancelar.setEnabled(false);
                c_cli_codigo.setEnabled(false);
                c_cli_nome.setEnabled(false);
                btn_cli_novo.setEnabled(true);
                btn_cli_editar.setEnabled(true);
                btn_cli_excluir.setEnabled(true); 
                break;
            
            default:
                System.out.println("Valor Invalido");
    
    }
}
    public void InterfaceCliente() {
        switch (modocliente){
            case "navegar":
                btn_cliente_salvar.setEnabled(false);
                btn_cliente_cancelar.setEnabled(false);
                c_cliente_cpf.setEnabled(false);
                c_cliente_nome.setEnabled(false);
                btn_cliente_novo.setEnabled(true);
                btn_cliente_editar.setEnabled(false);
                btn_cliente_excluir.setEnabled(false);
                break;
            
            case "novo":
                btn_cliente_salvar.setEnabled(true);
                btn_cliente_cancelar.setEnabled(true);
                c_cliente_cpf.setEnabled(true);
                c_cliente_nome.setEnabled(true);
                btn_cliente_novo.setEnabled(false);
                btn_cliente_editar.setEnabled(false);
                btn_cliente_excluir.setEnabled(false); 
                break;
            
            case "Salvar":
                btn_cliente_salvar.setEnabled(false);
                btn_cliente_cancelar.setEnabled(false);
                c_cliente_cpf.setEnabled(false);
                c_cliente_nome.setEnabled(false);
                btn_cliente_novo.setEnabled(true);
                btn_cliente_editar.setEnabled(false);
                btn_cliente_excluir.setEnabled(false); 
                break;
                     
            case "Editar":
            
                btn_cliente_salvar.setEnabled(true);
                btn_cliente_cancelar.setEnabled(true);
                c_cliente_cpf.setEnabled(true);
                c_cliente_nome.setEnabled(true);
                btn_cliente_novo.setEnabled(true);
                btn_cliente_editar.setEnabled(false);
                btn_cliente_excluir.setEnabled(false); 
                break;
            
            case "cancelar":
                btn_cliente_salvar.setEnabled(false);
                btn_cliente_cancelar.setEnabled(false);
                c_cliente_cpf.setEnabled(false);
                c_cliente_nome.setEnabled(false);
                btn_cliente_novo.setEnabled(true);
                btn_cliente_editar.setEnabled(false);
                btn_cliente_excluir.setEnabled(false); 
                break;
            
            case "Excluir":
                btn_cliente_salvar.setEnabled(false);
                btn_cliente_cancelar.setEnabled(false);
                c_cliente_cpf.setEnabled(false);
                c_cliente_nome.setEnabled(false);
                btn_cliente_novo.setEnabled(true);
                btn_cliente_editar.setEnabled(false);
                btn_cliente_excluir.setEnabled(false); 
                break;
            
                case "selecao":    
                
                btn_cliente_salvar.setEnabled(false);
                btn_cliente_cancelar.setEnabled(false);
                c_cliente_cpf.setEnabled(false);
                c_cliente_nome.setEnabled(false);
                btn_cliente_novo.setEnabled(true);
                btn_cliente_editar.setEnabled(true);
                btn_cliente_excluir.setEnabled(true); 
                break;
            
            default:
                System.out.println("Valor Invalido");
        }
    
    }
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_clinicas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        c_cli_codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_cli_nome = new javax.swing.JTextField();
        btn_cli_salvar = new javax.swing.JButton();
        btn_cli_cancelar = new javax.swing.JButton();
        btn_cli_novo = new javax.swing.JButton();
        btn_cli_editar = new javax.swing.JButton();
        btn_cli_excluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_cliente_cliente = new javax.swing.JTable();
        btn_cliente_novo = new javax.swing.JButton();
        btn_cliente_editar = new javax.swing.JButton();
        btn_cliente_excluir = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lbl_cliente_cpf = new javax.swing.JLabel();
        c_cliente_cpf = new javax.swing.JTextField();
        lbl_cliente_nome = new javax.swing.JLabel();
        c_cliente_nome = new javax.swing.JTextField();
        btn_cliente_salvar = new javax.swing.JButton();
        btn_cliente_cancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cb_cliente_clinica = new javax.swing.JComboBox<>();

        jTextField1.setText("jTextField1");

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_clinicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_clinicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_clinicasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_clinicas);
        if (tbl_clinicas.getColumnModel().getColumnCount() > 0) {
            tbl_clinicas.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbl_clinicas.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Clinica"));

        jLabel1.setText("Código");

        jLabel2.setText("Nome:");

        btn_cli_salvar.setText("Salvar");
        btn_cli_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_salvarActionPerformed(evt);
            }
        });

        btn_cli_cancelar.setText("Cancelar");
        btn_cli_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_cli_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_cli_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btn_cli_salvar)
                        .addGap(53, 53, 53)
                        .addComponent(btn_cli_cancelar)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(c_cli_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_cli_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cli_salvar)
                    .addComponent(btn_cli_cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_cli_novo.setText("Novo");
        btn_cli_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_novoActionPerformed(evt);
            }
        });

        btn_cli_editar.setText("Editar");
        btn_cli_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_editarActionPerformed(evt);
            }
        });

        btn_cli_excluir.setText("Excluir");
        btn_cli_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn_cli_novo)
                        .addGap(74, 74, 74)
                        .addComponent(btn_cli_editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cli_excluir)
                        .addGap(32, 32, 32)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cli_novo)
                    .addComponent(btn_cli_editar)
                    .addComponent(btn_cli_excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Clinica", jPanel1);

        tbl_cliente_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Clinica"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_cliente_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_cliente_clienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_cliente_cliente);
        if (tbl_cliente_cliente.getColumnModel().getColumnCount() > 0) {
            tbl_cliente_cliente.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbl_cliente_cliente.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        btn_cliente_novo.setText("Novo");
        btn_cliente_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_novoActionPerformed(evt);
            }
        });

        btn_cliente_editar.setText("Editar");
        btn_cliente_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_editarActionPerformed(evt);
            }
        });

        btn_cliente_excluir.setText("Excluir");
        btn_cliente_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_cliente_novo)
                .addGap(74, 74, 74)
                .addComponent(btn_cliente_editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btn_cliente_excluir)
                .addGap(42, 42, 42))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cliente_novo)
                    .addComponent(btn_cliente_editar)
                    .addComponent(btn_cliente_excluir))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cliente"));

        lbl_cliente_cpf.setText("CPF");

        lbl_cliente_nome.setText("Nome:");

        btn_cliente_salvar.setText("Salvar");
        btn_cliente_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_salvarActionPerformed(evt);
            }
        });

        btn_cliente_cancelar.setText("Cancelar");
        btn_cliente_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliente_cancelarActionPerformed(evt);
            }
        });

        jLabel3.setText("Clinica:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btn_cliente_salvar)
                        .addGap(53, 53, 53)
                        .addComponent(btn_cliente_cancelar))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl_cliente_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_cliente_cpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c_cliente_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_cliente_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(cb_cliente_clinica, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cliente_cpf)
                    .addComponent(c_cliente_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cliente_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_cliente_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_cliente_clinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cliente_salvar)
                    .addComponent(btn_cliente_cancelar)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(212, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Cliente", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cli_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_novoActionPerformed
        // TODO add your handling code here:
        c_cli_codigo.setText("");
        c_cli_nome.setText("");
        modoclinica = "novo";
        InterfaceClinica();

    }//GEN-LAST:event_btn_cli_novoActionPerformed

    private void btn_cli_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_cancelarActionPerformed
        c_cli_codigo.setText("");
        c_cli_nome.setText("");
        modoclinica = "navegar";
        InterfaceClinica();
    }//GEN-LAST:event_btn_cli_cancelarActionPerformed

    private void btn_cli_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_salvarActionPerformed
        String Cod = c_cli_codigo.getText();
        if(modoclinica.equals("novo")){
            Clinica C = new Clinica(Cod, c_cli_nome.getText());
            clinicaController.criarClinica(C);
        }else if(modoclinica.equals("Editar")){
            int indice = tbl_clinicas.getSelectedRow();
            clinicaController.editarClinica(indice, Cod, c_cli_nome.getText());
        }
        LoadTableCli();
        modoclinica = "navegar";
        InterfaceClinica();
        c_cli_codigo.setText("");
        c_cli_nome.setText("");
        
    }//GEN-LAST:event_btn_cli_salvarActionPerformed
        
    private void tbl_clinicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_clinicasMouseClicked
        // TODO add your handling code here:
        //int index = tbl_clinicas.
        int index = tbl_clinicas.getSelectedRow();
        final List<Clinica> listaDeClinicas = this.clinicaController.obterClinicas();
        if(index >= 0 && index < listaDeClinicas.size()){
            Clinica C = listaDeClinicas.get(index);
            c_cli_codigo.setText(String.valueOf(C.getCodigo()));
            c_cli_nome.setText(C.getNome());
            modoclinica = "selecao";
            InterfaceClinica();
    }
        
    }//GEN-LAST:event_tbl_clinicasMouseClicked

    private void btn_cli_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_editarActionPerformed
        modoclinica = "Editar";
        InterfaceClinica();
    }//GEN-LAST:event_btn_cli_editarActionPerformed

    private void btn_cli_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_excluirActionPerformed
       modoclinica = "excluir";
       int indice = tbl_clinicas.getSelectedRow();
       clinicaController.deletarClinica(indice);
       InterfaceClinica();
       LoadTableCli();
       
    }//GEN-LAST:event_btn_cli_excluirActionPerformed

    private void tbl_cliente_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_cliente_clienteMouseClicked
        // TODO add your handling code here:
         int index = tbl_cliente_cliente.getSelectedRow();
        final List<Cliente> listaDeCliente = this.ClienteController.obterCliente();
        if(index >= 0 && index < listaDeCliente.size()){
            Cliente X = listaDeCliente.get(index);
            c_cliente_cpf.setText(X.getCPF());
            //c_cliente_cpf.setText((String.valueOf(X.getCPF());
            c_cliente_nome.setText(X.getNome());
            modocliente = "selecao";
            InterfaceCliente();
    }//GEN-LAST:event_tbl_cliente_clienteMouseClicked
    }
    private void btn_cliente_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_salvarActionPerformed
        String CPF = c_cliente_cpf.getText();
        if(modocliente.equals("novo")){
            Cliente X;
            X = new Cliente(CPF, c_cliente_nome.getText());
            ClienteController.criarCliente(X);
        }else if(modocliente.equals("Editar")){
            int indice = tbl_cliente_cliente.getSelectedRow();
            
            ClienteController.editarCliente(indice, CPF, c_cli_nome.getText());
        }
        LoadTableCliente();
        modocliente = "navegar";
        InterfaceCliente();
        c_cliente_cpf.setText("");
        c_cliente_nome.setText("");
    }//GEN-LAST:event_btn_cliente_salvarActionPerformed

    private void btn_cliente_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_cancelarActionPerformed
        c_cliente_cpf.setText("");
        c_cliente_nome.setText("");
        modocliente = "navegar";
        InterfaceCliente();
    }//GEN-LAST:event_btn_cliente_cancelarActionPerformed

    private void btn_cliente_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_novoActionPerformed
        c_cliente_cpf.setText("");
        c_cliente_nome.setText("");
        modocliente = "novo";
        InterfaceCliente();
    }//GEN-LAST:event_btn_cliente_novoActionPerformed

    private void btn_cliente_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_editarActionPerformed
        modocliente = "Editar";
        InterfaceCliente();
    }//GEN-LAST:event_btn_cliente_editarActionPerformed

    private void btn_cliente_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliente_excluirActionPerformed
        // TODO add your handling code here:
         modocliente = "excluir";
       int indice = tbl_cliente_cliente.getSelectedRow();
       ClienteController.deletarCliente(indice);
       InterfaceCliente();
       LoadTableCliente();
    }//GEN-LAST:event_btn_cliente_excluirActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Visao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cli_cancelar;
    private javax.swing.JButton btn_cli_editar;
    private javax.swing.JButton btn_cli_excluir;
    private javax.swing.JButton btn_cli_novo;
    private javax.swing.JButton btn_cli_salvar;
    private javax.swing.JButton btn_cliente_cancelar;
    private javax.swing.JButton btn_cliente_editar;
    private javax.swing.JButton btn_cliente_excluir;
    private javax.swing.JButton btn_cliente_novo;
    private javax.swing.JButton btn_cliente_salvar;
    private javax.swing.JTextField c_cli_codigo;
    private javax.swing.JTextField c_cli_nome;
    private javax.swing.JTextField c_cliente_cpf;
    private javax.swing.JTextField c_cliente_nome;
    private javax.swing.JComboBox<String> cb_cliente_clinica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbl_cliente_cpf;
    private javax.swing.JLabel lbl_cliente_nome;
    private javax.swing.JTable tbl_cliente_cliente;
    private javax.swing.JTable tbl_clinicas;
    // End of variables declaration//GEN-END:variables


}