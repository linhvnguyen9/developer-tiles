package com.linh.developertiles.tiles

import android.content.Intent
import android.provider.Settings
import android.service.quicksettings.Tile
import android.service.quicksettings.TileService
import com.linh.developertiles.utils.setTileActive
import timber.log.Timber

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