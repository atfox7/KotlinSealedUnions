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

sealed class Union5<out First, out Second, out Third, out Fourth, out Fifth> {

  companion object {

    @JvmStatic
    fun <First> first(value: First): Union5<First, Nothing, Nothing, Nothing, Nothing> = Union5First(value)

    @JvmStatic
    fun <Second> second(value: Second): Union5<Nothing, Second, Nothing, Nothing, Nothing> = Union5Second(value)

    @JvmStatic
    fun <Third> third(value: Third): Union5<Nothing, Nothing, Third, Nothing, Nothing> = Union5Third(value)

    @JvmStatic
    fun <Fourth> fourth(value: Fourth): Union5<Nothing, Nothing, Nothing, Fourth, Nothing> = Union5Fourth(value)

    @JvmStatic
    fun <Fifth> fifth(value: Fifth): Union5<Nothing, Nothing, Nothing, Nothing, Fifth> = Union5Fifth(value)
  }

  inline fun <R> join(mapFirst: (First) -> R,
                      mapSecond: (Second) -> R,
                      mapThird: (Third) -> R,
                      mapFourth: (Fourth) -> R,
                      mapFifth: (Fifth) -> R): R =
      when (this) {
        is Union5First -> mapFirst(value)
        is Union5Second -> mapSecond(value)
        is Union5Third -> mapThird(value)
        is Union5Fourth -> mapFourth(value)
        is Union5Fifth -> mapFifth(value)
      }

  inline fun continued(continuationFirst: (First) -> Unit,
                       continuationSecond: (Second) -> Unit,
                       continuationThird: (Third) -> Unit,
                       continuationFourth: (Fourth) -> Unit,
                       continuationFifth: (Fifth) -> Unit) {
    when (this) {
      is Union5First -> continuationFirst(value)
      is Union5Second -> continuationSecond(value)
      is Union5Third -> continuationThird(value)
      is Union5Fourth -> continuationFourth(value)
      is Union5Fifth -> continuationFifth(value)
    }
  }

  data class Union5First<out First>(@PublishedApi internal val value: First) : Union5<First, Nothing, Nothing, Nothing, Nothing>()

  data class Union5Second<out Second>(@PublishedApi internal val value: Second) : Union5<Nothing, Second, Nothing, Nothing, Nothing>()

  data class Union5Third<out Third>(@PublishedApi internal val value: Third) : Union5<Nothing, Nothing, Third, Nothing, Nothing>()

  data class Union5Fourth<out Fourth>(@PublishedApi internal val value: Fourth) : Union5<Nothing, Nothing, Nothing, Fourth, Nothing>()

  data class Union5Fifth<out Fifth>(@PublishedApi internal val value: Fifth) : Union5<Nothing, Nothing, Nothing, Nothing, Fifth>()

}