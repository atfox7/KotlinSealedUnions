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

inline fun <First> union(value: First): Union<First> = SealedUnion.first(value)

/**
 * Union2
 */

inline fun <First, Second> union2First(value: First): Union2<First, Second> = SealedUnion2.first(value)

inline fun <First, Second> union2Second(value: Second): Union2<First, Second> = SealedUnion2.second(value)

/**
 * Union3
 */

inline fun <First, Second, Third> union3First(value: First): Union3<First, Second, Third> = SealedUnion3.first(value)

inline fun <First, Second, Third> union3Second(value: Second): Union3<First, Second, Third> = SealedUnion3.second(value)

inline fun <First, Second, Third> union3Third(value: Third): Union3<First, Second, Third> = SealedUnion3.third(value)

/**
 * Union4
 */

inline fun <First, Second, Third, Fourth> union4First(value: First): Union4<First, Second, Third, Fourth> = SealedUnion4.first(value)

inline fun <First, Second, Third, Fourth> union4Second(value: Second): Union4<First, Second, Third, Fourth> = SealedUnion4.second(value)

inline fun <First, Second, Third, Fourth> union4Third(value: Third): Union4<First, Second, Third, Fourth> = SealedUnion4.third(value)

inline fun <First, Second, Third, Fourth> union4Fourth(value: Fourth): Union4<First, Second, Third, Fourth> = SealedUnion4.fourth(value)

/**
 * Union5
 */

inline fun <First, Second, Third, Fourth, Fifth> union5First(value: First): Union5<First, Second, Third, Fourth, Fifth> = SealedUnion5.first(value)

inline fun <First, Second, Third, Fourth, Fifth> union5Second(value: Second): Union5<First, Second, Third, Fourth, Fifth> = SealedUnion5.second(value)

inline fun <First, Second, Third, Fourth, Fifth> union5Third(value: Third): Union5<First, Second, Third, Fourth, Fifth> = SealedUnion5.third(value)

inline fun <First, Second, Third, Fourth, Fifth> union5Fourth(value: Fourth): Union5<First, Second, Third, Fourth, Fifth> = SealedUnion5.fourth(value)

inline fun <First, Second, Third, Fourth, Fifth> union5Fifth(value: Fifth): Union5<First, Second, Third, Fourth, Fifth> = SealedUnion5.fifth(value)

/**
 * Union6
 */

inline fun <First, Second, Third, Fourth, Fifth, Sixth> union6First(value: First): Union6<First, Second, Third, Fourth, Fifth, Sixth> = SealedUnion6.first(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth> union6Second(value: Second): Union6<First, Second, Third, Fourth, Fifth, Sixth> = SealedUnion6.second(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth> union6Third(value: Third): Union6<First, Second, Third, Fourth, Fifth, Sixth> = SealedUnion6.third(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth> union6Fourth(value: Fourth): Union6<First, Second, Third, Fourth, Fifth, Sixth> = SealedUnion6.fourth(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth> union6Fifth(value: Fifth): Union6<First, Second, Third, Fourth, Fifth, Sixth> = SealedUnion6.fifth(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth> union6Sixth(value: Sixth): Union6<First, Second, Third, Fourth, Fifth, Sixth> = SealedUnion6.sixth(value)

/**
 * Union7
 */

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh> union7First(value: First): Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> = SealedUnion7.first(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh> union7Second(value: Second): Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> = SealedUnion7.second(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh> union7Third(value: Third): Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> = SealedUnion7.third(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh> union7Fourth(value: Fourth): Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> = SealedUnion7.fourth(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh> union7Fifth(value: Fifth): Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> = SealedUnion7.fifth(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh> union7Sixth(value: Sixth): Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> = SealedUnion7.sixth(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh> union7Seventh(value: Seventh): Union7<First, Second, Third, Fourth, Fifth, Sixth, Seventh> = SealedUnion7.seventh(value)

/**
 * Union8
 */

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> union8First(value: First): Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> = SealedUnion8.first(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> union8Second(value: Second): Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> = SealedUnion8.second(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> union8Third(value: Third): Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> = SealedUnion8.third(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> union8Fourth(value: Fourth): Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> = SealedUnion8.fourth(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> union8Fifth(value: Fifth): Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> = SealedUnion8.fifth(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> union8Sixth(value: Sixth): Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> = SealedUnion8.sixth(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> union8Seventh(value: Seventh): Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> = SealedUnion8.seventh(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> union8Eighth(value: Eighth): Union8<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth> = SealedUnion8.eighth(value)

/**
 * Union9
 */

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> union9First(value: First): Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> = SealedUnion9.first(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> union9Second(value: Second): Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> = SealedUnion9.second(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> union9Third(value: Third): Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> = SealedUnion9.third(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> union9Fourth(value: Fourth): Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> = SealedUnion9.fourth(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> union9Fifth(value: Fifth): Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> = SealedUnion9.fifth(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> union9Sixth(value: Sixth): Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> = SealedUnion9.sixth(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> union9Seventh(value: Seventh): Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> = SealedUnion9.seventh(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> union9Eighth(value: Eighth): Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> = SealedUnion9.eighth(value)

inline fun <First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> union9Ninth(value: Ninth): Union9<First, Second, Third, Fourth, Fifth, Sixth, Seventh, Eighth, Ninth> = SealedUnion9.ninth(value)
