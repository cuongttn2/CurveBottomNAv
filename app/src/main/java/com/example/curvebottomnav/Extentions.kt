package com.example.curvebottomnav

import android.util.Log
import android.view.View


fun View.gone() {
    visibility = View.GONE
}

fun Any.log(tag: String = "") {
    if (tag.equals("")) {
        Log.d("TAG_QMR", this.toString())
    } else {
        Log.d("TAG_QMR $tag", this.toString())

    }
}