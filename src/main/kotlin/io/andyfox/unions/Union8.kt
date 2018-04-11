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

sealed class Union8<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh, out Eighth> {

  companion object {

    @JvmStatic
    fun <First> first(value: First): Union8<First, Nothing, Nothing, Nothing,Nothing, Nothing, Nothing, Nothing> = Union8First(value)

    @JvmStatic
    fun <Second> second(value: Second): Union8<Nothing, Second, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> = Union8Second(value)

    @JvmStatic
    fun <Third> third(value: Third): Union8<Nothing, Nothing, Third, Nothing, Nothing, Nothing, Nothing, Nothing> = Union8Third(value)

    @JvmStatic
    fun <Fourth> fourth(value: Fourth): Union8<Nothing, Nothing, Nothing, Fourth, Nothing, Nothing, Nothing, Nothing> = Union8Fourth(value)

    @JvmStatic
    fun <Fifth> fifth(value: Fifth): Union8<Nothing, Nothing, Nothing, Nothing, Fifth, Nothing, Nothing, Nothing> = Union8Fifth(value)

    @JvmStatic
    fun <Sixth> sixth(value: Sixth): Union8<Nothing, Nothing, Nothing, Nothing, Nothing, Sixth, Nothing, Nothing> = Union8Sixth(value)

    @JvmStatic
    fun <Seventh> seventh(value: Seventh): Union8<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Seventh, Nothing> = Union8Seventh(value)

    @JvmStatic
    fun <Eighth> eighth(value: Eighth): Union8<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Eighth> = Union8Eighth(value)

  }

  inline fun <R> join(mapFirst: (First) -> R,
                      mapSecond: (Second) -> R,
                      mapThird: (Third) -> R,
                      mapFourth: (Fourth) -> R,
                      mapFifth: (Fifth) -> R,
                      mapSixth: (Sixth) -> R,
                      mapSeventh: (Seventh) -> R,
                      mapEighth: (Eighth) -> R): R =
      when (this) {
        is Union8First -> mapFirst(value)
        is Union8Second -> mapSecond(value)
        is Union8Third -> mapThird(value)
        is Union8Fourth -> mapFourth(value)
        is Union8Fifth -> mapFifth(value)
        is Union8Sixth -> mapSixth(value)
        is Union8Seventh -> mapSeventh(value)
        is Union8Eighth -> mapEighth(value)
      }

  inline fun continued(continuationFirst: (First) -> Unit,
                       continuationSecond: (Second) -> Unit,
                       continuationThird: (Third) -> Unit,
                       continuationFourth: (Fourth) -> Unit,
                       continuationFifth: (Fifth) -> Unit,
                       continuationSixth: (Sixth) -> Unit,
                       continuationSeventh: (Seventh) -> Unit,
                       continuationEighth: (Eighth) -> Unit) {
    when (this) {
      is Union8First -> continuationFirst(value)
      is Union8Second -> continuationSecond(value)
      is Union8Third -> continuationThird(value)
      is Union8Fourth -> continuationFourth(value)
      is Union8Fifth -> continuationFifth(value)
      is Union8Sixth -> continuationSixth(value)
      is Union8Seventh -> continuationSeventh(value)
      is Union8Eighth -> continuationEighth(value)
    }
  }

  data class Union8First<out First>(@PublishedApi internal val value: First) : Union8<First, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>()

  data class Union8Second<out Second>(@PublishedApi internal val value: Second) : Union8<Nothing, Second, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>()

  data class Union8Third<out Third>(@PublishedApi internal val value: Third) : Union8<Nothing, Nothing, Third, Nothing, Nothing, Nothing, Nothing, Nothing>()

  data class Union8Fourth<out Fourth>(@PublishedApi internal val value: Fourth) : Union8<Nothing, Nothing, Nothing, Fourth, Nothing, Nothing, Nothing, Nothing>()

  data class Union8Fifth<out Fifth>(@PublishedApi internal val value: Fifth) : Union8<Nothing, Nothing, Nothing, Nothing, Fifth, Nothing, Nothing, Nothing>()

  data class Union8Sixth<out Sixth>(@PublishedApi internal val value: Sixth) : Union8<Nothing, Nothing, Nothing, Nothing, Nothing, Sixth, Nothing, Nothing>()

  data class Union8Seventh<out Seventh>(@PublishedApi internal val value: Seventh) : Union8<Nothing, Nothing, Nothing,Nothing, Nothing, Nothing, Seventh, Nothing>()

  data class Union8Eighth<out Eighth>(@PublishedApi internal val value: Eighth) : Union8<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Eighth>()

}