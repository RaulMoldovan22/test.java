Feature: Rgol - Cos cumparaturi
  se va testa adaugarea unui produs in cos si vizualizarea acestuia

  Scenario: Succes "Produs"
    Given Open Rgol page
    Then Accept Cookie
    Then Click button Autentificare
    Then Puenm Email valid: "raul_moldovan22@yahoo.com"
    Then Punem Parola valida
    Then Click Accesare cont
    Then Alegem limba romana
    Then Intram in tabul - Pentru fani
    Then Alegem - Cluburi de fotbal
    Then Alegem echipa - Inter Milano
    Then Alegem tricoul de joc a celor de la Inter
    Then Selectam marimea S
    Then O adaugam in cos
    Then Inchidem tabul afisat
    Then Vizualizam cosul de cumparaturi
    Then Mergem la cosul de cumparaturi, pentu a face comanda



