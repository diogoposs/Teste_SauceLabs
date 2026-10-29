# SauceDemo Login Tests

Estudo inicial de automação web do fluxo de autenticação do [SauceDemo](https://www.saucedemo.com/), aplicação de demonstração da Sauce Labs.

**Tecnologias:** Java 17, Selenium WebDriver, Cucumber, JUnit 4 e Maven.

## Objetivo

Praticar a escrita de cenários em Gherkin, a implementação de passos com Selenium e a execução automatizada de interações no navegador.

## Implementação atual

- Abertura do Chrome e acesso à página de login.
- Preenchimento de usuário e senha e envio do formulário.
- Verificação de um elemento da página de produtos.
- Scenario Outline com diferentes usuários.

## Executar localmente

Requisitos: JDK 17, Maven, Google Chrome instalado e acesso ao SauceDemo.

```bash
git clone https://github.com/diogoposs/Teste_SauceLabs.git
cd Teste_SauceLabs
mvn test
```

O runner está configurado para gerar um relatório em `target/cucumber-report.html`.

**Ajuste necessário na versão atual:** o arquivo de cenários está em `src/test/Resources/features`, enquanto o runner aponta para `src/test/resources/features`. Em sistemas que diferenciam maiúsculas de minúsculas, alinhe o nome da pasta antes de executar. Uma execução sem cenários encontrados não comprova que o login foi testado.

## Organização

| Arquivo                                                            | Responsabilidade                                  |
| ------------------------------------------------------------------ | ------------------------------------------------- |
| [Login.feature](src/test/Resources/features/Login.feature)         | Exemplos de autenticação                          |
| [LoginSteps.java](src/test/java/steps/LoginSteps.java)             | Interação com a página e verificação de resultado |
| [RunCucumberTest.java](src/test/java/runners/RunCucumberTest.java) | Configuração do runner e do relatório             |
| [pom.xml](pom.xml)                                                 | Dependências e execução pelo Maven                |

## Estado do estudo

Os exemplos atuais misturam contas válidas, conta bloqueada e nomes inexistentes, todos com expectativa de sucesso. Portanto, a suíte ainda precisa separar cenários positivos e negativos para representar corretamente o comportamento esperado.

As próximas melhorias são: verificar URL e conteúdo da página autenticada, validar as mensagens de erro, utilizar esperas explícitas e encerrar o navegador em um hook `@After`, inclusive quando um passo falhar.

Este repositório registra uma etapa inicial de aprendizado e não representa uma suíte completa de regressão do SauceDemo.
