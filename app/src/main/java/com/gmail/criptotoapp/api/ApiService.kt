package com.gmail.criptotoapp.api

import com.gmail.criptotoapp.pojo.CoinInfoListOfDate
import com.gmail.criptotoapp.pojo.CoinPriceInfoRawData
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("top/totalvolfull")
    fun getTopCoinsInfo(
        @Query(QUERY_PARAM_API_KEY) apiKey: String = "",
        @Query(QUERY_PARAM_LIMIT) limit: Int = 10,
        @Query(QUERY_PARAM_TO_SYM) tsym: String = CURRENCY
        ): Single<CoinInfoListOfDate>
    @GET("pricemultifull")
    fun getFullPriceList(
        @Query(QUERY_PARAM_API_KEY) apiKey: String = "",
        @Query(QUERY_PARAM_FROM_SYMS) fSyms: String? = CURRENCY,
        @Query(QUERY_PARAM_TO_SYMS) tSyms: String = CURRENCY
    ):Single<CoinPriceInfoRawData>

    companion object {
        private const val QUERY_PARAM_API_KEY = "api_key"
        private const val QUERY_PARAM_LIMIT = "limit"
        private const val QUERY_PARAM_TO_SYM = "tsym"
        private const val QUERY_PARAM_TO_SYMS = "tsyms"
        private const val QUERY_PARAM_FROM_SYMS = "fsyms"
        private const val CURRENCY = "USD"
    }
}