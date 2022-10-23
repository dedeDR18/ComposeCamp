package com.example.composecamp.kotlin

/**
 * Created by Dede Dari Rahmadi on 19/10/22
 */
open class SmartDevice(val name: String, val category: String) {
    var deviceStatus = "Online"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
}