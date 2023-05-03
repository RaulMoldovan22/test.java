Feature: Rgol - Cos cumparaturi
  se va testa adaugarea unui produs in cos si vizualizarea acestuia

  Scenario: Succes "Produs"
    Given Open Rgol page
    Then Accept Cookie
    Then Click Man
    Then Put Email
    Then Put Pass
    Then Click
    Then Choose language
    Then Choose Fan
    Then Choose Cluburi
    Then Choose Inter Milano
    Then Pick Inter Shirt
    Then Choose Size S
    Then Put on basket
    Then Close window
    Then View basket
    Then Go to basket



