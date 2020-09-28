package com.gmail.criptotoapp.pojo

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.gmail.criptotoapp.api.ApiFactory
import com.gmail.criptotoapp.utils.convertTimestampToTime
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


@Entity(tableName = "full_price_list")
data class CoinPriceInfo @JvmOverloads constructor(
    @PrimaryKey
    @NonNull
    @SerializedName("FROMSYMBOL")
    @Expose
    val fromSymbol: String,
    @SerializedName("TOSYMBOL")
    @Expose
    val toSymbol: String?,
    @SerializedName("MARKET")
    @Expose
    val market: String?,
    @SerializedName("PRICE")
    @Expose
    val price: String?,
    @SerializedName("LASTUPDATE")
    @Expose
    val lastUpdate: Long?,
    @SerializedName("LASTVOLUME")
    @Expose
    val lastVolume: String?,
    @SerializedName("LASTVOLUMETO")
    @Expose
    val lastVolumeTo: String?,
    @SerializedName("LASTTRADEID")
    @Expose
    val lastTradeId: String?,
    @SerializedName("VOLUMEDAY")
    @Expose
    val volumeDay: String?,
    @SerializedName("VOLUMEDAYTO")
    @Expose
    val volumeDateTo: String?,
    @SerializedName("VOLUME24HOUR")
    @Expose
    val volume24Hour: String?,
    @SerializedName("VOLUME24HOURTO")
    @Expose
    val volume24HourTo: String?,
    @SerializedName("OPENDAY")
    @Expose
    val openDay: String?,
    @SerializedName("HIGHDAY")
    @Expose
    val highDay: String?,
    @SerializedName("LOWDAY")
    @Expose
    val lowDay: String?,
    @SerializedName("OPEN24HOUR")
    @Expose
    val open24Hour: String?,
    @SerializedName("HIGH24HOUR")
    @Expose
    val high24Hour: String?,
    @SerializedName("LOW24HOUR")
    @Expose
    val low24Hour: String?,
    @SerializedName("LASTMARKET")
    @Expose
    val lastMarket: String?,
    @SerializedName("VOLUMEHOUR")
    @Expose
    val volumeHour: String?,
    @SerializedName("VOLUMEHOURTO")
    @Expose
    val volumeHourTo: String?,
    @SerializedName("OPENHOUR")
    @Expose
    val openHour: String?,
    @SerializedName("HIGHHOUR")
    @Expose
    val highHour: String?,
    @SerializedName("LOWHOUR")
    @Expose
    val lowHour: String?,
    @SerializedName("TOPTIERVOLUME24HOUR")
    @Expose
    val topTierVolume24Hour: String?,
    @SerializedName("TOPTIERVOLUME24HOURTO")
    @Expose
    val topTierVolume24HourTo: String?,
    @SerializedName("CHANGE24HOUR")
    @Expose
    val change24Hour: String?,
    @SerializedName("CHANGEPCT24HOUR")
    @Expose
    val changePct24Hour: String?,
    @SerializedName("CHANGEDAY")
    @Expose
    val changeDay: String?,
    @SerializedName("CHANGEPCTDAY")
    @Expose
    val changepctDay: String?,
    @SerializedName("CHANGEHOUR")
    @Expose
    val changeHour: String?,
    @SerializedName("CHANGEPCTHOUR")
    @Expose
    val changePctHour: String?,
    @SerializedName("CONVERSIONTYPE")
    @Expose
    val conversionType: String?,
    @SerializedName("CONVERSIONSYMBOL")
    @Expose
    val conversionSymbol: String?,
    @SerializedName("SUPPLY")
    @Expose
    val suply: String?,
    @SerializedName("MKTCAP")
    @Expose
    val mktcap: String?,
    @SerializedName("TOTALVOLUME24H")
    @Expose
    val totalVolume24H: String?,
    @SerializedName("TOTALVOLUME24HTO")
    @Expose
    val totalVolume24Hto: String?,
    @SerializedName("TOTALTOPTIERVOLUME24H")
    @Expose
    val totalTopTierVolume24H: String?,
    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    @Expose
    val totalTopTierVolume24HTO: String?,
    @SerializedName("IMAGEURL")
    @Expose
    val imageUrl: String?
) {
    fun getFormatedTime(): String {
        return convertTimestampToTime(lastUpdate)
    }

    fun getFullImageUrl(): String {
        return ApiFactory.BASE_IMAGE_URL + imageUrl
    }

}