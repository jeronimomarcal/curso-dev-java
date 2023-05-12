-- Criação da tabela "Curso"
CREATE TABLE Curso (
  codigo_curso INT PRIMARY KEY,
  nome_curso VARCHAR(35),
  carga_horaria INT
);

-- Criação da tabela "Turma"
CREATE TABLE Turma (
  codigo_turma INT PRIMARY KEY,
  quantidade_alunos INT,
  turno VARCHAR(35),
  codigo_curso INT,
  FOREIGN KEY (codigo_curso) REFERENCES Curso(codigo_curso)
);

-- Criação da tabela "Professor"
CREATE TABLE Professor (
  matricula_professor INT PRIMARY KEY,
  nome_professor VARCHAR(35),
  sobrenome_professor VARCHAR(35),
  cpf_professor VARCHAR(15),
  salario DECIMAL(10, 2),
  ano_contratacao INT,
  codigo_curso INT,
  codigo_turma INT,
  FOREIGN KEY (codigo_curso) REFERENCES Curso(codigo_curso),
  FOREIGN KEY (codigo_turma) REFERENCES Turma(codigo_turma)
);

-- Criação da tabela "EnderecoProfessor"
CREATE TABLE EnderecoProfessor (
  id_endereco INT PRIMARY KEY,
  cep VARCHAR(10),
  uf VARCHAR(2),
  cidade VARCHAR(15),
  bairro VARCHAR(15),
  logradouro VARCHAR(25),
  complemento VARCHAR(25),
  numero VARCHAR(4),
  matricula_professor INT,
  FOREIGN KEY (matricula_professor) REFERENCES Professor(matricula_professor)
);

-- Criação da tabela "ContatoProfessor"
CREATE TABLE ContatoProfessor (
  id_contato_professor INT PRIMARY KEY,
  email_professor VARCHAR(35),
  ddi VARCHAR(3),
  ddd VARCHAR(3),
  telefone_contato VARCHAR(15),
  telefone_alternativo VARCHAR(15),
  matricula_professor INT,
  FOREIGN KEY (matricula_professor) REFERENCES Professor(matricula_professor)
);

-- Criação da tabela "Aluno"
CREATE TABLE Aluno (
  matricula_aluno INT PRIMARY KEY,
  nome_aluno VARCHAR(45),
  sobrenome_aluno VARCHAR(45),
  cpf_aluno VARCHAR(12),
  renda_mensal DECIMAL(10, 2),
  profissao VARCHAR(25),
  codigo_turma INT,
  FOREIGN KEY (codigo_turma) REFERENCES Turma(codigo_turma)
);

-- Criação da tabela "ContatoAluno"
CREATE TABLE ContatoAluno (
  id_contato_aluno INT PRIMARY KEY,
  email_aluno VARCHAR(35),
  ddi VARCHAR(5),
  ddd VARCHAR(5),
  telefone_contato VARCHAR(15),
  telefone_alternativo VARCHAR(15),
  matricula_aluno INT,
  FOREIGN KEY (matricula_aluno) REFERENCES Aluno(matricula_aluno)
);

-- Criação da tabela "EnderecoAluno"
CREATE TABLE EnderecoAluno (
  id_endereco_aluno INT PRIMARY KEY,
  cep VARCHAR(10),
  uf VARCHAR(4),
  cidade VARCHAR(25),
  bairro VARCHAR(30),
  logradouro VARCHAR(35),
  complemento VARCHAR(20),
  numero VARCHAR(6),
  matricula_aluno INT,
  FOREIGN KEY (matricula_aluno) REFERENCES Aluno(matricula_aluno)
);

-- Criação da tabela "Responsavel"
CREATE TABLE Responsavel (
  codigo_responsavel INT PRIMARY KEY,
  nome_responsavel VARCHAR(255),
  sobrenome_responsavel VARCHAR(255),
  cpf VARCHAR(14),
  profissao VARCHAR(255),
  matricula_aluno INT,
  FOREIGN KEY (matricula_aluno) REFERENCES Aluno

-- Criação da tabela "ContatoResponsavel"
CREATE TABLE ContatoResponsavel (
  id_contato_aluno INT PRIMARY KEY,
  email_aluno VARCHAR(35),
  ddi VARCHAR(5),
  ddd VARCHAR(5),
  telefone_contato VARCHAR(15),
  telefone_alternativo VARCHAR(15),
  matricula_aluno INT,
  FOREIGN KEY (matricula_aluno) REFERENCES Aluno(matricula_aluno)
);

-- Criação da tabela "EnderecoResponsavel"
CREATE TABLE EnderecoResponsavel (
  id_endereco_aluno INT PRIMARY KEY,
  cep VARCHAR(10),
  uf VARCHAR(4),
  cidade VARCHAR(25),
  bairro VARCHAR(30),
  logradouro VARCHAR(35),
  complemento VARCHAR(20),
  numero VARCHAR(6),
  matricula_aluno INT,
  FOREIGN KEY (matricula_aluno) REFERENCES Aluno(matricula_aluno)
);
