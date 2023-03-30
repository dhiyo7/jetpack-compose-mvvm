package com.maxxi.agri.retailer.domain.login

import com.maxxi.agri.retailer.data.common.utils.WrappedResponse
import com.maxxi.agri.retailer.data.login.remote.dto.LoginRequest
import com.maxxi.agri.retailer.data.login.remote.dto.LoginResponse
import com.maxxi.agri.retailer.domain.common.base.BaseResult
import com.maxxi.agri.retailer.domain.login.entity.LoginEntity
import kotlinx.coroutines.flow.Flow

interface LoginRepository {
    suspend fun login(loginRequest: LoginRequest) : Flow<BaseResult<LoginEntity, WrappedResponse<LoginResponse>>>
}