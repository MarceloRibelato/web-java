#language: pt
#encoding: UTF-8
#version:1.0
#author: Marcelo Ribelato
#date: 11/02/2020

  @web
  Funcionalidade: Login na aplicação

    @login
    Cenario: Realizar login com usuario valido
      Dado que realizo login com o usuario "teste"
      Entao visualizo a mensagem de login com sucesso
