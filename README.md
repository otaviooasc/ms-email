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

   ```javascript
   const user = cadastrarUsuario();
   const emailInfo = {
     to: user.email,
     subject: 'Bem-vindo!',
     body: 'Obrigado por se cadastrar!',
   };
   projetoEmailService.enviarEmail(emailInfo);

   <img width="636" alt="image" src="https://github.com/otaviooasc/ms-email/assets/52991335/d31cdd3c-ae81-45ed-b8fa-372fd2d37a05">
