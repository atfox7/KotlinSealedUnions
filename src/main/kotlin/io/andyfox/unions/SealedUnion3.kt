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

sealed class SealedUnion3<out First, out Second, out Third> : Union3<First, Second, Third> {

  companion object {

    @JvmStatic
    fun <First, Second, Third> first(value: First): SealedUnion3<First, Second, Third> = Union3First(value)

    @JvmStatic
    fun <First, Second, Third> second(value: Second): SealedUnion3<First, Second, Third> = Union3Second(value)

    @JvmStatic
    fun <First, Second, Third> third(value: Third): SealedUnion3<First, Second, Third> = Union3Third(value)
  }

  override fun <R> join(mapFirst: (First) -> R,
                        mapSecond: (Second) -> R,
                        mapThird: (Third) -> R): R =
      when (this) {
        is Union3First -> mapFirst(value)
        is Union3Second -> mapSecond(value)
        is Union3Third -> mapThird(value)
      }

  override fun continued(continuationFirst: (First) -> Unit,
                         continuationSecond: (Second) -> Unit,
                         continuationThird: (Third) -> Unit) {
    when (this) {
      is Union3First -> continuationFirst(value)
      is Union3Second -> continuationSecond(value)
      is Union3Third -> continuationThird(value)
    }
  }

  private data class Union3First<out First, out Second, out Third>(val value: First) : SealedUnion3<First, Second, Third>()

  private data class Union3Second<out First, out Second, out Third>(val value: Second) : SealedUnion3<First, Second, Third>()

  private data class Union3Third<out First, out Second, out Third>(val value: Third) : SealedUnion3<First, Second, Third>()
}