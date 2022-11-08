package com.example.unittwolistapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
fun main(){
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6)
    val number = listOf(1, 2, 3, 4, 5, 6)
    val colors = listOf("green", "orange", "blue")
    val oddNumbers = listOf(5, 3, 7, 1)
//    //read-Only List
//    colors.add("purple")
//    colors[0] = "yellow"
    //number of operations on lists that don't change the list, but will return a new list
    println("Reversed list: ${colors.reversed()}")
    println("List: $colors")


    println("List: $oddNumbers")
    println("Sorted list: ${oddNumbers.sorted()}")

    println("List: $numbers")
    println("List: $number")
    println()
    //// Access elements of the list
    println("First element: ${numbers[0]}")
   // println("Six element: ${numbers[6]}")
    println("Second element: ${numbers[1]}")
    println()
    println("Last index: ${numbers.size - 1}")
    println("Last element: ${numbers[numbers.size - 1]}")
print("\n")
    println("First: ${numbers.first()}")
    println("Last: ${numbers.last()}")
    println()
    //// Use the contains() method
    println("Contains 1? ${numbers.contains(1)}")
    println("Contains 4? ${numbers.contains(4)}")
    println("Contains 7? ${numbers.contains(7)}")
    println("Size: ${numbers.size}")





}
