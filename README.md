## Zoológico Madagascar
___
Este projeto é uma API REST desenvolvida com Spring Boot, utilizando Java 17, banco de dados H2 em memória, e suporte a validações com Lombok e JPA.
___

O Zoológico Madagascar solicitou um sistema para realizar o controle de todos os animais 
existentes nas instalações. 

**_O sistema armazena:_** Código único(id), Nome, Idade e se nasceu em cativeiro.

## Funcionalidades:
___ 
### Animais
  - Listar todos ``GET /animais``
  - Listar por Id ``GET /animais/{id}``
  - Cadastrar ``POST /animais``
  - Atualizar ``PUT /animais/{id}``
  - Excluir ``DELETE /animais/{id}`` 
  - Listar todos nascidos em cativeiro ``GET /animais/nascidoEmCativeiro``

### Adicionais:
Classe **GlobalExceptionHandler** possui a anotação **@ControllerAdvice** e está 
sendo usada para centralizar o tratamento nos erros que serão genericos ou comuns em todos os controllers 


## 🚀 Tecnologias Utilizadas
___
### 🧱 Base do Projeto
- **Java 17**
- **Spring Boot**

### 💾️ Persistência e Banco de Dados
- **Spring Data JPA**
- **H2 Database** (em memória)

### ✅ Validação e Utilitários
- **Lombok**
  - `@Getter`, `@Setter`, `@Builder`, `@NoArgsConstructor`, `@AllArgsConstructor`
- **Bean Validation (JSR-380)**
  - `@Valid`, `@NotBlank`


