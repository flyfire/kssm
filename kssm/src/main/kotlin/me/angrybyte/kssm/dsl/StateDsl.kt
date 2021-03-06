package me.angrybyte.kssm.dsl

import me.angrybyte.kssm.api.State
import me.angrybyte.kssm.impl.state.NamedState
import me.angrybyte.kssm.impl.state.PayloadState

/**
 * Simplifies creation of a new [NamedState] instance.
 */
fun namedState(name: String): State<Nothing> = NamedState(name)

/**
 * Simplifies creation of a new [PayloadState] instance.
 */
fun <T> payloadState(name: String, payload: T?): State<T> = PayloadState(name, payload)