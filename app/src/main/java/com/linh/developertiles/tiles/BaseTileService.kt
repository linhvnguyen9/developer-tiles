package com.linh.developertiles.tiles

import android.service.quicksettings.TileService
import com.linh.developertiles.utils.setTileActive

open class BaseTileService : TileService() {
    override fun onTileAdded() {
        super.onTileAdded()
        setTileActive()
    }

    override fun onStartListening() {
        super.onStartListening()
        setTileActive()
    }
}