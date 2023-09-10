package com.kotlin.datastore.data

import kotlinx.coroutines.flow.Flow

interface DataStoreManager {
    suspend fun saveTasks(tasks: Tasks)
    fun getTasks(): Flow<Tasks>
}