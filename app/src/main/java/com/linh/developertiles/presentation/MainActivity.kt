package com.linh.developertiles.presentation

import android.net.ProxyInfo
import android.net.wifi.WifiConfiguration
import android.net.wifi.WifiManager
import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.linh.developertiles.presentation.theme.DeveloperTilesTheme
import timber.log.Timber

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Timber.d("Hello World!")

        setContent {
            DeveloperTilesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Button(onClick = {
                        val config = WifiConfiguration().apply {
                            httpProxy = ProxyInfo.buildDirectProxy("192.168.1.1", 8888)
                        }

                        val wifiManager = applicationContext.getSystemService(WIFI_SERVICE) as WifiManager
                        val result = wifiManager.updateNetwork(config)
                        Timber.d("Update network result $result")
                    }) {
                        Text(text = "Set proxy")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DeveloperTilesTheme {
        Greeting("Android")
    }
}
