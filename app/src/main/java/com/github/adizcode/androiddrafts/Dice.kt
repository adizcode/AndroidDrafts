package com.github.adizcode.androiddrafts

import android.widget.ImageView

const val DICE_NUM = 6

fun rollDiceViews(vararg dices: ImageView) {
    for (dice in dices) {
        val diceRoll = getRandomNum(DICE_NUM)
        dice.setImageResource(getRandomDice(diceRoll))
        dice.contentDescription = diceRoll.toString()
    }
}

private fun getRandomDice(diceRoll: Int) = getDiceDrawableResId(diceRoll)

private fun getDiceDrawableResId(num: Int) = when (num) {
    1 -> R.drawable.dice_1
    2 -> R.drawable.dice_2
    3 -> R.drawable.dice_3
    4 -> R.drawable.dice_4
    5 -> R.drawable.dice_5
    else -> R.drawable.dice_6
}