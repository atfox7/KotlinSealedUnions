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

sealed class SealedUnion4<out First, out Second, out Third, out Fourth> : Union4<First, Second, Third, Fourth> {

  companion object {

    @JvmStatic
    fun <First, Second, Third, Fourth> first(value: First): SealedUnion4<First, Second, Third, Fourth> = Union4First(value)

    @JvmStatic
    fun <First, Second, Third, Fourth> second(value: Second): SealedUnion4<First, Second, Third, Fourth> = Union4Second(value)

    @JvmStatic
    fun <First, Second, Third, Fourth> third(value: Third): SealedUnion4<First, Second, Third, Fourth> = Union4Third(value)

    @JvmStatic
    fun <First, Second, Third, Fourth> fourth(value: Fourth): SealedUnion4<First, Second, Third, Fourth> = Union4Fourth(value)

  }

  override fun <R> join(mapFirst: (First) -> R,
                        mapSecond: (Second) -> R,
                        mapThird: (Third) -> R,
                        mapFourth: (Fourth) -> R): R =
      when (this) {
        is Union4First -> mapFirst(value)
        is Union4Second -> mapSecond(value)
        is Union4Third -> mapThird(value)
        is Union4Fourth -> mapFourth(value)
      }

  override fun continued(continuationFirst: (First) -> Unit,
                         continuationSecond: (Second) -> Unit,
                         continuationThird: (Third) -> Unit,
                         continuationFourth: (Fourth) -> Unit) {
    when (this) {
      is Union4First -> continuationFirst(value)
      is Union4Second -> continuationSecond(value)
      is Union4Third -> continuationThird(value)
      is Union4Fourth -> continuationFourth(value)
    }
  }

  private data class Union4First<out First, out Second, out Third, out Fourth>(val value: First) : SealedUnion4<First, Second, Third, Fourth>()

  private data class Union4Second<out First, out Second, out Third, out Fourth>(val value: Second) : SealedUnion4<First, Second, Third, Fourth>()

  private data class Union4Third<out First, out Second, out Third, out Fourth>(val value: Third) : SealedUnion4<First, Second, Third, Fourth>()

  private data class Union4Fourth<out First, out Second, out Third, out Fourth>(val value: Fourth) : SealedUnion4<First, Second, Third, Fourth>()
}