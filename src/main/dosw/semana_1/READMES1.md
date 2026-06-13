# SEMANA No 1 - DOSW Manejo de Streams 

## Datos Personales: 
- William Santiago Ruiz Medina
- ID: 1000091727
- DOSW 

### E1S1 - Números Pares mayores a diez

Dada una lista de números enteros obtener una nueva solo con los pares mayores a 10

**Codigo:**
![alt text](CódigoE1S1.png)


**Captura de ejecución**
![alt text](OUTPUT_E1S1.png)

**Explicación**
Se crea una lista de enteros determinada, se filtra por los que cumplan con que sean pares y mayores que 10, se hace .collect y esto es lo que se mete en una nueva lista 


### E2S1 Palabras > 4 caracteres

 Dada lista de palabras: 
 - Filtrar las que tengan > 4 caracteres
 - Convertir a mayuscula
 - Ordenar alfabéticamente
 - Obtener cantidad total de palabras resultantes

**Codigo:**
![alt text](CODIGOE2S1.png)

**Captura de ejecución**
![alt text](OUTPUTE2S1.png)

**Explicación**
Se tiene la lista de palabras, se filtra dejando pasar solo las que tengan longitud mayor de 4, se convierte a mayúscula cada una de estas con .map, y con .sorted se ordenan alfabeticamente

### E3S1 Obtener nombres de los Usuarios 

Dada una lista de usuarios con los atributos: id, name, age, active
Filtra únicamente los usuarios activos, obtén una lista con los nombres en mayúscula y ordenada alfabéticamente.

**Codigo:**
![alt text](CODIGOE3S1.png)


**Captura de ejecución**
![alt text](OUTPUTE3S1.png)


**Explicación**
Teniendo la lista de usuarios, se filtran los activos, después con .map se dejan los nombres en mayúscula 


### E4S1  Personas mayores de edad 
Dado un listado de Usuarios y utilizando los mismo atributos anteriores, filtrar las personas mayores de edad y obtener
sus nombres.

**Codigo:**
![alt text](CODIGOE4S1.png)


**Captura de ejecución**
![alt text](OUTPUT_E4S1.png)

**Explicación**
Se tiene lista de users, filtramos los que tengan más de 18 años (o 18 años), se toman los nombres de las personas que cumplan con la condicion, y posteriormente se usa .collect() para meter a todos esos en una lista con sus nombres 

### E5S1 Transacciones Bancarias



**Codigo:**
Clase principal: 
![alt text](CODIGOE5S1.png)

Clase auxiliar 
![alt text](CODIGOE5S1_AUXILIAR.png)

**Captura de ejecución**
![alt text](OUTPUTE5S1.png)

**Explicación**
Teniendo la lista de transacciones, se hace .peek para ver si están aprovadas o no (una por una) se usa anyMatch para ver si alguna no está aprobada, si eso pasa da True, si ninguna está desaprobada es caso contrario 

Si se tiene 1 o más desaprobadas = lote invalido 



