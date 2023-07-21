package com.ema.emaaprende

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView
import com.ema.emaaprende.firstapp.FirstAppActivity
import com.ema.emaaprende.imccalculator.ImcCalculatorActivity
import com.ema.emaaprende.settings.SettingsActivity
import com.ema.emaaprende.superheroapp.SuperHeroListActivity
import com.ema.emaaprende.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val viewSaludapp = findViewById<CardView>(R.id.viewSaludapp)
        val viewIMC = findViewById<CardView>(R.id.viewIMC)
        val viewTodoapp = findViewById<CardView>(R.id.viewTodoapp)
        val viewSuperHeroApp = findViewById<CardView>(R.id.viewSuperHeroApp)
        val viewHeight = findViewById<CardView>(R.id.viewHeight)

        viewSaludapp.setOnClickListener { navigateToSaludApp() }
        viewIMC.setOnClickListener { navigateToImcApp() }
        viewTodoapp.setOnClickListener { navigateToTodoApp() }
        viewSuperHeroApp.setOnClickListener { navigateToSuperheroApp() }
        viewHeight.setOnClickListener { navigateToSettings() }
    }

    private fun navigateToSettings() {
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTodoApp(){
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSuperheroApp(){
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }


}