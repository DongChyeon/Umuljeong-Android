package com.hana.umuljeong.data.datasource

import com.hana.umuljeong.data.model.Customer
import com.hana.umuljeong.data.model.Member
import com.hana.umuljeong.data.model.Report

val report = listOf(
    Report(id = 0, customer = "고객1", name = "업무1", category = "A/S", content = "ㅁㄴㅇㄹ"),
    Report(id = 1, customer = "고객2", name = "업무2", category = "기술마케팅", content = "ㅁㄴㅇㄹ"),
    Report(id = 2, customer = "고객3", name = "업무3", category = "사전점검", content = "ㅁㄴㅇㄹ"),
    Report(id = 3, customer = "고객4", name = "업무4", category = "단순문의", content = "ㅁㄴㅇㄹ"),
    Report(id = 4, customer = "고객5", name = "업무5", category = "고객민원", content = "ㅁㄴㅇㄹ"),
    Report(id = 5, customer = "고객6", name = "업무6", category = "고객민원", content = "ㅁㄴㅇㄹ"),
    Report(id = 6, customer = "고객7", name = "업무7", category = "고객민원", content = "ㅁㄴㅇㄹ")
)

var fakeCustomerSelectionData = listOf(
    "디지털리얼코리아", "Central Makeus Challenge"
)

val fakeBussinessSelectionData = listOf(
    "디지털리얼코리아 전용 회선", "CMC 12기 하나팀 화이팅", "UI 개발하기가 제일 힘들다"
)

val fakeCategorySelectionData = listOf(
    "단순문의", "고객민원", "A/S", "기술마케팅", "사전점검"
)

val fakeCustomerData = listOf(
    Customer(id = 0, name = "디지털리얼코리아", phone = "010-1234-5678", visitNum = 27, businessNum = 5),
    Customer(id = 1, name = "CMC", phone = "010-1234-5678", visitNum = 62, businessNum = 15),
    Customer(id = 2, name = "UMC", phone = "010-1234-5678", visitNum = 15, businessNum = 2),
    Customer(id = 3, name = "하나", phone = "010-1234-5678", visitNum = 234, businessNum = 7),
)

val fakeMemberData = listOf(
    Member(id = 0, name = "동현", email = "kimdonghyun90766@gmail.com", phone = "010-1234-5678"),
    Member(id = 1, name = "동쳔", email = "kimdonghyun90766@gmail.com", phone = "010-1234-5678"),
    Member(id = 2, name = "동챤", email = "kimdonghyun90766@gmail.com", phone = "010-1234-5678"),
    Member(id = 3, name = "똥쳔", email = "kimdonghyun90766@gmail.com", phone = "010-1234-5678"),
    Member(id = 4, name = "동치연", email = "kimdonghyun90766@gmail.com", phone = "010-1234-5678"),
)