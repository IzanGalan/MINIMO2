# DSA - MINIMO2

Proyecto de la MINIMO2 entrega para la asignatura de DSA. Tiene dos partes:
- **android/**: app Android del juego (Dungeon Run).
- **web/**: backend REST con Jersey.

## Segundo minimo - EJ5 (Izan, G2)

Mostrar los usuarios registrados en un evento.

- **T1 (Android):** actividad nueva que lista los usuarios (foto, nombre y apellido) de un evento.
- **T2 (Backend):** ruta nueva  + "GET /api/juego/evento/{nombre}/usuarios" +  que devuelve la lista de usuarios. Es dummy: no usa BBDD, devuelve datos fijos y saca un mensaje por consola(imagen en carpeta evidencias del repositorio).

La llamada se hace con Retrofit, como dice el enunciado del MINIMO2.

### Estado
- Funciona: la app llama al backend, recibe el JSON y muestra la lista con las fotos, las fotos son avatares aleatorio de internet.
- Pendiente: el nombre del evento esta puesto a fuego en la app, no se elige desde otra pantalla
- 
Las capturas de las cosas están en la carpeta evidencias:
-hay una caputra del JSON
-otra captura de la app con el boton de evento
-otra captura con la lista de participantes de ese evento
-y la otra caputra es la terminal respondiendo a la api llamada desde el android y dando la respusta que es la lista de jugadores
