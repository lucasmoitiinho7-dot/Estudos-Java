# Guia Git e GitHub — Passo a passo

## 1. Abrir a pasta do projeto

Abra o PowerShell no VS Code e acesse a pasta do projeto:

```powershell
cd C:\Users\lucas\Estudos-Java
```

## 2. Verificar a instalação do Git

```powershell
git --version
```

Exibe a versão instalada do Git.

## 3. Inicializar o repositório

```powershell
git init
```

Cria um repositório Git local na pasta do projeto.

## 4. Verificar o estado dos arquivos

```powershell
git status
```

Mostra arquivos novos, modificados e alterações preparadas para commit.

## 5. Adicionar arquivos ao Git

```powershell
git add .
```

Adiciona todos os arquivos e pastas do projeto à área de preparação (*staging*).

## 6. Criar um commit

```powershell
git commit -m "descrição das alterações"
```

Registra uma versão do projeto com uma mensagem que descreve as alterações realizadas.

Exemplo:

```powershell
git commit -m "finalização do dia 01 - Fundamentos em Java"
```

## 7. Criar um repositório no GitHub

1. Acesse https://github.com.
2. Clique em **New repository**.
3. Escolha um nome para o repositório.
4. Escolha se será público ou privado.
5. Não marque a opção de criar README, pois o projeto já possui um.
6. Clique em **Create repository**.

## 8. Conectar o projeto local ao GitHub

Copie a URL HTTPS do repositório criado e execute:

```powershell
git remote add origin URL_DO_REPOSITORIO
```

Exemplo:

```powershell
git remote add origin https://github.com/SEU-USUARIO/Estudos-Java.git
```

## 9. Verificar a conexão

```powershell
git remote -v
```

Mostra o endereço do repositório remoto configurado.

## 10. Padronizar o nome da branch

