package com.example.statesexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // create state and initialize it
    private var state: MainActivityState = FirstMainActivityState(this);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // map functions to buttons
        findViewById<Button>(R.id.buttonLeft).setOnClickListener { view -> buttonLeft(view) };
        findViewById<Button>(R.id.buttonRight).setOnClickListener { view -> buttonRight(view) };
        findViewById<Button>(R.id.buttonSwitchToFirst).setOnClickListener { _ -> buttonSwitchToFirst() };
        findViewById<Button>(R.id.buttonSwitchToSecond).setOnClickListener { _ -> buttonSwitchToSecond() };


        // transition state
        this.transitionTo(FirstMainActivityState(this));

    }

    fun transitionTo(state: MainActivityState) {
        this.state = state;
        this.state.setContext(this);

        findViewById<TextView>(R.id.displayedText).setText(this.state.displayedText);
    }


    // functions for buttons

    private fun buttonLeft(view: View) {
        this.state.stateFunction1(view);
    }

    private fun buttonRight(view: View) {
        findViewById<TextView>(R.id.displayedText).setText(this.state.stateFunction2());
    }

    private fun buttonSwitchToFirst() {
        this.transitionTo(FirstMainActivityState(this));
    }

    private fun buttonSwitchToSecond() {
        this.transitionTo(SecondMainActivityState(this));
    }

}