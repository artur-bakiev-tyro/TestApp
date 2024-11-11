package com.example.mylibrary

import android.content.ContentProvider
import android.content.ContentValues
import android.content.SharedPreferences
import android.database.Cursor
import android.net.Uri
import dagger.hilt.android.EarlyEntryPoints
import dagger.hilt.android.EntryPointAccessors

class LibraryRepositoryProvider : ContentProvider() {
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(): Boolean {
        val hiltEntryPoint =
//            EntryPointAccessors.fromApplication(context!!, LibraryProviderEntryPoint::class.java)
            EarlyEntryPoints.get(context!!, LibraryProviderEntryPoint::class.java)
        sharedPreferences = hiltEntryPoint.getSharedPreferences()
        return true
    }

    override fun query(
        uri: Uri,
        projection: Array<out String>?,
        selection: String?,
        selectionArgs: Array<out String>?,
        sortOrder: String?
    ): Cursor? {
        TODO("Not yet implemented")
    }

    override fun getType(uri: Uri): String? {
        TODO("Not yet implemented")
    }

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        TODO("Not yet implemented")
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int {
        TODO("Not yet implemented")
    }

    override fun update(uri: Uri, values: ContentValues?, selection: String?, selectionArgs: Array<out String>?): Int {
        TODO("Not yet implemented")
    }
}
