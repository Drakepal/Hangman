package com.example.hangman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hangman.R.*

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_game)
    }
}