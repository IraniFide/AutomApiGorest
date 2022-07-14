#language: pt
#Author: Irani
#Version: 1.0
#Encoding: UTF-8

@Gorest @CT-01
Funcionalidade: Criar e editar contas de usuários
  Eu como administrador do sistema, quero cadastrar, editar e excluir usuários do sistema
  Cenario: Cadastrar novo usuário API Gorest
    Dado que possuo gorest token valido
    Quando envio um request de cadastro de usuario com dados validos
    Entao o usuario deve ser criado corretamente
    E o status code do request deve ser 200