package com.github.dsx137.jable.extension

import java.util.stream.Stream

fun <T> Stream<T?>.filterNotNull(): Stream<T> = this.filter { it != null }.map { it!! }
