package com.example.statesexample

import android.view.View

abstract class MainActivityState {

    protected var activityContext: MainActivity;
    abstract val displayedText: String;


    constructor(activityContext: MainActivity) {
        this.activityContext = activityContext;
    }

    public fun setContext(activityContext: MainActivity) {
        this.activityContext = activityContext;
    }


    public abstract fun stateFunction1(view: View);
    public abstract fun stateFunction2(): String;
}