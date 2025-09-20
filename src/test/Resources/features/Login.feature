Feature: Login no SauceDemo

  Scenario Outline: Login com sucesso
    Given que estou na página de login
    When eu entro com usuário "<usuario>" e senha "<senha>"
    Then devo ver a página de produtos

    Examples:
      | usuario         | senha         |
      | standard_user   | secret_sauce  |
      | locked_out_user | secret_sauce  |
      | problem_user    | secret_sauce  |
      | performance_glitch_user | secret_sauce |
      | error_user      | secret_sauce  |
      | visual_user     | secret_sauce  |
      | user1           | secret_sauce  |
      | user2           | secret_sauce  |
      | user3           | secret_sauce  |
      | user4           | secret_sauce  |
