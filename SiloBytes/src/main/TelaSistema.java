// Autor: Juan Carlos Cardoso de Oliveira
package main;

import util.Info;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class TelaSistema extends javax.swing.JFrame {

    public TelaSistema() {
        initComponents();
        atualizarInformacoes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelCapacidadeSilo = new javax.swing.JLabel();
        campoQtdArmSilo = new javax.swing.JTextField();
        labelArmazenamentoKg = new javax.swing.JLabel();
        labelUtilizacaoSilo = new javax.swing.JLabel();
        campoUtilizacaoSilo = new javax.swing.JTextField();
        labelUtilizacaoKg = new javax.swing.JLabel();
        campoPorcentagem = new javax.swing.JTextField();
        labelPorcentagem = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        btnCadArmazenagem = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuUsuarios = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenuItem();
        menuConfiguracoes = new javax.swing.JMenu();
        menuConfiguracoesSistema = new javax.swing.JMenuItem();
        menuOpcoes = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SiloBytes");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelCapacidadeSilo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCapacidadeSilo.setText("Capacidade de Armazenamento do Silo:");

        campoQtdArmSilo.setEditable(false);
        campoQtdArmSilo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        labelArmazenamentoKg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelArmazenamentoKg.setText("kg.");

        labelUtilizacaoSilo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelUtilizacaoSilo.setText("Utilização do Silo:");

        campoUtilizacaoSilo.setEditable(false);
        campoUtilizacaoSilo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        labelUtilizacaoKg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelUtilizacaoKg.setText("kg.");

        campoPorcentagem.setEditable(false);
        campoPorcentagem.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        labelPorcentagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPorcentagem.setText("%");

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo350px.jpg"))); // NOI18N

        btnCadArmazenagem.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCadArmazenagem.setText("Cadastrar Armazenagem");
        btnCadArmazenagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadArmazenagemActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnAtualizar.setText("Atualizar Informações");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(715, Short.MAX_VALUE)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAtualizar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCapacidadeSilo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelUtilizacaoSilo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoUtilizacaoSilo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelUtilizacaoKg))
                            .addComponent(btnCadArmazenagem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoQtdArmSilo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(campoPorcentagem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelArmazenamentoKg)
                            .addComponent(labelPorcentagem))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCapacidadeSilo)
                    .addComponent(campoQtdArmSilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelArmazenamentoKg))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUtilizacaoSilo)
                    .addComponent(campoUtilizacaoSilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUtilizacaoKg)
                    .addComponent(campoPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPorcentagem))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadArmazenagem)
                    .addComponent(btnAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menuCadastro.setText("Cadastro");

        jMenuItem1.setText("Cadastro de Armazenagem");
        menuCadastro.add(jMenuItem1);

        menuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-user-account-16.png"))); // NOI18N
        menuUsuarios.setText("Cadastro de Usuários");
        menuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuariosActionPerformed(evt);
            }
        });
        menuCadastro.add(menuUsuarios);

        menuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-budget-16.png"))); // NOI18N
        menuClientes.setText("Cadastro de Clientes");
        menuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientesActionPerformed(evt);
            }
        });
        menuCadastro.add(menuClientes);

        jMenuBarPrincipal.add(menuCadastro);

        menuConfiguracoes.setText("Configurações");

        menuConfiguracoesSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-settings-16.png"))); // NOI18N
        menuConfiguracoesSistema.setText("Configurações do Sistema");
        menuConfiguracoesSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConfiguracoesSistemaActionPerformed(evt);
            }
        });
        menuConfiguracoes.add(menuConfiguracoesSistema);

        jMenuBarPrincipal.add(menuConfiguracoes);

        menuOpcoes.setText("Opções");

        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-exit-16.png"))); // NOI18N
        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuOpcoes.add(menuSair);

        menuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-about-16.png"))); // NOI18N
        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        menuOpcoes.add(menuSobre);

        jMenuBarPrincipal.add(menuOpcoes);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuariosActionPerformed
        // Abre a tela para cadastro de usuários.
        JFrame telausuario = new TelaNovoUsuario();
        telausuario.setLocationRelativeTo(null);
        telausuario.setVisible(true);
    }//GEN-LAST:event_menuUsuariosActionPerformed

    private void menuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientesActionPerformed
        // Abre a tela para cadastro de usuários.
        JFrame telaclientes = new TelaCadastroClientes();
        telaclientes.setLocationRelativeTo(null);
        telaclientes.setVisible(true);
    }//GEN-LAST:event_menuClientesActionPerformed

    private void menuConfiguracoesSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConfiguracoesSistemaActionPerformed
        // Abre a tela de configuração do sistema.
        JFrame telaqtdsilo = new TelaConfiguracao();
        telaqtdsilo.setLocationRelativeTo(null);
        telaqtdsilo.setVisible(true);
    }//GEN-LAST:event_menuConfiguracoesSistemaActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        // Fecha a aplicação.
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        // Abre a tela de Sobre do sistema.
        JFrame telasobre = new TelaSobre();
        telasobre.setLocationRelativeTo(null);
        telasobre.setVisible(true);
    }//GEN-LAST:event_menuSobreActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        atualizarInformacoes();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnCadArmazenagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadArmazenagemActionPerformed
        // Abre a tela de configuração do sistema.
        JFrame telaArmazenagem = new TelaArmazenagem();
        telaArmazenagem.setLocationRelativeTo(null);
        telaArmazenagem.setVisible(true);
    }//GEN-LAST:event_btnCadArmazenagemActionPerformed

    // Função para verificar a capacidade do silo.
    public static int verificarArmazenamentoSilo() {
        int quantidade = 0;
        // Lê o arquivo com a quantidade de armazenamento do silo.
        try {
            File file = new File(Info.ARQUIVO_QTD_SILO); 
            BufferedReader br = new BufferedReader(new FileReader(file)); 
            String st; 
            while ((st = br.readLine()) != null) 
                quantidade = Integer.valueOf(st);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler configurações do sistema.");            
        }
        return quantidade;
    }
    
    // Função para calcular a utilização do silo.
    public static int calcularUso() {
        // Variável para salvar o total de uso do silo.
        int total = 0;
        
        // Lê o arquivo com informações dos usuários.
        String dados = null;
        try {   
            // Escreve todas as informações do arquivo em uma String.
            dados = new String(Files.readAllBytes(Paths.get(Info.ARQUIVO_ARMAZENAGENS)));
        } catch (IOException ex) {
            System.out.println(ex);
        }
                
        // Criação da lista para armazenar todas as informações do arquivo.
        List<String[]> lista = new ArrayList<String[]>();

        // Obtém cada linha da String com os dados do arquivo de armazenagens.
        String[] linhas = dados.split("\n");

        // Passa por cada linha da String para gerar as colunas das armazenagens.
        for (int i = 0; i < linhas.length; i++) {
            
            // Gerando as colunas.
            String[] colunas = linhas[i].split(";");

            // A adicionando à lista.
            lista.add(colunas);

            // Realiza a soma de todas as quantidades de armazenagens.
            total = total + Integer.valueOf(lista.get(i)[1]);
        }
        return total;
    }
    
    // Função para calcular a porcentagem de utilização do silo.
    public static double calcularPorcentagemUso() {
        // Recebe a quantidade de uso do silo.
        double uso = calcularUso();
        
        // Recebe a capacidade total do silo.
        double total = verificarArmazenamentoSilo();

        // Calcula e retorna a porcentagem.
        double porcentagem = ((uso/total)*100); 
        return porcentagem;
    }
    
    public void atualizarInformacoes() {
        // Verifica a capacidade de armazenamento do silo e mostra na tela.
        campoQtdArmSilo.setText(String.valueOf(verificarArmazenamentoSilo()));
                
        // Calcula a quantidade utilizada do silo e mostra na tela.
        campoUtilizacaoSilo.setText(String.valueOf(calcularUso()));
        
        // Calcula a porcentagem de utilização do silo e mostra na tela.
        campoPorcentagem.setText(String.valueOf(calcularPorcentagemUso()));
    }
    
    public static void main(String args[]) {
        try { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadArmazenagem;
    private javax.swing.JTextField campoPorcentagem;
    private javax.swing.JTextField campoQtdArmSilo;
    private javax.swing.JTextField campoUtilizacaoSilo;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelArmazenamentoKg;
    private javax.swing.JLabel labelCapacidadeSilo;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelPorcentagem;
    private javax.swing.JLabel labelUtilizacaoKg;
    private javax.swing.JLabel labelUtilizacaoSilo;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuClientes;
    private javax.swing.JMenu menuConfiguracoes;
    private javax.swing.JMenuItem menuConfiguracoesSistema;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuSobre;
    private javax.swing.JMenuItem menuUsuarios;
    // End of variables declaration//GEN-END:variables
}
