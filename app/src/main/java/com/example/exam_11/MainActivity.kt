package com.example.exam_11

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var Square: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Square = findViewById<View>(R.id.viewSquare)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_red -> {
                SquareColor(Color.RED)
                true
            }
            R.id.menu_green -> {
                SquareColor(Color.GREEN)
                true
            }
            R.id.menu_yellow -> {
                SquareColor(Color.YELLOW)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
    private fun SquareColor(color: Int) {
        Square.setBackgroundColor(color)
    }
}