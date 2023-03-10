# Patrón Factory con tipos de transporte para la mensajería:

---


### Procedimiento

La finalidad de este programa, es poder saber el coste del envío, tipo de embalaje, el tipo de transporte que se va a usar, código postal de la dirección a donde hay que hacer el envío, las dimensiones y el peso del paquete.


---

### Coste de envío

El coste de envío cambia, por lo que debemos de calcular el coste de envío, en el caso del camión hay que sacar la diferencia de códigos postales y multiplicar la diferencia por 0.04€, en el caso de que la diferencia sea de 0, el precio será de 0.4€. En el caso de la bicicleta, la diferencia será de 0.02€, y si la diferencia es de 0, el precio será de 0.2€.


---
### Tipos de embalaje

En este método, vamos a ver que tipo de embalaje necesitará cada producto.


- Si la suma de las dimensiones es <=150 y el peso <=40 irá en **caja de madera**.
- Si la suma de las dimensiones es <=3000 y el peso es <=100 irá en **caja de cartón**.
- Si no es ningúna de las anteriores irá en palet.


