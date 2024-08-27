# Projeto-Backend-Uber

## Descrição

Este projeto é um serviço de envio de e-mails desenvolvido com Java Spring e Arquitetura Limpa. Ele fornece uma abstração entre diferentes provedores de e-mail, permitindo uma troca fácil de provedores sem afetar os clientes.

## Funcionalidades

- Envio de e-mails usando diferentes provedores de e-mail.
- Abstração para troca de provedores de e-mail.
- Manipulação de erros durante o envio de e-mails.

## Tecnologias

- **Java 21**
- **Spring Boot**: Framework utilizado para a construção do serviço.
- **AWS SDK for Java (SES)**: Biblioteca utilizada para integração com o Amazon SES.

## Estrutura do Projeto

### Pacotes

- **com.jg.email_service.adapters**
  - `EmailSenderGateway`: Interface para a abstração do envio de e-mails.

- **com.jg.email_service.application**
  - `EmailSenderService`: Implementação do serviço de envio de e-mails.

- **com.jg.email_service.controllers**
  - `EmailSenderController`: Controlador REST para receber e processar solicitações de envio de e-mail.

- **com.jg.email_service.core**
  - `EmailRequest`: Record que representa uma solicitação de envio de e-mail.
  - `EmailSendUseCase`: Interface que define o caso de uso para o envio de e-mails.
  - `exceptions.EmailServiceException`: Exceção personalizada para erros no serviço de e-mail.

### Configuração

O projeto usa um arquivo `pom.xml` para gerenciar dependências. Aqui está uma amostra das principais dependências:

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>com.amazonaws</groupId>
        <artifactId>aws-java-sdk-ses</artifactId>
        <version>1.12.472</version>
    </dependency>
</dependencies>
```

## Execução

Para executar o projeto, siga estas etapas:

1. **Clone o repositório**:
   ```bash
   git clone (https://github.com/JGabriel02/Projeto-Backend-Uber.git)
   ```

2. **Navegue até o diretório do projeto**:
   ```bash
   cd email-service
   ```

3. **Compile e execute o projeto**:
   ```bash
   mvn spring-boot:run
   ```

## Endpoints

### Enviar E-mail

- **URL**: `/api/email`
- **Método**: `POST`
- **Descrição**: Envia um e-mail com base na solicitação recebida.
- **Corpo da Requisição**:
  ```json
  {
      "to": "example@example.com",
      "subject": "Assunto do E-mail",
      "body": "Corpo do E-mail"
  }
  ```
- **Resposta**:
  - **200 OK**: E-mail enviado com sucesso.
  - **500 Internal Server Error**: Erro ao enviar e-mail.

## Documentação Adicional

Para mais detalhes sobre o Amazon SES e como configurá-lo, consulte a [documentação do Amazon SES](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html).
