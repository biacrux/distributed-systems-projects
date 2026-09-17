# Data-Science
# Projeto Kotlin/Gradle

## Requisitos

* **IntelliJ IDEA (Community, gratuito)**: https://www.jetbrains.com/idea/download/
* JDK 17 ou 21 (o IntelliJ costuma sugerir a instalação automaticamente se não detetar nenhum)
* Instalar docker

## Como abrir e correr cada projeto

1. Abrir o IntelliJ IDEA.
2. Escolher **Open** (ou **File > Open**) e selecionar a pasta raiz do projeto (a que contém o `build.gradle.kts` e `settings.gradle.kts`).
3. Esperar que o IntelliJ sincronize o Gradle (aparece uma barra de progresso em baixo, "Syncing Gradle...").
4. Se houver um `docker-compose.yaml` no projeto e ele configurar serviços (ex: base de dados), correr primeiro no terminal:

   ```
   docker compose up -d
   ```

5. No painel lateral direito **Gradle**, expandir o projeto até à tarefa `run` ou `bootRun` (Spring Boot) e fazer duplo clique para correr. Ou, se houver uma classe `main`, basta abrir o ficheiro e clicar no botão **▶** verde ao lado da função `main`.
6. Para parar, usar o botão de **stop** (quadrado vermelho) no painel de execução.

Repete os passos 2-6 para cada projeto/pasta Gradle diferente que quiseres correr — cada um deve ser aberto como um projeto separado no IntelliJ.
