package kr.hs.dgsw.smartfarm.network.model.response


import com.google.gson.annotations.SerializedName

data class Humidity(
    val status: Int,
    val value: Int
)