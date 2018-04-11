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

sealed class Union9<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh, out Eighth, out Ninth> {

  companion object {

    @JvmStatic
    fun <First> first(value: First): Union9<First, Nothing, Nothing, Nothing, Nothing,Nothing, Nothing, Nothing, Nothing> = Union9First(value)

    @JvmStatic
    fun <Second> second(value: Second): Union9<Nothing, Second, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> = Union9Second(value)

    @JvmStatic
    fun <Third> third(value: Third): Union9<Nothing, Nothing, Third, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> = Union9Third(value)

    @JvmStatic
    fun <Fourth> fourth(value: Fourth): Union9<Nothing, Nothing, Nothing, Fourth, Nothing, Nothing, Nothing, Nothing, Nothing> = Union9Fourth(value)

    @JvmStatic
    fun <Fifth> fifth(value: Fifth): Union9<Nothing, Nothing, Nothing, Nothing, Fifth, Nothing, Nothing, Nothing, Nothing> = Union9Fifth(value)

    @JvmStatic
    fun <Sixth> sixth(value: Sixth): Union9<Nothing, Nothing, Nothing, Nothing, Nothing, Sixth, Nothing, Nothing, Nothing> = Union9Sixth(value)

    @JvmStatic
    fun <Seventh> seventh(value: Seventh): Union9<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Seventh, Nothing, Nothing> = Union9Seventh(value)

    @JvmStatic
    fun <Eighth> eighth(value: Eighth): Union9<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Eighth, Nothing> = Union9Eighth(value)

    @JvmStatic
    fun <Ninth> ninth(value: Ninth): Union9<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Ninth> = Union9Ninth(value)

  }

  inline fun <R> join(mapFirst: (First) -> R,
                      mapSecond: (Second) -> R,
                      mapThird: (Third) -> R,
                      mapFourth: (Fourth) -> R,
                      mapFifth: (Fifth) -> R,
                      mapSixth: (Sixth) -> R,
                      mapSeventh: (Seventh) -> R,
                      mapEighth: (Eighth) -> R,
                      mapNinth: (Ninth) -> R): R =
      when (this) {
        is Union9First -> mapFirst(value)
        is Union9Second -> mapSecond(value)
        is Union9Third -> mapThird(value)
        is Union9Fourth -> mapFourth(value)
        is Union9Fifth -> mapFifth(value)
        is Union9Sixth -> mapSixth(value)
        is Union9Seventh -> mapSeventh(value)
        is Union9Eighth -> mapEighth(value)
        is Union9Ninth -> mapNinth(value)
      }

  inline fun continued(continuationFirst: (First) -> Unit,
                       continuationSecond: (Second) -> Unit,
                       continuationThird: (Third) -> Unit,
                       continuationFourth: (Fourth) -> Unit,
                       continuationFifth: (Fifth) -> Unit,
                       continuationSixth: (Sixth) -> Unit,
                       continuationSeventh: (Seventh) -> Unit,
                       continuationEighth: (Eighth) -> Unit,
                       continuationNinth: (Ninth) -> Unit) {
    when (this) {
      is Union9First -> continuationFirst(value)
      is Union9Second -> continuationSecond(value)
      is Union9Third -> continuationThird(value)
      is Union9Fourth -> continuationFourth(value)
      is Union9Fifth -> continuationFifth(value)
      is Union9Sixth -> continuationSixth(value)
      is Union9Seventh -> continuationSeventh(value)
      is Union9Eighth -> continuationEighth(value)
      is Union9Ninth -> continuationNinth(value)
    }
  }

  data class Union9First<out First>(@PublishedApi internal val value: First) : Union9<First, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>()

  data class Union9Second<out Second>(@PublishedApi internal val value: Second) : Union9<Nothing, Second, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>()

  data class Union9Third<out Third>(@PublishedApi internal val value: Third) : Union9<Nothing, Nothing, Third, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>()

  data class Union9Fourth<out Fourth>(@PublishedApi internal val value: Fourth) : Union9<Nothing, Nothing, Nothing, Fourth, Nothing, Nothing, Nothing, Nothing, Nothing>()

  data class Union9Fifth<out Fifth>(@PublishedApi internal val value: Fifth) : Union9<Nothing, Nothing, Nothing, Nothing, Fifth, Nothing, Nothing, Nothing, Nothing>()

  data class Union9Sixth<out Sixth>(@PublishedApi internal val value: Sixth) : Union9<Nothing, Nothing, Nothing, Nothing, Nothing, Sixth, Nothing, Nothing, Nothing>()

  data class Union9Seventh<out Seventh>(@PublishedApi internal val value: Seventh) : Union9<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Seventh, Nothing, Nothing>()

  data class Union9Eighth<out Eighth>(@PublishedApi internal val value: Eighth) : Union9<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Eighth, Nothing>()

  data class Union9Ninth<out Ninth>(@PublishedApi internal val value: Ninth) : Union9<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Ninth>()
}