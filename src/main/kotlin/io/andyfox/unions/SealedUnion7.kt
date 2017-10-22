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

sealed class SealedUnion7<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh> : Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> {

  companion object {

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh> first(value: First): SealedUnion7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> = Union7First(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh> second(value: Second): SealedUnion7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> = Union7Second(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh> third(value: Third): SealedUnion7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> = Union7Third(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh> fourth(value: Fourth): SealedUnion7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> = Union7Fourth(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh> fifth(value: Fifth): SealedUnion7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> = Union7Fifth(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh> sixth(value: Sixth): SealedUnion7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> = Union7Sixth(value)

    @JvmStatic
    fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh> seventh(value: Seventh): SealedUnion7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> = Union7Seventh(value)

  }

  override fun <R> join(mapFirst: (First) -> R,
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

  override fun continued(continuationFirst: (First) -> Unit,
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

  private data class Union7First<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh>(val value: First) : SealedUnion7<First, Second, Third, Fourth, Fifth, Sixth, Seventh>()

  private data class Union7Second<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh>(val value: Second) : SealedUnion7<First, Second, Third, Fourth, Fifth, Sixth, Seventh>()

  private data class Union7Third<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh>(val value: Third) : SealedUnion7<First, Second, Third, Fourth, Fifth, Sixth, Seventh>()

  private data class Union7Fourth<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh>(val value: Fourth) : SealedUnion7<First, Second, Third, Fourth, Fifth, Sixth, Seventh>()

  private data class Union7Fifth<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh>(val value: Fifth) : SealedUnion7<First, Second, Third, Fourth, Fifth, Sixth, Seventh>()

  private data class Union7Sixth<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh>(val value: Sixth) : SealedUnion7<First, Second, Third, Fourth, Fifth, Sixth, Seventh>()

  private data class Union7Seventh<out First, out Second, out Third, out Fourth, out Fifth, out Sixth, out Seventh>(val value: Seventh) : SealedUnion7<First, Second, Third, Fourth, Fifth, Sixth, Seventh>()

}