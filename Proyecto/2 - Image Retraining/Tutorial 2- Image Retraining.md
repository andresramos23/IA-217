# Image Retraining

## Conclusiones
- Tensorflow brinda una forma de poder reutilizar ya un modelo entrenado, dando la posibilidad de ahorrar tiempo en vida real en casos que no se necesite que exista tanta exactitud y aún así den resultados relativamente buenos.
- TensorFlow da la posibilidad de crear un conjunto de imágenes para entrenar redes, para ello se debe de reunir al menos 100 imágenes del tipo de objeto que se busca reconocer, entre más fotos mejor, además se recomienda que sean imágenes en diferentes condiciones.
- Es posible ver datos relevantes de manera gráfica con la herramienta que brinda TensorFlow llamada TensorBoard, en ella se puede ve resultados de entrenamiento.
- Se puede mejorar los resultados del entrenamiento utilizando varios métodos que da propiamente Tensorflow, entre ellos:
-- Si se quiere mejorar resultados del proceso de aprendizaje, se puede utilizar how_many_training_steps, ya que default es 4000, pero se podría  hasta duplicar el número para conseguir un mejor resultado.
-- Se puede mejorar el entrenamiento modificando las imágenes que se están usando de manera aleatoria, es decir se pueden cortar, cambiar  brillo, para ello Tensorflow da comandos random_crop, random_scale y random_brigthness.
-- Es posible cambiar el porcentaje que se quiere utilizar para el conjunto de datos de entrenamiento, ya que se puede modificar cuánto se quiere otorgar a la validación con validation_percentage y para las pruebas con testing_percentage. 


## Aplicación a un problema real
- El poder transferir conocimiento podría ser de gran ayuda para gran cantidad de problemas que se repiten en varios lugares, entre ellos se podría mencionar el caso de la industria de la salud, que en muchas situaciones se va a buscar el reutilizar datos de otros hospitales, de manera que se podría aplicar a varios hospitales pues serían válidos para esa zona.
- En caso de querer desplegar el modelo en un dispositivo móvil es posible cambiar un poco de exactitud para tener archivos más pequeños y mejores velocidades, por lo que script retrain.py soporta variaciones para arquitectura Mobilenet.

## Capturas de pantalla
#### Bottleneck 

![alt text](https://image.ibb.co/huosJG/bottleneckinicio.png)
![alt text](https://image.ibb.co/ipauXb/bottleneckfinal.png)

#### Gráficos de TensorBoard
![alt text](https://image.ibb.co/j3M1Cb/grafico_Uno.png)
![alt text](https://image.ibb.co/kzuMCb/grafico_Dos.png)
![alt text](https://image.ibb.co/ca3sJG/grafico_Tres.png)
#### Resultado final
![alt text](https://image.ibb.co/mqquXb/final.png)

#### Otras arquitecturas de modelos
![alt text](https://image.ibb.co/meKwCb/otro_Modelo1.png)
![alt text](https://image.ibb.co/mkdOsb/otro_Modelo2.png)
![alt text](https://image.ibb.co/hFX55w/otro_Modelo3.png)
