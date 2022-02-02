package com.linh.developertiles.infrastructure.service.utils.base

import android.service.quicksettings.TileService
import com.linh.developertiles.infrastructure.service.utils.extension.setTileActive

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
