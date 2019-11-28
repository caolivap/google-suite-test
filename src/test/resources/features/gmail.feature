#language:es

Característica: Recepción correo Gmail
  Antecedentes:
  Yo como usuario de Gmail
  Quiero revisar la bandeja de entrada de mi cuenta
  Para validar la llegada de un correo

Escenario: Recepción de correo en Gmail
  Dado Carlos se encuentra en la bandeja de entrada de Gmail con usuario pruebascaoliva y contraseña testingGmail
  Cuando busca el correo con asunto Alerta de seguridad del remitente Google
  Entonces encuentra en el cuerpo del mensaje el texto Se ha cambiado tu contraseña

