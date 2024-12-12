package com.ll.gb.global.initData

import com.ll.gb.domain.chat.room.service.ChatRoomService
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BaseInitData(
    private val chatRoomService: ChatRoomService
) {
    @Bean
    fun initDataBaseApplicationRunner(): ApplicationRunner {
        return ApplicationRunner {
            if (chatRoomService.count() > 0) return@ApplicationRunner

            chatRoomService.make("축구 하실 분?")
            chatRoomService.make("농구 하실 분?")
        }
    }
}