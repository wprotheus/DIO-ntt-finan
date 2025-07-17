# DIO - NTT DATA - Java e IA para Iniciantes  

## Autor
🔸[wprotheus](https://github.com/wprotheus)

---

### Criando um Aplicativo de Controle de Transações Financeiras com POO  

Atividade executada, replicando os passos/codificações contidos nos vídeos, sendo assim uma cópia da implementação apresentada, e conforme orientações abaixo retiradas da [Descrição do Desafio](https://web.dio.me/lab/criando-um-aplicativo-de-controle-de-transacoes-financeiras-com-poo/learning/294081b2-a315-4085-a6d1-cc8e39c76835).  
O resultado do desafio é composto pelas alterações e ajustes que achei necessário.  
<small><sup>Obs.: O link acima somente é acessado através de uma conta na plataforma DIO.</sup></small>

> ---  

### 🛠️ Habilidades e Sub-habilidades que vamos aprender neste conteúdo  

---
[ X ] - ***Aplicar conceitos de orientação a objetos***  
[ X ] - ***Implementar estrutura de entidades com herança e composição***  
[ X ] - ***Criar repositórios simulando persistência em memória***  
[ X ] - ***Praticar boas práticas com uso de Lombok, enums e records***  
[ X ] - ***Exercitar a construção de menus e fluxos interativos via console***  
[ X ] - ***Documentar processos técnicos de forma clara e estruturada***  
[ X ] - ***Utilizar o GitHub como ferramenta para compartilhamento de documentação técnica***  
  
### 🛠️ Tecnologias Utilizadas  

---    
[ X ] - ***Java 17***  
[ X ] - ***IntelliJ IDEA***  
[ X ] - ***Git e Github***  

    
### 📂 Estrutura do Projeto  

---  
#### O projeto está organizado da seguinte forma:  

##### ├── src
##### │ .. ├── DioNttFinanApplication.java
##### │ .. ├── exceptions
##### │ .. │ .. ├── AccountNotFoundException.java
##### │ .. │ .. ├── AccountWithInvestmentException.java
##### │ .. │ .. ├── InvestmentNotFoundException.java
##### │ .. │ .. ├── MoneyAuditNotFoundException.java
##### │ .. │ .. ├── NoFundsEnoughException.java
##### │ .. │ .. └── PixInUseException.java
##### │ .. ├── model
##### │ .. │ .. ├── Account.java
##### │ .. │ .. ├── AccountWallet.java
##### │ .. │ .. ├── Investment.java
##### │ .. │ .. ├── InvestmentWallet.java
##### │ .. │ .. ├── Money.java
##### │ .. │ .. ├── MoneyAudit.java
##### │ .. │ .. └── Wallet.java
##### │ .. ├── repository
##### │ .. │ .. ├── AccountRepository.java
##### │ .. │ .. ├── CommonRepository.java
##### │ .. │ .. └── InvestmentRepository.java
##### └── README.md  

> ---  

### Descrição do Desafio

> *Agora é a sua hora de brilhar e construir um perfil de destaque na DIO!* Explore todos os conceitos abordados até aqui, aplique os conhecimentos adquiridos nas aulas e *documente sua experiência para demonstrar sua compreensão dos temas discutidos.*

> #### Descrição do Desafio  

> Este laboratório tem como objetivo de *consolidar conceitos fundamentais da programação orientada a objetos (POO)*, como *herança, encapsulamento, polimorfismo, abstração e reuso de código*. A aplicação simula um sistema bancário básico que permite a *criação de contas, depósitos, saques, transferências via PIX, criação de investimentos e acompanhamento de histórico de transações.*

> #### Objetivos de Aprendizagem

> *Ao concluir este desafio, você será capaz de:*

> - Aplicar conceitos de orientação a objetos;
> - Implementar estrutura de entidades com herança e composição;
> - Criar repositórios simulando persistência em memória;
> - Praticar boas práticas com uso de Lombok, enums e records;
> - Exercitar a construção de menus e fluxos interativos via console;
> - Documentar processos técnicos de forma clara e estruturada;
> - Utilizar o GitHub como ferramenta para compartilhamento de documentação técnica.

> #### Entrega do Desafio

> *Para concluir este desafio, você deverá:*

> 1. *Assistir a todas as vídeo-aulas*
> Não pule nenhuma etapa! As aulas contêm informações essenciais para o sucesso do seu projeto.

> 2. *Criar um repositório público no GitHub contendo:*
> Um arquivo `README.md` detalhado
> Quaisquer arquivos adicionais que sejam relevantes para documentar sua experiência
> Opcionalmente, capturas de tela relevantes organizadas em uma pasta `/images`

> 3. *Enviar o link do seu repositório* e uma breve descrição clicando no botão “Entregar Projeto”

### Descrição em Informações

> Este projeto é uma aplicação Java orientada a objetos, desenvolvida com o objetivo de consolidar conceitos fundamentais da programação orientada a objetos (POO), como herança, encapsulamento, polimorfismo, abstração e reuso de código. A aplicação simula um sistema bancário básico que permite a criação de contas, depósitos, saques, transferências via PIX, criação de investimentos e acompanhamento de histórico de transações.

> ***Java***
