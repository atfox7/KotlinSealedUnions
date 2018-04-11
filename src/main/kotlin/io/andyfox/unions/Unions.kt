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

@file:Suppress("NOTHING_TO_INLINE")
package io.andyfox.unions

/**
 * Union
 */

inline fun <First> union(value: First): Union<First> = Union.first(value)

/**
 * Union2
 */

inline fun <First> union2First(value: First): Union2<First, Nothing> = Union2.first(value)

inline fun <Second> union2Second(value: Second): Union2<Nothing, Second> = Union2.second(value)

/**
 * Union3
 */

inline fun <First> union3First(value: First): Union3<First, Nothing, Nothing> = Union3.first(value)

inline fun <Second> union3Second(value: Second): Union3<Nothing, Second, Nothing> = Union3.second(value)

inline fun <Third> union3Third(value: Third): Union3<Nothing, Nothing, Third> = Union3.third(value)

/**
 * Union4
 */

inline fun <First> union4First(value: First): Union4<First, Nothing, Nothing, Nothing> = Union4.first(value)

inline fun <Second> union4Second(value: Second): Union4<Nothing, Second, Nothing, Nothing> = Union4.second(value)

inline fun <Third> union4Third(value: Third): Union4<Nothing, Nothing, Third, Nothing> = Union4.third(value)

inline fun <Fourth> union4Fourth(value: Fourth): Union4<Nothing, Nothing, Nothing, Fourth> = Union4.fourth(value)

/**
 * Union5
 */

inline fun <First> union5First(value: First): Union5<First, Nothing, Nothing, Nothing, Nothing> = Union5.first(value)

inline fun <Second> union5Second(value: Second): Union5<Nothing, Second, Nothing, Nothing, Nothing> = Union5.second(value)

inline fun <Third> union5Third(value: Third): Union5<Nothing, Nothing, Third, Nothing, Nothing> = Union5.third(value)

inline fun <Fourth> union5Fourth(value: Fourth): Union5<Nothing, Nothing, Nothing, Fourth, Nothing> = Union5.fourth(value)

inline fun <Fifth> union5Fifth(value: Fifth): Union5<Nothing, Nothing, Nothing, Nothing, Fifth> = Union5.fifth(value)

/**
 * Union6
 */

inline fun <First> union6First(value: First): Union6<First, Nothing, Nothing, Nothing, Nothing, Nothing> = Union6.first(value)

inline fun <Second> union6Second(value: Second): Union6<Nothing, Second, Nothing, Nothing, Nothing, Nothing> = Union6.second(value)

inline fun <Third> union6Third(value: Third): Union6<Nothing, Nothing, Third, Nothing, Nothing, Nothing> = Union6.third(value)

inline fun <Fourth> union6Fourth(value: Fourth): Union6<Nothing, Nothing, Nothing, Fourth, Nothing, Nothing> = Union6.fourth(value)

inline fun <Fifth> union6Fifth(value: Fifth): Union6<Nothing, Nothing, Nothing, Nothing, Fifth, Nothing> = Union6.fifth(value)

inline fun <Sixth> union6Sixth(value: Sixth): Union6<Nothing, Nothing, Nothing, Nothing, Nothing, Sixth> = Union6.sixth(value)

/**
 * Union7
 */

inline fun <First> union7First(value: First): Union7<First, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> = Union7.first(value)

inline fun <Second> union7Second(value: Second): Union7<Nothing, Second, Nothing, Nothing, Nothing, Nothing, Nothing> = Union7.second(value)

inline fun <Third> union7Third(value: Third): Union7<Nothing, Nothing, Third, Nothing, Nothing, Nothing, Nothing> = Union7.third(value)

inline fun <Fourth> union7Fourth(value: Fourth): Union7<Nothing, Nothing, Nothing, Fourth, Nothing, Nothing, Nothing> = Union7.fourth(value)

inline fun <Fifth> union7Fifth(value: Fifth): Union7<Nothing, Nothing, Nothing, Nothing, Fifth, Nothing, Nothing> = Union7.fifth(value)

inline fun <Sixth> union7Sixth(value: Sixth): Union7<Nothing, Nothing, Nothing, Nothing, Nothing, Sixth, Nothing> = Union7.sixth(value)

inline fun <Seventh> union7Seventh(value: Seventh): Union7<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Seventh> = Union7.seventh(value)

/**
 * Union8
 */

inline fun <First> union8First(value: First): Union8<First, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> = Union8.first(value)

inline fun <Second> union8Second(value: Second): Union8<Nothing, Second, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> = Union8.second(value)

inline fun <Third> union8Third(value: Third): Union8<Nothing, Nothing, Third, Nothing, Nothing, Nothing, Nothing, Nothing> = Union8.third(value)

inline fun <Fourth> union8Fourth(value: Fourth): Union8<Nothing, Nothing, Nothing, Fourth, Nothing, Nothing, Nothing, Nothing> = Union8.fourth(value)

inline fun <Fifth> union8Fifth(value: Fifth): Union8<Nothing, Nothing, Nothing, Nothing, Fifth, Nothing, Nothing, Nothing> = Union8.fifth(value)

inline fun <Sixth> union8Sixth(value: Sixth): Union8<Nothing, Nothing, Nothing, Nothing, Nothing, Sixth, Nothing, Nothing> = Union8.sixth(value)

inline fun <Seventh> union8Seventh(value: Seventh): Union8<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Seventh, Nothing> = Union8.seventh(value)

inline fun <Eighth> union8Eighth(value: Eighth): Union8<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Eighth> = Union8.eighth(value)

/**
 * Union9
 */

inline fun <First> union9First(value: First): Union9<First, Nothing, Nothing, Nothing, Nothing,Nothing, Nothing, Nothing, Nothing> = Union9.first(value)

inline fun <Second> union9Second(value: Second): Union9<Nothing, Second, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> = Union9.second(value)

inline fun <Third> union9Third(value: Third): Union9<Nothing, Nothing, Third, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing> = Union9.third(value)

inline fun <Fourth> union9Fourth(value: Fourth): Union9<Nothing, Nothing, Nothing, Fourth, Nothing, Nothing, Nothing, Nothing, Nothing> = Union9.fourth(value)

inline fun <Fifth> union9Fifth(value: Fifth): Union9<Nothing, Nothing, Nothing, Nothing, Fifth, Nothing, Nothing, Nothing, Nothing> = Union9.fifth(value)

inline fun <Sixth> union9Sixth(value: Sixth): Union9<Nothing, Nothing, Nothing, Nothing, Nothing, Sixth, Nothing, Nothing, Nothing> = Union9.sixth(value)

inline fun <Seventh> union9Seventh(value: Seventh): Union9<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Seventh, Nothing, Nothing> = Union9.seventh(value)

inline fun <Eighth> union9Eighth(value: Eighth): Union9<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Eighth, Nothing> = Union9.eighth(value)

inline fun <Ninth> union9Ninth(value: Ninth): Union9<Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Nothing, Ninth> = Union9.ninth(value)
