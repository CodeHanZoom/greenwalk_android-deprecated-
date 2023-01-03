package com.yj.graphictest

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.view.View

class MyView(context: Context) : View(context) {
    init {
        setBackgroundColor(Color.YELLOW)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        if (canvas == null) return

        val paint = Paint()
        val paint2 = Paint()
        paint.color = Color.BLUE
        paint2.style = Paint.Style.STROKE
        paint2.strokeWidth = 3f

        var refX = 100f
        var refY = 100f
        val r1 = RectF(refX, refY, refX + 300f, refY + 300f)

        canvas.drawRoundRect(r1, 50f, 50f, paint)
        canvas.drawRect(r1, paint2)

        refY += 350f
        val r2 = RectF(refX, refY, refX + 500f, refY + 300f)
        canvas.drawOval(r2, paint)
        canvas.drawRect(r2, paint2)

        refY += 350f
        val r3 = RectF(refX, refY, refX + 300f, refY + 300f)
        canvas.drawArc(r3, 120f, 270f, true, paint)
        canvas.drawRect(r3, paint2)

        refY += 350f
        val r4 = RectF(refX, refY, refX + 300f, refY + 300f)
        canvas.drawArc(r4, 120f, 270f, false, paint)
        canvas.drawRect(r4, paint2)
    }

}
