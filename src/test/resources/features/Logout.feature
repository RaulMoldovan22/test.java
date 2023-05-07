Feature: Rgol - LogOut
  se va testa LogOut'ul

  Scenario: Succes Logout
    Given Open Rgol page
    Then Accept Cookie
    Then Click button Autentificare
    Then Puenm Email valid: "raul_moldovan22@yahoo.com"
    Then Punem Parola valida
    Then Click Accesare cont
    Then Alegem limba romana
    Then Click button Autentificare
    Then Logout
    Then Click button Autentificare
