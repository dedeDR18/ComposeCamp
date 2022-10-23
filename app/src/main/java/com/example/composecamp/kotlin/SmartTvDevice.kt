package com.example.composecamp.kotlin

/**
 * Created by Dede Dari Rahmadi on 19/10/22
 */

class SmartTvDevice(deviceName: String, deviceCategoty: String) :
    SmartDevice(name = deviceName, category = deviceCategoty) {

    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    var channelNumber = 1
        set(value) {
            if (value in 1..100){
                field = value
            }
        }

    fun increaseSpeakerVolume(){
        speakerVolume++
        println("Speaker volume increased to $speakerVolume")
    }

    fun nextChannel(){
        channelNumber++
        println("Channel number increased to $channelNumber")
    }
}