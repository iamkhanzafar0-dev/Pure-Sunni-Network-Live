package com.puresunninetwork.live

import android.app.Service
import android.content.Intent
import android.os.IBinder

class StreamingService : Service() {

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}
