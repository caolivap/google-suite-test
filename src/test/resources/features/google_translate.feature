# language: es

Característica: Traductor Google
  Como Usuario Web
  Quiero usar Google translate
  Para traducir palabras en diferentes lenguajes

  Escenario: Traduccion de Ingles a Español
    Dado "Susana" quiere traducir una palabra
    Cuando ella traduce la palabra "cheese" de "inglés" a "español"
    Entonces ella debe ver la palabra "queso"

  Escenario: Traduccion de Español a Ingles
    Dado "Carlos" quiere traducir una palabra
    Cuando el traduce la palabra "casa" de "español" a "inglés"
    Entonces el debe ver la palabra "home"

  Escenario: Traduccion de Japones to Español
    Dado "Farru" quiere traducir una palabra
    Cuando el traduce la palabra "はじめまして" de "japonés" a "español"
    Entonces el debe ver la palabra "Un placer conocerte"
