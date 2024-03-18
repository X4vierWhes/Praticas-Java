package Main;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import  Gateway.*;

public class Main {

    static GatewayInterface stub;
    static Client client;
    public static void main(String[] args) throws RemoteException {

        Scanner cin = new Scanner(System.in);
        System.out.println("Informe o nome/endereço do RMIRegistry");
        String host = cin.nextLine();

        try{
            Registry registro = LocateRegistry.getRegistry(host, Registry.REGISTRY_PORT);
            stub = (GatewayInterface) registro.lookup("Gateway");
            //System.out.println(stub.oi());
            stub.init();

            System.out.print("login:");
            String login = cin.nextLine();
            System.out.print("senha:");
            String password = cin.nextLine();
            System.out.println();

            if (stub.connect(login, password)) {
                client = new Client(new User(login, password), new Vehicle(), 10000.0);
                clientLoop(client);
            } else {
                System.out.println("Não foi possivel conectar, cliente nao possui conta.");
                System.out.println("Cadastre-se no sistema: ");
                while(true) {
                    System.out.print("login:");
                    login = cin.nextLine();
                    System.out.print("senha:");
                    password = cin.nextLine();
                    System.out.println();
                    if (stub.signIn(login, password)) {
                        client = new Client(new User(login, password), new Vehicle(), 10000.0);
                        clientLoop(client);
                        break;
                    } else {
                        System.err.println("Não foi possivel cadastrar, tente novamente");
                    }
                }

            }


        }catch (RemoteException e){
            e.printStackTrace();
        }catch (NotBoundException e){
            e.printStackTrace();
        }

    }

    public static void clientLoop(Client client){
        System.out.println("************************************");
        System.out.println("          Loja de Carros");
        System.out.println("Seja bem vindo!");
        Scanner cin = new Scanner(System.in);
        int escolha = 0;
        while (escolha != 9){
            System.out.println("************************************");
            System.out.println("               MENU");
            if(client.isAdmin()) {
                System.out.println("""
                        USUARIO: ADMINISTRADOR
                        ---------------------------------------------
                        1 | ADICIONAR CARRO
                        2 | DELETAR CARRO
                        3 | LISTAR TODOS OS CARROS
                        4 | LISTAR POR MODELO
                        5 | LISTAR POR CATEGORIA
                        6 | PESQUISAR CARRO
                        7 | ALTERAR CARRO
                        8 | QUANTIDADE DE CARROS NO SISTEMA
                        9 | SAIR                                                                            \s
                        """);
                try {
                    escolha = cin.nextInt();

                    switch (escolha){
                        case 1: break;
                        case 2: break;
                        case 3: break;
                        case 4: break;
                        case 5: break;
                        case 6: break;
                        case 7: break;
                        case 8: break;
                        case 9: break;
                        default: break;

                    }

                }catch(Exception e){
                    System.out.println("Numero invalido");
                }


            }else{
                System.out.println("USUARIO: " + client.getUser().getLogin());
                System.out.println("""                   
                        ---------------------------------------------
                        1 | LISTAR CARROS               \s
                        2 | LISTAR TODOS OS CARROS
                        3 | LISTAR POR MODELO
                        4 | LISTAR POR CATEGORIA
                        5 | PESQUISAR CARRO
                        6 | QUANTIDADE DE CARROS NO SISTEMA
                        7 | SAIR                                                                            \s
                        """);
                try {
                    escolha = cin.nextInt();

                    switch (escolha){
                        case 1: break;
                        case 2: break;
                        case 3: break;
                        case 4: break;
                        case 5: break;
                        case 6: break;
                        case 7:
                        case 8:
                        case 9: escolha = 9; break;
                        default: break;

                    }

                }catch(Exception e){
                    System.out.println("Numero invalido");
                }
            }
        }
    }

}

