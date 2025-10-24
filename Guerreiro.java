//Construção da classe que representa um guerreiro do jogo *Guerreiros da POO*.

import java.util.Random;

public class Guerreiro {

    // Criação dos atributos privativos (acesso permitido apenas dentro da classe).
    private int codigo;
    private String nome;
    private int energia;

    //Gerador de números aleatórios para os ataques.
    Random gerador = new Random();

    // Criação do Construtor para receber o código e o nome do guerreiro como parâmetros e definir a energia inicial dele.
    public Guerreiro(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.energia = 5;
    }

    // Método para ver a energia atual do guerreiro.
    public int getEnergia() {
        return energia;
    }

    // Metódo para estabelecer o aumento de energia dentro de um limite pré-estabelecido.
    public void incremento(){
        if(energia <5){
            energia +=1;
        }
    }

    // Método para estabelecer a diminuição da energia dentro de um limite pré-estabelecido.
    public void decremento(){
        if(energia > 0){
            energia -=1;
        } else if(energia == 0){
            System.out.println("Você estrá sem energia!");
        }
            
        }

     // Método para recuperar energia chamando o método incremento para estabelecer o limite de energia obtida (no caso 1).
     public void seAlimentar(){
        incremento();
     }

    // O método atacar consiste na geração e retorno de um número aleatório entre 0 e 1 (0 – sem sucesso, 1- com sucesso).
     public int atacar(){
        return gerador.nextInt(2);
     }

    // Método para estabelecer as regras da luta usando loop.
     public void lutarLoop(Guerreiro oponente){
        while (energia > 0 && oponente.energia > 0) {

            // Condicional para a luta acontecer.
            if (atacar() != 0){
                oponente.decremento();

            // Condicional para declarar o vencedor.  
            }if (oponente.energia <= 0) {
                    System.out.printf("%s ganhou!", nome);
                    break;
            }if (oponente.atacar() != 0) {
                decremento();
            }if (energia <= 0) {
                System.out.printf("%s ganhou!", oponente.nome);
                break;
            }
        }
     }
   
     // Método recursivo para as lutas acontecerem.
     public String lutarRecursivo(Guerreiro oponente){

        // Condicional para que as lutas aconteçam
        if(energia > 0 && oponente.energia > 0){
            if (atacar() != 0){
                oponente.decremento();
                
            }if (oponente.energia <= 0) {
                return String.format("\n%s ganhou! ", nome);
                    
            }if (oponente.atacar() != 0) {
                decremento();
            }if (energia <= 0) {
                return String.format("\n%s ganhou!", oponente.nome);
            }

            // Chamando o método novamente para garantir a recursão.
            return lutarRecursivo(oponente);
        }
        return "A luta acabou!";
     }

    // Método para exibir as informações atuais do guerreiro.
    @Override
    public String toString() {
        
        return "Nome: "+nome + "\nCódigo: "+codigo + "\nEnergia: " + energia;
    }
     
}

   
    
