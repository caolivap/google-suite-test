#language:es

Característica: Recepción correo Gmail
  Antecedentes:
  Yo como usuario de Gmail
  Quiero revisar la bandeja de entrada de mi cuenta
  Para validar la llegada de un correo

Esquema del escenario: Recepción de correo en Gmail
  Dado Carlos se encuentra en la bandeja de entrada de Gmail con usuario pruebascaoliva y contraseña testingGmail
  Cuando busca el correo con asunto <Asunto> del remitente <Remitente>
  Entonces encuentra en el cuerpo del mensaje el texto <Texto del correo>
  Ejemplos:
| Asunto                | Remitente                     | Texto del correo                                    |
| Test                  | pruebascaoliva@gmail.com      | Este es el Correo de Test 1                         |
| Alerta de seguridad   | no-reply@accounts.google.com  | Se ha cambiado la contraseña de tu cuenta de Google |



