package com.svlit.myapplication.util

import android.content.Context
import android.widget.Toast

/**
 * Расширения для контекста.
 *
 * @author Litvinenko Sergei
 * @since 09.09.2019.
 */

/**
 * Показывает [Toast] с переданным сообщением [message].
 */
fun Context.toast(message: CharSequence) =
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()