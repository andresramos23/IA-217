# Vector Representations of Words
## Conclusiones 
- El modelo word2vec es computacionalmente eficiente para aprender palabras embebidas.
- El lenguaje natural codifica palabras como símbolos atómicos, es decir, si fuera un gato se le da un id. Codificación es arbitraria y no dan información útil con relaciones que puedan existir entre símbolos, es decir, que casi no se aprovecha lo aprendido de “gatos” en caso de procesar “perros”, pero utilizando representación de vectores es posible quitar esos obstáculos.
- Vector Space Models representan palabras “empotradas” en un espacio contínuo en un vector donde palabras semánticamente similares son mapeadas a puntos cercanos. 
- Métodos dependen de distribución hipotética, que lo que dictan es que palabras que aparezcan en mismos contextos comparten un significado semántico. Hay dos enfoques:
-- métodos basado en recuento : Calculan las estadísticas de qué tan frecuente algunas palabras co ocurren con su vecino en un texto largo, luego mapea ese conteo estadístico a un vector pequeño, denso para cada palabra.
-- métodos predictivos  : Trata directamente de predecir una palabra de su vecinos en términos pequeños, densos vectores empotrados. Word2vec es eficiente modelo predictivo .
- Es posible visualizar vectores aprendidos en dos dimensiones usando t-SN3 dimensionality reduction technique. Esta técnica muestra que vectores capturan información general, útil y semántica sobre palabras y sus relaciones a otras.
- Implementación dada muestra que TensorFlow posee gran flexibilidad, entre los elementos que brindan esta flexibilidad está que el cambiar el objetivo de entrenamiento es sencillo, ya que con cambiar la llamada de una función es posible. 
- Sí se quiere usar una función de perdida manual, se puede escribir manualmente en una expresión y se puede dejar que el optimizador calcule sus derivadas.
- El modelo muestra cómo TensorFlow aporta la flexibilidad necesaria para una experimentación temprana y el control que luego se va a necesitar para la implementación.


## Aplicación a un problema real
- El modelo de este tutorial podría ser de gran utilidad para cualquier sistema que de escritura que busque predecir conforme la persona va escribiendo, como lo es el teclado predictivo de un iPhone, que va sugiriendo palabras al usuario que lo va utilizando. 
- El utilizar el modelo skip-gram podría favorecer también el aprendizaje que palabras que tal vez no sean tan utilizadas pero tienen relación con lo que se está desarrollando, inclusive podría ser útil para la enseñanza de ortografía.


## Capturas de pantalla
![alt text](https://image.ibb.co/fsb1Cb/inicio.png)
![alt text](https://image.ibb.co/cnBCJG/final.png)