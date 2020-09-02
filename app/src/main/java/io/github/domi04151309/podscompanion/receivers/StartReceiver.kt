package io.github.domi04151309.podscompanion.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import io.github.domi04151309.podscompanion.services.PodsService

class StartReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == Intent.ACTION_MY_PACKAGE_REPLACED || intent?.action == Intent.ACTION_BOOT_COMPLETED) {
            context?.startService(Intent(context, PodsService::class.java))
        }
    }
}