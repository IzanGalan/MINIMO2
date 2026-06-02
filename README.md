# DSA - Proyecto

Proyecto de la asignatura DSA. Tiene dos partes:
- **android/**: app Android del juego (Dungeon Run).
- **web/**: backend REST con Jersey.

## Segundo minimo - EJ5 (Izan, G2)

Mostrar los usuarios registrados en un evento.

- **T1 (Android):** actividad nueva que lista los usuarios (foto, nombre y apellido) de un evento. Usa RecyclerView y Glide para las imagenes.
- **T2 (Backend):** ruta nueva  + "GET /api/juego/evento/{nombre}/usuarios" +  que devuelve la lista de usuarios. Es dummy: no usa BBDD, devuelve datos fijos y saca un mensaje por consola.

La llamada se hace con Retrofit, que es lo que pide el minimo.

### Estado
- Funciona: la app llama al backend, recibe el JSON y muestra la lista con las fotos.
- Pendiente: el nombre del evento esta puesto a fuego en la app, no se elige desde otra pantalla.

Capturas en /evidencias.
