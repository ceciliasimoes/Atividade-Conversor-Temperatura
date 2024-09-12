
---

# Projeto de Conversão de Temperaturas

Este é um mini-projeto desenvolvido em Java utilizando o framework Spring Boot, que fornece dois endpoints para converter temperaturas entre Fahrenheit e Celsius. O projeto implementa um simples REST API com suporte a CORS e retorna respostas nos formatos JSON e XML.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Maven

## Endpoints Disponíveis

1. **/fahrenheitParaCelsius**
    - Método: `GET`
    - Descrição: Converte uma temperatura de Fahrenheit para Celsius.
    - Parâmetro: `f` (Temperatura em Fahrenheit).
    - Exemplo de Requisição:
      ```
      GET /fahrenheitParaCelsius?f=100
      ```
    - Exemplo de Resposta (JSON):
      ```json
      {
        "celsius": 37.77777777777778
      }
      ```

2. **/celsiusParaFahrenheit**
    - Método: `GET`
    - Descrição: Converte uma temperatura de Celsius para Fahrenheit.
    - Parâmetro: `c` (Temperatura em Celsius).
    - Exemplo de Requisição:
      ```
      GET /celsiusParaFahrenheit?c=37
      ```
    - Exemplo de Resposta (JSON):
      ```json
      {
        "fahrenheit": 98.6
      }
      ```

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd nome-do-repositorio
   ```
3. Execute o projeto com Maven:
   ```bash
   mvn spring-boot:run
   ```

## Acesso aos Endpoints

Após iniciar o servidor, acesse os endpoints utilizando um navegador ou uma ferramenta como Postman. O servidor estará disponível em `http://localhost:8080`.

---

