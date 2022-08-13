Feature: login

  @test
  Scenario: login exitoso

    Given que me enuentro en el login de Swag Labs
    When digito mi usuario "standart_user" y contraseña "secret_sauce"
    And presiono el boton login
    Then verifico que este el titulo "PRODUCTS"
    ##And verifico que exista almenos un item