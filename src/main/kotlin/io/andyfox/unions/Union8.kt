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
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> first(value: First): Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> = Union8First(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> second(value: Second): Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> = Union8Second(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> third(value: Third): Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> = Union8Third(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> fourth(value: Fourth): Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> = Union8Fourth(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> fifth(value: Fifth): Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> = Union8Fifth(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> sixth(value: Sixth): Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> = Union8Sixth(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> seventh(value: Seventh): Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> = Union8Seventh(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> eighth(value: Eighth): Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> = Union8Eighth(value)

  }

  inline fun <R> join(crossinline mapFirst: (First) -> R,
                      crossinline mapSecond: (Second) -> R,
                      crossinline mapThird: (Third) -> R,
                      crossinline mapFourth: (Fourth) -> R,
                      crossinline mapFifth: (Fifth) -> R,
                      crossinline mapSixth: (Sixth) -> R,
                      crossinline mapSeventh: (Seventh) -> R,
                      crossinline mapEighth: (Eighth) -> R): R =
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

  data class Union8First<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh, out Eighth>(val value: First) : Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth>()

  data class Union8Second<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh, out Eighth>(val value: Second) : Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth>()

  data class Union8Third<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh, out Eighth>(val value: Third) : Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth>()

  data class Union8Fourth<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh, out Eighth>(val value: Fourth) : Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth>()

  data class Union8Fifth<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh, out Eighth>(val value: Fifth) : Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth>()

  data class Union8Sixth<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh, out Eighth>(val value: Sixth) : Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth>()

  data class Union8Seventh<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh, out Eighth>(val value: Seventh) : Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth>()

  data class Union8Eighth<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh, out Eighth>(val value: Eighth) : Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth>()

}