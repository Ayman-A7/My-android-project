package com.example.terminal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

import android.content.BroadcastReceiver
import android.content.Context
import android.widget.Toast

class broadcast : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast)
    }
    class MyBroadcast : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            BroadcastReceiver broadCastReceiver=new  BroadcastReceiver();

            context.registerReceiver(BroadcastReceiver,new IntentFilter("android.intent.action.TIME_TICK");
        }
    }
    class AirplaneBroadcast : BroadcastReceiver() {

        override fun onReceive(context: Context, intent: Intent) {

            if (intent.action === Intent.ACTION_AIRPLANE_MODE_CHANGED) {
                Toast.makeText(context, "Airplane Mode Changed", Toast.LENGTH_SHORT).show()
            }
        }
    }
