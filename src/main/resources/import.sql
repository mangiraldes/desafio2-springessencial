INSERT INTO tbl_categoria(descricao) values ('Curso');
INSERT INTO tbl_categoria(descricao) values ('Oficina');

INSERT INTO tbl_bloco(inicio,fim) values ('2017-09-25 08:00:00','2017-09-25 11:00:00');
INSERT INTO tbl_bloco(inicio,fim) values ('2017-09-25 14:00:00','2017-09-25 18:00:00');
INSERT INTO tbl_bloco(inicio,fim) values ('2017-09-26 08:00:00','2017-09-26 11:00:00');

INSERT INTO tbl_atividade(nome,descricao,preco) values ('Curso de HTML','Aprenda HTML de forma prática',80.00);
INSERT INTO tbl_atividade(nome,descricao,preco) values ('Oficina de Github','Controle versões de seus projetos',50.00);

INSERT INTO tbl_participante(nome,email) values ('José Silva','jose@gmail.com');
INSERT INTO tbl_participante(nome,email) values ('Tiago Faria','tiago@gmail.com');
INSERT INTO tbl_participante(nome,email) values ('Maria do Rosário','maria@gmail.com');
INSERT INTO tbl_participante(nome,email) values ('Teresa Silva','teresa@gmail.com');
