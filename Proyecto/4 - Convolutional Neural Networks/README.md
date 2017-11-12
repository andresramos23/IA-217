# Convolutional Neural Networks
## Conclusiones
- Se utiliza  CIFAR-10 porque es lo suficientemente complejo para ejercitar habilidad de TensorFlow para escalar a grandes modelos.
- Modelo de CIFAR-10  es pequeño por lo que se puede entrenar rápido, lo que es ideal para probar y experimentar nuevas técnicas.
- Red de CIFAR-10 busca clasificar imágenes 32x32 en diez categorías comunes, donde ellas son: avión, auto, pájaro, gato, venado, perro, rana, caballo, barco, camión.
- Se usa la red para reconocer imágenes, busca enfocar una organización canónica para arquitectura de red, entrenar y evaluar. 
- Modelo CIFAR-10 es dividido en tres módulos, ellos son:
-- Modelo de entradas: Se tiene inputs() y distorted_inputs() que agregan operaciones para que lean y pre procesan imágenes CIFAR para evaluación y entrenamiento.
-- Modelo de predicción:Se tiene inference() que añade operaciones que realizan inferencia, clasificación en imágenes dadas.
-- Modelo de entrenamiento: Este modelo da loss() y train() para brindar operaciones que calculan la perdida, gradientes, actualización de variables  y visualización de resúmenes.
- Para que el problema pudiera correr en un CPU normal se tuvo que hacer ciertas modificaciones. 
-- Se realizó varias pruebas donde el número pasos máximos fue modificado.
-- El modelo con 100 pasos dio precisión de 1 = 0.358
-- El modelo con 1000 pasos dio precisión de 1 = 0.607
-- El modelo con 1000000 pasos dio precisión de 1 = 0.860 (modelo dado por el ejemplo)



## Aplicación a un problema real
- El modelo es útil para problemas que se necesite reconocer imágenes que caigan en en las categorías que CIFAR-10 brinda, como lo podría ser para la industria de aviones o empresas que manejen algún tipo de control en animales. 
- El tener una red neuronal convolucional relativamente pequeña para reconocer imágenes es útil porque da una plantilla  para poder construir modelos más grandes y sofisticados.

# Capturas de pantalla 
#### Corrida con 100 pasos 
![alt text](https://image.ibb.co/k8j2kw/primera_Corrida1.png)
#### Resultado con 100 pasos 
![alt text](https://image.ibb.co/kLvWdG/primer_Resultado.png)

#### Corrida con 1000 pasos 
![alt text](https://image.ibb.co/e3gF5w/segunda_Corrida1.png)
![alt text](https://image.ibb.co/ebgtsb/segunda_Corrida2.png)
#### Resultado con 1000 pasos
![alt text](https://image.ibb.co/hgZeXb/segundo_Resultado.png)
