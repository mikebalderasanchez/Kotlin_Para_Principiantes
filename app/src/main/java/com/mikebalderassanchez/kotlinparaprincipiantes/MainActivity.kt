package com.mikebalderassanchez.kotlinparaprincipiantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Leccion 1
        //variablesYConstantes()

        //Leccion 2
        //tiposDeDatos()

        //Leccion 3
        //sentenciaIf()

        //Leccion 4
        //sentenciaWhen()

        //Leccion 5
        //arrays()

        //Leccion 6
        //maps()

        //Leccion 7
        //loops()

        //Leccion 8
        //nullSafety()

        //Leccion 9
        //funciones()

        //Leccion 10
        //classes()
    }

    /*
    Aqui vamos a hablar de variables y constantes
     */
    private fun variablesYConstantes() {

        //Variables

        var myFirstVariable = "Hello Mike"
        var myFirstNumber = 1

        println(myFirstVariable)

        myFirstVariable = "Welcome Mike"

        println(myFirstVariable)

        //No podemos asignar un tipo Int a una variables de tipo String
        //myFirstVariable = 1

        var mySecondVariable = "How Are You?"

        println(mySecondVariable)

        mySecondVariable = myFirstVariable

        println(mySecondVariable)

        myFirstVariable = "You are OK?"

        println(myFirstVariable)

        // Constantes

        val myFirstConstant = "Hello Ari"

        println(myFirstConstant)

        // Una constante no puede modificar su valor
        //myFirstConstant = "Hello Mike"

        val mySeconConstant = myFirstVariable

        println(mySeconConstant)
    }

    /*
    Aqui vamos a hablar de tipos de datos (Data Types)
     */
    private fun tiposDeDatos() {

        //String

        val myString: String = "Hello Mike"
        val myString2 = "Welcome Mike"
        val myString3 = myString + " " + myString2
        println(myString3)

        //Enteros (Byte, Short, Int, Long)

        val myInt: Int = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        //Decimales (Float, Double)

        val myFloat: Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3: Int = 1 //En realidad este es Int
        val myDouble4: Double = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        // Boolean (Bool)
        val myBool: Boolean = true
        val myBool2 = false
        //val myBool3 = myBool + myBool2
        println(myBool == myBool2)
        println(myBool && myBool2)

    }
    /*
    Aqui vamos a hablar de sentencias If
     */
    private fun sentenciaIf() {

        val myNumber = 71

        // Operadores condicionales
        // > mayor que
        // < menor que
        // >= mayor o igual que
        // <= menor o igual que
        // == igualdad
        // != desigualdad

        // Operadores logicos
        // &&  operador "y"
        // || operador "o"
        // ! operador "no"

        if (!(myNumber <= 10 && myNumber > 5 || myNumber == 53)) {
            //Sentencia if
            println("$myNumber es menor o igual que 10 y mayor que 5 o es igual a 53")

        } else if(myNumber == 60) {
            //Sentencia else if
            println("$myNumber es igual a 60")

        } else if(myNumber != 70) {
            println("$myNumber no es igual a 70")

        } else{
            //Sentencia else
            println("$myNumber es mayor que 10 o menor o igual que 5 y no es igual a 53")

        }

    }

    /*
    Aqui vamos a hablar de la sentencia When
     */
    fun sentenciaWhen() {

        //When con String
        val country = "Italia"

        when (country) {
            "Mexico" -> {
                println("El idioma es Espanol Latino")
            } "Espana" -> {
                println("El idioma es Espanol")
            } "Peru" -> {
                println("El idioma es Espanol Latino")
            } "Francia" -> {
                println("El idioma es Frances")
            } "EEUU" -> {
                println("El idioma es Ingles")
            } else -> {
                println("No conocemos el idioma")
            }
        }
        // When con Int
        val age = 100

        when (age) {
            0, 1, 2, 3 -> {
                println("Eres un bebe")
            } in 3 .. 10 -> {
                println("Eres un nino")
            } in 11 .. 17 -> {
                println("Eres un adolescente")
            } in 18 .. 69 -> {
                println("Eres un adulto")
            } in 70 .. 99 -> {
                println("Eres un adulto mayor")
            } else -> {
                println("😱")
            }
        }
    }
    /*
    Aqui vamos a hbalar de arrays o arreglos
     */
    fun arrays(){

        val name = "Mike"
        val surname = "Balderas"
        val company = "Balderas Enterprise"
        val age = "17"

        // Creacion de un Array

        val myArray : ArrayList<String> = arrayListOf<String>()

        // Anador datos de uno en uno

        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
        //myArray.add(age)
        //myArray.add(age)

        println(myArray)

        //Anadir  un conjunto de datos

        myArray.addAll(listOf("Hola", "Bienvenido Mike"))

        println(myArray)

        //Anadir datos

        val myCompany:String = myArray[2]

        println(myCompany)

        //Modificacion de datos

        myArray[5] = "How Are You?"

        println(myArray)

        //Eliminar datos

        myArray.removeAt(4)

        println(myArray)

        // Recorrer datos

        myArray.forEach {
            println(it)
        }

        // Otras operaciones

        println(myArray.count())

        myArray.clear()

        println(myArray.count())


    }

    /*
    Aqui vamos a hablar de mapas, tambien llamdos diccionarios
     */
    fun maps() {

        // Sintaxis
        var myMap: Map<String,Int> = mapOf()
        println(myMap)

        // Anadir elementos
        myMap = mutableMapOf("Mike" to 1, "Ari" to 2, "Mia" to 3)
        println(myMap)

        //Anadir un solo valor
        myMap["Mike2"] = 7
        myMap.put("Ari2", 8)
        println(myMap)

        //Actualizacion de dato
        myMap.put("Mike", 3)
        println(myMap)

        myMap.put("Mia2", 3)

        //Acceso a un dato
        println(myMap["Mike"])

        //Eliminar un dato
        myMap.remove("Mike")
        println(myMap)
    }

    /*
    Aqui vamos a hablar de loops, tambien llamados bucles
     */
    private fun loops(){

        // Bucles

        val myArray:List<String> = listOf("Hello", "Welcome Mike", "How Are You ")
        val myMap:MutableMap<String, Int> = mutableMapOf("Mike" to 1, "Ari" to 2, "Mia" to 3)

        // For

        for (myString in myArray) {
            println(myString)
        }

        for (myElement:MutableMap.MutableEntry<String, Int> in myMap) {
            println("${myElement.key}-${myElement.value}")
        }

        for(x in 0..10){
            println(x)
        }

        for(x in 0 until 10){
            println(x)
        }

        for(x in 0..10 step 2){
            println(x)
        }

        for(x in 10 downTo 0 step 3){
            println(x)
        }

        val myNumericArray:IntRange = (0..20)
        for(myNum:Int in myNumericArray){
            println(myNum)
        }

        // While

        var x = 0
        while (x < 10) {
            println(x)
            x += 2
        }
    }

    /*
    Aqui vamos a hablar de seguridad contra nulos (Null Safety)
     */
    fun nullSafety() {

        var myString = "Mike"
        //myString = null !Esto da un error de compilacion
        println(myString)

        // Variable null safety
        var mySafetyString: String? = "Mike null safety"
        mySafetyString = null
        println(mySafetyString)

        mySafetyString = "Welcome Mike"
        //println(mySafetyString)

        /*if (mySafetyString != null) {
            println(mySafetyString!!)
        } else {
            println(mySafetyString)
        }*/

        // Safe call

        println(mySafetyString?.length)

        mySafetyString?.let {
            println(it)
        } ?: kotlin.run {
            println(mySafetyString)
        }
    }

    /*
    Aqui vamos a hablar de funciones
     */
    fun funciones() {

        sayHello()
        sayHello()
        sayHello()

        sayMyName("Mike")
        sayMyName("Ari")
        sayMyName("Mia")

        sayMyNameAndAge("Mike",17)

        val sumResult: Int = sumTowNumbers(10, 5)
        println(sumResult)

        println(sumTowNumbers(10, sumTowNumbers(5, 5)))
    }

    //Funcion simple
    fun sayHello(){
        println("Hola!")
    }

    //Funciones con un parametro de entrada
    fun sayMyName(name: String){
        println("Hola, mi nombre es $name")
    }

    //Funciones con un parametro de entrada
    fun sayMyNameAndAge(name: String, age: Int){
        println("Hola, mi nombre es $name y mi edad es $age")
    }

    //Funciones con un valor de retorno
    fun sumTowNumbers(firstNumber: Int, secondNumber: Int) : Int{
        val sum = firstNumber + secondNumber
        return sum
    }

    /*
    Aqui vamos a hablar de clases
     */
    fun classes() {

        val mike = Programmer("Mike", 17, arrayOf(Programmer.Language.Kotlin, Programmer.Language.CPP, Programmer.Language.HTML))
        println(mike.name)

        mike.age = 18
        mike.code()

        val ari = Programmer("Ari", 16, arrayOf(Programmer.Language.HTML), arrayOf(mike))
        ari.code()

        println("${ari.friends?.first()?.name} es novio de ${ari.name}")

    }
}