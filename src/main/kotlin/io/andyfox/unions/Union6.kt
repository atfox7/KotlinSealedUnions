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

sealed class Union6<out First, out Second, out Third, out Fourth, out Fifth, out Sixth> {

  companion object {

    @JvmStatic
    fun <First> first(value: First): Union6<First, Nothing, Nothing, Nothing, Nothing, Nothing> = Union6First(value)

    @JvmStatic
    fun <Second> second(value: Second): Union6<Nothing, Second, Nothing, Nothing, Nothing, Nothing> = Union6Second(value)

    @JvmStatic
    fun <Third> third(value: Third): Union6<Nothing, Nothing, Third, Nothing, Nothing, Nothing> = Union6Third(value)

    @JvmStatic
    fun <Fourth> fourth(value: Fourth): Union6<Nothing, Nothing, Nothing, Fourth, Nothing, Nothing> = Union6Fourth(value)

    @JvmStatic
    fun <Fifth> fifth(value: Fifth): Union6<Nothing, Nothing, Nothing, Nothing, Fifth, Nothing> = Union6Fifth(value)

    @JvmStatic
    fun <Sixth> sixth(value: Sixth): Union6<Nothing, Nothing, Nothing, Nothing, Nothing, Sixth> = Union6Sixth(value)

  }

  inline fun <R> join(mapFirst: (First) -> R,
                      mapSecond: (Second) -> R,
                      mapThird: (Third) -> R,
                      mapFourth: (Fourth) -> R,
                      mapFifth: (Fifth) -> R,
                      mapSixth: (Sixth) -> R): R =
      when (this) {
        is Union6First -> mapFirst(value)
        is Union6Second -> mapSecond(value)
        is Union6Third -> mapThird(value)
        is Union6Fourth -> mapFourth(value)
        is Union6Fifth -> mapFifth(value)
        is Union6Sixth -> mapSixth(value)
      }

  inline fun continued(continuationFirst: (First) -> Unit,
                       continuationSecond: (Second) -> Unit,
                       continuationThird: (Third) -> Unit,
                       continuationFourth: (Fourth) -> Unit,
                       continuationFifth: (Fifth) -> Unit,
                       continuationSixth: (Sixth) -> Unit) {
    when (this) {
      is Union6First -> continuationFirst(value)
      is Union6Second -> continuationSecond(value)
      is Union6Third -> continuationThird(value)
      is Union6Fourth -> continuationFourth(value)
      is Union6Fifth -> continuationFifth(value)
      is Union6Sixth -> continuationSixth(value)
    }
  }

  data class Union6First<out First>(@PublishedApi internal val value: First) : Union6<First, Nothing, Nothing, Nothing, Nothing, Nothing>()

  data class Union6Second<out Second>(@PublishedApi internal val value: Second) : Union6<Nothing, Second, Nothing, Nothing, Nothing, Nothing>()

  data class Union6Third<out Third>(@PublishedApi internal val value: Third) : Union6<Nothing, Nothing, Third, Nothing, Nothing, Nothing>()

  data class Union6Fourth<out Fourth>(@PublishedApi internal val value: Fourth) : Union6<Nothing, Nothing, Nothing, Fourth, Nothing, Nothing>()

  data class Union6Fifth<out Fifth>(@PublishedApi internal val value: Fifth) : Union6<Nothing, Nothing, Nothing, Nothing, Fifth, Nothing>()

  data class Union6Sixth<out Sixth>(@PublishedApi internal val value: Sixth) : Union6<Nothing, Nothing, Nothing, Nothing, Nothing, Sixth>()
}