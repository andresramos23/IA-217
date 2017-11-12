# A Guide to TF Layers: Building a Convolutional Neural Network

## Conclusiones

- Tensorflow brinda una modulo llamado layers que es una manera relativamente sencilla de construir una red neuronal.
- Es posible configurar la red neuronal a cómo uno desee pues Tensorflow brinda herramientas que permite parametrizar la red que se está construyendo.
- Las redes neuronales convolucionales (CNNs)  son el medio actual arquitectónico para tareas de clasificación de imágenes. 
- CNN aplica filtros a los datos del pixel puro de una imagen para extraer y aprender características de alto nivel.
- CNN está compuesta por 3 tipos de capas, ellas son: 
-- Convolutional layers: Aplica un número de filtros convolucionales a una imagen. Capa hace operaciones para producir un valor en la salida del mapa de características.
-- Pooling layers:   Rebaja los datos de la imagen extraída por las convolutional layers para reducir la dimensión del mapa de características para bajar el tiempo de procesamiento.
-- Dense(fully connected) layers: Hace clasificación de las características extraídas por las convolutional layers y rebajada por pooling layers. En dense layer cada nodo está conectado a todo nodo de capa anterior.


## Aplicación a un problema real
- El programa va a analizar dígitos escritos a mano del 0 al 9, es similar a un ejemplo visto en clase que era para dar una noción de lo que son las redes neuronales, solo que el análisis producido en este ejercicio es más extenso y detallado, además que se utiliza herramientas de Tensorflow.
- A futuro y con unas modificaciones, este tipo de ejercicio se podría expandir al análisis de escritura de las personas para verificar identidad, un ejemplo podría ser en un banco, se podría examinar que la identidad de la persona coincida con la escritura que está presentado. 
- Tensorflow brinda una manera de crear redes neuronales que podría ser aprovechada por gran cantidad de personas ya que permite ajustar la red neuronal a como una persona desee ya que tiene la posibilidad de parametrizar la red.

## Capturas de pantalla
#### Resultado parcial
![alt text](https://image.ibb.co/kqiTQw/primero.png)
#### Resultado final
![alt text](https://image.ibb.co/f3SYsb/segundo.png)