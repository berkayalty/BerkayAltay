package ise308.Homework.BerkayAltay17243610043

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    private lateinit var imageButton1: ImageButton
    private lateinit var imageButton2: ImageButton
    private lateinit var imageButton3: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageButton1 = findViewById(R.id.cardView1ImageButtonID)
        imageButton2 = findViewById(R.id.cardView2ImageButtonID)
        imageButton3 = findViewById(R.id.cardView3ImageButtonID)
        imageButton1.tag = "FALSE"
        imageButton2.tag = "FALSE"
        imageButton3.tag = "FALSE"
        imageButton1.setOnClickListener(onClick)
        imageButton2.setOnClickListener(onClick)
        imageButton3.setOnClickListener(onClick)
    }

    val onClick = View.OnClickListener {it :View->
        val imageButton : ImageButton = (it as ImageButton)

        if(it.tag == "FALSE"){
            imageButton.setImageResource(R.drawable.fav_asset_true)
            it.tag = "TRUE"
        }else{
            imageButton.setImageResource(R.drawable.fav_asset_false)
            it.tag = "FALSE"
        }


    }


}