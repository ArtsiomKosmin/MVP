package com.example.mvp.Presenter

@FunctionalInterface
interface LoginPresenter {
    fun doLogin(userName: String, password: String)
}