Feature: Rgol - LogIn
  se va testa pagina de login

  Scenario: Succes Login
    Given Open Rgol page
    Then Accept Cookie
    Then Click Man
    Then Put Email
    Then Put Pass
    Then Click
    Then Choose language
    Then Click Man
