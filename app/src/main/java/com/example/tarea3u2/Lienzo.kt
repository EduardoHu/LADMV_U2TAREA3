package com.example.tarea3u2

import android.graphics.*
import android.view.View
import java.lang.Exception

class Lienzo(p:MainActivity):View(p){
    var hilo=Hilo(this)
    var counter=0
    var CH=0


    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()
        val path = Path()

        c.drawColor(Color.rgb(10,140,216))
        c.drawPath(path,p)
        p.color=Color.BLACK
        c.drawLine(600f, 1800f, 800f, 1700f,p)


        p.color=Color.GRAY
        c.drawRect(600f,5f,850f,2050f,p)
        c.drawRect(5f,810f,1550f,950f,p)

        p.color=Color.YELLOW
        c.drawRect(250f,50f,500f,650f,p)
        p.color=Color.RED
        c.drawCircle(370f,180f,90f,p)
        p.color=Color.BLACK
        c.drawCircle(370f,365f,90f,p)
        p.color=Color.BLACK
        c.drawCircle(370f,550f,90f,p)

        if(counter<=250){

            p.color=Color.CYAN
            p.style=Paint.Style.STROKE
            p.strokeWidth=10f
            p.isAntiAlias=true

            c.drawPath(path, p)
            c.drawLine(-250+(7*counter).toFloat(), 825f, -250+(7*counter).toFloat(), 900f,p)
            c.drawLine(-245+(7*counter).toFloat(), 825f, -245+(7*counter).toFloat(), 900f,p)
            c.drawLine(-240+(7*counter).toFloat(), 825f, -240+(7*counter).toFloat(), 900f,p)
            c.drawLine(-235+(7*counter).toFloat(), 825f, -235+(7*counter).toFloat(), 900f,p)
            c.drawLine(-230+(7*counter).toFloat(), 825f, -230+(7*counter).toFloat(), 900f,p)
            c.drawLine(-225+(7*counter).toFloat(), 825f, -225+(7*counter).toFloat(), 900f,p)
            c.drawLine(-220+(7*counter).toFloat(), 825f, -220+(7*counter).toFloat(), 900f,p)
            c.drawLine(-215+(7*counter).toFloat(), 825f, -215+(7*counter).toFloat(), 900f,p)
            c.drawLine(-210+(7*counter).toFloat(), 825f, -210+(7*counter).toFloat(), 900f,p)
            c.drawLine(-205+(7*counter).toFloat(), 825f, -205+(7*counter).toFloat(), 900f,p)
            c.drawLine(-200+(7*counter).toFloat(), 825f, -200+(7*counter).toFloat(), 900f,p)
            c.drawLine(-195+(7*counter).toFloat(), 825f, -195+(7*counter).toFloat(), 900f,p)
            c.drawLine(-190+(7*counter).toFloat(), 825f, -190+(7*counter).toFloat(), 900f,p)
            c.drawLine(-185+(7*counter).toFloat(), 825f, -185+(7*counter).toFloat(), 900f,p)
            p.color=Color.BLACK
            c.drawLine(-180+(7*counter).toFloat(), 835f, -180+(7*counter).toFloat(), 885f,p)

            p.style=Paint.Style.FILL_AND_STROKE
            if(counter < 135) {
                p.color=Color.MAGENTA
                c.drawCircle(780.5f, (800).toFloat(), 20f, p)
                p.color=Color.BLACK
                c.drawCircle(805.5f, (800).toFloat(), .5f, p)
                c.drawCircle(755.5f, (800).toFloat(), .5f, p)
                c.drawCircle(805.5f, (810).toFloat(), .5f, p)
                c.drawCircle(755.5f, (810).toFloat(), .5f, p)

                p.color=Color.WHITE
                c.drawCircle(712.5f, (960).toFloat(), 20f, p)
                p.color=Color.BLACK
                c.drawCircle(737.5f, (960).toFloat(), .5f, p)
                c.drawCircle(687.5f, (960).toFloat(), .5f, p)
                c.drawCircle(737.5f, (970).toFloat(), .5f, p)
                c.drawCircle(687.5f, (970).toFloat(), .5f, p)
            }

            if(counter>150) {
                p.color=Color.GREEN
                c.drawCircle(370f,180f,90f,p)
                p.color=Color.MAGENTA
                c.drawCircle(780.5f, (800+counter-150).toFloat(), 20f, p)
                p.color=Color.BLACK
                c.drawCircle(805.5f, (800+counter-150).toFloat(), .5f, p)
                c.drawCircle(755.5f, (800+counter-150).toFloat(), .5f, p)
                c.drawCircle(805.5f, (810+counter-150).toFloat(), .5f, p)
                c.drawCircle(755.5f, (810+counter-150).toFloat(), .5f, p)
                p.color=Color.WHITE
                c.drawCircle(712.5f, (1085-counter).toFloat(), 20f, p)
                p.color=Color.BLACK
                c.drawCircle(737.5f, (1085-counter).toFloat(), .5f, p)
                c.drawCircle(687.5f, (1085-counter).toFloat(), .5f, p)
                c.drawCircle(737.5f, (1095-counter).toFloat(), .5f, p)
                c.drawCircle(687.5f, (1095-counter).toFloat(), .5f, p)
            }

        }
        try {
            hilo.start()

        }catch (e: Exception){

        }

    }
}
class Hilo(p:Lienzo):Thread(){
    var pnto = p
    var estado:Boolean=true
    override fun run(){
        super.run()
        while(estado){
            pnto.run {
                    if(true){
                        sleep(50)
                        pnto.CH++
                        pnto.counter++
                        pnto.invalidate()
                        if (counter==360){
                            counter=1
                    }
                }
            }
        }
        }
    }