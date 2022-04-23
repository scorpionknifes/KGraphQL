package com.apurebase.kgraphql

import io.ktor.http.*
import io.ktor.serialization.*
import io.ktor.util.*
import kotlin.reflect.*

@KtorDsl
public class GraphQLConfig : Configuration {
    override fun <T : ContentConverter> register(
        contentType: ContentType,
        converter: T,
        configuration: T.() -> Unit
    ) {
        TODO("Not yet implemented")
    }

}
