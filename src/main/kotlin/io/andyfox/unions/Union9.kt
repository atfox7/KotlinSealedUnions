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
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> first(value: First): Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> = Union9First(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> second(value: Second): Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> = Union9Second(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> third(value: Third): Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> = Union9Third(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> fourth(value: Fourth): Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> = Union9Fourth(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> fifth(value: Fifth): Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> = Union9Fifth(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> sixth(value: Sixth): Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> = Union9Sixth(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> seventh(value: Seventh): Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> = Union9Seventh(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> eighth(value: Eighth): Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> = Union9Eighth(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> ninth(value: Ninth): Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> = Union9Ninth(value)

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

  inline fun continued(crossinline continuationFirst: (First) -> Unit,
                       crossinline continuationSecond: (Second) -> Unit,
                       crossinline continuationThird: (Third) -> Unit,
                       crossinline continuationFourth: (Fourth) -> Unit,
                       crossinline continuationFifth: (Fifth) -> Unit,
                       crossinline continuationSixth: (Sixth) -> Unit,
                       crossinline continuationSeventh: (Seventh) -> Unit,
                       crossinline continuationEighth: (Eighth) -> Unit,
                       crossinline continuationNinth: (Ninth) -> Unit) {
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

  data class Union9First<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh, out Eighth, out Ninth>(val value: First) : Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth>()

  data class Union9Second<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh, out Eighth, out Ninth>(val value: Second) : Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth>()

  data class Union9Third<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh, out Eighth, out Ninth>(val value: Third) : Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth>()

  data class Union9Fourth<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh, out Eighth, out Ninth>(val value: Fourth) : Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth>()

  data class Union9Fifth<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh, out Eighth, out Ninth>(val value: Fifth) : Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth>()

  data class Union9Sixth<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh, out Eighth, out Ninth>(val value: Sixth) : Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth>()

  data class Union9Seventh<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh, out Eighth, out Ninth>(val value: Seventh) : Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth>()

  data class Union9Eighth<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh, out Eighth, out Ninth>(val value: Eighth) : Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth>()

  data class Union9Ninth<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh, out Eighth, out Ninth>(val value: Ninth) : Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth>()
}