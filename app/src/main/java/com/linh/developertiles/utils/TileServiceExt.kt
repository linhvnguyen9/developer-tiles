package com.linh.developertiles.utils

import android.service.quicksettings.Tile
import android.service.quicksettings.TileService

fun TileService.setTileActive() {
    qsTile.apply {
        state = Tile.STATE_ACTIVE
        updateTile()
    }
}