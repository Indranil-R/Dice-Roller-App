package corp.thunder.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun rollDice(view: View) {
        val diceImage: ImageView = findViewById(R.id.imageView)
        val dice: Dice = Dice()

        val imageSrc = when (dice.roll()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            2 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(imageSrc)
//        Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT).show()

    }
}

class Dice {
    fun roll(): Int {
        return (1..6).random()
    }
}