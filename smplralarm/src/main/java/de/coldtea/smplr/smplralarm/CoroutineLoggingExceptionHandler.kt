package de.coldtea.smplr.smplralarm

import kotlinx.coroutines.CoroutineExceptionHandler
import timber.log.Timber
import kotlin.coroutines.CoroutineContext

class CoroutineLoggingExceptionHandler : CoroutineExceptionHandler {
    override val key = CoroutineExceptionHandler.Key

    override fun handleException(context: CoroutineContext, exception: Throwable) {
        // Handle the exception
        Timber.e("Coroutine exception:", exception)
    }
}
