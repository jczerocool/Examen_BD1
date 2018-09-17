

/*
problema número 1.
verifique solo número par

def nombreFuncion ([ parámetros () ]) : [return tipoDato]
funcpar es el nombre de la función se antepone def seguido del nombre de la función se ingresan los parámetros a usar o tareas a realizar, en este caso ingresamos numero:Int número siendo el nombre de la variable que será igual a un entero Int, terminamos con : para después asignar el tipo de datos que deseamos obtener, en este caso será Boolean, terminamos con = para después poner {} estos contendrán el cuerpo de la función*/

def funcpar(numero: Int): Boolean={
  if(numero%2 == 0){//if es una condicion la cual en este caso nos //ayuda a comparar a realizar
     true     // las comparaciones entre el numero entero, al dividirlo //y obtener = 0
  }                 // entonces sera par y se retornara boolean true, //al ser diferente de 0
  else{             // se regresara false, el false esta contenido //dentro del else.
     false
  }
}

/*

Problema número 2.
Buscar numero pares en lista.

creamos una lista  e ingresamos datos en esta, la lista para esta ejemplo se llama listilla, una vez creada la lista procedemos a crear una función la cual como se explicó en el ejercicio anterior contiene
def nombreFuncion ([ parametros() ]) : [return tipoDato]
el nombre de la función es pairs y contiene el números : List[Int]
números es el nombre de la variable que contiene los datos contenidos
en la lista y los cuales son de tipo entero, esta función regresa
un dato tipo String en este caso. se usará una condición for y este contendrá un i el cual tomará los valores de los datos contenidos en la lista,y dentro de for se usará la condición if en el cual compararemos i (datos de la lista) y si estos regresan 0 como residuo de la division entonces seran pares y se procederá a imprimir i (o el dato que corresponde en la lista) de no cumplir con la función if pasaran a else (por que no son pares) y se imprimira que i no es par*/
val listilla = List (1,2,3,4,5,6)

def pairs(numeros : List[Int]): String={
  for(i <- numeros){//dentro de for i toma el valor de los datos de la lista
    if(i%2 == 0){//dentro de la condición if se divide a i y debe regresar 0
      println(s"el numero $i es par")//al regresar 0 como residuo asuminos que es par§
    } else {
      println(s"el numero $i no es par")//de no regresar 0 asuminos que no es par
    }
    }
    return "end"//terminamos la condicion con una impresion end al final
  }


  /*
  Problema número 3.
  Afortunado número 7.

  Creamos una lista  e ingresamos datos en esta, la lista para esta ejemplo se llama lista, una vez creada la lista procedemos a crear una función la cual como se explicó en el ejercicio anterior contiene
  def nombreFuncion ([ parametros() ]) : [return tipoDato]
  el nombre de la función es win y contiene el número : List[Int]
  número es el nombre de la variable que contiene los datos contenidos
  en la lista y los cuales son de tipo entero, esta función regresa
  un dato tipo entero (Int) en este caso. dentro de la función se
  deberá crear una variable, en esta caso se llama suma = 0
  esta variable servirá como contenedor para la suma de cada uno de los datos de la lista una vez que ingresan al for. Ahora se procede a crear la condición for y este contendrá un x el cual tomará los valores de los datos contenidos en la lista y dentro de for se usará la condición if en el cual x tomará los datos de la lista y en caso de que x sea igual a 7 entonces la variable suma tomará el valor que llevaba sumado y se le sumará el resultado de multiplicar x dos veces, en caso de no ser igual a 7 este seguirá sumando los valores de x al término de la condición se imprimirá la suma total contenida en la variable suma*/

  val lista = List (1,7,4,7,5,7)
  def win(numero: List[Int]): Int={
    var suma = 0
    for(x <- numero){
      if (x == 7){
        suma = suma + x*2
      }
      else{
        suma = suma + x
      }
    }
    return suma
  }

  /*
  Problema número 4.
  Balance.

  procedemos a crear una función la cual como se explicó en el
  ejercicio anterior contiene
  def nombreFuncion ([ parametros() ]) : [return tipoDato]
  el nombre de la función es balance y contiene list : List[Int]
  list es el nombre de la variable que contiene los datos contenidos
  en la lista y los cuales son de tipo entero, esta función regresa
  un dato tipo Boolean (true o false) en este caso.
  se crean 2 variable var first y var second, ambas se igual a 0,
  usaremos la var second para alojar la suma total de los elementos
  contenidos en la lista, esto es posible gracias a .sum (la función de
  .sum es sumar los datos contenidos en la lista).
  proseguimos a crear una condicion for, los parámetros que esta contendrá será una variable (i) en este caso, la cual tomará el valor de los datos contenidos en la lista (esto es posible a <-), el rango de la lista se definen con Range(0, list.length),el parámetro 0 contenidos en Range (0) hace referencia a que la lista comenzará en el lugar 0, list.length es la longitud de la lista (número de elementos dentro de la lista). una vez que se tiene el la suma de la lista se procede a realizar la siguiente tarea: entra first com valor 0 y se suma el valor del primer elemento de la lista y ahora first vale 1, la siguiente es
  second, second es igual a la suma de los elementos de la lista,
  osea menos el 1 elemento (el cual fue usado por first), si la lista
  first es igual a lista second entonces se regresa un boolean true de no serlo
se vuelve a entrar a la condicion for hasta lograr igualar las listas.
*/

def balance(list: List[Int]): Boolean={
  var first = 0
  var second = 0

  second = list.sum

  for(i <- Range(0, list.length)){
      first = first + list(i)
      second = second - list(i)

      if(first == second){
        return true
      }
  }
  return false
}

/*
Problema número 5.
palindromo
def nombreFuncion ([ parametros() ]) : [return tipoDato]
como se explicó en los problemas anteriores haremos uso de
una función, esta contendrá el nombre de la función el cual es
pal y contiene (word: String): Boolean, nombre word que es formato
String y regresará un Boolean.
usaremos el método .reverse el cual invierte los elementos
dentro de la lista.
se compara el string ingresado (en este caso la variable word)
(nota: la variable debe crearse después de la función )
entonces comparamos word con word.reverse en caso de ser iguales
regresara un true (Boolean), en caso de no serlo regresara
false.
se debe poner un println y con el nombre de la función mas
la variable println(pal(word1))
*/


def pal(word: String): Boolean={
  return(word==word.reverse)
}

val word = ("damn")
val word1 = ("damn")
val word2 = ("damn")
val word3 = ("anna")

println(pal(word))
println(pal(word1))
