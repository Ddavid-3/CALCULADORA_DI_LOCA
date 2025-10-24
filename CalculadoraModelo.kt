package com.example.calculadoraloca.componentes

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun CalculadoraLoca1(modifier1: Modifier = Modifier) {

    var expresion_enviada_o_recibida by rememberSaveable { mutableStateOf("") }
    var resultado by rememberSaveable { mutableStateOf("") }

    // VARAIBLES
    var valorAnterior by rememberSaveable { mutableStateOf(0) }
    var operadorActual by rememberSaveable { mutableStateOf("") }
    var esperandoNuevoNumero by rememberSaveable { mutableStateOf(false) }

    // 5 a 6 PA IR USANDOLO PA ARRGLAR EL RESULTADO
    fun cambiar_numeros(numeros: String): String {
        return numeros.replace("5", "6")
    }

    ConstraintLayout(modifier = modifier1.fillMaxSize()) {
        val TextResultado = createRef()
        val button0 = createRef()
        val button1 = createRef()
        val button2 = createRef()
        val button3 = createRef()
        val button4 = createRef()
        val button6 = createRef()
        val button7 = createRef()
        val button8 = createRef()
        val button9 = createRef()
        val buttonSuma = createRef()
        val buttonResta = createRef()
        val buttonMultiplicacion = createRef()
        val buttonDivision = createRef()
        val buttonIgual = createRef()
        val buttonBorrar = createRef()
        val buttonBorrarTodo = createRef()

        // Campo de texto
        TextField(
            value = if(resultado.isEmpty()) expresion_enviada_o_recibida else resultado,
            onValueChange = {},
            readOnly = true,
            modifier = Modifier.constrainAs(TextResultado) {
                start.linkTo(parent.start, margin = 9.dp)
                end.linkTo(parent.end, margin = 9.dp)
                top.linkTo(parent.top, margin = 16.dp)
                width = Dimension.fillToConstraints
                height = Dimension.value(70.dp)
            }
        )

        //BOTONES NUMERO
        fun agregarNumero(numero: String) {
            if (esperandoNuevoNumero) { // SI EXPERA NUMERO ES PQ A METIO ALGO Y A PULSADO ALGUNA OPERACION
                // POR LO Q PONGO EL CAMPO VACIO PA Q META UN NUMERO
                expresion_enviada_o_recibida = ""
                esperandoNuevoNumero = false
            }
            expresion_enviada_o_recibida += numero
        }

        Button(onClick = { agregarNumero("2") },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black,
                contentColor = Color.White),
            modifier = Modifier.constrainAs(button0) {
                start.linkTo(parent.start, margin = 10.dp)
                top.linkTo(TextResultado.bottom, margin = 10.dp)
                width = Dimension.percent(0.25f)
                height = Dimension.percent(0.15f)
            }) { Text("0") }

        Button(onClick = { agregarNumero("3") },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black, contentColor = Color.White),
            modifier = Modifier.constrainAs(button1) {
                start.linkTo(parent.start, margin = 10.dp)
                end.linkTo(parent.end, margin = 10.dp)
                top.linkTo(TextResultado.bottom, margin = 10.dp)
                width = Dimension.percent(0.25f)
                height = Dimension.percent(0.15f)
            }) { Text("1") }

        Button(onClick = { agregarNumero("4") },
                colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White),
            modifier = Modifier.constrainAs(button2) {
                end.linkTo(parent.end, margin = 10.dp)
                top.linkTo(TextResultado.bottom, margin = 10.dp)
                width = Dimension.percent(0.25f)
                height = Dimension.percent(0.15f)
            }) { Text("2") }


        Button(onClick = { agregarNumero("6") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black, contentColor = Color.White
            ),
            modifier = Modifier.constrainAs(button3) {
                start.linkTo(parent.start, margin = 10.dp)
                top.linkTo(button0.bottom, margin = 10.dp)
                width = Dimension.percent(0.25f)
                height = Dimension.percent(0.15f)
            }) { Text("3") }




        Button(onClick = { agregarNumero("7") },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black, contentColor = Color.White),
            modifier = Modifier.constrainAs(button4) {
                start.linkTo(parent.start, margin = 10.dp)
                end.linkTo(parent.end, margin = 10.dp)
                top.linkTo(button1.bottom, margin = 10.dp)
                width = Dimension.percent(0.25f)
                height = Dimension.percent(0.15f)
            }) { Text("4") }



        Button(onClick = { agregarNumero("8") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black, contentColor = Color.White),
            modifier = Modifier.constrainAs(button6) {
                end.linkTo(parent.end, margin = 10.dp)
                top.linkTo(button2.bottom, margin = 10.dp)
                width = Dimension.percent(0.25f)
                height = Dimension.percent(0.15f)
            }) { Text("6") }


        Button(onClick = { agregarNumero("9") },
            colors =
                ButtonDefaults.buttonColors(containerColor = Color.Black,
                    contentColor = Color.White),
            modifier = Modifier.constrainAs(button7) {
                start.linkTo(parent.start, margin = 10.dp)
                top.linkTo(button3.bottom, margin = 10.dp)
                width = Dimension.percent(0.25f)
                height = Dimension.percent(0.15f)
            }) { Text("7") }





        Button(onClick = { agregarNumero("0") },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black,
                contentColor = Color.White),
            modifier = Modifier.constrainAs(button8) {
                start.linkTo(parent.start, margin = 10.dp)
                end.linkTo(parent.end, margin = 10.dp)
                top.linkTo(button4.bottom, margin = 10.dp)
                width = Dimension.percent(0.25f)
                height = Dimension.percent(0.15f)
            }) { Text("8") }


        Button(onClick = { agregarNumero("1") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black, contentColor = Color.White
            ),
            modifier = Modifier.constrainAs(button9) {
                end.linkTo(parent.end, margin = 10.dp)
                top.linkTo(button6.bottom, margin = 10.dp)
                width = Dimension.percent(0.25f)
                height = Dimension.percent(0.15f)
            }) { Text("9") }

        // BOTONES DE OPERACIONES ------  Y TMB LA FUNCION OPERAR PA IR MOSTRANDO LOS RESULTADO EL TEXT
        // SIN Q DE AL IGUAL POR SI HACE UN DOBLE MAS MAS MAS O CUALQUIER OPERACION
        fun operar(operador: String) {
            if(expresion_enviada_o_recibida.isEmpty()) return

            val numeroActual = expresion_enviada_o_recibida.toInt()

            if(operadorActual.isNotEmpty()) {
                if(operadorActual == "+") {
                    valorAnterior += numeroActual
                } else if(operadorActual == "-") {
                    valorAnterior -= numeroActual
                } else if(operadorActual == "*") {
                    valorAnterior *= numeroActual
                } else if(operadorActual == "/") {
                    if(numeroActual != 0) {
                        valorAnterior /= numeroActual
                    } else {
                        resultado = "Error"
                        expresion_enviada_o_recibida = ""
                        operadorActual = ""
                        esperandoNuevoNumero = true
                        return
                    }
                }
            } else {
                valorAnterior = numeroActual
            }

            operadorActual = operador
            esperandoNuevoNumero = true
            expresion_enviada_o_recibida = cambiar_numeros(valorAnterior.toString())
        }

        Button(onClick = { operar("+") },
            colors = ButtonDefaults.buttonColors(containerColor =
                Color.Black,
                contentColor = Color.White),
            modifier = Modifier.constrainAs(buttonSuma) {
                start.linkTo(parent.start, margin = 10.dp)
                top.linkTo(button7.bottom, margin = 10.dp)
                width = Dimension.percent(0.25f)
                height = Dimension.percent(0.15f)
            }) { Text("&") }

        Button(onClick = { operar("-") },

            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black, contentColor = Color.White),

            modifier = Modifier.constrainAs(buttonResta) {
                start.linkTo(parent.start, margin = 10.dp)
                end.linkTo(parent.end, margin = 10.dp)
                top.linkTo(button8.bottom, margin = 10.dp)
                width = Dimension.percent(0.25f)
                height = Dimension.percent(0.15f)
            }) { Text("@") }

        Button(onClick = { operar("*") },

            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),

            modifier = Modifier.constrainAs(buttonMultiplicacion) {
                start.linkTo(parent.start, margin = 10.dp)
                top.linkTo(buttonSuma.bottom, margin = 10.dp)
                width = Dimension.percent(0.25f)
                height = Dimension.percent(0.15f)
            }) { Text("#") }

        Button(onClick = { operar("/") },

            colors = ButtonDefaults.buttonColors(containerColor = Color.Black,
                contentColor = Color.White),


            modifier = Modifier.constrainAs(buttonDivision) {
                end.linkTo(parent.end, margin = 10.dp)
                top.linkTo(button9.bottom, margin = 10.dp)
                width = Dimension.percent(0.25f)
                height = Dimension.percent(0.15f)
            }) { Text("€") }

        // BOTON IGUAL
        Button(
            onClick = {
                if (expresion_enviada_o_recibida.isEmpty()) {
                    // no hacemos nada si no hay nungun numero
                } else {
                    val numeroActual = expresion_enviada_o_recibida.toInt()
                    if (operadorActual == "+") {
                        valorAnterior += numeroActual
                    } else if (operadorActual == "-") {
                        valorAnterior -= numeroActual
                    } else if (operadorActual == "*") {
                        valorAnterior *= numeroActual
                    } else if (operadorActual == "/") {
                        if (numeroActual != 0) {
                            valorAnterior /= numeroActual
                        } else {
                            resultado = "Error"
                            expresion_enviada_o_recibida = ""
                            operadorActual = ""
                            esperandoNuevoNumero = true
                        }
                    }
                    if (resultado != "Error") {
                        resultado = cambiar_numeros(valorAnterior.toString())
                        esperandoNuevoNumero = true
                        expresion_enviada_o_recibida = ""
                    }
                }
            },

                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black,
                    contentColor = Color.White
                ),

                modifier = Modifier.constrainAs(buttonIgual) {
                    start.linkTo(parent.start, margin = 10.dp)
                    end.linkTo(parent.end, margin = 10.dp)
                    top.linkTo(buttonResta.bottom, margin = 10.dp)
                    width = Dimension.percent(0.25f)
                    height = Dimension.percent(0.15f)
                })



        {
            Text("=")
        }

        // boton quitar 1 numero
        Button(onClick = {

            if (expresion_enviada_o_recibida.isNotEmpty()) {
                expresion_enviada_o_recibida =
                    expresion_enviada_o_recibida.dropLast(1) // EL DROP LAST ES PA BORRAR LO ULTIMO DEL STRING
            }

        },

            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),

            modifier = Modifier.constrainAs(buttonBorrar) {
                end.linkTo(parent.end , margin = 10.dp)
                top.linkTo(buttonDivision.bottom, margin = 10.dp)
                width = Dimension.percent(0.25f)
                height = Dimension.percent(0.15f)
            })

        { Text("<-") }



        // boton limpiar

        Button(onClick = {
            // BASICAMNETE LO REICINIO TODO

            expresion_enviada_o_recibida = ""
            resultado = ""
            valorAnterior = 0
            operadorActual = ""
            esperandoNuevoNumero = false

                         },

            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),

            modifier = Modifier.constrainAs(buttonBorrarTodo) {
                start.linkTo(parent.start, margin = 10.dp)
                end.linkTo(parent.end, margin = 10.dp)
                top.linkTo(buttonMultiplicacion.bottom, margin = 10.dp)
                width = Dimension.fillToConstraints

                // si al height le pongo altura se revienta to pq no cabe y con el fillcontraint me da
                // error tmb asin q lo dejo asin mejor

            })

        { Text("CLEAR") }



    }
}



