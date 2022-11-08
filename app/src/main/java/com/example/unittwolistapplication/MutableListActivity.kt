package com.example.unittwolistapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// use val for a mutable list because the entrees variable contains
// a reference to the list, and that reference
// doesn't change even if the contents of the list do.
fun main(){
print("===Mutable Lists===\n")
    val entrees = mutableListOf<String>()
    val entree: MutableList<String> = mutableListOf()
    val moreItems = listOf("ravioli", "lasagna", "fettuccine")
  //  println("Entrees: $entrees")
   // println("Entrees: $entree")
    //Add elements to a list
    // Add individual items using add()
    println("Add noodles: ${entrees.add("noodles")}")
    println("Add spaghetti: ${entrees.add("spaghetti")}")
    //println("Entrees: $entrees")
    println("Add list: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")
    //    // Remove an item using remove()
    println("Remove spaghetti: ${entrees.remove("spaghetti")}")
    println("Entrees: $entrees")

    println("Remove item that doesn't exist: ${entrees.remove("rice")}")
    println("Entrees: $entrees")
   // specify the index of the element to remove.
    println("Remove first element: ${entrees.removeAt(0)}")
    println("Entrees: $entrees")
    // clear the whole list,
    entrees.clear()
    println("Entrees: $entrees")
// Check if the list is empty
    println("Empty? ${entrees.isEmpty()}")
}
