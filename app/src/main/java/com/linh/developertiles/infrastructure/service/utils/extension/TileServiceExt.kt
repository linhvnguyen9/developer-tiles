package com.linh.developertiles.infrastructure.service.utils.extension

import android.service.quicksettings.Tile
import android.service.quicksettings.TileService

fun TileService.setTileActive() {
    qsTile.apply {
        state = Tile.STATE_ACTIVE
        updateTile()
    }
}
