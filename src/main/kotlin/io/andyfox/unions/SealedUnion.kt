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

sealed class SealedUnion<out First> : Union<First> {

  companion object {

    @JvmStatic
    fun <First> first(value: First): Union<First> = UnionFirst(value)

  }

  override fun <R> join(mapFirst: (First) -> R): R =
      when (this) {
        is UnionFirst -> mapFirst(value)
      }

  override fun continued(continuationFirst: (First) -> Unit) {
    when (this) {
      is UnionFirst -> continuationFirst(value)
    }
  }

  private data class UnionFirst<out First>(val value: First) : SealedUnion<First>()

}