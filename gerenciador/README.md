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

#### Definindo o nosso modelo (Aula 3):
- Criação do **modelo** da nossa aplicação.
  > O modelo ou domínio são as classes que representam o mundo real, aquilo que o cliente ou usuário da aplicação define.<br>
  > Para descobrir quais são as classes e funcionalidades do modelo o analista de requisitos conversa com o cliente e documenta cada funcionalidade.<br>
  > Nesse curso falaremos menos sobre o modelo e a camada de persistência como JDBC ou JPA. Nós vamos focar nas Servlets, claro!

#### Páginas dinâmicas com JSP (Aula 4):
- JSP significa Java Server Pages
- JSP é uma página automaticamente processada pelo Tomcat
- Para gerar HTML dinamicamente no JSP usamos Scriptlets
- Um scriptlet `<% %>` é um código Java dentro do HTML
- Um scriptlet só funciona em uma página JSP
- Usamos o `RequestDispatcher` para chamar um JSP a partir da servlet
- Obtemos o `RequestDispatcher` a partir do `HttpServletRequest`
- Usamos a requisição para colocar ou pegar um atributo (`setAttribute(name, value)` ou `getAttribute(name)`)

#### Java Standard Tag Library e Expression Language (Aula 5):
- Expression Language (EL) e Java Standard Tag Library (JSTL) foram utilizados como alternativa aos scriptlets
- EL é uma linguagem simples e limitada para imprimir o resultado de uma expressão, sua sintaxe é `${ ... }`
- JSTL é utilizada em conjunto ao EL e ela define 5 taglibs (core, fmt, xml, sql e fn)
- O conjunto de bibliotecas não vem com o Tomcat, sendo necessário importar o arquivo: [jstl-1.2.jar](https://github.com/DiegoCosta1/java-servlets-fundamentos-programacao-web/blob/main/gerenciador/src/main/webapp/WEB-INF/lib/jstl-1.2.jar) para o diretório `WEB-INF/lib`
- As taglibs mais importantes são: `core`, que serve para controle de fluxo e `fmt`, que serve para formatação e i18n (internacionalização). Os respectivos imports dessas taglibs podem ser feitos através do código:
```
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
```
- Foram utilizadas as tags `c:if`, `c:forEach`, `c:url` e `fmt:formatDate`
-  Para saber mais: [Java e JSTL: Tags para facilitar o desenvolvimento JSP](https://cursos.alura.com.br/course/jstl)

## Dicas do Eclipse
- Criação do projeto web pelo menu "File" ou "Project Explorer":
_`New > Project... > Dynamic Web Project`_
- Exemplo como criar um arquivo Java pelo menu do diretório "src/main/java"/"src/main/webapp":
_`New > Other > Servlet`_ ou _`New > Other > HTML File`_
- Gerador de Getters e Setters através do atalho _`ctrl + 3`_
