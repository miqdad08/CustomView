package com.miqdad.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CircleActivity(ctx : Context, attr : AttributeSet) : View(ctx, attr) {
    //Radius untuk view
    private var radius = 100f

    //untuk memberi warna pada tampilan view
    private var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    //untuk mengammbar view ke tampilan
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.color = Color.RED
        canvas?.drawCircle(radius, radius, radius, paint)
    }

    /**
    //Method pada custom view dan fungsinya

    //onFinishedInflate()-> dipanggil setelah view dan semua turununannya
    //                      berhasil di inflated dari xml
    //onMeasure() -> Dipanggil untuk menentukna ukuran view
    //               dan semua turunannya
    //onLayout() -> dipanggil ketika view
    //              harus menetapkan ukuran dan posisi untuk semua turunannya.
    //onSizeChanged() -> Dipanggil ketika ukuran view telah berubahh
    //onDraw() -> Dipanggil ketika tampilan harus melakukan render kontennya
    //onKeyDown() -> dipanggil ketika ada sebuah event key down baru terjadi
    //onKeyUp() -> dipanggil ketika event up terjadi
    //onTrackBallEvent() -> dipanggil ketika terjadi gerakan pada trackball
    //onTouchEvent() -> dipanggil ketika terjadi sentuhan terakhir

    **/

}