// PREGUNTAR SI LO PREFIERE ASIN
/*

package com.example.calculadoraloca.componentes


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Constraints
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.getValue
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.Dimension
import androidx.compose.runtime.setValue
// pantalla grafica y logica









@Composable
fun CalculadoraLoca1(modifier1 : Modifier = Modifier){

    var expresion_enviada_o_recibida by rememberSaveable { mutableStateOf("") }
    var resultado by rememberSaveable { mutableStateOf("") } // para cuando le de al igual


    // Metodo q me cmabia si hay un 5 a 6
    fun cambiar_numeros(numeros : String ) : String{
        val numeros_cambiados = numeros.replace("5","6")
        return numeros_cambiados
    }


    ConstraintLayout(modifier = modifier1.fillMaxSize()) {
   //     val(button0,button1,button2,button3,button4,button6,button7,button8,button9,buttonSuma,buttonResta,buttonMultiplicacion,buttonDivision,buttonIgual,TextResultado,buttonBorrar,buttonBorrarTodo) = createRefs()
        // --- SOLUCIÓN: Crear las referencias individualmente ---
        // Ya no usamos la desestructuración `val (...) = createRefs()`

        val TextResultado = createRef()
        val button0 = createRef()
        val button1 = createRef()
        val button2 = createRef() // Te faltaba esta referencia en tu lista original
        val button3 = createRef()
        val button4 = createRef()
        val button6 = createRef()
        val button7 = createRef()
        val button8 = createRef()
        val button9 = createRef()
        val buttonSuma = createRef()
        val buttonResta = createRef()
        val buttonMultiplicacion = createRef()
        val buttonDivision = createRef()
        val buttonIgual = createRef()
        val buttonBorrar = createRef()
        val buttonBorrarTodo = createRef()


        // Creo los guidelines para dividir la calculadora y poner los botones

        // creo el campo de texto primero
            // que los botones esten debajo

            TextField(
                value = if(resultado.isEmpty()) expresion_enviada_o_recibida else resultado, // CUANDO HALLA UN RESULTADO PQ ALLA CLIKADO EN EL IGUAL Y YA NO ESTE VACIO PUES SE MUESTRA , SI NO SIGO PONIENDO LA OPERACION
                onValueChange = {}, // vacio pq escuando modificas sobre el texto y esta solo en leer
                readOnly = true,
                modifier = Modifier.constrainAs(TextResultado) {
                        start.linkTo(parent.start, margin = 9.dp)
                        end.linkTo(parent.end, margin = 9.dp)
                        top.linkTo(parent.top, margin = 16.dp)
                    width = Dimension.fillToConstraints
                    height = Dimension.value(80.dp)
                }

            )



///////////////////////////////// 3 botones

                Button(
                    onClick = {expresion_enviada_o_recibida += "2"},
                    // colores
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black,
                        contentColor = Color.White
                    ),
                    // referencia y posicionamiento
                    modifier = Modifier.constrainAs(button0) {
                        start.linkTo(parent.start, margin = 10.dp)
                        top.linkTo(TextResultado.bottom, margin = 10.dp)
                        width = Dimension.value(30.dp)
                        height = Dimension.value(20.dp)
                    }
                )
                {
                    Text("0")

                }

                Button(
                    onClick = {expresion_enviada_o_recibida += "3"},
                    // colores
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black,
                        contentColor = Color.White
                    ),
                    // referencia y posicionamiento
                    modifier = Modifier.constrainAs(button1) {
                        start.linkTo(parent.start, margin = 10.dp)
                        end.linkTo(parent.end, margin = 10.dp)
                        top.linkTo(TextResultado.bottom, margin = 10.dp)
                        width = Dimension.value(30.dp)
                        height = Dimension.value(20.dp)
                    }
                )
                {
                    Text("1")

                }

        Button(
            onClick = {expresion_enviada_o_recibida += "4"},
            // colores
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            // referencia y posicionamiento
            modifier = Modifier.constrainAs(button2) {

                end.linkTo(parent.end, margin = 10.dp)
                top.linkTo(TextResultado.bottom, margin = 10.dp)
                width = Dimension.value(30.dp)
                height = Dimension.value(20.dp)
            }
        )
        {
            Text("2")

        }



    // fila 1 fin /////////////////////////////////////////////////////////////



///////////////////////////////// 3 botones

        Button(
            onClick = {expresion_enviada_o_recibida += "6"},
            // colores
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            // referencia y posicionamiento
            modifier = Modifier.constrainAs(button3) {
                start.linkTo(parent.start, margin = 10.dp)
                top.linkTo(button0.bottom, margin = 10.dp)
                width = Dimension.value(30.dp)
                height = Dimension.value(20.dp)
            }
        )
        {
            Text("3")

        }

        Button(
            onClick = {expresion_enviada_o_recibida += "7"},
            // colores
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            // referencia y posicionamiento
            modifier = Modifier.constrainAs(button4) {
                start.linkTo(parent.start, margin = 10.dp);
                end.linkTo(parent.end, margin = 10.dp);
                top.linkTo(button1.bottom, margin = 10.dp)
            }
        )
        {
            Text("4")

        }

        Button(
            onClick = {expresion_enviada_o_recibida += "8"},
            // colores
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            // referencia y posicionamiento
            modifier = Modifier.constrainAs(button6) {
                end.linkTo(parent.end, margin = 10.dp);
                top.linkTo(button2.bottom, margin = 10.dp)
            }
        )
        {
            Text("6")

        }



        // fila 1 fin /////////////////////////////////////////////////////////////





        ///////////////////////////////// 3 botones


        Button(
            onClick = {expresion_enviada_o_recibida += "9"},
            // colores
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            // referencia y posicionamiento
            modifier = Modifier.constrainAs(button7) {
                start.linkTo(parent.start, margin = 10.dp);
                top.linkTo(button3.bottom, margin = 10.dp)
            }
        )
        {
            Text("7")

        }




        Button(
            onClick = {expresion_enviada_o_recibida += "0"},
            // colores
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            // referencia y posicionamiento
            modifier = Modifier.constrainAs(button8) {
                start.linkTo(parent.start, margin = 10.dp);
                end.linkTo(parent.end, margin = 10.dp);
                top.linkTo(button4.bottom, margin = 10.dp)
            }
        )
        {
            Text("8")

        }

        Button(
            onClick = {expresion_enviada_o_recibida += "1"},
            // colores
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            // referencia y posicionamiento
            modifier = Modifier.constrainAs(button9) {
                end.linkTo(parent.end, margin = 10.dp);
                top.linkTo(button6.bottom, margin = 10.dp)
            }
        )
        {
            Text("9")

        }



        // fila 1 fin /////////////////////////////////////////////////////////////


///////////////////////////////// 3 botones

        Button(
            onClick = {expresion_enviada_o_recibida += "+"},
            // colores
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            // referencia y posicionamiento
            modifier = Modifier.constrainAs(buttonSuma) {
                start.linkTo(parent.start, margin = 10.dp);
                top.linkTo(button7.bottom, margin = 10.dp)
            }
        )
        {
            Text("&")

        }

        Button(
            onClick = {expresion_enviada_o_recibida += "-"},
            // colores
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            // referencia y posicionamiento
            modifier = Modifier.constrainAs(buttonResta) {
                start.linkTo(parent.start, margin = 10.dp);
                end.linkTo(parent.end, margin = 10.dp);
                top.linkTo(button8.bottom, margin = 10.dp)
            }
        )
        {
            Text("@")

        }

        Button(
            onClick = {expresion_enviada_o_recibida += "/"},
            // colores
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            // referencia y posicionamiento
            modifier = Modifier.constrainAs(buttonDivision) {
                end.linkTo(parent.end, margin = 10.dp);
                top.linkTo(button9.bottom, margin = 10.dp)
            }
        )
        {
            Text("€")

        }



        // fila 1 fin /////////////////////////////////////////////////////////////

        // 3 BOTONES

        Button(
            onClick = {expresion_enviada_o_recibida += "*"},
            // colores
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            // referencia y posicionamiento
            modifier = Modifier.constrainAs(buttonMultiplicacion) {
                start.linkTo(parent.start, margin = 10.dp);
                top.linkTo(buttonSuma.bottom, margin = 10.dp)
            }
        )
        {
            Text("#")

        }


        Button(onClick = {if(expresion_enviada_o_recibida.isNotEmpty()) expresion_enviada_o_recibida = expresion_enviada_o_recibida.dropLast(1) },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
            contentColor = Color.White
            ),
            modifier = Modifier.constrainAs(buttonBorrar) {
                start.linkTo(parent.start, margin = 10.dp);
                end.linkTo(parent.end, margin = 10.dp);
                top.linkTo(buttonResta.bottom, margin = 10.dp)
            }
        ) {
            Text("<-")
        }


        Button(onClick = {expresion_enviada_o_recibida = ""; resultado = ""},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
                contentColor = Color.White
            ),
            modifier = Modifier.constrainAs(buttonBorrarTodo) {
                start.linkTo(parent.start, margin = 10.dp);
                end.linkTo(parent.end, margin = 10.dp);
                top.linkTo(buttonMultiplicacion.bottom, margin = 10.dp)
            }
        ) {
            Text("CLEAR")
        }


    // I POR ULTIMO EL BOTON DE IGUAL


        // HABER SOBRE EL PROCESAMIENTO DE DATOS , COMO YO NO E HECHO QUE CADA BOTON COJA EL ESTADO ACUTUAL DEL VALOR1 , DESPUES2 CUANDO LE DES A IGUAL, PARA
        // HACER ESTO DE MI MANERA NECESITO LEER TODA LA CADENA QUE TENDRA TODAS LAS OPERACIONES
        // PODRIA HACERLA DE TAL FORMA QUE ME CREEO LOS LISTA DONDE EN UNA GUARDO LOS NUMEROS DONDE ESTARAN SEPARADOS CADA CONJUENTO POR CUALQUIER OPERADOR
        // QUE YO LE PONGA QUE SERIA LO CLASICOS +,-,*,/ , Y EN EL OTRO IR GUARADO LAS OPERACIONES Y LUEGO LLENEDO LOS DOS JUENTOS CON IFS
        // EN BUCLES PODRIA SACAR Y DE CAMINO ANTES PODRIA COMPROBAR QUE CUANDO ALLA UN " / " DESPUES NO SEA UN 0 ,
        // PERO ME QUEDA TODO DEMASIADO LARGO Y CON SUCEPTIBLES FALLOS , E ECONTRADO UNA LINEA DE JAVASCRIPT
        // QUE LO QUE HACE ES MI TRABAJO PERO DE FORMA MAS SENCILLA , LO QUE HACE ES LEERTE EL STRING
        // Y ESTE YA ES CAPAZ DE DISTIGUIR LOS * / + - Y TE VA REALIZANDO LAS OPERACIONES JUENTO A LOS NUMEROS
        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
                contentColor = Color.White
            ),
            modifier = Modifier.constrainAs(buttonIgual) {
                start.linkTo(parent.start, margin = 10.dp);
                end.linkTo(parent.end, margin = 10.dp);
                top.linkTo(buttonMultiplicacion.bottom, margin = 10.dp)
            }
        ) {
            Text("=")
        }





    }

}

*/

