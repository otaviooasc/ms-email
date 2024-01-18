# Projeto Email

## Descrição

O Projeto Email simplifica o envio de emails por meio de uma API, complementando a funcionalidade da API User. Desenvolvido para integração fácil, especialmente após o cadastro de novos usuários pela API User.

## Funcionalidades Principais

- Envio de Email Simples
- Modelos de Email Personalizados
- Anexos
- Programação de Envios
- Log de Envios

## Integração com a API User

1. **Cadastro de Usuário:** Ao cadastrar um novo usuário pela API User, acione o Projeto Email para enviar um email de boas-vindas.

   ```java
   @Data
   @Entity
   @Table(name = "TB_EMAIL")
   public class EmailModel implements Serializable {

       @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
       private UUID emailId;

       private UUID userId;

       private String emailFrom;

       private String emailTo;

       private String subject;

       @Column(columnDefinition = "TEXT")
       private String text;

       private LocalDateTime sendDateEmail;

       private StatusEmail statusEmail;
   }

<img width="636" alt="image" src="https://github.com/otaviooasc/ms-email/assets/52991335/d31cdd3c-ae81-45ed-b8fa-372fd2d37a05">

OBS: Para enviar o email altere o application.properties, coloque seu e email e sua senha de APP.
