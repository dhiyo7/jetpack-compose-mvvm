package com.maxxi.agri.retailer.domain.login.usecase

import com.maxxi.agri.retailer.data.common.utils.WrappedResponse
import com.maxxi.agri.retailer.data.login.remote.dto.LoginRequest
import com.maxxi.agri.retailer.data.login.remote.dto.LoginResponse
import com.maxxi.agri.retailer.domain.common.base.BaseResult
import com.maxxi.agri.retailer.domain.login.LoginRepository
import com.maxxi.agri.retailer.domain.login.entity.LoginEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LoginUseCase @Inject constructor(private val loginRepository: LoginRepository) {
    suspend fun execute(loginRequest: LoginRequest): Flow<BaseResult<LoginEntity, WrappedResponse<LoginResponse>>> {
        return loginRepository.login(loginRequest)
    }

}