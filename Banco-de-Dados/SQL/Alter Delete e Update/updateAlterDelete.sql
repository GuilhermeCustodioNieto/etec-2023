/*CRIAR Banco de Dados*/
CREATE DATABASE db_produto

/*deletar em caso de erro*/
USE db_produto
DROP DATABASE db_produto




/*Criar Tabela*/
USE db_produto

CREATE TABLE tbl_produtos(
produto VARCHAR(20) NOT NULL,
fornecedor VARCHAR(30) NOT NULL,
custo_unitario FLOAT NOT NULL,
quantidade INTEGER NOT NULL,
custo_total FLOAT NOT NULL,
PRIMARY KEY (produto)
)

/*Inserir dados na tabela*/
USE db_produto
INSERT INTO tbl_produtos(produto, fornecedor, custo_unitario, quantidade, custo_total) VALUES
('Produto 1', 'Fornecedor 1', 200.00, 30, 6.000), 
('Produto 2', 'Fornecedor 1', 100.00, 50, 5.000), 
('Produto 3', 'Fornecedor 1', 50.00, 50, 2.500), 
('Produto 4', 'Fornecedor 1', 10.00, 100, 1.000), 
('Produto 5', 'Fornecedor 1', 150.00, 20, 3.000), 
('Produto 6', 'Fornecedor 1', 250.00, 2, 500.00), 
('Produto 7', 'Fornecedor 1', 300.00, 5, 1.500)

/*excluir a tabela custo total*/
ALTER TABLE tbl_produtos DROP COLUMN custo_total

/*Adicionar tabelas nomeProduto e percentualLucro*/
ALTER table tbl_produtos ADD nomeProduto VARCHAR(50)
ALTER TABLE tbl_produtos ADD percentualLucro  FLOAT;

/*inserir exemplos nelas*/
UPDATE tbl_produtos SET nomeProduto = 'Arroz', percentualLucro = 15.2 WHERE produto = 'Produto 1';
UPDATE tbl_produtos SET nomeProduto = 'A�ucar', percentualLucro = 18.5 WHERE produto = 'Produto 2';
UPDATE tbl_produtos SET nomeProduto = 'Feij�o', percentualLucro = 14.8 WHERE produto = 'Produto 3';
UPDATE tbl_produtos SET nomeProduto = 'Macarr�o', percentualLucro = 16.7 WHERE produto = 'Produto 4';
UPDATE tbl_produtos SET nomeProduto = 'Leite', percentualLucro = 12.3 WHERE produto = 'Produto 5';
UPDATE tbl_produtos SET nomeProduto = 'Caf�', percentualLucro = 20.0 WHERE produto = 'Produto 6';
UPDATE tbl_produtos SET nomeProduto = '�leo', percentualLucro = 17.6 WHERE produto = 'Produto 7';

/*atualizar o produto 1 para 50 e produto 4 para 80*/
UPDATE tbl_produtos SET quantidade  = 50 WHERE produto = 'Produto 1'
UPDATE tbl_produtos SET quantidade  = 80 WHERE produto = 'Produto 4'

/*delete o produto 6 e 7*/

DELETE FROM tbl_produtos WHERE produto = 'Produto 6'
DELETE FROM tbl_produtos WHERE produto = 'Produto 7'

/*Buscar todas as informa��es da tabela*/
SELECT * FROM tbl_produtos

/*Buscar informa��es de nome e quantidade*/
SELECT nomeProduto, quantidade FROM tbl_produtos


/*criar tabela de pre�o de venda*/
ALTER TABLE tbl_produtos ADD preco_venda FLOAT

UPDATE tbl_produtos SET preco_venda = (custo_unitario + percentualLucro) WHERE produto = 'Produto 1'
UPDATE tbl_produtos SET preco_venda = (custo_unitario + percentualLucro) WHERE produto = 'Produto 2'
UPDATE tbl_produtos SET preco_venda = (custo_unitario + percentualLucro) WHERE produto = 'Produto 3'
UPDATE tbl_produtos SET preco_venda = (custo_unitario + percentualLucro) WHERE produto = 'Produto 4'
UPDATE tbl_produtos SET preco_venda = (custo_unitario + percentualLucro)  WHERE produto = 'Produto 5'

/*buscar informa��o do produto e custo unitario*/	
SELECT custo_unitario, preco_venda FROM tbl_produtos