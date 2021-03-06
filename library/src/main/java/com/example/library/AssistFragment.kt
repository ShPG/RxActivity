package com.example.library

import android.app.Fragment
import android.content.Intent

class AssistFragment : Fragment() {
    lateinit var onActivityResult: (requestCode: Int, resultCode: Int, data: Intent?) -> Unit
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        onActivityResult.invoke(requestCode, resultCode, data)
    }
}