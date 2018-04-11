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
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh> first(value: First): Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> = Union7First(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh> second(value: Second): Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> = Union7Second(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh> third(value: Third): Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> = Union7Third(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh> fourth(value: Fourth): Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> = Union7Fourth(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh> fifth(value: Fifth): Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> = Union7Fifth(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh> sixth(value: Sixth): Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> = Union7Sixth(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh> seventh(value: Seventh): Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> = Union7Seventh(value)

  }

  inline fun <R> join(crossinline mapFirst: (First) -> R,
                      crossinline mapSecond: (Second) -> R,
                      crossinline mapThird: (Third) -> R,
                      crossinline mapFourth: (Fourth) -> R,
                      crossinline mapFifth: (Fifth) -> R,
                      crossinline mapSixth: (Sixth) -> R,
                      crossinline mapSeventh: (Seventh) -> R): R =
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

  data class Union7First<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh>(val value: First) : Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh>()

  data class Union7Second<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh>(val value: Second) : Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh>()

  data class Union7Third<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh>(val value: Third) : Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh>()

  data class Union7Fourth<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh>(val value: Fourth) : Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh>()

  data class Union7Fifth<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh>(val value: Fifth) : Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh>()

  data class Union7Sixth<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh>(val value: Sixth) : Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh>()

  data class Union7Seventh<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh>(val value: Seventh) : Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh>()

}