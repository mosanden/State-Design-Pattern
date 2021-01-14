package com.example.statesexample

import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlin.random.Random

class SecondMainActivityState : MainActivityState {

    override val displayedText: String = "Second State";

    constructor(activityContext: MainActivity) : super(activityContext);

    override fun stateFunction1(view: View) {
        Snackbar.make(view, "Second states snackbar", Snackbar.LENGTH_LONG).show();
    }

    override fun stateFunction2(): String {
        val charset: String = "ABCDEFGHIJKLMNOPQRSTUVWXTZ";
        val index: Int = Random.nextInt(0, charset.length - 1);
        return charset[index].toString();

    }
}