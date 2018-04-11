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

sealed class Union3<out First, out Second, out Third> {

  companion object {

    @JvmStatic
    fun <First, Second, Third> first(value: First): Union3<First, Second, Third> = Union3First(value)

    @JvmStatic
    fun <First, Second, Third> second(value: Second): Union3<First, Second, Third> = Union3Second(value)

    @JvmStatic
    fun <First, Second, Third> third(value: Third): Union3<First, Second, Third> = Union3Third(value)
  }

  inline fun <R> join(crossinline mapFirst: (First) -> R,
                      crossinline mapSecond: (Second) -> R,
                      crossinline mapThird: (Third) -> R): R =
      when (this) {
        is Union3First -> mapFirst(value)
        is Union3Second -> mapSecond(value)
        is Union3Third -> mapThird(value)
      }

  inline fun continued(continuationFirst: (First) -> Unit,
                       continuationSecond: (Second) -> Unit,
                       continuationThird: (Third) -> Unit) {
    when (this) {
      is Union3First -> continuationFirst(value)
      is Union3Second -> continuationSecond(value)
      is Union3Third -> continuationThird(value)
    }
  }

  data class Union3First<out First, out Second, out Third>(val value: First) : Union3<First, Second, Third>()

  data class Union3Second<out First, out Second, out Third>(val value: Second) : Union3<First, Second, Third>()

  data class Union3Third<out First, out Second, out Third>(val value: Third) : Union3<First, Second, Third>()
}