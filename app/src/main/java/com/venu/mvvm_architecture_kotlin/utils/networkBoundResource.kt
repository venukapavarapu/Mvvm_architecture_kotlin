package com.venu.mvvm_architecture_kotlin.utils

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

/**
 * Created by Venu on 12/06/21.
 */
@OptIn(ExperimentalCoroutinesApi::class)
inline fun<RequestType,ResultType> networkBoundResource(
    crossinline query: () -> Flow<ResultType>,
    crossinline fetch: suspend () -> RequestType,
    crossinline saveFetchResult: suspend (RequestType) -> Unit,
    crossinline shouldFetch: (ResultType) -> Boolean = { true }
) = channelFlow {
    val data = query().first()

    if (shouldFetch(data)) {
        val loading = launch {
            query().collect { send(Resource.Loading()) }
        }

        try {
            delay(2000)
            saveFetchResult(fetch())
            loading.cancel()
            query().collect { send(Resource.Success(it)) }
        } catch (t: Throwable) {
            loading.cancel()
            query().collect { send(Resource.Error(t.message!!,null)) }
        }
    } else {
        query().collect { send(Resource.Success(it)) }
    }
}