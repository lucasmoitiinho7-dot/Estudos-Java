# Estudos Java

Repositório criado para acompanhar e registrar meu aprendizado em Java, organizando os conteúdos estudados, exemplos e exercícios realizados durante minha evolução na linguagem.

## Dia 01

### Conteúdos estudados

- Estrutura básica de um programa Java.
- Variáveis e tipos de dados.
- Tipos primitivos e tipos de referência.
- Classes Wrapper.
- Operadores matemáticos.
- Casting (conversão de tipos).
- Comentários em Java.
- Saída de dados com `print` e `println`.
- Concatenação de textos.
- Entrada de dados com `Scanner`.
- Operadores relacionais e de comparação.
- Estruturas condicionais (`if`, `else if` e `else`).
- Operadores lógicos (`&&`, `||` e `!`).

## Objetivo

Registrar minha evolução no aprendizado de Java, praticando os conceitos fundamentais e desenvolvendo uma base sólida para futuramente trabalhar com desenvolvimento backend.

## Observações e anotações

### 1. Declaração de variáveis

Em Java, precisamos informar o tipo de dado antes do nome da variável.

Exemplo:

```java
String nome = "Lucas";
int idade = 25;
double altura = 1.75;
```

As instruções normalmente precisam ser encerradas com ponto e vírgula (`;`). Os blocos de código são delimitados por chaves (`{ }`).

### 2. Tipos primitivos

Os tipos primitivos são tipos de dados básicos, predefinidos pela própria linguagem Java. Eles armazenam valores simples, como números, caracteres e valores lógicos.

### Java possui 8 tipos primitivos

| Tipo | O que armazena | Exemplo |
|---|---|---|
| `byte` | Inteiros pequenos | `byte idade = 25;` |
| `short` | Inteiros | `short numero = 1000;` |
| `int` | Inteiros | `int idade = 25;` |
| `long` | Inteiros grandes | `long populacao = 1000000L;` |
| `float` | Números decimais | `float altura = 1.75f;` |
| `double` | Números decimais | `double altura = 1.75;` |
| `char` | Um caractere | `char letra = 'A';` |
| `boolean` | Verdadeiro ou falso | `boolean ativo = true;` |

### 3. Tipos de referência

Diferentemente dos tipos primitivos, os tipos de referência representam objetos.

Exemplo:

```java
String nome = "Lucas";
Integer idade = 25;
Double altura = 1.75;
```

`String` não é um tipo primitivo, mas uma classe da linguagem Java.

As classes Wrapper, como `Integer`, `Double` e `Boolean`, representam os tipos primitivos correspondentes por meio de objetos.

### 4. Concatenação de textos

O operador `+` também pode ser utilizado para unir textos e valores em uma mesma saída.

Exemplo:

```java
System.out.print("Meu nome é " + nome);
```

### 5. Operadores matemáticos

Utilizados para realizar operações aritméticas.

| Operador | Operação |
|---|---|
| `+` | Adição |
| `-` | Subtração |
| `*` | Multiplicação |
| `/` | Divisão |
| `%` | Resto da divisão |

**Observação:** quando dividimos dois valores do tipo `int`, o resultado também será inteiro, descartando a parte decimal.

### 6. Casting

Casting é a conversão de um tipo de dado para outro, desde que a conversão seja permitida pela linguagem.

Existem dois tipos principais:

- **Conversão implícita:** realizada automaticamente pelo Java.
- **Conversão explícita:** exige informar o tipo desejado entre parênteses.

Exemplos:

```java
// Conversão implícita
int numero = 10;
double resultado = numero;

// Conversão explícita
double valor = 8.9;
int inteiro = (int) valor;
```

A conversão explícita de `double` para `int` descarta a parte decimal, não realiza arredondamento.

#### Exemplos de conversões

| De | Para | Conversão |
|---|---|---|
| `int` | `double` | Implícita |
| `int` | `float` | Implícita |
| `double` | `int` | Explícita |
| `double` | `float` | Explícita |
| `long` | `int` | Explícita |
| `char` | `int` | Implícita |
| `int` | `char` | Explícita |

### 7. Comentários

Comentários são utilizados para documentar o código e explicar determinadas instruções.

- `//` — comentário de uma linha.
- `/* */` — comentário de várias linhas.
- `/** */` — comentário JavaDoc, utilizado para documentação.

### 8. Entrada de dados com Scanner

A classe `Scanner` permite receber informações digitadas pelo usuário.

Exemplo:

```java
import java.util.Scanner;

Scanner entrada = new Scanner(System.in);

String nome = entrada.nextLine();
int idade = entrada.nextInt();
double altura = entrada.nextDouble();

entrada.close();
```

Principais métodos:

| Método | Utilização |
|---|---|
| `nextLine()` | Lê uma linha completa de texto |
| `next()` | Lê uma palavra |
| `nextInt()` | Lê um número inteiro |
| `nextDouble()` | Lê um número decimal |

### 9. Operadores relacionais e de comparação

São utilizados para comparar valores. O resultado de uma comparação é sempre `true` ou `false`.

| Operador | Significado |
|---|---|
| `==` | Igual a |
| `!=` | Diferente de |
| `>` | Maior que |
| `<` | Menor que |
| `>=` | Maior ou igual a |
| `<=` | Menor ou igual a |

**Atenção:** `=` é utilizado para atribuição de valores, enquanto `==` é utilizado para comparação.

### 10. Estruturas condicionais

Permitem executar diferentes blocos de código dependendo de uma condição.

- `if` — verifica uma condição.
- `else if` — verifica outra condição caso a anterior seja falsa.
- `else` — executa quando nenhuma das condições anteriores é verdadeira.

Exemplo:

```java
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

### 11. Operadores lógicos

Permitem combinar ou inverter condições.

| Operador | Significado | Funcionamento |
|---|---|---|
| `&&` | E (AND) | Todas as condições precisam ser verdadeiras |
| `||` | OU (OR) | Pelo menos uma condição precisa ser verdadeira |
| `!` | NÃO (NOT) | Inverte o resultado lógico |

Exemplos:

```java
// As duas condições precisam ser verdadeiras
idade >= 18 && possuiIngresso == true

// Pelo menos uma condição precisa ser verdadeira
idade >= 18 || possuiIngressoEspecial == true

// Inverte o resultado
!possuiIngresso
```



``dia 04``
Aprofundei um pouco mais no uso dos if, else if, else
ultilizei tbm o o switch e o cases para elabora uma calculadora,com multiplas escolhas.



`dia06`
Hoje realizei algumas atividades de sobrecarga