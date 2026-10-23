# SimpsonCompuesto

# Instrucciones para compilar y ejecutar
1. Compilar desde la terminal
- Desde la carpeta raíz del proyecto, se ejecuta:
javac -d out src/dif_e_Integracion/*.java

- Ejecutar el método del Trapecio
java -cp out dif_e_Integracion.MainTrap

- Ejecutar el método de Simpson
java -cp out dif_e_Integracion.MainSimpson

2. Ejecutar desde un IDE
1. Abrir el proyecto en NetBeans o IntelliJ IDEA.
2. Verificar que las clases estén dentro del paquete dif_e_Integracion.
3. Abrir MainTrap.java y ejecutar el programa.
4. Después, abrir MainSimpson.java y ejecutarlo.
5. Revisar los resultados y las iteraciones mostradas en la consola.

# Ejemplo de salida en consola
--- ITERACIONES (TRAPECIO COMPUESTO) ---
 n = 2 | Integral = 3.0 
 n = 4 | Integral = 2.75 | Error = 0.25
 n = 8 | Integral = 2.6875 | Error = 0.0625
 n = 16 | Integral = 2.671875 | Error = 0.015625
 n = 32 | Integral = 2.66796875 | Error = 0.00390625
 n = 64 | Integral = 2.6669921875 | Error = 9.765625E-4
 n = 128 | Integral = 2.666748046875 | Error = 2.44140625E-4
 n = 256 | Integral = 2.66668701171875 | Error = 6.103515625E-5

Resultado final obtenido: 2.66668701171875

--- ITERACIONES (SIMPSON 1/3 COMPUESTO) ---
n = 2 | Integral = 2.6666666666666665
n = 4 | Integral = 2.6666666666666665 | Error = 0.0

Resultado final obtenido: 2.6666666666666665
