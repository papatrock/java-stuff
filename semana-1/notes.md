## Método println
O método System.out.println() gera uma string de texto, cria uma nova linha abaixo da atual e então posiciona o cursor nesta linha.

Abaixo temos um exemplo do método sendo empregado para exibir duas mensagens no console:

System.out.println("Olá pessoal, Aqui é o Fábio ");
System.out.println("da Bóson Treinamentos em Tecnologia");

## Método print
O método System.out.print() gera uma string de texto, porém diferentemente do método println, não cria uma nova linha abaixo da atual, deixando o cursor na mesma linha onde a string foi impressa.

Abaixo temos um exemplo do método sendo empregado para exibir duas mensagens:

System.out.print("Olá pessoal, Aqui é o Fábio ");
System.out.print("da Bóson Treinamentos em Tecnologia");
Note que agora as duas mensagens foram exibidas na mesma linha, em sequência.

## Método printf
O método System.out.printf mostra os dados na saída formatados. Abaixo temos um exemplo do método sendo empregado para exibir a mensagem “Olá pessoal!, aqui é o Fábio” (em duas linhas), e uma terceira mensagem logo abaixo:

System.out.printf("%s%n%s","Olá pessoal", "Aqui é o Fábio");
System.out.printf("%n%d\n%d",15,20);
System.out.printf("%n%s%n%s%d%s","Estão com fome?","Agora são ", 12, " horas e 24 minutos");

### Método printf – especificadores de formato
Na tabela abaixo temos alguns dos especificadores de formato mais comuns empregados pelo método printf():

Especificador	Formato
%s	String de caracteres
%d	Número inteiro decimal
%u	Número inteiro decimal sem sinal
%o	Número inteiro octal sem sinal
%x, %X	Número inteiro hexadecimal sem sinal, minúsculo ou maiúsculo
%f	Float
%2f	Double
%e, %E	Número real, em notação científica, minúsculo ou maiúsculo
%b	Boolean
%c	Caractere (char)

##Leitura
* Lê um int
```java
int num;
num - input,nextInt();
```

* Lê um float
```java
float num;
num = input.nextFloat();
```

* Lê uma string

```java=
String num;
num = input.nextLine();
```