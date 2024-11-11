package com.example.mylibrary

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EarlyEntryPoint
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//@EntryPoint
@EarlyEntryPoint
@InstallIn(SingletonComponent::class)
interface LibraryProviderEntryPoint {
    fun getSharedPreferences(): SharedPreferences
}

@Module
@InstallIn(SingletonComponent::class)
class LibraryProviderModule {
    @Provides
    @Singleton
    fun providerEncryptedSharedPreferences(@ApplicationContext context: Context): SharedPreferences {
        return context.getSharedPreferences("temp", Context.MODE_PRIVATE)
    }
}
