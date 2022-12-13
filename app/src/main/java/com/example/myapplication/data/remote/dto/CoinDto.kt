package com.example.myapplication.data.remote.dto

import com.example.myapplication.domain.model.Coin
import com.google.gson.annotations.SerializedName

data class CoinDto(
    val id: String,
    @SerializedName("is_active")
    val is_active: Boolean,
    @SerializedName("is_new")
    val is_new: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

fun CoinDto.toCoin() :Coin{
    return Coin(
        id, is_active, name, rank, symbol
    )
}