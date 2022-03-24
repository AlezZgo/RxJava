package com.example.rxjava

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

object RxHelper {
    var text = "hello Rx java"
    fun getObservable() : Observable<String> {
        return Observable
            .just(text)
            .subscribeOn(Schedulers.computation())
            .map{ s-> s.uppercase() }
            .observeOn(AndroidSchedulers.mainThread())
    }
}