# Agendador de Tarefas 🗓️

Este é um microserviço de **Agendador de Tarefas** desenvolvido em **Java 17** com **Spring Boot**. Ele permite que usuários gerenciem suas tarefas de forma segura, com autenticação JWT e armazenamento em MongoDB.

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 4.0.2**
- **Spring Data MongoDB** (Persistência NoSQL)
- **Spring Security** (Autenticação e Autorização)
- **Spring Cloud OpenFeign** (Comunicação entre microserviços)
- **JSON Web Token (JWT)** (Segurança)
- **MapStruct** (Mapeamento de objetos DTO/Entity)
- **Lombok** (Produtividade)

## 🛠️ Funcionalidades

- **CRUD de Tarefas:** Criação, leitura, atualização e exclusão de tarefas.
- **Segurança:** Integração com JWT para identificar e isolar tarefas por usuário (e-mail extraído do token).
- **Filtro por Período:** Busca de tarefas agendadas entre datas específicas.
- **Gerenciamento de Status:** Alteração rápida do status de notificação das tarefas (ex: PENDENTE, CONCLUIDO).
- **Integração Externa:** Consumo de serviço de usuários via Feign Client.

## 📁 Estrutura do Projeto

O projeto segue uma arquitetura organizada por camadas:

- `business`: Contém a lógica de negócio, serviços e mappers.
- `controller`: Endpoints da API REST.
- `infrastructure`: Configurações de segurança, acesso a dados (banco de dados), clientes externos e exceções.
- `dto`: Objetos de transferência de dados.
- `entity`: Modelos de dados do MongoDB.

## 📡 Endpoints Principais (`/tarefas`)

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| `POST` | `/tarefas` | Cria uma nova tarefa. |
| `GET` | `/tarefas` | Lista tarefas do usuário logado (via token). |
| `GET` | `/tarefas/eventos` | Busca tarefas por intervalo de data. |
| `PUT` | `/tarefas` | Atualiza uma tarefa completa por ID. |
| `PATCH` | `/tarefas` | Altera apenas o status de uma tarefa. |
| `DELETE` | `/tarefas` | Remove uma tarefa por ID. |

## 🔐 Segurança

O microserviço está protegido por Spring Security. Todas as requisições (exceto as configuradas como públicas) devem incluir um header `Authorization: Bearer <seu_token_jwt>`.

O sistema extrai automaticamente o e-mail do usuário do token para garantir que as operações sejam realizadas apenas nos dados pertencentes ao usuário autenticado.

## ⚙️ Como Executar

### Pré-requisitos
- Java 17 instalado.
- MongoDB rodando localmente ou em container.
- Serviço de usuários (dependência externa) disponível.

### Instalação
1. Clone o repositório:
   ```bash
   git clone https://github.com/Luizgsch/agendador-tarefas.git
   ```
2. Configure o `application.properties` com as credenciais do seu MongoDB e a URL do serviço de usuários.
3. Execute o projeto usando Gradle:
   ```bash
   ./gradlew bootRun
   ```

---
Desenvolvido por [Luiz](https://github.com/Luizgsch)
