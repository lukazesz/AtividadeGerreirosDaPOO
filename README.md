# 🛡️ Guerreiros da POO

Este projeto foi desenvolvido como atividade da disciplina de **Programação Orientada a Objetos (POO)**.  
O objetivo é simular um jogo simples entre dois guerreiros, utilizando **conceitos fundamentais de classes, objetos, métodos, encapsulamento e recursividade**.

---

## Descrição

Cada **guerreiro** possui:
- Um **código** (identificador numérico);
- Um **nome**;
- Um nível de **energia** (de 0 a 5);

Os guerreiros podem:
- **Lutar** entre si (usando laço de repetição ou recursão);
- **Atacar** (com sucesso ou não, de forma aleatória);
- **Se alimentar** para recuperar energia;

A luta termina quando a energia de um dos guerreiros chega a **zero**, e o vencedor é anunciado.

---

## Estrutura do Projeto

### **Classe `Guerreiro`**
Implementa toda a lógica do jogo:
- Atributos privados: `codigo`, `nome`, `energia`
- Métodos principais:
  - `incremento()` → aumenta a energia em 1 (máximo 5);
  - `decremento()` → reduz a energia em 1;
  - `seAlimentar()` → chama `incremento()`;
  - `atacar()` → gera 0 ou 1 aleatoriamente (sem sucesso / com sucesso);
  - `lutarLoop(Guerreiro oponente)` → simula a luta usando **laço de repetição**;
  - `lutarRecursivo(Guerreiro oponente)` → simula a luta usando **recursividade**;
  - `toString()` → retorna as informações do guerreiro (nome, código e energia);

### **Classe `Main`**
Responsável por executar o jogo e demonstrar as funcionalidades da classe `Guerreiro`.

Exemplo:
```java
public class Main {
    public static void main(String[] args) {
        // Criação dos guerreiros
        Guerreiro lucas = new Guerreiro(777, "Lucas");
        Guerreiro mateus = new Guerreiro(852, "Mateus");

        // Luta com laço
        lucas.lutarLoop(mateus);

        // Luta com recursão
        lucas.lutarRecursivo(mateus);

        // Guerreiro se alimenta
        lucas.seAlimentar();

        // Exibição do estado atual
        System.out.println(lucas.toString());
    }
}
```
---
## Funcionamento do **jogo**:
- Dois guerreiros são criados com nome e código.

- Cada guerreiro começa com 5 pontos de energia.

### Durante a **luta**:

- Cada ataque tem 50% de chance de sucesso.

- Quando o ataque é bem-sucedido, o oponente perde 1 ponto de energia.

- A luta termina quando um dos guerreiros atinge 0 de energia.

- O programa exibe o vencedor e o estado final dos guerreiros.
---
## 🧠 Conceitos Envolvidos:

- Encapsulamento (atributos privados + métodos de acesso);

- Construtores;

- Métodos com retorno e sem retorno;

- Estruturas de repetição e recursividade;

- Geração de números aleatórios `(java.util.Random)`;

- Uso do método `toString()`;
---
## 🚀 Como Executar:

### Clone este repositório:

`git clone https://github.com/lukazesz/guerreiros-poo.git`

### Entre na pasta do projeto:

`cd guerreiros-poo`

### Compile e execute o projeto:

`javac Main.java Guerreiro.java`

`java Main`

### 🏆 Exemplo de Saída:
```Lucas ganhou!
Nome: Lucas
Código: 777
Energia: 3
```
---
## ✍️ Sobre o Autor:

Eu me chamo Lucas da Silva Santos, um jovem apaixonado pela àrea de TI (principalmente o mundo dos **códigos**). Atualmente sou Estudante de **Tecnologia em Sistemas para Internet** (TSI) no **Instituto Federal da Paraíba** (IFPB) — Campus Guarabira.

---

## 📄 Licença

Este projeto foi desenvolvido para fins educacionais e não possui restrições de uso.