# Atividade de Autoestudo - Java e Programação Orientada a Objetos

**Nome:** Arthur Sousa da Silva
**Turma:** DSM 2º Semestre - Noite -  Técnicas de Programção

## Sobre a atividade

Esta atividade tem como objetivo praticar os três pilares da Programação
Orientada a Objetos em Java: encapsulamento, herança e polimorfismo,
trabalhando cada conceito separadamente e depois de forma integrada.

## Como compilar e executar

Cada exercício está em sua própria pasta, com uma classe `Main.java`.
Para rodar:

1. Abra a pasta do exercício desejado no VS Code (ou outra IDE Java).
2. Compile e execute o arquivo `Main.java` (no VS Code, use o botão "Run"
   que aparece acima do método `main`).

## Exercício 1 - Encapsulamento (Cofrinho)

Classe que representa um cofrinho digital com objetivo e saldo.
Os atributos são privados; o saldo só pode ser alterado pelos
métodos depositar() e retirar(), que validam os valores antes
de aplicar a mudança.

**Conceito utilizado:** Encapsulamento — atributos privados
protegidos por métodos públicos com validação.

**Como executar:** abrir a pasta exercicio1encapsulamento e
rodar Main.java.

## Exercício 2 - Herança (Conteúdos Educacionais)

Hierarquia com a superclasse Conteudo (título e duração) e as
subclasses VideoAula e Podcast, que herdam esses atributos e o
método exibirResumo(), além de terem atributos e métodos próprios.

**Conceito utilizado:** Herança — VideoAula e Podcast usam extends
Conteudo e super() para reaproveitar código da superclasse.

**Como executar:** abrir a pasta exercicio2heranca e rodar Main.java.

## Exercício 3 - Polimorfismo (Calculadora)

Classe Calculadora com três versões sobrecarregadas do método
somar(): dois int, dois double e três int. O Java escolhe qual
versão executar de acordo com a quantidade e o tipo dos argumentos
passados na chamada.

**Conceito utilizado:** Polimorfismo estático por sobrecarga —
mesmo nome de método, listas de parâmetros diferentes.

**Como executar:** abrir a pasta exercicio3polimorfismo e rodar
Main.java.

## Exercício 4 - Integração (Sistema de Pagamentos)

Sistema com a superclasse Pagamento (valor privado, cálculo de
total) e as subclasses PagamentoPix e PagamentoCartao, que
sobrescrevem calcularTaxa() e processar() com regras próprias
(Pix sem taxa, Cartão com 3% sobre o valor).

**Conceitos utilizados:**
- **Encapsulamento:** valor e parcelas são atributos privados,
  acessados por getters.
- **Herança:** PagamentoPix e PagamentoCartao usam extends Pagamento.
- **Polimorfismo (sobrescrita):** os métodos calcularTaxa() e
  processar() são sobrescritos com @Override; no Main, variáveis
  do tipo Pagamento apontam para objetos de subclasses diferentes,
  e cada chamada de processar() executa a versão correta conforme
  o objeto real (polimorfismo em tempo de execução).

**Como executar:** abrir a pasta exercicio4integracaoconceitos e
rodar Main.java.

## Dificuldades encontradas e como foram resolvidas

- Erro de sintaxe no nome do pacote (package) por causa do hífen
  nos nomes das pastas dos exercícios: resolvido removendo os
  hífens dos nomes das pastas (ex: exercicio1-encapsulamento virou
  exercicio1encapsulamento).
- Erro de "classe pública deve estar em seu próprio arquivo":
  aconteceu por escrever a classe Cofrinho dentro do arquivo
  Main.java por engano; resolvido movendo cada classe pública
  para seu próprio arquivo .java com o mesmo nome.
- Método duplicado (retirar) na classe Cofrinho: resolvido
  apagando o bloco de código repetido.
- Chave de fechamento (}) fechando o método main antes da hora,
  deixando comandos soltos fora do método: resolvido reorganizando
  as chaves para fechar o main só no final.
- Erros de "método/construtor não encontrado" que na verdade eram
  causados por arquivos não salvos no editor: resolvido salvando
  todos os arquivos antes de compilar.