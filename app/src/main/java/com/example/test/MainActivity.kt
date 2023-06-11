package com.example.test

import android.graphics.Bitmap
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.databinding.ActivityMainBinding
import com.google.zxing.BarcodeFormat
import com.google.zxing.qrcode.QRCodeWriter
import com.journeyapps.barcodescanner.BarcodeEncoder


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    val qa_contents = "https://www.naver.com"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        createQRCode()
    }

    fun createQRCode(){
        val barcodeEncoder = BarcodeEncoder()

        val bitmap: Bitmap = barcodeEncoder.encodeBitmap(qa_contents, BarcodeFormat.QR_CODE, 512, 512)

        binding.qrImage.setImageBitmap(bitmap)
    }
}

