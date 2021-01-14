package com.example.statesexample

import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlin.random.Random

class FirstMainActivityState : MainActivityState {

    override val displayedText: String = "First State";

    constructor(activityContext: MainActivity) : super(activityContext);

    override fun stateFunction1(view: View) {
        Snackbar.make(view, "Redirecting to second state.", Snackbar.LENGTH_LONG).show();
        this.activityContext.transitionTo(SecondMainActivityState(this.activityContext));
    }

    override fun stateFunction2(): String {
        return Random.nextInt(0, 100).toString();
    }
}