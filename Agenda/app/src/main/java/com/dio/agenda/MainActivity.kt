package com.dio.agenda

import android.content.Intent
import android.os.Bundle
import android.provider.CalendarContract
import android.provider.CalendarContract.Events.*
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.dio.agenda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var buttonSetEvent: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setVariables()

        buttonSetEvent.setOnClickListener {
            val intent = Intent(Intent.ACTION_INSERT)
                .setData(CONTENT_URI)
                .putExtra(TITLE,"BootcampCalendar")
                .putExtra(EVENT_LOCATION,"onLine")
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,System.currentTimeMillis())
                .putExtra(CalendarContract.EXTRA_EVENT_END_TIME,System.currentTimeMillis()+(60*60+1000))

            startActivity(intent)

            /*Toast.makeText(
                applicationContext,
                getString(R.string.textTextButton),
                Toast.LENGTH_SHORT
            ).show()*/
        }

    }

    private fun setVariables() {
        buttonSetEvent = binding.setEvent
    }
}