package com.hana.fieldmate.data.remote.datasource

import com.hana.fieldmate.data.ResultWrapper
import com.hana.fieldmate.data.remote.api.MemberService
import com.hana.fieldmate.data.remote.model.request.CreateMemberReq
import com.hana.fieldmate.data.remote.model.request.UpdateProfileReq
import com.hana.fieldmate.data.remote.model.response.CreateMemberRes
import com.hana.fieldmate.data.remote.model.response.MemberListRes
import com.hana.fieldmate.data.remote.model.response.MemberRes
import com.hana.fieldmate.data.remote.model.response.UpdateProfileRes
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class MemberDataSource @Inject constructor(
    private val memberService: MemberService,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) {
    fun createMember(
        companyId: Long, createMemberReq: CreateMemberReq
    ): Flow<ResultWrapper<CreateMemberRes>> = flow {
        memberService.createMember(companyId, createMemberReq).onSuccess {
            emit(ResultWrapper.Success(it))
        }.onFailure {
            emit(ResultWrapper.Error(it.message!!))
        }
    }.flowOn(ioDispatcher)

    fun fetchProfile(): Flow<ResultWrapper<MemberRes>> = flow {
        memberService.fetchProfile().onSuccess {
            emit(ResultWrapper.Success(it))
        }.onFailure {
            emit(ResultWrapper.Error(it.message!!))
        }
    }.flowOn(ioDispatcher)

    fun fetchProfileById(memberId: Long): Flow<ResultWrapper<MemberRes>> = flow {
        memberService.fetchProfileById(memberId).onSuccess {
            emit(ResultWrapper.Success(it))
        }.onFailure {
            emit(ResultWrapper.Error(it.message!!))
        }
    }.flowOn(ioDispatcher)

    fun updateProfile(updateProfileReq: UpdateProfileReq): Flow<ResultWrapper<UpdateProfileRes>> =
        flow {
            memberService.updateProfile(updateProfileReq).onSuccess {
                emit(ResultWrapper.Success(it))
            }.onFailure {
                emit(ResultWrapper.Error(it.message!!))
            }
        }.flowOn(ioDispatcher)

    fun fetchMemberList(companyId: Long): Flow<ResultWrapper<MemberListRes>> = flow {
        memberService.fetchMemberList(companyId).onSuccess {
            emit(ResultWrapper.Success(it))
        }.onFailure {
            emit(ResultWrapper.Error(it.message!!))
        }
    }.flowOn(ioDispatcher)
}