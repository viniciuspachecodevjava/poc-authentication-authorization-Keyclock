# Projeto: Implementação de Autenticação e Autorização com Keycloak
## Descrição
Este projeto implementa autenticação e autorização utilizando Keycloak em uma aplicação Spring Boot. Keycloak é uma solução open-source para gerenciamento de identidade e acesso, permitindo a integração com vários serviços e facilitando o controle de usuários, roles e permissões.

## Tecnologias Utilizadas
* **Spring Boot:** Framework Java para a construção de aplicações web.
* **Spring Security:** Framework de segurança para proteger a aplicação.
* **Keycloak:** Ferramenta de gestão de identidade e acesso, usada para autenticação e autorização.
* **Clean Architecture:** Arquitetura usada para estruturar o projeto em camadas distintas.
* **Virtualização com Docker:** Utilização do Docker para criar um container do Keycloak, facilitando a configuração e o gerenciamento do ambiente de autenticação.
* **Java 17**

## Funcionalidades
* Autenticação via Keycloak: Os usuários podem autenticar-se na aplicação utilizando Keycloak. O Keycloak gerencia os tokens de autenticação e a aplicação valida esses tokens para garantir a segurança.
* Autorização baseada em Roles: A aplicação verifica as roles dos usuários autenticados via Keycloak para controlar o acesso a diferentes partes do sistema.