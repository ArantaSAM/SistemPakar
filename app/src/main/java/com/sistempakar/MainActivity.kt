package com.sistempakar

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val cfg1: Double = 0.5
    val cfg2: Double = 0.3
    val cfg3: Double = 0.3
    val cfg4: Double = 0.2
    val cfg5: Double = 0.5
    val cfg6: Double = 0.3
    val cfg7: Double = 0.5
    val cfg8: Double = 0.5
    val cfg9: Double = 0.5
    val cfg10: Double = 0.6
    val cfg11: Double = 0.5
    val cfg12: Double = 0.7

    fun CFtotal1(): Double {
        return cfg1 + cfg2 * (1 - cfg1)
    }
    fun CFtotal2(): Double {
        return CFtotal1() + cfg3 * (1 - CFtotal1())
    }
    fun CFtotal3(): Double {
        return CFtotal2() + cfg4 * (1 - CFtotal2())
    }
    fun CFtotal4(): Double {
        return CFtotal3() + cfg5 * (1 - CFtotal3())
    }
    fun CFtotal5(): Double {
        return CFtotal4() + cfg6 * (1 - CFtotal4())
    }
    fun CFtotal6(): Double {
        return CFtotal5() + cfg7 * (1 - CFtotal5())
    }
    fun CFtotal7(): Double {
        return CFtotal6() + cfg8 * (1 - CFtotal6())
    }
    fun CFtotal8(): Double {
        return CFtotal7() + cfg9 * (1 - CFtotal7())
    }
    fun CFtotal9(): Double {
        return CFtotal8() + cfg10 * (1 - CFtotal8())
    }
    fun CFtotal10(): Double {
        return CFtotal9() + cfg11 * (1 - CFtotal9())
    }
    fun CFtotal11(): Double {
        return CFtotal10() + cfg12 * (1 - CFtotal10())
    }
    var hasil: Double? = null
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonResult.setOnClickListener(View.OnClickListener {
            if (g1.isChecked)
                hasil=cfg1*100
            hasilview.text = hasil.toString()
            tingkatview.text = "Anda Mengalami Gangguan Mood"
            if (g1.isChecked && g2.isChecked)
                hasil =CFtotal1() * 100
            hasilview.text = hasil.toString()+" %\n"
            if (g1.isChecked && g2.isChecked && g3.isChecked)
                hasil =CFtotal2() * 100
            hasilview.text = hasil.toString()+" %\n"
            if (g1.isChecked && g2.isChecked && g3.isChecked && g4.isChecked)
                hasil =CFtotal3() * 100
            hasilview.text = hasil.toString()+" %\n"
            if (g1.isChecked && g2.isChecked && g3.isChecked && g4.isChecked && g5.isChecked)
                hasil =CFtotal4() * 100
            hasilview.text = hasil.toString()+" %\n"
            if (g1.isChecked && g2.isChecked && g3.isChecked && g4.isChecked && g5.isChecked && g6.isChecked)
                hasil =CFtotal5() * 100
            hasilview.text = hasil.toString()+" %\n"
            if (g1.isChecked && g2.isChecked && g3.isChecked && g4.isChecked && g5.isChecked && g6.isChecked && g7.isChecked)
                hasil =CFtotal6() * 100
            hasilview.text = hasil.toString()+" %\n"
            if (g1.isChecked && g2.isChecked && g3.isChecked && g4.isChecked && g5.isChecked && g6.isChecked && g7.isChecked && g8.isChecked)
                hasil =CFtotal7() * 100
            hasilview.text = hasil.toString()+" %\n"
            if (g1.isChecked && g2.isChecked && g3.isChecked && g4.isChecked && g5.isChecked && g6.isChecked && g7.isChecked && g8.isChecked && g9.isChecked)
                hasil =CFtotal8() * 100
            hasilview.text = hasil.toString()+" %\n"
            if (g1.isChecked && g2.isChecked && g3.isChecked && g4.isChecked && g5.isChecked && g6.isChecked && g7.isChecked && g8.isChecked && g9.isChecked && g10.isChecked)
                hasil =CFtotal9() * 100
            hasilview.text = hasil.toString()+" %\n"
            if (g1.isChecked && g2.isChecked && g3.isChecked && g4.isChecked && g5.isChecked && g6.isChecked && g7.isChecked && g8.isChecked && g9.isChecked && g10.isChecked && g11.isChecked)
                hasil =CFtotal10() * 100
            hasilview.text = hasil.toString()+" %\n"
            if (g1.isChecked && g2.isChecked && g3.isChecked && g4.isChecked && g5.isChecked && g6.isChecked && g7.isChecked && g8.isChecked && g9.isChecked && g10.isChecked && g11.isChecked && g12.isChecked)
                hasil =CFtotal11() * 100
            hasilview.text = hasil.toString()+" %\n"
            tingkatview.text = "Anda Mengalami Depresi Mayor/ Severe Depresion"

        })
    }
}



