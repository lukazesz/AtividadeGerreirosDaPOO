// Classe principal que executa o jogo entre dois guerreiros.
public class Main {
    public static void main(String[] args) {

        //Criação de dois objetos guerreiros com respectivos código e nome;
        Guerreiro lucas = new Guerreiro(777, "Lucas");
        Guerreiro mateus = new Guerreiro(852, "Mateus");

        //Iniciando uma luta com os dois guerreiros usando o método com laço;
        lucas.lutarLoop(mateus);
        // mateus.lutarLoop(lucas);

        // Iniciando uma luta com método de recursividade;
        System.out.println(lucas.lutarRecursivo(mateus));
        System.out.println(mateus.lutarRecursivo(lucas));


        // Chamando o método para recuperar energia se alimentando;
        lucas.seAlimentar();

        // Exibindo as informações de um guerreiro.
        System.out.println(lucas.toString());
    }
    
}
