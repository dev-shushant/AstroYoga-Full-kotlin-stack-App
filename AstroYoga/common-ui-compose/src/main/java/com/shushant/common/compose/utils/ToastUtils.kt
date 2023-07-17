/*
 * Copyright (c) 2023 Shushant Tiwari.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */

package com.shushant.common.compose.utils

import android.content.Context
import android.widget.Toast

fun Context.toast(
    message: String,
    duration: Int = Toast.LENGTH_SHORT,
    block: Toast.() -> Unit = {}
) {
    Toast
        .makeText(this, message, duration)
        .apply {
            block(this)
            show()
        }
}