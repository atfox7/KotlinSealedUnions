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
    fun <First, Second, Third, Fourth, Fifth> first(value: First): Union5<First, Second, Third, Fourth, Fifth> = Union5First(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth> second(value: Second): Union5<First, Second, Third, Fourth, Fifth> = Union5Second(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth> third(value: Third): Union5<First, Second, Third, Fourth, Fifth> = Union5Third(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth> fourth(value: Fourth): Union5<First, Second, Third, Fourth, Fifth> = Union5Fourth(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth> fifth(value: Fifth): Union5<First, Second, Third, Fourth, Fifth> = Union5Fifth(value)
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

  data class Union5First<out First, out Second, out Third, out Fourth, out Fifth>(@PublishedApi internal val value: First) : Union5<First, Second, Third, Fourth, Fifth>()

  data class Union5Second<out First, out Second, out Third, out Fourth, out Fifth>(@PublishedApi internal val value: Second) : Union5<First, Second, Third, Fourth, Fifth>()

  data class Union5Third<out First, out Second, out Third, out Fourth, out Fifth>(@PublishedApi internal val value: Third) : Union5<First, Second, Third, Fourth, Fifth>()

  data class Union5Fourth<out First, out Second, out Third, out Fourth, out Fifth>(@PublishedApi internal val value: Fourth) : Union5<First, Second, Third, Fourth, Fifth>()

  data class Union5Fifth<out First, out Second, out Third, out Fourth, out Fifth>(@PublishedApi internal val value: Fifth) : Union5<First, Second, Third, Fourth, Fifth>()

}