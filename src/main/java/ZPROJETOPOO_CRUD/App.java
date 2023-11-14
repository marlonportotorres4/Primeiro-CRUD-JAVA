package ZPROJETOPOO_CRUD;

import java.util.ArrayList;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Estoque> estoque = new ArrayList<>();
        ArrayList<Fornecedor> fornecedor = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("---------Seleciona uma opção---------\n");
            System.out.println("1-Consultar os produtos");
            System.out.println("2-Consultar o estoque");
            System.out.println("3-Consultar os fornecedores");
            System.out.println("4-Sair\n");
            int opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("---------Seleciona uma opção---------\n");
                    System.out.println("1-Adicionar produto");
                    System.out.println("2-Deletar produto");
                    System.out.println("3-Listar produtos");
                    System.out.println("4-Buscar produto");
                    System.out.println("5-Editar produto");
                    System.out.println("6-Voltar\n");
                    int opcao2 = in.nextInt();

                    switch (opcao2) {
                        case 1:
                            cadastrarProduto(produtos, in);
                            break;
                        case 2:
                            deletarProduto(produtos, in);
                            break;

                        case 3:
                            listarProdutos(produtos);
                            break;
                        case 4:
                            buscarProduto(produtos, in);
                            break;
                        case 5:
                            editarProduto(produtos, in);
                            break;
                        case 6:
                            System.out.println("Voltando...\n");
                            break;
                        default:
                            System.out.println("Opção inválida...");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("---------Seleciona uma opção---------\n");
                    System.out.println("1-Adicionar estoque de produtos");
                    System.out.println("2-Deletar estoque de produtos");
                    System.out.println("3-Listar estoques disponiveis");
                    System.out.println("4-Atualizar estoque de produtos");
                    System.out.println("5-Voltar\n");
                    int opcao3 = in.nextInt();
                    switch (opcao3) {
                        case 1:
                            adicionarEstoque(estoque, in);
                            break;
                        case 2:
                            deletarEstoque(estoque, in);
                            break;

                        case 3:
                            listarEstoque(estoque);
                            break;
                        case 4:
                            atualizarEstoque(estoque, in);
                            break;
                        case 5:
                            System.out.println("Voltando...\n");
                            break;
                        default:
                            System.out.println("Opção inválida...");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("---------Seleciona uma opção---------\n");
                    System.out.println("1-Cadastrar fornecedor");
                    System.out.println("2-Deletar fornecedor");
                    System.out.println("3-Listar fornecedores");
                    System.out.println("4-Buscar fornecedor");
                    System.out.println("5-Editar fornecedor");
                    System.out.println("6-Voltar\n");
                    int opcao4 = in.nextInt();
                    switch (opcao4) {
                        case 1:
                            cadastrarFornecedor(fornecedor, in);
                            break;
                        case 2:
                            deletarFornecedor(fornecedor, in);
                            break;
                        case 3:
                            listarFornecedor(fornecedor);
                            break;
                        case 4:
                            buscarFornecedor(fornecedor, in);
                            break;
                        case 5:
                               editarFornecedor(fornecedor, in); 
                        case 6:
                            System.out.println("Voltando...\n");
                            break;
                        default:
                            System.out.println("Opção inválida...");
                            break;
                    }

                    break;
                case 4:
                    in.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida...");
                    break;
            }

        }

    }

    public static void cadastrarFornecedor(ArrayList<Fornecedor> fornecedor, Scanner in) {
        Fornecedor forne = new Fornecedor();

        forne.setId(forne.getId() + 1);

        System.out.println("Digite o nome do fornecedor:");
        in.nextLine();
        forne.setNome(in.nextLine());

        System.out.println("Digite o CPF do fornecedor:");
        forne.setCpf(in.nextLine());

        System.out.println("Digite o CNPJ do fornecedor:");
        forne.setCnpj(in.nextLine());

        System.out.println("Digite o RG do fornecedor:");
        forne.setRg(in.nextLine());

        System.out.println("Digite o e-mail do fornecedor:");
        forne.setEmail(in.nextLine());

        System.out.println("Digite o telefone de contato do fornecedor:");
        forne.setTelefoneContato(in.nextLine());

        System.out.println("Digite a data de nascimento do fornecedor (caso seja pessoa física):");
        forne.setDataNascimento(in.nextLine());

        System.out.println("Digite o logradouro do fornecedor:");
        forne.setLogradouro(in.nextLine());

        System.out.println("Digite o bairro do fornecedor:");
        forne.setBairro(in.nextLine());

        System.out.println("Digite a cidade do fornecedor:");
        forne.setCidade(in.nextLine());

        System.out.println("Digite o estado do fornecedor:");
        forne.setEstado(in.nextLine());

        System.out.println("Digite o número da casa do fornecedor:");
        forne.setNumeroCasa(in.nextLine());

        System.out.println("Digite o CEP do fornecedor:");
        forne.setCep(in.nextLine());

        System.out.println("Digite a data de cadastro do fornecedor:");
        forne.setDataCadastro(in.nextLine());

        fornecedor.add(forne);
        System.out.println("\n---FORNECEDOR ADICIONADO COM SUCESSO---\n");
    }

    public static void deletarFornecedor(ArrayList<Fornecedor> fornecedor, Scanner in) {

        System.out.println("Digite o NOME do fornecedor que deseja deletar:");
        in.nextLine();
        String nome = in.nextLine();
        for (Fornecedor forn : fornecedor) {
            if (forn.getNome().equalsIgnoreCase(nome)) {
                fornecedor.remove(forn);
                System.out.println("---FORNECEDOR REMOVIDO COM EXITO---");
                return;
            }
        }
        System.out.println("---PRODUTO INEXISTENTE---\n");
    }

    public static void listarFornecedor(ArrayList<Fornecedor> fornecedor) {
        System.out.println("Lista dos fornecedores:\n");
        for (Fornecedor forn : fornecedor) {
            System.out.println("ID: " + forn.getId() + ", Nome: " + forn.getNome()
                    + ", CPF: " + forn.getCpf() + ", CNPJ: " + forn.getCnpj()
                    + ", RG: " + forn.getRg()
                    + ", E-mail: " + forn.getEmail()
                    + ", Telefone: " + forn.getTelefoneContato()
                    + ", Data de Nascimento: " + forn.getDataNascimento()
                    + ", Logradouro: " + forn.getLogradouro()
                    + ", Bairro: " + forn.getBairro()
                    + ", Cidade: " + forn.getCidade()
                    + ", Estado: " + forn.getEstado()
                    + ", Número da Casa: " + forn.getNumeroCasa()
                    + ", CEP: " + forn.getCep()
                    + ", Data de Cadastro: " + forn.getDataCadastro() + ".");
        }
    }

    public static void buscarFornecedor(ArrayList<Fornecedor> fornecedor, Scanner in) {
        System.out.println("Digite o NOME  do fornecedor que deseja encontrar:");
        in.nextLine();
        String noome = in.nextLine();

        for (Fornecedor forn : fornecedor) {
            if (forn.getNome().equalsIgnoreCase(noome)) {
                System.out.println("Produto de nome: " + forn.getNome() + " Encontrado.");
                return;
            }
        }
        System.out.println("---PRODUTO INEXISTENTE---");
    }

    public static void cadastrarProduto(ArrayList<Produto> produtos, Scanner in) {
        Produto produto = new Produto();

        int maiorId = 0;
        for (Produto pro : produtos) {
            if (pro.getId() > maiorId) {
                maiorId = pro.getId();
            }
        }

        produto.setId(maiorId + 1);

        System.out.println("Digite o código do produto:");
        in.nextLine();
        produto.setCodigo(in.nextLine());
        System.out.println("Digite o nome do produto:");
        produto.setNome(in.nextLine());
        System.out.println("Digite o valor do produto:");
        produto.setValor(in.nextDouble());
        System.out.println("Digite o fornecedor do produto:");
        in.nextLine();
        produto.setFornecedor(in.nextLine());
        System.out.println("Digite a descrição do produto:");
        produto.setDescricao(in.nextLine());

        produtos.add(produto);
        System.out.println("\n---PRODUTO ADICIONADO COM EXITO---\n");

    }

    public static void deletarProduto(ArrayList<Produto> produtos, Scanner in) {

        System.out.println("Digite o ID do produto que deseja deletar:");
        int id = in.nextInt();
        for (Produto pro : produtos) {
            if (pro.getId() == id) {
                produtos.remove(pro);
                System.out.println("---PRODUTO REMOVIDO COM EXITO---");
                return;
            }
        }
        System.out.println("---PRODUTO INEXISTENTE---\n");
    }

    public static void listarProdutos(ArrayList<Produto> produtos) {
        System.out.println("Lista dos produtos:\n");
        for (Produto pro : produtos) {
            System.out.println("ID: " + pro.getId() + ", Nome: " + pro.getNome()
                    + ", Descrição: " + pro.getDescricao()
                    + ", Valor: " + pro.getValor() + "RS, Fornecedor: " + pro.getFornecedor()
                    + ", Código: " + pro.getCodigo() + ".");
        }
    }

    public static void buscarProduto(ArrayList<Produto> produtos, Scanner in) {
        System.out.println("Digite o nome do produto que deseja encontrar:");
        in.nextLine();
        String noome = in.next();

        for (Produto pro : produtos) {
            if (pro.getNome().equalsIgnoreCase(noome)) {
                System.out.println("Produto de nome: " + pro.getNome() + " Encontrado.");
                return;
            }
        }
        System.out.println("---PRODUTO INEXISTENTE---");
    }

    public static void adicionarEstoque(ArrayList<Estoque> estoque, Scanner in) {
        Estoque estoq = new Estoque();

        System.out.println("Digite o nome do produto:");
        in.nextLine();
        estoq.setNomeProduto(in.nextLine());
        System.out.println("Digite a quantidade desse produto:");
        estoq.setQuantidade(in.nextInt());
        System.out.println("Digite o corredor deste produto:");
        in.nextLine();
        estoq.setCorredor(in.nextLine());
        System.out.println("Digite a prateleira deste produto:");
        estoq.setPrateleira(in.nextLine());
        System.out.println("Digite a validade deste produto:");
        estoq.setValidade(in.nextLine());

        estoque.add(estoq);
        System.out.println("\n---ESTOQUE ADICIONADO COM EXITO---\n");
    }

    public static void deletarEstoque(ArrayList<Estoque> estoque, Scanner in) {

        System.out.println("Digite o NOME do produto que possue estoque:");
        in.nextLine();
        String nome = in.nextLine();
        for (Estoque esto : estoque) {
            if (esto.getNomeProduto().equalsIgnoreCase(nome)) {
                estoque.remove(esto);
                System.out.println("---ESTOQUE REMOVIDO COM EXITO---");
                return;
            }
        }
        System.out.println("---ESTOQUE INEXISTENTE---\n");
    }

    public static void listarEstoque(ArrayList<Estoque> estoque) {
        System.out.println("Lista dos estoques:\n");
        for (Estoque esto : estoque) {
            System.out.println("Produto: " + esto.getNomeProduto() + ", Quantidade: "
                    + esto.getQuantidade() + ", Corredor: " + esto.getCorredor() + ", Prateleira: "
                    + esto.getPrateleira() + ", Validade: " + esto.getValidade() + ".");
        }
    }

    public static void atualizarEstoque(ArrayList<Estoque> estoque, Scanner in) {
        Estoque estoq = new Estoque();

        System.out.println("Digite o nome do produto que deseja encontrar:");
        in.nextLine();
        String noome = in.nextLine();

        for (Estoque esto : estoque) {
            if (esto.getNomeProduto().equalsIgnoreCase(noome)) {
                System.out.println("PRODUTO ENCONTRADO\n");
                System.out.println(" Aqui estão os dados do produto: "
                        + "Produto: " + esto.getNomeProduto() + ", Quantidade: "
                        + esto.getQuantidade() + ", Corredor: " + esto.getCorredor() + ", Prateleira: "
                        + esto.getPrateleira() + ", Validade: " + esto.getValidade() + ".");
                System.out.println("\nDIGITE O QUE DESEJA ATUALIZAR:\n");
                System.out.println("1-Nome do produto");
                System.out.println("2-Quantidade");
                System.out.println("3-Corredor");
                System.out.println("4-Prateleira");
                System.out.println("5-Validade");
                System.out.println("6-Cancelar");
                in.nextLine();
                int escolhaAtualizar = in.nextInt();

                switch (escolhaAtualizar) {

                    case 1:
                        System.out.println("Digite o novo NOME DO PRODUTO:");
                        estoq.setNomeProduto(in.nextLine());
                        break;
                    case 2:
                        System.out.println("Digite a nova QUANTIDADE:");
                        estoq.setQuantidade(in.nextInt());
                        break;
                    case 3:
                        System.out.println("Digite o novo CORREDOR:");
                        estoq.setCorredor(in.nextLine());
                        break;
                    case 4:
                        System.out.println("Digite a nova PRATELEIRA:");
                        estoq.setPrateleira(in.nextLine());
                        break;
                    case 5:
                        System.out.println("Digite a nova VALIDADE:");
                        estoq.setValidade(in.nextLine());
                        break;

                    case 6:
                        System.out.println("Cancelando...");
                        break;
                    default:
                        System.out.println("Opção inexistente...");
                        break;
                }

                return;
            }
        }
        System.out.println("---PRODUTO INEXISTENTE---");
    }

    public static void editarProduto(ArrayList<Produto> produtos, Scanner in) {
        Produto produto = new Produto();

        System.out.println("Digite o nome do produto que deseja encontrar:");
        in.nextLine();
        String nome = in.nextLine();

        for (Produto pro : produtos) {
            if (pro.getNome().equalsIgnoreCase(nome)) {

                System.out.println("PRODUTO ENCONTRADO\n");
                System.out.println("Aqui estão os dados do produto: ");
                System.out.println("Código: " + pro.getCodigo());
                System.out.println("Nome: " + pro.getNome());
                System.out.println("Valor: " + pro.getValor());
                System.out.println("Fornecedor: " + pro.getFornecedor());
                System.out.println("Descrição: " + pro.getDescricao());

                System.out.println("\nDIGITE O QUE DESEJA ATUALIZAR:\n");
                System.out.println("1 - Código do produto");
                System.out.println("2 - Nome do produto");
                System.out.println("3 - Valor do produto");
                System.out.println("4 - Fornecedor do produto");
                System.out.println("5 - Descrição do produto");
                System.out.println("6 - Cancelar");

                int escolhaAtualizar = in.nextInt();
                in.nextLine();

                switch (escolhaAtualizar) {
                    case 1:
                        System.out.println("Digite o novo código do produto:");
                        produto.setCodigo(in.nextLine());

                        break;
                    case 2:
                        System.out.println("Digite o novo nome do produto:");
                        produto.setNome(in.nextLine());
                        break;
                    case 3:
                        System.out.println("Digite o novo valor do produto:");
                        produto.setValor(in.nextDouble());
                        in.nextLine();
                        break;
                    case 4:
                        System.out.println("Digite o novo fornecedor do produto:");
                        produto.setFornecedor(in.nextLine());
                        break;
                    case 5:
                        System.out.println("Digite a nova descrição do produto:");
                        produto.setDescricao(in.nextLine());
                        break;
                    case 6:
                        System.out.println("Cancelando...");
                        break;
                    default:
                        System.out.println("Opção inexistente...");
                        break;
                }

                return;
            }

        }
        System.out.println("---PRODUTO INEXISTENTE---");
    }

    public static void editarFornecedor(ArrayList<Fornecedor> fornecedor, Scanner in) {
        Fornecedor forne = new Fornecedor();
        System.out.println("Digite o nome do fornecedor que deseja encontrar:");
        in.nextLine();
        String nome = in.nextLine();

        for (Fornecedor forn : fornecedor) {
            if (forn.getNome().equalsIgnoreCase(nome)) {

                System.out.println("Cliente de nome: " + forn.getNome() + " encontrado.\n");
                System.out.println("Aqui estão os dados do cliente: ");
                System.out.println("ID: " + forn.getId());
                System.out.println("Nome: " + forn.getNome());
                System.out.println("CPF: " + forn.getCpf());
                System.out.println("RG: " + forn.getRg());
                System.out.println("Email: " + forn.getEmail());
                System.out.println("Telefone de Contato: " + forn.getTelefoneContato());
                System.out.println("Data de Nascimento: " + forn.getDataNascimento());
                System.out.println("CNPJ: " + forn.getCnpj());
                System.out.println("Logradouro: " + forn.getLogradouro());
                System.out.println("Bairro: " + forn.getBairro());
                System.out.println("Cidade: " + forn.getCidade());
                System.out.println("Estado: " + forn.getEstado());
                System.out.println("Número da Casa: " + forn.getNumeroCasa());
                System.out.println("CEP: " + forn.getCep());
                System.out.println("Data de Cadastro: " + forn.getDataCadastro());

                System.out.println("\nDigite o que deseja atualizar:\n");
                System.out.println("1 - Nome do cliente");
                System.out.println("2 - CPF");
                System.out.println("3 - RG");
                System.out.println("4 - Email");
                System.out.println("5 - Telefone de Contato");
                System.out.println("6 - Data de Nascimento");
                System.out.println("7 - CNPJ");
                System.out.println("8 - Logradouro");
                System.out.println("9 - Bairro");
                System.out.println("10 - Cidade");
                System.out.println("11 - Estado");
                System.out.println("12 - Número da Casa");
                System.out.println("13 - CEP");
                System.out.println("14 - Data de Cadastro");
                System.out.println("15 - Cancelar");

                int escolhaAtualizar = in.nextInt();
                in.nextLine();

                switch (escolhaAtualizar) {
                    case 1:
                        System.out.println("Digite o novo nome do cliente:");
                        forne.setNome(in.nextLine());
                        break;
                    case 2:
                        System.out.println("Digite o novo CPF:");
                        forne.setCpf(in.nextLine());
                        break;
                    case 3:
                        System.out.println("Digite o novo RG:");
                        forne.setRg(in.nextLine());
                        break;
                    case 4:
                        System.out.println("Digite o novo email:");
                        forne.setEmail(in.nextLine());
                        break;
                    case 5:
                        System.out.println("Digite o novo telefone de contato:");
                        forne.setTelefoneContato(in.nextLine());
                        break;
                    case 6:
                        System.out.println("Digite a nova data de nascimento:");
                        forne.setDataNascimento(in.nextLine());
                        break;
                    case 7:
                        System.out.println("Digite o novo CNPJ:");
                        forne.setCnpj(in.nextLine());
                        break;
                    case 8:
                        System.out.println("Digite o novo logradouro:");
                        forne.setLogradouro(in.nextLine());
                        break;
                    case 9:
                        System.out.println("Digite o novo bairro:");
                        forne.setBairro(in.nextLine());
                        break;
                    case 10:
                        System.out.println("Digite a nova cidade:");
                        forne.setCidade(in.nextLine());
                        break;
                    case 11:
                        System.out.println("Digite o novo estado:");
                        forne.setEstado(in.nextLine());
                        break;
                    case 12:
                        System.out.println("Digite o novo número da casa:");
                        forne.setNumeroCasa(in.nextLine());
                        break;
                    case 13:
                        System.out.println("Digite o novo CEP:");
                        forne.setCep(in.nextLine());
                        break;
                    case 14:
                        System.out.println("Digite a nova data de cadastro:");
                        forne.setDataCadastro(in.nextLine());
                        break;
                    case 15:
                        System.out.println("Cancelando...");
                        break;
                    default:
                        System.out.println("Opção inexistente...");
                        break;
                }
                return;
            }

        }
        System.out.println("---CLIENTE INEXISTENTE---");

    }
}
