package IniciandoMiniProjetos.domain;

import java.util.Scanner;

public class SistemaDeBiblioteca {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] livros = new String[5];
        int[] anoDoLivro = new int[5];

        int opcao = 7;

        while(opcao != 0){

            System.out.println("=============================");
            System.out.println("     SISTEMA BIBLIOTECA      ");
            System.out.println("=============================");
            System.out.println("1 - Cadastrar livros");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Pesquisar livros");
            System.out.println("4 - Mostrar quantidade de livros");
            System.out.println("5 - Mostrar livro mais antigo");
            System.out.println("0 - Sair");
            System.out.print("Digite sua opção:");
            opcao = teclado.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("1 - Cadastrar livros.");

                    for(int i = 0; i < livros.length; i++) {
                        System.out.print("Digite o nome do livro: ");
                        livros[i] = teclado.next();
                        System.out.print("Digite o ano do livro:");
                        anoDoLivro[i] = teclado.nextInt();
                    }

                    System.out.println("Livros cadastrados com sucesso!");
                    break;
                case 2:
                    System.out.println("2 - Listar livros");

                    for(int i = 0; i < livros.length; i++){
                        System.out.println("Livro: "+livros[i]+ " Ano: "+anoDoLivro[i]);
                    }

                    break;
                case 3:
                    System.out.println("3 - Pesquisar livro.");
                    System.out.print("Digite o número do livro: ");

                    int posicao = teclado.nextInt();

                        if(posicao < 1 || posicao > 5){
                            System.out.println("Posição sem estoque.");
                        }else{
                            System.out.println("Livro:"+livros[posicao - 1]);
                            System.out.println("Ano:"+anoDoLivro[posicao - 1]);
                        }

                     break;
                case 4:
                    System.out.println("4 - Mostrar quantidade de livros");

                    int quantidadeDeLivros = 0;

                    for(int i = 0; i < livros.length; i++){
                        quantidadeDeLivros++;
                    }
                    System.out.println("Quantidade de livros cadastrados: "+quantidadeDeLivros);
                    break;
                case 5:
                    System.out.println("5 - Mostrar livro mais antigo.");
                    int anoMaisAntigo = anoDoLivro[0];
                    String livroMaisAntigo = livros[0];
                    for(int i = 0; i < anoDoLivro.length; i++){
                        if(anoDoLivro[i] < anoMaisAntigo){
                            anoMaisAntigo = anoDoLivro[i];
                            livroMaisAntigo = livros[i];
                        }
                    }
                    System.out.println("Livro: "+livroMaisAntigo+ " Ano: "+anoMaisAntigo);
                    break;
                case 6:
                    System.out.println("6 - Pesquisar livros por nome.");
                    System.out.print("Digite o nome do livro: ");

                    teclado.nextLine();
                    String nomePesquisa = teclado.nextLine();

                    boolean encontrado = false;

                    for(int i = 0; i < livros.length; i++){

                        if(nomePesquisa.equals(livros[i])){

                            encontrado = true;

                            System.out.println("Livro: " + livros[i]);
                            System.out.println("Ano: "+anoDoLivro[i]);
                            break;
                        }
                    }

                    if(!encontrado){
                        System.out.println("Livro não encontrado.");
                    }

                    break;
                case 0:
                    System.out.println("SISTEMA ENCERRADO");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        teclado.close();
    }
}
