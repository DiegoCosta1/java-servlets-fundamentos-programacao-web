# [Curso de Java Servlet: fundamentos da programação web Java](https://cursos.alura.com.br/course/servlets-fundamentos-programacao-web-java)

## Sobre o projeto
#### Instrutor/es:
- [Nico Steppat](https://cursos.alura.com.br/user/nico-steppat)

#### Objetivos:
- Entender o que é um Servlet
- Mapear requisições HTTP utilizando POST e GET
- Gerar HTML dinamicamente com JSP e JSTL
- Criar uma CRUD completa e deploy com Tomcat
- Entender o que é inversão de controle

## Lições aprendidas
#### Fundamentos da Web e a API de Servlets (Aula 1):
- Apache Tomcat ou apenas Tomcat é um servidor web em Java
- Tomcat entende o protocolo HTTP e roda por padrão no `http://localhost:8080`
- O projeto Java faz parte da URL, no nosso caso: `http://localhost:8080/gerenciador`
- Uma aplicação web Java pode ter páginas HTML
- Uma servlet é um objeto Java que podemos chamar a partir de uma requisição HTTP
- Para mapear a URL para uma servlet usamos a anotação `@WebServlet`
- Uma servlet deve estender a classe `HttpServlet` e sobrescrever um determinado método (por exemplo: service)

#### Trabalhando com POST e GET (Aula 2):
- Escrever uma servlet que atende apenas GET ou POST
- Ler parâmetros da requisição dentro da servlet
- criar um formulário HTML usando as tags form e input
- Enviar os dados pelo formulário através do POST
- Diferença entre GET e POST
- Para saber mais: [Fundamentos do HTTP](https://cursos.alura.com.br/course/http-fundamentos)

## Dicas do Eclipse
- Criação do projeto web pelo menu "File" ou "Project Explorer":
_`New > Project... > Dynamic Web Project`_
- Exemplo como criar um arquivo Java pelo menu do diretório "src/main/java"/"src/main/webapp":
_`New > Other > Servlet`_ ou _`New > Other > HTML File`_
