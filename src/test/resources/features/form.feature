Feature: Login
  Como usuario
  Yo quiero crear una cuenta
  Para tener acceso a la web

  Scenario: Register
    Given el esta en la pagina de registro
    When el ingresa los datos de registro
      | firstName | lastName | email   | phone      | address              | city    | state | zipCode | website | projectDescription |
      | pepito    | perez    | p@p.com | 7410000000 | avenida siempre viva | Alabama | daho  | 55555   | website | proyecto de prueba |
    Then el deberia poder ver que se creo el registro correctamente

