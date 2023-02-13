package com.hana.umuljeong.ui.auth

data class RegisterDataState(
    val nameCondition: Boolean = false,
    val emailCondition: Boolean = false,
    val phoneCondition: Boolean = false,
    val getCertNumber: Boolean = false,
    val remainSeconds: Int = 180,
    val certNumberCondition: Boolean = false,
    val passwordConditionList: MutableList<Boolean> = mutableListOf(false, false, false, false),
    val confirmPasswordCondition: Boolean = false,
    val registerBtnEnabled: Boolean = false,
)