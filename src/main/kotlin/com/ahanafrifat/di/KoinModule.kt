package com.ahanafrifat.di

import com.ahanafrifat.repository.HeroRepository
import com.ahanafrifat.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single <HeroRepository>{
        HeroRepositoryImpl()
    }
}