package com.maxxi.agri.retailer.data.common.utils

import com.google.gson.annotations.SerializedName

data class WrappedListResponse<T> (
    var code: Int,
    @SerializedName("success") var status : Boolean,
    @SerializedName("data") var data : List<T>? = null
)


data class WrappedResponse<T> (
    var code: Int,
    @SerializedName("success") var status : Boolean,
    @SerializedName("data") var data : T? = null
)