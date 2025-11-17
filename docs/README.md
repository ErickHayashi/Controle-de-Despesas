# Sistema de Controle de Despesas - Versão 0.0.1

## Descrição
Este é o início do projeto de Sistema de Controle de Despesas.
Nesta versão (0.0.1), foi criado o menu principal com as opções básicas do sistema,
incluindo os prints (println) de cada funcionalidade.

## Próximos Passos
- Implementar o cadastro de despesas.
- Implementar o registro de pagamentos.
- Criar as classes para despesas, tipos de despesa e usuários.

---

# Versão 0.0.2 - Separação de Prioridades, Definição de POC e Estruturação do MVP

## Objetivo
Estabelecer a base conceitual do projeto, definindo os limites iniciais, o escopo mínimo funcional e a priorização técnica para o desenvolvimento do Sistema de Controle de Despesas.

## Entregas deste Commit
- Separação inicial das prioridades do sistema.
- Definição da POC (Proof of Concept) para validação da arquitetura em Java.
- Estruturação da organização do projeto e planejamento para o MVP.
- Criação da pasta `/src` e estrutura inicial do código.
- Identificação dos principais módulos:
  - Cadastro e gestão de despesas  
  - Registro de pagamentos  
  - Sistema de usuários  
  - Gerenciamento de tipos de despesas  
  - Persistência em arquivos de texto  
- Planejamento de uso de:
  - Herança para subclasses de despesas  
  - Interfaces para contratos como “Pagável”  
  - Polimorfismo para tratamento padronizado das despesas  
  - Criptografia simples para senhas  
- Definição inicial do fluxo do Menu Principal
- Identificação das dependências e organização dos futuros commits

## Motivo
Este commit estabelece o alicerce do projeto, organizando a arquitetura e as responsabilidades de cada módulo. Serve como marco inicial para garantir um desenvolvimento incremental, modularizado e sustentável.

## 0.0.3 — MVP Finalizado, Documentado e Empacotado para Repositório de Produção
Objetivo

Consolidar o MVP (Minimum Viable Product) do Sistema de Controle de Despesas, garantindo que todas as funcionalidades essenciais estejam implementadas, testadas, documentadas e prontas para uso em ambiente real.

## Entregas deste Commit
## 1. MVP completamente funcional

Entrada de novas despesas

Registro de pagamentos

Listagem de despesas pagas e pendentes

Listagem filtrada por período

CRUD de tipos de despesa

CRUD de usuários com criptografia

Persiste tudo em arquivos .txt

## 2. Documentação finalizada

README atualizado com:

Objetivos do projeto

Arquitetura

Funcionalidades do MVP

Estrutura de diretórios

Instruções de execução

CHANGELOG documentando as versões 0.0.1, 0.0.2 e 0.0.3

Comentários no código e padronização de nomenclaturas

## 3. Organização para repositório de produção

Estrutura completa de src/, docs/, data/ e .gitignore

Arquivos vazios necessários criados (usuários.txt, despesas.txt, tipos_despesa.txt)

Preparação para futuras versões 0.1.x (versão beta)

Policies internas de commit definidas

## 4. Tags de Git adicionadas

Criada a tag v0.0.3 marcando o MVP entregue

Estrutura preparada para versionamento semântico

Histórico limpo e merge conflicts resolvidos

Motivo

Este commit marca o fim da fase de prototipação (0.0.x) e estabelece a base sólida para evolução contínua do sistema. A partir de agora, o projeto tem documentação formal, código funcional e repositório preparado para ciclos de entrega incrementais.