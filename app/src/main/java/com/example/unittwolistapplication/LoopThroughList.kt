package com.example.unittwolistapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

fun main(){
    val guestsPerFamily = listOf(2, 4, 1, 3)
    var totalGuests = 0
    var index = 0
    //While loops
    while (index < guestsPerFamily.size) {
        totalGuests += guestsPerFamily[index]
        index++
    }
    println("Total Guest Count: $totalGuests")


    val names = listOf("Jessica", "Henry", "Alicia", "Jose")
    //for loop
    for (name in names) {
        println("$name - Number of characters: ${name.length}")
    }
}
