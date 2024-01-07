package com.example.mvp.View.listner

interface LoginResultListener {
    fun onSuccess(result: String)
    fun onFail(errorMessage: String)
}