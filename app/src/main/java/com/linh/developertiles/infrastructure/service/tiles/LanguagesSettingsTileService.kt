package com.linh.developertiles.infrastructure.service.tiles

import android.content.Intent
import android.provider.Settings
import com.linh.developertiles.infrastructure.service.utils.base.BaseTileService

class LanguagesSettingsTileService : BaseTileService() {
    override fun onClick() {
        super.onClick()

        val intent = Intent(Settings.ACTION_LOCALE_SETTINGS)
        intent.apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK
        }
        startActivityAndCollapse(intent)
    }
}