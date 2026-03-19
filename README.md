# tarea7-pila--Fuentes-
Bitácora de USS Algoritmo

Nombre de la clase USS Algoritmo
Se crea una Bitácora de Eventos de la nave que contiene un registro cronológico de todo lo que ocurre durante la misión.

La bitácora funciona bajo un principio crítico de seguridad: el último evento registrado es el primero que se consulta. Cuando ocurre una emergencia, el capitán necesita ver qué pasó justo antes, no lo que pasó hace tres horas. Por eso, el sistema de bitácora debe implementarse como una Pila (Stack).

FASES
Parte 1 - Definición de la bitacora y su implementacion
La Bitacora implementa el TDA Pila con los siguientes métodos:

Método	Descripción
registrar(String evento)	Agrega un nuevo evento a la cima de la bitácora (push)
consultarUltimo()	Devuelve el último evento sin eliminarlo (top/peek)
eliminarUltimo()	Elimina y devuelve el último evento registrado (pop)
estaVacia()	Retorna true si no hay eventos registrados (isEmpty)
totalEventos()	Retorna el número de eventos actuales (size)

EXCEPCIONES
Si se intenta hacer consultarUltimo() o eliminarUltimo() en una bitácora vacía, el sistema debe lanzar una excepción con un mensaje apropiado.

Parte 2 — Mision solicitada
Durante el vuelo, la nave registra eventos automáticamente. Sin embargo, cuando el sistema detecta que el último evento fue un error crítico, el protocolo exige deshacer los últimos 3 registros para reanalizar qué ocurrió.

Se implementa en Main la siguiente secuencia de la misión:

1. Registrar los siguientes 6 eventos en orden:
   - "Motor de estribor encendido"
   - "Velocidad warp alcanzada"
   - "Señal de comunicación estable"
   - "Anomalía detectada en sector 7"
   - "Escudos al 40%"
   - "ERROR CRÍTICO: fallo en sistema de navegación"

2. Consultar e imprimir el último evento registrado.

3. Si el último evento contiene la palabra "ERROR",
   ejecutar el protocolo de revisión:
   eliminar los últimos 3 eventos e imprimir cada uno
   que se va removiendo.

4. Imprimir el estado actual de la bitácora:
   - Total de eventos restantes
   - Cuál es ahora el evento en la cima

Parte 3 — Pregunta de Reflexión

/* ¿Por qué una Pila es la estructura correcta para este sistema de bitácora? 
Porque la estructura de pila permite registrar los evento en orden cronologico y dado los requisitos del proyecto es necesario acceder al ultimo evento
¿Qué pasaría si usaras una lista normal accediendo por índice?
La lista creceria indefinidamente con un numero de indice impredecible ya que como usuarios seria dificil saber cual es el numero de indice del ultimo incidente, por lo tanto no seria eficiente, ni plausible */