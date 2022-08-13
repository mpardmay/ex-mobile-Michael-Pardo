Feature: login

  @test
  Scenario: login exitoso

    Given que me encuentro en el login de Swag Labs
    When digito mi usuario "standart_user" y contrasena "secret_sauce"
    And presiono el boton login
    Then verifico que este el titulo "PRODUCTS"
    ##And verifico que exista almenos un item