Feature: Rgol - LogIn
  se va testa functionalitatea Search-ului + adaugare la lista de produse dorite

  Scenario: Succes Seaarch
    Given Open Rgol page
    Then Accept Cookie
    Then Click button Autentificare
    Then Puenm Email valid: "raul_moldovan22@yahoo.com"
    Then Punem Parola valida
    Then Click Accesare cont
    Then Alegem limba romana
    Then Cauta: "creatine xplode powder 260g"
    Then Click Lupa cauta
    Then Click pentru a adauga la produse dorite
    Then Adaugam o noua lista de produse dorite: "Noua mea lista"
    Then Selectam lista adaugata anterior
    Then Vizualizare lista creata

