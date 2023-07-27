package com.nicol1921.myapplication.Retos

class Nequi{

}

fun main() {
    println("Bienvenido")
    println("Seleccione la opción 1 si desea ingresar")
    var ap: Int = readLine()!!.toInt()
    var saldo: Double = 4500.0

    while (ap == 1) {
        println(
            "Elige una opción: \n" +
                    "1: Consultar su saldo \n" +
                    "2: Sacar su dinero \n" +
                    "3: Enviar su dinero \n" +
                    "4: Recargar dinero su nequi \n" +
                    "5: Salir de nequi"
        )

        val opcion: Int = readLine()!!.toInt()

        when (opcion) {
            1 -> {
                println("Tu saldo disponible es: $saldo")
            }

            2 -> {
                if (saldo < 2000) {
                    println("SALDO insuficiente.")
                } else {
                    println("Ingresa la cantidad que deseas retirar:")
                    val retiro: Double = readLine()!!.toDouble()
                    if (retiro <= saldo) {
                        saldo -= retiro
                        val codigoRetiro = (100000..999999).random()
                        println("Código de retiro: $codigoRetiro")
                        println("Tu saldo actual es : $saldo")
                    } else {
                        println("Saldo insuficiente para hacer el retiro.")
                    }
                }
            }

            3 -> {
                println("Ingresa el número de teléfono si deseas enviar dinero:")
                val numTelefono: String = readLine()!!.toString()
                println("Ingresa el valor a enviar:")
                val valorEnviado: Double = readLine()!!.toDouble()

                if (valorEnviado <= saldo) {
                    saldo -= valorEnviado
                    println("Envío exitoso. Has enviado $valorEnviado a $numTelefono")
                    println("Tu saldo disponible ahora es: $saldo")
                } else {
                    println("Monto insuficiente.")
                }
            }

            4 -> {
                println("Ingresa el valor a recargar:")
                val recarga: Double = readLine()!!.toDouble()
                println("¿Deseas realizar la recarga? (Si/No)")
                val confirmacion: String = readLine()!!.toString()

                if (confirmacion.equals("Si", ignoreCase = true)) {
                    saldo += recarga
                    println("Tu saldo disponible ahora es: $saldo")
                } else {
                    println("Recarga no exitosa.")
                }
            }

            5 -> {
                println("Gracias por usar nuestra APP")
                ap = 0 // Exit the loop
            }

            else -> {
                println("Opción inválida.")
            }
        }
    }
}
