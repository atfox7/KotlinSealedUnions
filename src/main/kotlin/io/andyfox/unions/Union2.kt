/*
 * Copyright (c) andyfox 2016
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.andyfox.unions

sealed class Union2<out First, out Second> {



  companion object {

    @JvmStatic
    fun <First> first(value: First): Union2<First, Nothing> = Union2First(value)

    @JvmStatic
    fun <Second> second(value: Second): Union2<Nothing, Second> = Union2Second(value)
  }

  inline fun <R> join(mapFirst: (First) -> R, mapSecond: (Second) -> R): R =
      when (this) {
        is Union2First -> mapFirst(value)
        is Union2Second -> mapSecond(value)
      }

  inline fun continued(continuationFirst: (First) -> Unit, continuationSecond: (Second) -> Unit) {
    when (this) {
      is Union2First -> continuationFirst(value)
      is Union2Second -> continuationSecond(value)
    }
  }

  data class Union2First<out First>(@PublishedApi internal val value: First) : Union2<First, Nothing>()

  data class Union2Second<out Second>(@PublishedApi internal val value: Second) : Union2<Nothing, Second>()

}