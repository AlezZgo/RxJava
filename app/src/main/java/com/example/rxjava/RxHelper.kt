package com.example.rxjava

import io.reactivex.rxjava3.core.Observable


class RxHelper {
    private val text = "hello Rx java"
    fun getObservable() : Observable<String> {
        return Observable.just(text)
    }
}