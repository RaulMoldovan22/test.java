Feature: Rgol - LogIn
  se va testa pagina de login

  Scenario: Succes Login
    Given Open Rgol page
    Then Accept Cookie
    Then Click button Autentificare
    Then Puenm Email valid: "raul_moldovan22@yahoo.com"
    Then Punem Parola valida
    Then Click Accesare cont
    Then Alegem limba romana
    Then Click button Autentificare
