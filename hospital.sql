create database hospital;
-- drop database hospital;

use hospital;

create table Hospital(
id int auto_increment primary key,
nm_hospital varchar(45) not null,
ds_endereco varchar(200) not null
);

create table ProntoSocorro(
cd int auto_increment primary key,
id_hospital int not null,
ds_endereco varchar(100) not null,
foreign key(id_hospital) references Hospital(id) 
);

create table Pacientes(
cd int auto_increment primary key,
id_hospital int not null,
nm_paciente varchar(200) not null,
nr_cpf varchar(14) not null,
nr_idade int not null,
ds_senha varchar(45) not null,
foreign key (id_hospital) references hospital(id)
);

create table Funcionarios(
cd int auto_increment primary key,
id_hospital int not null,
nm_paciente varchar(200) not null,
nr_cpf varchar(14) not null,
nr_idade int not null,
ds_senha varchar(45) not null,
vl_hora decimal(5,2) not null,
foreign key (id_hospital) references Hospital(id)
);

create table Medicos(
cd int not null primary key,
nr_crm varchar(45),
ds_especialidade varchar(45),
id_funcionario int not null,
foreign key(id_funcionario) references funcionarios(cd)
);

create table enfermeiros(
cd int not null primary key,
nr_corem varchar(45) not null,
id_funcionario int not null,
foreign key(id_funcionario) references funcionarios(cd)
);