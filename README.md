# Parcial 2 corte ARSW

[![Heroku link](https://www.herokucdn.com/deploy/button.png)](https://secure-river-96770.herokuapp.com/)

## Corre localmente

Para correr el proyecto localmente, primero hay que asegurarse de que el proyecto esta corriendo en netbeans, o en consola en la carpeta raiz del proyecto con el siguiente comando:

```sh
$ mvn spring-boot:run
```

La aplicacion deberia estar corriendo en [localhost:5000](http://localhost:5000/).

## Documentacion arquitectura

- Para este parcial teniamos que utilizar un api el cual con la key correcta de activacion y el link correcto se pueden obtener los datos climaticos dependiendo la ciudad que se quiera buscar, en este caso, tuvimos que implementar mediante Spring, maven y heroku, una aplicacion web la cual permitiera ingresar el nombre de la ciudad la cual se quiere conocer su informacion de clima y mostrarla en pantalla de una manera amigable y entendible hacia el usuario. En este caso, mi desarrollo de la aplicacion fue el siguiente:



- Si se quiere saber el clima de una ciudad determinada, se puede ingresar el nombre en el campo que esta habilitado para ingresar texto y dar click en el boton de buscar, cuando esto ocurre se mostrar una tabla con la informacion del clima de esta ciudad como se ve en la siguiente imagen: 



- En caso de que el usuario deje en blanco el espacio se le avisara con un campo de informacion que debe ingresar un dato como se ve en la siguiente imagen:



- En el caso que el usuario ingrese un nombre de una ciudad que no se encuentra registrada por el api, la aplicacion mostrara una tabla vacia, lo cual quiere decir que no existen datos para esta ciudad que el usuario esta intentando ingresar, se puede observar en la siguiente imagen:



- Para este parcial usamos la arquitectura de paquetes denominada MVC como se puede observar en la siguiente imagen, se observa la correcta modularizacion y empaquetado del codigo del parcial, ademas que los nombres son concretos y los nombres de las funciones y su documentacion son concisos y se encunetran disponibles: 



- En conclusion el correcto manejo de las tecnologias que se ofrecen hoy en dia, en este caso heroku, spring, maven, axios y bootstrap se pueden construir aplciaciones amigables para el usuario, y ademas, de una manera organizada y concreta, esto aplicando el patron de MVC. Y con el correcto uso de las API's gratuitas que nos ofrecen se puede obtener y organizar la informacion de una manera adecuada.
