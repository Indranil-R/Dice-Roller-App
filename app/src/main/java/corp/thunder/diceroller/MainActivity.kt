package corp.thunder.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button =findViewById(R.id.button)
        val textView: TextView=findViewById(R.id.textView)

        button.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT)
            val dice:Dice=Dice()
            toast.show()
            textView.text=dice.roll().toString()

        }
    }
}
class Dice{
    fun roll():Int{
        return (1..6).random()
    }
}