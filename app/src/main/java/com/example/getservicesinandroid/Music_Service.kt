package com.example.getservicesinandroid

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings
import java.security.Provider

class Music_Service : Service() {

    lateinit var mediaplayer : MediaPlayer
//on start  command method is triggered whatever user want to perform as a background service.
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        //set the default user's phone ringtone

        mediaplayer = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI)

       mediaplayer.isLooping = true
       mediaplayer.start()

        return START_NOT_STICKY
    }
    override fun onBind(intent: Intent?): IBinder? {
        
        return null

    }

    override fun onDestroy() {

        mediaplayer.stop()
        super.onDestroy()
    }
}