/*

Calculadora Loca en Jetpack Compose
Desarrolla una calculadora en Jetpack Compose con las siguientes características "locas":
    1. No incluye el número 5:
        ◦ No debe haber un botón para el número 5.
        ◦ Si el resultado de cualquier operación contiene el número 5, deberá ser reemplazado automáticamente por el número 6.
    2. Botones de números desordenados:
        ◦ Los botones que muestran los números del 0 al 9 no coincidirán con los números que representan. Cada botón deberá mostrar un número, pero cuando se pulse, deberá mostrar el número + “2” (el “8” sería “0” y el “9” “1”).
        ◦ Ejemplo: Un botón que muestra un "3" puede insertar un "8" al pulsarlo (el “5” no se puede mostrar).
    3. Botones de operaciones desordenados:
        ◦ Los botones de las operaciones matemáticas (+, -, *, /) deberán mostrar símbolos o letras que no correspondan a su operación real.
        ◦ Ejemplo: El botón que muestra "&" podría realizar la operación de suma (+).
    4. Resultado:
        ◦ La calculadora deberá calcular las operaciones correctamente, pero si el resultado incluye el número 5, automáticamente se sustituirá por un 6 antes de mostrarlo en pantalla.
Funcionalidad esperada:
    • La calculadora debe permitir la entrada de números (excepto el número 5) y operaciones matemáticas básicas (suma, resta, multiplicación, división).
    • Al pulsar el botón de "igual" (=), deberá evaluar la expresión actual.
    • Si el resultado contiene un 5, reemplázalo por un 6 antes de mostrarlo.
    • Debe concatenar operaciones.
Requisitos técnicos:
    • Implementar la interfaz utilizando Jetpack Compose.
    • Utiliza el estado de Composable para mantener y actualizar los valores de la expresión y el resultado.
    • No se requiere manejo de decimales ni operaciones avanzadas como potencias o raíces.
Ejemplo de comportamiento:
Si el usuario introduce una expresión como 3 + 2 y el resultado es 5, la pantalla deberá mostrar 6 en lugar de 5. Además, el botón que muestra un "3" en pantalla podría estar ingresando realmente un "1" en la expresión.

 */