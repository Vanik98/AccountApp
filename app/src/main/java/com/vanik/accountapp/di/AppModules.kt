@file:OptIn(ExperimentalSerializationApi::class)

package com.vanik.accountapp.di

import com.vanik.accountapp.ui.main.MainViewModel
import kotlinx.serialization.ExperimentalSerializationApi
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModules by lazy {
    listOf(
        viewModelsModule,

    )
}

private val viewModelsModule = module {
    viewModel {
        MainViewModel()
    }
}
