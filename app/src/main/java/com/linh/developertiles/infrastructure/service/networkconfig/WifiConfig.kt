package com.linh.developertiles.infrastructure.service.networkconfig

import android.content.Context
import android.content.Context.WIFI_SERVICE
import android.net.ProxyInfo
import android.net.wifi.WifiConfiguration
import android.net.wifi.WifiManager

class WifiConfig(private val context: Context) {
    fun setProxy() {
        val config = WifiConfiguration().apply {
            httpProxy = ProxyInfo.buildDirectProxy("192.168.1.1", 8888)
        }

        val wifiManager = context.applicationContext.getSystemService(WIFI_SERVICE) as WifiManager
        wifiManager.updateNetwork(config)
    }
}