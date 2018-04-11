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

sealed class Union7<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh> {

  companion object {

    @JvmStatic
    fun <First> first(value: First): Union7<First, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> = Union7First(value)

    @JvmStatic
    fun <Second> second(value: Second): Union7<Nothing, Second, Nothing, Nothing, Nothing, Nothing, Nothing> = Union7Second(value)

    @JvmStatic
    fun <Third> third(value: Third): Union7<Nothing, Nothing, Third, Nothing, Nothing, Nothing, Nothing> = Union7Third(value)

    @JvmStatic
    fun <Fourth> fourth(value: Fourth): Union7<Nothing, Nothing, Nothing, Fourth, Nothing, Nothing, Nothing> = Union7Fourth(value)

    @JvmStatic
    fun <Fifth> fifth(value: Fifth): Union7<Nothing, Nothing, Nothing, Nothing, Fifth, Nothing, Nothing> = Union7Fifth(value)

    @JvmStatic
    fun <Sixth> sixth(value: Sixth): Union7<Nothing, Nothing, Nothing, Nothing, Nothing, Sixth, Nothing> = Union7Sixth(value)

    @JvmStatic
    fun <Seventh> seventh(value: Seventh): Union7<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Seventh> = Union7Seventh(value)

  }

  inline fun <R> join(mapFirst: (First) -> R,
                      mapSecond: (Second) -> R,
                      mapThird: (Third) -> R,
                      mapFourth: (Fourth) -> R,
                      mapFifth: (Fifth) -> R,
                      mapSixth: (Sixth) -> R,
                      mapSeventh: (Seventh) -> R): R =
      when (this) {
        is Union7First -> mapFirst(value)
        is Union7Second -> mapSecond(value)
        is Union7Third -> mapThird(value)
        is Union7Fourth -> mapFourth(value)
        is Union7Fifth -> mapFifth(value)
        is Union7Sixth -> mapSixth(value)
        is Union7Seventh -> mapSeventh(value)
      }

  inline fun continued(continuationFirst: (First) -> Unit,
                       continuationSecond: (Second) -> Unit,
                       continuationThird: (Third) -> Unit,
                       continuationFourth: (Fourth) -> Unit,
                       continuationFifth: (Fifth) -> Unit,
                       continuationSixth: (Sixth) -> Unit,
                       continuationSeventh: (Seventh) -> Unit) {
    when (this) {
      is Union7First -> continuationFirst(value)
      is Union7Second -> continuationSecond(value)
      is Union7Third -> continuationThird(value)
      is Union7Fourth -> continuationFourth(value)
      is Union7Fifth -> continuationFifth(value)
      is Union7Sixth -> continuationSixth(value)
      is Union7Seventh -> continuationSeventh(value)
    }
  }

  data class Union7First<out First>(@PublishedApi internal val value: First) : Union7<First, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing>()

  data class Union7Second<out Second>(@PublishedApi internal val value: Second) : Union7<Nothing, Second, Nothing, Nothing, Nothing, Nothing, Nothing>()

  data class Union7Third<out Third>(@PublishedApi internal val value: Third) : Union7<Nothing, Nothing, Third, Nothing, Nothing, Nothing, Nothing>()

  data class Union7Fourth<out Fourth>(@PublishedApi internal val value: Fourth) : Union7<Nothing, Nothing, Nothing, Fourth, Nothing, Nothing, Nothing>()

  data class Union7Fifth<out Fifth>(@PublishedApi internal val value: Fifth) : Union7<Nothing, Nothing, Nothing, Nothing, Fifth, Nothing, Nothing>()

  data class Union7Sixth< out Sixth>(@PublishedApi internal val value: Sixth) : Union7<Nothing, Nothing, Nothing, Nothing, Nothing, Sixth, Nothing>()

  data class Union7Seventh<out Seventh>(@PublishedApi internal val value: Seventh) : Union7<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Seventh>()

}