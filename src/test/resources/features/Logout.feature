Feature: Rgol - LogOut
  se va testa LogOut'ul

  Scenario: Succes Logout
    Given Open Rgol page
    Then Accept Cookie
    Then Click Man
    Then Put Email
    Then Put Pass
    Then Click
    Then Choose language
    Then Click Man
    Then Logout
    Then Click Man
