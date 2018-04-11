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

sealed class Union4<out First, out Second, out Third, out Fourth> {

  companion object {

    @JvmStatic
    fun <First> first(value: First): Union4<First, Nothing, Nothing, Nothing> = Union4First(value)

    @JvmStatic
    fun <Second> second(value: Second): Union4<Nothing, Second, Nothing, Nothing> = Union4Second(value)

    @JvmStatic
    fun <Third> third(value: Third): Union4<Nothing, Nothing, Third, Nothing> = Union4Third(value)

    @JvmStatic
    fun <Fourth> fourth(value: Fourth): Union4<Nothing, Nothing, Nothing, Fourth> = Union4Fourth(value)

  }

  inline fun <R> join(mapFirst: (First) -> R,
                      mapSecond: (Second) -> R,
                      mapThird: (Third) -> R,
                      mapFourth: (Fourth) -> R): R =
      when (this) {
        is Union4First -> mapFirst(value)
        is Union4Second -> mapSecond(value)
        is Union4Third -> mapThird(value)
        is Union4Fourth -> mapFourth(value)
      }

  inline fun continued(continuationFirst: (First) -> Unit,
                       continuationSecond: (Second) -> Unit,
                       continuationThird: (Third) -> Unit,
                       continuationFourth: (Fourth) -> Unit) {
    when (this) {
      is Union4First -> continuationFirst(value)
      is Union4Second -> continuationSecond(value)
      is Union4Third -> continuationThird(value)
      is Union4Fourth -> continuationFourth(value)
    }
  }

  data class Union4First<out First>(@PublishedApi internal val value: First) : Union4<First, Nothing, Nothing, Nothing>()

  data class Union4Second<out Second>(@PublishedApi internal val value: Second) : Union4<Nothing, Second, Nothing, Nothing>()

  data class Union4Third<out Third>(@PublishedApi internal val value: Third) : Union4<Nothing, Nothing, Third, Nothing>()

  data class Union4Fourth<out Fourth>(@PublishedApi internal val value: Fourth) : Union4<Nothing, Nothing, Nothing, Fourth>()
}