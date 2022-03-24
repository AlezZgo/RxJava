package com.example.rxjava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rxjava.databinding.ActivityMainBinding
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        binding.button.setOnClickListener {
            RxHelper.text = Random.nextInt().toString()
        }

        RxHelper.getObservable().subscribe(object : Observer<String>{
            override fun onSubscribe(d: Disposable) {

            }

            override fun onNext(t: String) {
                binding.tv.text = t
            }

            override fun onError(e: Throwable) {

            }

            override fun onComplete() {

            }

        })

        setContentView(binding.root)
    }
}