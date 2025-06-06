# Casa de Leilões
 
## Descrição
Este projeto é um sistema de gerenciamento de produtos para uma Casa de Leilões, desenvolvido como atividade de prática em Java. O sistema permite o cadastro de produtos com nome, valor e status, a listagem dos itens cadastrados e a marcação de itens como vendidos.
 
## Tecnologias Utilizadas
- Java
- MySQL
- JDBC (para conexão com banco de dados)
- Swing (para interface gráfica)
 
## Funcionalidades
- Cadastro de produtos
- Listagem dos produtos cadastrados
- Atualização do status dos produtos para 'Vendido'
 
## Estrutura do Projeto
- ProdutosDAO: Classe responsável pelo acesso ao banco de dados (inserção, listagem, atualização)
- ProdutosDTO: Objeto de transferência de dados dos produtos
- conectaDAO: Classe responsável pela conexão com o banco MySQL
- cadastroVIEW: Tela de cadastro de produtos
- listagemVIEW: Tela de exibição dos produtos cadastrados
