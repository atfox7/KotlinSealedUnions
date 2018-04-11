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
    fun <First, Second, Third, Fourth, Fifth, Sixth> first(value: First): Union6<First, Second, Third, Fourth, Fifth, Sixth> = Union6First(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth> second(value: Second): Union6<First, Second, Third, Fourth, Fifth, Sixth> = Union6Second(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth> third(value: Third): Union6<First, Second, Third, Fourth, Fifth, Sixth> = Union6Third(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth> fourth(value: Fourth): Union6<First, Second, Third, Fourth, Fifth, Sixth> = Union6Fourth(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth> fifth(value: Fifth): Union6<First, Second, Third, Fourth, Fifth, Sixth> = Union6Fifth(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth> sixth(value: Sixth): Union6<First, Second, Third, Fourth, Fifth, Sixth> = Union6Sixth(value)

  }

  inline fun <R> join(crossinline mapFirst: (First) -> R,
                      crossinline mapSecond: (Second) -> R,
                      crossinline mapThird: (Third) -> R,
                      crossinline mapFourth: (Fourth) -> R,
                      crossinline mapFifth: (Fifth) -> R,
                      crossinline  mapSixth: (Sixth) -> R): R =
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

  data class Union6First<out First, out Second, out Third, out Fourth, out Fifth, out Sixth>(val value: First) : Union6<First, Second, Third, Fourth, Fifth, Sixth>()

  data class Union6Second<out First, out Second, out Third, out Fourth, out Fifth, out Sixth>(val value: Second) : Union6<First, Second, Third, Fourth, Fifth, Sixth>()

  data class Union6Third<out First, out Second, out Third, out Fourth, out Fifth, out Sixth>(val value: Third) : Union6<First, Second, Third, Fourth, Fifth, Sixth>()

  data class Union6Fourth<out First, out Second, out Third, out Fourth, out Fifth, out Sixth>(val value: Fourth) : Union6<First, Second, Third, Fourth, Fifth, Sixth>()

  data class Union6Fifth<out First, out Second, out Third, out Fourth, out Fifth, out Sixth>(val value: Fifth) : Union6<First, Second, Third, Fourth, Fifth, Sixth>()

  data class Union6Sixth<out First, out Second, out Third, out Fourth, out Fifth, out Sixth>(val value: Sixth) : Union6<First, Second, Third, Fourth, Fifth, Sixth>()
}