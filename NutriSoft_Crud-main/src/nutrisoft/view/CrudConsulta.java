/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nutrisoft.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nutrisoft.model.Consulta;

/**
 *
 * @author monocat-maria <github.com/monocat-maria>
 */
public class CrudConsulta extends javax.swing.JFrame {

    /**
     * Creates new form CrudConsulta
     */
    private final String[] tableColumns = {"Paciente", "CPF", "Telefone", "Data", "Já era paciente?", "Consulta realizada"};

    DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);

    private List<Consulta> consultasList = new ArrayList<>();

    public CrudConsulta() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastroConsulta = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        label_paciente = new javax.swing.JLabel();
        label_telefone = new javax.swing.JLabel();
        label_cpf = new javax.swing.JLabel();
        label_dataConsulta = new javax.swing.JLabel();
        input_nomePaciente = new javax.swing.JTextField();
        input_telefone = new javax.swing.JTextField();
        input_dataConsulta = new javax.swing.JTextField();
        input_cpf = new javax.swing.JTextField();
        checkbox_paciente = new javax.swing.JCheckBox();
        button_cadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        detalheConsulta = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        label_detalhes = new javax.swing.JLabel();
        checkbox_consulta = new javax.swing.JCheckBox();
        label_receita = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textPane_receita = new javax.swing.JTextPane();
        button_finalizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label_titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_consultas = new javax.swing.JTable();
        button_excluirConsulta = new javax.swing.JButton();
        button_novaConsuta = new javax.swing.JButton();
        button_finalizarConsulta = new javax.swing.JButton();

        cadastroConsulta.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        cadastroConsulta.setMinimumSize(new java.awt.Dimension(464, 333));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        label_paciente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_paciente.setText("Nome do(a) Paciente:");

        label_telefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_telefone.setText("Telefone:");

        label_cpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_cpf.setText("CPF:");

        label_dataConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_dataConsulta.setText("Data da Consulta:");

        input_nomePaciente.setMinimumSize(new java.awt.Dimension(64, 30));
        input_nomePaciente.setPreferredSize(new java.awt.Dimension(71, 30));
        input_nomePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nomePacienteActionPerformed(evt);
            }
        });

        input_telefone.setMinimumSize(new java.awt.Dimension(64, 30));
        input_telefone.setPreferredSize(new java.awt.Dimension(71, 30));

        input_dataConsulta.setMinimumSize(new java.awt.Dimension(64, 30));
        input_dataConsulta.setPreferredSize(new java.awt.Dimension(71, 30));

        input_cpf.setMinimumSize(new java.awt.Dimension(64, 30));
        input_cpf.setPreferredSize(new java.awt.Dimension(71, 30));

        checkbox_paciente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        checkbox_paciente.setText("Já é paciente");
        checkbox_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_pacienteActionPerformed(evt);
            }
        });

        button_cadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button_cadastrar.setText("Cadastrar");
        button_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label_paciente)
                        .addComponent(label_telefone)
                        .addComponent(label_cpf)
                        .addComponent(label_dataConsulta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_nomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_dataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbox_paciente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_paciente)
                    .addComponent(input_nomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_telefone)
                    .addComponent(input_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_cpf)
                    .addComponent(input_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_dataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_dataConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkbox_paciente)
                .addGap(18, 18, 18)
                .addComponent(button_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Cadastrar Consulta");

        javax.swing.GroupLayout cadastroConsultaLayout = new javax.swing.GroupLayout(cadastroConsulta.getContentPane());
        cadastroConsulta.getContentPane().setLayout(cadastroConsultaLayout);
        cadastroConsultaLayout.setHorizontalGroup(
            cadastroConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroConsultaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(cadastroConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cadastroConsultaLayout.setVerticalGroup(
            cadastroConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastroConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        detalheConsulta.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        detalheConsulta.setMinimumSize(new java.awt.Dimension(400, 330));

        label_detalhes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_detalhes.setText("Detalhes da Consulta");

        checkbox_consulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        checkbox_consulta.setText("Consulta Realizada");
        checkbox_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_consultaActionPerformed(evt);
            }
        });

        label_receita.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_receita.setText("Receita e observações:");

        textPane_receita.setMinimumSize(new java.awt.Dimension(58, 20));
        jScrollPane2.setViewportView(textPane_receita);

        button_finalizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button_finalizar.setText("Finalizar");
        button_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_finalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_receita)
                            .addComponent(label_detalhes)
                            .addComponent(checkbox_consulta)
                            .addComponent(button_finalizar))
                        .addGap(0, 215, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_detalhes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkbox_consulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_receita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_finalizar)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout detalheConsultaLayout = new javax.swing.GroupLayout(detalheConsulta.getContentPane());
        detalheConsulta.getContentPane().setLayout(detalheConsultaLayout);
        detalheConsultaLayout.setHorizontalGroup(
            detalheConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalheConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        detalheConsultaLayout.setVerticalGroup(
            detalheConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalheConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(726, 520));

        label_titulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_titulo.setText("Boas vindas ao sistema de agendamento");

        jScrollPane1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jScrollPane1AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        table_consultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paciente", "CPF", "Telefone", "Data", "Já era paciente?", "Consulta realizada"
            }
        ));
        jScrollPane1.setViewportView(table_consultas);

        button_excluirConsulta.setText("Excluir Consulta");
        button_excluirConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_excluirConsultaActionPerformed(evt);
            }
        });

        button_novaConsuta.setText("Nova Consulta");
        button_novaConsuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_novaConsutaActionPerformed(evt);
            }
        });

        button_finalizarConsulta.setText("Finalizar Consulta");
        button_finalizarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_finalizarConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(button_novaConsuta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_excluirConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_finalizarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_titulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_excluirConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_finalizarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_novaConsuta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_novaConsutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_novaConsutaActionPerformed
        cadastroConsulta.setVisible(true);
        cadastroConsulta.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cadastroConsulta.setLocationRelativeTo(null);

    }//GEN-LAST:event_button_novaConsutaActionPerformed

    private void button_finalizarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_finalizarConsultaActionPerformed
        mostrarDetalheConsulta();

        try {
            getReceitaPane();
            setButtonVisible();
        } catch (Exception e) {
        }
        validateConsulta();
    }//GEN-LAST:event_button_finalizarConsultaActionPerformed

    private void jScrollPane1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jScrollPane1AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1AncestorMoved

    private void input_nomePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nomePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_nomePacienteActionPerformed

    private void checkbox_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_pacienteActionPerformed
    }//GEN-LAST:event_checkbox_pacienteActionPerformed

    private void button_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cadastrarActionPerformed
        if (emptyFields() == true) {

        } else if (emptyFields() == false && validateFields() == false) {
            getConsulta();
            inserirConsulta(getConsulta());
            cadastroConsulta.dispose();
            printConsulta();
            cleanFields();
        }
    }//GEN-LAST:event_button_cadastrarActionPerformed

    private void button_excluirConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_excluirConsultaActionPerformed
        excluirConsulta();
    }//GEN-LAST:event_button_excluirConsultaActionPerformed

    private void checkbox_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_consultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkbox_consultaActionPerformed

    private void button_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_finalizarActionPerformed
        if (emptyPane() == true) {
        } else {
            setReceitaPane();
            finalizarConsulta();
            atualizarTabela();
        }
    }//GEN-LAST:event_button_finalizarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CrudConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_cadastrar;
    private javax.swing.JButton button_excluirConsulta;
    private javax.swing.JButton button_finalizar;
    private javax.swing.JButton button_finalizarConsulta;
    private javax.swing.JButton button_novaConsuta;
    private javax.swing.JFrame cadastroConsulta;
    private javax.swing.JCheckBox checkbox_consulta;
    private javax.swing.JCheckBox checkbox_paciente;
    private javax.swing.JFrame detalheConsulta;
    private javax.swing.JTextField input_cpf;
    private javax.swing.JTextField input_dataConsulta;
    private javax.swing.JTextField input_nomePaciente;
    private javax.swing.JTextField input_telefone;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_cpf;
    private javax.swing.JLabel label_dataConsulta;
    private javax.swing.JLabel label_detalhes;
    private javax.swing.JLabel label_paciente;
    private javax.swing.JLabel label_receita;
    private javax.swing.JLabel label_telefone;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JTable table_consultas;
    private javax.swing.JTextPane textPane_receita;
    // End of variables declaration//GEN-END:variables

    public Consulta getConsulta() {
        Consulta consulta = new Consulta();

        try {

            consulta.setNome_paciente(input_nomePaciente.getText());
            consulta.setTelefone_paciente(input_telefone.getText());
            consulta.setCpf_paciente(input_cpf.getText());
            consulta.setData_Consulta(input_dataConsulta.getText());
            consulta.setConsulta_realizada("não");
            consulta.setReceita(textPane_receita.getText());

            if (checkbox_paciente.isSelected()) {
                consulta.setPaciente_cadastrado("sim");
            } else {
                consulta.setPaciente_cadastrado("não");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro ao cadastrar a consulta.\nERRO:" + e.getMessage());
        }

        return consulta;
    }

    private void printConsulta() {
        JOptionPane.showMessageDialog(rootPane, "Consulta cadastrada com sucesso.\nNome do paciente:" + input_nomePaciente.getText()
                + "\nTelefone:" + input_telefone.getText()
                + "\nCPF:" + input_cpf.getText()
                + "\nData da consulta:" + input_dataConsulta.getText());
    }

    private void inserirConsulta(Consulta consulta) {
        try {
            consultasList.add(consulta);
            atualizarTabela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Não foi possível adicionar a consulta na tabela.\nERRO:" + e.getMessage());
        }
    }

    private int getIndexConsulta() {
        int indexConsulta = table_consultas.getSelectedRow();

        try {
            if (indexConsulta == -1) {
                JOptionPane.showMessageDialog(rootPane, "Selecione uma consulta.");
            }
        } catch (Exception e) {

        }
        return indexConsulta;
    }

    private void excluirConsulta() {

        try {
            String[] option = {"Sim", "Não"};

            if (getIndexConsulta() >= 0) {
                int delete = JOptionPane.showOptionDialog(rootPane, "Tem certeza que deseja excluir a consulta?", "Excluir consulta", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);

                if (delete == 0) {
                    consultasList.remove(getIndexConsulta());
                    atualizarTabela();
                } else {
                    table_consultas.clearSelection();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Não foi possível excluir consulta");
        }
    }

    private void finalizarConsulta() {

        try {
            String[] option = {"Sim", "Não"};
            int finalizar = JOptionPane.showOptionDialog(rootPane, "Tem certeza que deseja finalizar a consulta?", "Excluir consulta", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);

            if (finalizar == 0) {
                consultasList.get(getIndexConsulta()).setConsulta_realizada("sim");
            } else {
                consultasList.get(getIndexConsulta()).setConsulta_realizada("não");
            }

            detalheConsulta.dispose();
        } catch (Exception e) {

        }
    }

    private void validateConsulta() {
        checkbox_consulta.setSelected(true);
        checkbox_consulta.setEnabled(false);
    }

    private void mostrarDetalheConsulta() {
        try {
            if (!(getIndexConsulta() == -1)) {
                detalheConsulta.setVisible(true);
                detalheConsulta.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                detalheConsulta.setLocationRelativeTo(null);
            }
        } catch (Exception e) {

        }

    }

    private void setReceitaPane() {
        consultasList.get(getIndexConsulta()).setReceita(textPane_receita.getText());
    }

    private void getReceitaPane() {

        textPane_receita.setText(consultasList.get(table_consultas.getSelectedRow()).getReceita());

    }

    private void setButtonVisible() {

        if (consultasList.get(getIndexConsulta()).getConsulta_realizada().equals("não")) {
            button_finalizar.setVisible(true);
        } else if (consultasList.get(getIndexConsulta()).getConsulta_realizada().equals("sim")) {
            button_finalizar.setVisible(false);
        }
    }

    private void cleanFields() {
        input_nomePaciente.setText("");
        input_telefone.setText("");
        input_cpf.setText("");
        input_dataConsulta.setText("");
    }

    private boolean emptyFields() {

        boolean empty = true;

        try {
            if (input_nomePaciente.getText().trim().isEmpty()) {

                JOptionPane.showMessageDialog(rootPane, "Insira nome do Paciente!\nNome não pode ser vazio.");
            } else if (input_telefone.getText().trim().isEmpty()) {

                JOptionPane.showMessageDialog(rootPane, "Insira um telefone!\nNúmero de telefone não pode ser vazio.");
            } else if (input_cpf.getText().trim().isEmpty()) {

                JOptionPane.showMessageDialog(rootPane, "Insira um CPF!\nCPF do paciente não pode ser vazio.");
            } else if (input_dataConsulta.getText().trim().isEmpty()) {

                JOptionPane.showMessageDialog(rootPane, "Insira a data da consulta!\nData da consulta não pode ser vazio.");
            } else {
                empty = false;
            }
        } catch (Exception e) {

        }

        return empty;
    }

    private boolean emptyPane() {
        boolean emptyPane = true;

        try {
            if (textPane_receita.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Insira a receita ou alguma observação.");
            } else {
                emptyPane = false;
            }
        } catch (Exception e) {

        }
        return emptyPane;
    }

    private boolean validateFields() {
        boolean validate = true;

        try {
            if (!input_telefone.getText().matches("[0-9]{10,11}")) {
                JOptionPane.showMessageDialog(rootPane, "Número de telefone inválido.\nDigite apenas números, sem parênteses ou traços.");
            } else if (!input_cpf.getText().matches("[0-9]{3}[0-9]{3}[0-9]{3}[0-9]{2}")) {
                JOptionPane.showMessageDialog(rootPane, "CPF Inválido.\nDigite somente números, sem pontos ou traços.");
            } else if (!input_dataConsulta.getText().matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}")) {
                JOptionPane.showMessageDialog(rootPane, "Formato de data inválida.\nDigite a data no formato dd/mm/aaaa.");
            } else {
                validate = false;
            }
        } catch (Exception e) {
        }
        return validate;
    }

    private void atualizarTabela() {

        try {
            if (!consultasList.isEmpty()) {

                Consulta consulta;

                tableModel = new DefaultTableModel(tableColumns, 0);

                for (int i = 0; i < consultasList.size(); i++) {

                    consulta = consultasList.get(i);

                    String[] rowData = {consulta.getNome_paciente(), consulta.getTelefone_paciente(), consulta.getCpf_paciente(), consulta.getData_consulta(), consulta.getPaciente_cadastrado(), consulta.getConsulta_realizada()};

                    tableModel.addRow(rowData);
                }

                table_consultas.setModel(tableModel);
            } else {

                tableModel = new DefaultTableModel(tableColumns, 0);
                table_consultas.setModel(tableModel);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Não é possível visualizar consultas na tabela.\nERRO:" + e.getMessage());
        }
    }
}
