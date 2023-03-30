package com.maxxi.agri.retailer.data.login.remote.api

import com.maxxi.agri.retailer.data.common.utils.WrappedResponse
import com.maxxi.agri.retailer.data.login.remote.dto.LoginRequest
import com.maxxi.agri.retailer.data.login.remote.dto.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginApi {
    @POST("auth/login") //contoh aja misal
    suspend fun login(@Body loginRequest: LoginRequest) : Response<WrappedResponse<LoginResponse>>
}