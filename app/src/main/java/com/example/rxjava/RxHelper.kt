package com.example.rxjava

import io.reactivex.rxjava3.core.Observable


object RxHelper {
    var text = "hello Rx java"
    fun getObservable() : Observable<String> {
        return Observable.just(text)
    }
}