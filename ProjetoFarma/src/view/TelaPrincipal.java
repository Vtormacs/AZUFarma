/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.ClienteDAO;
import dao.FornecedoresDAO;
import dao.FuncionarioDAO;
import dao.ProdutosDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Fornecedores;
import model.Funcionario;
import model.Produtos;
import utilitarios.Utilitarios;

/**
 *
 * @author vitor
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Este método público 'Listar' é usado para listar todos os clientes.
     * Primeiro, ele cria um novo objeto 'ClienteDAO' e chama o método 'Listar'.
     * O método 'Listar' retorna uma lista de todos os clientes. Em seguida, ele
     * obtém o modelo da tabela 'tabela_clientes' e limpa todas as linhas
     * existentes. Depois disso, ele percorre a lista de clientes e adiciona
     * cada cliente como uma nova linha na tabela. Cada linha contém detalhes do
     * cliente, incluindo id, nome, rg, cpf, sexo, email, telefone, celular,
     * cep, endereço, número, complemento, bairro, cidade e estado.
     */
    public void Listar() {
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> lista = dao.Listar();
        DefaultTableModel dados = (DefaultTableModel) tabela_clientes.getModel();
        dados.setNumRows(0);
        for (Cliente c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getRg(),
                c.getCpf(),
                c.getNomeSexo(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getEstado()
            });
        }
    }

    public void ListarFuncionario() {
        FuncionarioDAO dao = new FuncionarioDAO();
        List<Funcionario> lista = dao.Listar();
        DefaultTableModel dados = (DefaultTableModel) tabela_funcionarios.getModel();
        dados.setNumRows(0);
        for (Funcionario f : lista) {
            dados.addRow(new Object[]{
                f.getId(),
                f.getNome(),
                f.getRg(),
                f.getCpf(),
                f.getEmail(),
                f.getSenha(),
                f.getCargo(),
                f.getNivelAcesso(),
                f.getCelular()
            });
        }
    }
    
    public void ListarFornecedores() {
        FornecedoresDAO dao = new FornecedoresDAO();
        List<Fornecedores> lista = dao.Listar();
        DefaultTableModel dados = (DefaultTableModel) tabela_fornecedores.getModel();
        dados.setNumRows(0);
        for (Fornecedores c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCnpj(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getEstado()
            });
        }
    }
    
    public void ListarProdutos() {
        ProdutosDAO dao = new ProdutosDAO();
        List<Produtos> lista = dao.Listar();
        DefaultTableModel dados = (DefaultTableModel) tabela_produtos.getModel();
        dados.setNumRows(0);
        for (Produtos c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getDescricao(),
                c.getPreco(),
                c.getQtd_estoque(),
                c.getFornecedor().getNome(),
                c.getNomeClasse()
            });
        }
    }

    public TelaPrincipal() {
        initComponents();

        Utilitarios u = new Utilitarios();;
        u.InserirIcone(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        content = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        painel_consulta = new javax.swing.JPanel();
        txtPesquisaNome = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_clientes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Funcionarios1 = new javax.swing.JLabel();
        painel_fornecedores = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela_fornecedores = new javax.swing.JTable();
        Funcionarios2 = new javax.swing.JLabel();
        txtPesquisaNomeFornecedores = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        painel_funcionarios = new javax.swing.JPanel();
        txtPesquisaNomeFuncionario = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela_funcionarios = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        Funcionarios = new javax.swing.JLabel();
        painel_produtos = new javax.swing.JPanel();
        txtPesquisaNomeProduto = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabela_produtos = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        Funcionarios3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnProdutos = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnFuncionarios = new javax.swing.JButton();
        btnFornecedores = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AZUfarma");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(1250, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        content.setBackground(new java.awt.Color(153, 153, 153));
        content.setPreferredSize(new java.awt.Dimension(1090, 570));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setPreferredSize(new java.awt.Dimension(1090, 570));

        jLabel3.setText("primeira tela");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(467, 467, 467)
                .addComponent(jLabel3)
                .addContainerGap(627, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel3)
                .addContainerGap(360, Short.MAX_VALUE))
        );

        content.addTab("tab4", jPanel4);

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setPreferredSize(new java.awt.Dimension(1090, 570));

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jLabel4)
                .addContainerGap(761, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel4)
                .addContainerGap(364, Short.MAX_VALUE))
        );

        content.addTab("tab5", jPanel5);

        painel_consulta.setBackground(new java.awt.Color(153, 153, 153));

        txtPesquisaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaNomeActionPerformed(evt);
            }
        });
        txtPesquisaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaNomeKeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Nome:");

        jScrollPane1.setBackground(new java.awt.Color(204, 255, 255));

        tabela_clientes.setBackground(new java.awt.Color(255, 255, 255));
        tabela_clientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabela_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "RG", "CPF", "Sexo", "Email", "Telefone", "Celular", "CEP", "Endereço", "Numero", "Complemento", "Bairro", "Cidade", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_clientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_clientes);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Adicionar Cliente, Editar ou Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Funcionarios1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Funcionarios1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Funcionarios1.setText("CLIENTES");

        javax.swing.GroupLayout painel_consultaLayout = new javax.swing.GroupLayout(painel_consulta);
        painel_consulta.setLayout(painel_consultaLayout);
        painel_consultaLayout.setHorizontalGroup(
            painel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE)
            .addGroup(painel_consultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Funcionarios1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painel_consultaLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        painel_consultaLayout.setVerticalGroup(
            painel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_consultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Funcionarios1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        content.addTab("Consulta de Clientes", painel_consulta);

        painel_fornecedores.setBackground(new java.awt.Color(153, 153, 153));
        painel_fornecedores.setPreferredSize(new java.awt.Dimension(1090, 570));

        jScrollPane3.setBackground(new java.awt.Color(204, 255, 255));

        tabela_fornecedores.setBackground(new java.awt.Color(255, 255, 255));
        tabela_fornecedores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabela_fornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CNPJ", "Email", "Telefone", "Celular", "CEP", "Endereço", "N°", "Complemento", "Bairro", "Cidade", "Estado"
            }
        ));
        tabela_fornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_fornecedoresMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabela_fornecedores);

        Funcionarios2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Funcionarios2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Funcionarios2.setText("FORNECEDORES");

        txtPesquisaNomeFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaNomeFornecedoresActionPerformed(evt);
            }
        });
        txtPesquisaNomeFornecedores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaNomeFornecedoresKeyReleased(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Adicionar Funcionario,Editar ou Exluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Nome:");

        javax.swing.GroupLayout painel_fornecedoresLayout = new javax.swing.GroupLayout(painel_fornecedores);
        painel_fornecedores.setLayout(painel_fornecedoresLayout);
        painel_fornecedoresLayout.setHorizontalGroup(
            painel_fornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE)
            .addGroup(painel_fornecedoresLayout.createSequentialGroup()
                .addGroup(painel_fornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_fornecedoresLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisaNomeFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(painel_fornecedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Funcionarios2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painel_fornecedoresLayout.setVerticalGroup(
            painel_fornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_fornecedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Funcionarios2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_fornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtPesquisaNomeFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
        );

        content.addTab("tab6", painel_fornecedores);

        painel_funcionarios.setBackground(new java.awt.Color(153, 153, 153));

        txtPesquisaNomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaNomeFuncionarioActionPerformed(evt);
            }
        });
        txtPesquisaNomeFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaNomeFuncionarioKeyReleased(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Nome:");

        jScrollPane2.setBackground(new java.awt.Color(204, 255, 255));

        tabela_funcionarios.setBackground(new java.awt.Color(255, 255, 255));
        tabela_funcionarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabela_funcionarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabela_funcionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "RG", "CPF", "Email", "Senha", "Cargo", "Nivel", "Celular"
            }
        ));
        tabela_funcionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_funcionariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabela_funcionarios);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Adicionar Funcionario,Editar ou Exluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Funcionarios.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Funcionarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Funcionarios.setText("FUNCIONARIOS");

        javax.swing.GroupLayout painel_funcionariosLayout = new javax.swing.GroupLayout(painel_funcionarios);
        painel_funcionarios.setLayout(painel_funcionariosLayout);
        painel_funcionariosLayout.setHorizontalGroup(
            painel_funcionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(painel_funcionariosLayout.createSequentialGroup()
                .addGroup(painel_funcionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_funcionariosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisaNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 497, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(painel_funcionariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Funcionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painel_funcionariosLayout.setVerticalGroup(
            painel_funcionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_funcionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Funcionarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_funcionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtPesquisaNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
        );

        content.addTab("Consulta de Clientes", painel_funcionarios);

        painel_produtos.setBackground(new java.awt.Color(153, 153, 153));

        txtPesquisaNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaNomeProdutoActionPerformed(evt);
            }
        });
        txtPesquisaNomeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaNomeProdutoKeyReleased(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Descrição;");

        jScrollPane4.setBackground(new java.awt.Color(204, 255, 255));

        tabela_produtos.setBackground(new java.awt.Color(255, 255, 255));
        tabela_produtos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabela_produtos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabela_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descrição", "Preço", "qtd Estoque", "Fornecedor", "Classe"
            }
        ));
        tabela_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_produtosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabela_produtos);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Adicionar Produto,Editar ou Exluir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Funcionarios3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Funcionarios3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Funcionarios3.setText("PRODUTOS");

        javax.swing.GroupLayout painel_produtosLayout = new javax.swing.GroupLayout(painel_produtos);
        painel_produtos.setLayout(painel_produtosLayout);
        painel_produtosLayout.setHorizontalGroup(
            painel_produtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(painel_produtosLayout.createSequentialGroup()
                .addGroup(painel_produtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_produtosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisaNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 496, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(painel_produtosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Funcionarios3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painel_produtosLayout.setVerticalGroup(
            painel_produtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_produtosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Funcionarios3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_produtosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtPesquisaNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );

        content.addTab("Consulta de Clientes", painel_produtos);

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, -40, 1160, 610));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));

        btnProdutos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProdutos.setText("Produtos");
        btnProdutos.setBorder(null);
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        btnCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCliente.setText("Clientes");
        btnCliente.setBorder(null);
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnFuncionarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFuncionarios.setText("Funcionarios");
        btnFuncionarios.setBorder(null);
        btnFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionariosActionPerformed(evt);
            }
        });

        btnFornecedores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFornecedores.setText("Fornecedores");
        btnFornecedores.setBorder(null);
        btnFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnFuncionarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProdutos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFornecedores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 560));

        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/4850490_clients_communication_discussion_media_social_icon.png"))); // NOI18N
        jMenu1.setText("Clientes");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Formulario Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/7830741_human_resources_search_employees_icon.png"))); // NOI18N
        jMenu2.setText("Funcionários");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Formulario Funcionarios");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/9111289_delivery_icon.png"))); // NOI18N
        jMenu3.setText("Fornecedores");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Formulario Fornecedores");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/6791549_box_new product_package_product_products_icon.png"))); // NOI18N
        jMenu4.setText("Produtos");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem4.setText("Controle de Estoque");
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("Consulta de produtos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/134157_money_cashier_dollar_currency_icon.png"))); // NOI18N
        jMenu5.setText("Vendas");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem6.setText("Abir PTV");
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("Posição do Dia");
        jMenu5.add(jMenuItem7);

        jMenuItem8.setText("Historico de vendas");
        jMenu5.add(jMenuItem8);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1976057_config_configuration_settings_icon.png"))); // NOI18N
        jMenu6.setText("Configurações");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem9.setText("Trocar Usuario");
        jMenu6.add(jMenuItem9);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1564505_close_delete_exit_remove_icon.png"))); // NOI18N
        jMenu7.setText("Sair");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem10.setText("Sair do sistemas");
        jMenu7.add(jMenuItem10);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaNomeActionPerformed

    /**
     * Este método é chamado quando a janela do formulário é ativada. Ele chama
     * o método 'Listar()' para preencher a tabela na interface do usuário com a
     * lista atual de clientes.
     */
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Listar();
        ListarFuncionario();
        ListarFornecedores();
        ListarProdutos();
    }//GEN-LAST:event_formWindowActivated

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        content.setSelectedIndex(2);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        content.setSelectedIndex(5);
    }//GEN-LAST:event_btnProdutosActionPerformed

    /**
     * Este método é chamado quando uma tecla é liberada no campo de texto de
     * pesquisa por nome. Ele inicia um Timer que é reiniciado a cada vez que
     * uma tecla é liberada. Quando o Timer expira (ou seja, algum tempo após o
     * usuário parar de digitar), ele busca clientes cujo nome corresponde ao
     * texto no campo de pesquisa. Em seguida, ele atualiza a tabela na
     * interface do usuário com os clientes encontrados.
     */
    private void txtPesquisaNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaNomeKeyReleased

                String nome = "%" + txtPesquisaNome.getText() + "%";
                ClienteDAO dao = new ClienteDAO();
                List<Cliente> lista = dao.Filtrar(nome);
                DefaultTableModel dados = (DefaultTableModel) tabela_clientes.getModel();
                dados.setNumRows(0);
                for (Cliente c : lista) {
                    dados.addRow(new Object[]{
                        c.getId(),
                        c.getNome(),
                        c.getRg(),
                        c.getCpf(),
                        c.getNomeSexo(),
                        c.getEmail(),
                        c.getTelefone(),
                        c.getCelular(),
                        c.getCep(),
                        c.getEndereco(),
                        c.getNumero(),
                        c.getComplemento(),
                        c.getBairro(),
                        c.getCidade(),
                        c.getEstado()
                    });
                }
    }//GEN-LAST:event_txtPesquisaNomeKeyReleased

    /**
     * Este método é chamado quando um evento de clique do mouse é acionado na
     * tabela_clientes. Ele pega os valores da linha selecionada na tabela e
     * preenche os campos de texto correspondentes na interface do usuário. Isso
     * permite que os usuários vejam e editem os detalhes do cliente
     * selecionado.
     */
    private void tabela_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_clientesMouseClicked

    }//GEN-LAST:event_tabela_clientesMouseClicked

    private void btnFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionariosActionPerformed
        content.setSelectedIndex(4);
    }//GEN-LAST:event_btnFuncionariosActionPerformed

    private void txtPesquisaNomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaNomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaNomeFuncionarioActionPerformed

    private void txtPesquisaNomeFuncionarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaNomeFuncionarioKeyReleased
        String nome = "%" + txtPesquisaNomeFuncionario.getText() + "%";
                FuncionarioDAO dao = new FuncionarioDAO();
                List<Funcionario> lista = dao.Filtrar(nome);
                DefaultTableModel dados = (DefaultTableModel) tabela_funcionarios.getModel();
                dados.setNumRows(0);
                for (Funcionario f : lista) {
                    dados.addRow(new Object[]{
                        f.getId(),
                        f.getNome(),
                        f.getRg(),
                        f.getCpf(),
                        f.getEmail(),
                        f.getSenha(),
                        f.getCargo(),
                        f.getNivelAcesso(),
                        f.getCelular()
                    });
                }
    }//GEN-LAST:event_txtPesquisaNomeFuncionarioKeyReleased

    private void tabela_funcionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_funcionariosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabela_funcionariosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new CadastroDeCliente().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new CadastroFuncionario().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedoresActionPerformed
        content.setSelectedIndex(3);
    }//GEN-LAST:event_btnFornecedoresActionPerformed

    private void tabela_fornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_fornecedoresMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabela_fornecedoresMouseClicked

    private void txtPesquisaNomeFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaNomeFornecedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaNomeFornecedoresActionPerformed

    private void txtPesquisaNomeFornecedoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaNomeFornecedoresKeyReleased
        String nome = "%" + txtPesquisaNomeFornecedores.getText() + "%";
                FornecedoresDAO dao = new FornecedoresDAO();
                List<Fornecedores> lista = dao.Filtrar(nome);
                DefaultTableModel dados = (DefaultTableModel) tabela_fornecedores.getModel();
                dados.setNumRows(0);
                for (Fornecedores c : lista) {
                    dados.addRow(new Object[]{
                        c.getId(),
                        c.getNome(),
                        c.getCnpj(),
                        c.getEmail(),
                        c.getTelefone(),
                        c.getCelular(),
                        c.getCep(),
                        c.getEndereco(),
                        c.getNumero(),
                        c.getComplemento(),
                        c.getBairro(),
                        c.getCidade(),
                        c.getEstado()
                    });
                }
    }//GEN-LAST:event_txtPesquisaNomeFornecedoresKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new CadastroDeFornecedores().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       new CadastroDeCliente().setVisible(true); 
       content.setSelectedIndex(2);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new CadastroFuncionario().setVisible(true);
        content.setSelectedIndex(4);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new CadastroDeFornecedores().setVisible(true);
        content.setSelectedIndex(3);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void txtPesquisaNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaNomeProdutoActionPerformed

    private void txtPesquisaNomeProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaNomeProdutoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaNomeProdutoKeyReleased

    private void tabela_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_produtosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabela_produtosMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new CadastroDeProdutos().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Funcionarios;
    private javax.swing.JLabel Funcionarios1;
    private javax.swing.JLabel Funcionarios2;
    private javax.swing.JLabel Funcionarios3;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnFornecedores;
    private javax.swing.JButton btnFuncionarios;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JTabbedPane content;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel painel_consulta;
    private javax.swing.JPanel painel_fornecedores;
    private javax.swing.JPanel painel_funcionarios;
    private javax.swing.JPanel painel_produtos;
    private javax.swing.JTable tabela_clientes;
    private javax.swing.JTable tabela_fornecedores;
    private javax.swing.JTable tabela_funcionarios;
    private javax.swing.JTable tabela_produtos;
    private javax.swing.JTextField txtPesquisaNome;
    private javax.swing.JTextField txtPesquisaNomeFornecedores;
    private javax.swing.JTextField txtPesquisaNomeFuncionario;
    private javax.swing.JTextField txtPesquisaNomeProduto;
    // End of variables declaration//GEN-END:variables
}
